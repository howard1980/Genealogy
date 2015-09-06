package com.maxiaohua.genealogy.fw.core.bean.impl;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.config.XMLBean;
import com.maxiaohua.genealogy.fw.core.config.XMLBeanConstructorArg;
import com.maxiaohua.genealogy.fw.core.config.XMLBeanProperty;
import com.maxiaohua.genealogy.fw.core.config.XMLBeans;
import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;
import com.maxiaohua.genealogy.fw.core.type.Component;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;


public class BeanFactoryImpl implements BeanFactory {
	
	private static final String IMPLEMENT_OBJECT_PACKAGE_POSTFIX = ".impl.";
	
	private static final String IMPLEMENT_OBJECT_CLASS_POSTFIX = "Impl";

	
	private XMLBeans xmlBeans;

	
	public BeanFactoryImpl(
			XMLBeans xmlBeans,
			boolean preLoad) throws Exception {
		this.xmlBeans = xmlBeans;

		if (preLoad) {
			
			for (XMLBean xmlBean : xmlBeans.getBeans()) {
				String beanName = xmlBean.getName();
				this.beanOfName(beanName);
			}
		}
	}

	
	private static final Map<String, Object> instanceContainer = new HashMap<String, Object>();
	
	private static final Byte[] block = new Byte[0];

	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T beanOfName(
			String beanName) throws Exception {
		XMLBean xmlBean = xmlBeans.getBean(beanName);
		if (xmlBean == null) {
			return null;
		}
		if (Component.SINGLETON.equalsIgnoreCase(xmlBean.getScope())) {
			synchronized (block) {
				if (!instanceContainer.containsKey(beanName)) {
					Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(xmlBean.getType());
					Object newInstance = createInstance(clazz, xmlBean);
					instanceContainer.put(beanName, newInstance);
				}
			}
			return (T) instanceContainer.get(beanName);
		}
		Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(xmlBean.getType());
		return (T) createInstance(clazz, xmlBean);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T beanOfType(
			Class<T> clazz) throws Exception {
		Class<?> implClazz;
		String implClazzName = null;
		String key = null;
		boolean interfaceFlag = false;
		if (clazz.isInterface()) {
			
			implClazzName = clazz.getPackage().getName() + IMPLEMENT_OBJECT_PACKAGE_POSTFIX + clazz.getSimpleName() + IMPLEMENT_OBJECT_CLASS_POSTFIX;

			XMLBean xmlBean = xmlBeans.getBean(implClazzName);
			if (xmlBean != null) {
				implClazz = Thread.currentThread().getContextClassLoader().loadClass(xmlBean.getType());
				interfaceFlag = true;
			} else {
				implClazz = Thread.currentThread().getContextClassLoader().loadClass(implClazzName);
			}
		} else {
			implClazz = clazz;
		}

		Component hasAnnoComponent = implClazz.getAnnotation(Component.class);
		String scope = hasAnnoComponent != null ? hasAnnoComponent.scope() : Component.SINGLETON;
		if (Component.SINGLETON.equalsIgnoreCase(scope)) {
			if (interfaceFlag) {
				key = implClazzName;
			} else {
				key = implClazz.getName();
			}

			synchronized (block) {
				if (!instanceContainer.containsKey(key)) {
					Object newInstance = createInstance(implClazz, null);
					instanceContainer.put(key, newInstance);
				}
			}
			return (T) instanceContainer.get(key);
		}
		return (T) createInstance(implClazz, null);
	}

	
	@Override
	public <T> void putBean(
			String beanName,
			T beanInstance) throws Exception {
		instanceContainer.put(beanName, beanInstance);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getBean(
			String beanName) throws Exception {
		return (T) instanceContainer.get(beanName);
	}

	
	@Override
	public <T> void removeBean(
			String beanName) throws Exception {
		if (instanceContainer.containsKey(beanName)) {
			instanceContainer.remove(beanName);
		}
	}

	
	@SuppressWarnings("unchecked")
	protected Object createInstance(
			Class<?> clazz,
			XMLBean xmlBean) throws Exception {
		List<XMLBeanConstructorArg> constructorArgs = xmlBean != null ? xmlBean.getConstructorArgs() : null;
		List<XMLBeanProperty> properties = xmlBean != null ? xmlBean.getProperties() : null;

		if (java.util.Map.class.isAssignableFrom(clazz)) {
			
			Map<String, Object> instance = (Map<String, Object>) clazz.newInstance();
			if (properties != null) {
				for (XMLBeanProperty property : properties) {
					String propName = property.getName();
					String propValue = property.getValue();
					String propRef = property.getRef();
					if (propRef != null) {
						Object refObj = beanOfName(propRef);
						instance.put(propName, refObj);
					} else if (propValue != null) {
						instance.put(propName, propValue);
					}
				}
			}
			return instance;
		}

		if (java.util.List.class.isAssignableFrom(clazz)) {
			
			List<Object> instance = (List<Object>) clazz.newInstance();
			if (properties != null) {
				for (XMLBeanProperty property : properties) {
					String propValue = property.getValue();
					String propRef = property.getRef();
					if (propRef != null) {
						Object refObj = beanOfName(propRef);
						instance.add(refObj);
					} else if (propValue != null) {
						instance.add(propValue);
					}
				}
			}
			return instance;
		}

		
		Object instance = null;
		if (constructorArgs != null) {
			
			Class<?>[] parameterTypes = new Class[constructorArgs.size()];
			Object[] parameterObjs = new Object[constructorArgs.size()];
			for (int i = 0; i < constructorArgs.size(); i++) {
				parameterTypes[i] = String.class;
				parameterObjs[i] = constructorArgs.get(i).getValue();
			}
			Constructor<?> constructors = clazz.getConstructor(parameterTypes);
			instance = constructors.newInstance(parameterObjs);
		} else {
			
			instance = clazz.newInstance();
		}
		if (properties != null) {
			
			BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
			PropertyDescriptor[] beanProperties = beanInfo.getPropertyDescriptors();
			for (XMLBeanProperty property : properties) {
				String propName = property.getName();
				String propRef = property.getRef();
				String value = property.getValue();
				if (propRef != null) {
					Object refObj = beanOfName(propRef);
					for (PropertyDescriptor beanProperty : beanProperties) {
						if (propName.equals(beanProperty.getName())) {
							beanProperty.getWriteMethod().invoke(instance, new Object[] { refObj });
						}
					}
				} else if (value != null) {
					for (PropertyDescriptor beanProperty : beanProperties) {
						if (propName.equals(beanProperty.getName())) {
							Class<?> clazzProperty = beanProperty.getPropertyType();
							Object setValue = null;
							
							if (clazzProperty.equals(String.class) || clazzProperty.equals(java.lang.Object.class)) {
								setValue = value;
							} else if (clazzProperty.equals(Character.class) || clazzProperty.equals(char.class)) {
								setValue = value.charAt(0);
							} else if (clazzProperty.equals(Boolean.class) || clazzProperty.equals(boolean.class)) {
								setValue = Boolean.valueOf(value);
							} else if (clazzProperty.equals(Long.class) || clazzProperty.equals(long.class)) {
								setValue = Long.valueOf(value);
							} else if (clazzProperty.equals(Integer.class) || clazzProperty.equals(int.class)) {
								setValue = Integer.valueOf(value);
							} else if (clazzProperty.equals(Short.class) || clazzProperty.equals(short.class)) {
								setValue = Short.valueOf(value);
							} else if (clazzProperty.equals(Double.class) || clazzProperty.equals(double.class)) {
								setValue = Double.valueOf(value);
							} else if (clazzProperty.equals(Float.class) || clazzProperty.equals(float.class)) {
								setValue = Float.valueOf(value);
							} else if (clazzProperty.equals(Byte.class) || clazzProperty.equals(byte.class)) {
								setValue = Byte.valueOf(value);
							} else if (clazzProperty.equals(java.math.BigDecimal.class)) {
								setValue = new java.math.BigDecimal(value);
							} else if (clazzProperty.equals(java.math.BigInteger.class)) {
								setValue = new java.math.BigInteger(value);
							} else if (clazzProperty.equals(java.sql.Date.class)) {
								setValue = java.sql.Date.valueOf(value);
							} else if (clazzProperty.equals(java.sql.Time.class)) {
								setValue = java.sql.Time.valueOf(value);
							} else if (clazzProperty.equals(java.sql.Timestamp.class)) {
								setValue = java.sql.Timestamp.valueOf(value);
							} else if (clazzProperty.equals(java.util.Date.class)) {
								setValue = DateUtil.parseToDate(value, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen);
							} else {
								throw new ApplicationException("No support class type: " + clazz);
							}
							beanProperty.getWriteMethod().invoke(instance, new Object[] { setValue });
						}
					}
				}
			}
		}

		InjectionUtil.inject(instance, clazz, this);
		return instance;
	}

}