package com.maxiaohua.genealogy.fw.core.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


abstract public class BeanTransformer {
	
	private static final Map<Class<?>, Map<String, PropertyDescriptor>> beanInfos = new HashMap<Class<?>, Map<String, PropertyDescriptor>>();

	
	public static <T> List<T> fromBeanList(
			List<?> sources,
			Class<T> clazz,
			int startIndex,
			int maxLimit) {
		if (sources == null) {
			return null;
		}
		List<T> targets = new ArrayList<T>(maxLimit == Integer.MAX_VALUE ? sources.size() : maxLimit);
		for (int i = 0; i < sources.size(); i++) {
			if (i >= startIndex && i < startIndex + maxLimit) {
				T target = fromBean(sources.get(i), clazz);
				targets.add(target);
			}
		}
		return targets;
	}

	
	public static <T> Object fromBeanArray(
			Object sources,
			Class<T> clazz,
			int startIndex,
			int maxLimit) {
		if (sources == null) {
			return null;
		}
		int length = Array.getLength(sources);
		Object targets = Array.newInstance(clazz, length);
		for (int i = 0; i < length; i++) {
			if (i >= startIndex && i < startIndex + maxLimit) {
				T target = fromBean(Array.get(sources, i), clazz);
				Array.set(targets, i, target);
			}
		}
		return targets;
	}

	
	public static <T> Object fromBeanArray(
			Object sources,
			Class<T> clazz) {
		if (sources == null) {
			return null;
		}
		return fromBeanArray(sources, clazz, 0, Array.getLength(sources));
	}

	
	public static <T> List<T> fromBeanList(
			List<?> sources,
			Class<T> clazz) {
		if (sources == null) {
			return null;
		}
		return fromBeanList(sources, clazz, 0, sources.size());
	}

	
	public static <T> T fromBean(
			Object source,
			Class<T> clazz) {
		if (source == null) {
			return null;
		}
		try {
			T target = clazz.newInstance();
			populateObjectALL(target, source);
			return target;
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
	}

	
	public static void populateObject(
			Object target,
			Object source) {
		Collection<PropertyDescriptor> targetProerties = getBeanProperties(target.getClass());
		Iterator<PropertyDescriptor> itr = targetProerties.iterator();
		while (itr.hasNext()) {
			PropertyDescriptor tarProp = itr.next();
			if (tarProp.getWriteMethod() == null) {
				continue;
			}
			PropertyDescriptor srcProp = getBeanProperty(source.getClass(), tarProp.getName());
			if (srcProp != null && srcProp.getReadMethod() != null) {
				if (tarProp.getPropertyType().equals(srcProp.getPropertyType())) {
					try {
						Object value = srcProp.getReadMethod().invoke(source, new Object[0]);
						tarProp.getWriteMethod().invoke(target, new Object[] { value });
					} catch (Exception e) {
						
						throw new RuntimeException(e);
					}
				}
			}
		}
	}

	
	public static void populateObjectALL(
			Object target,
			Object source) {
		Collection<PropertyDescriptor> targetProerties = getBeanProperties(target.getClass());
		Iterator<PropertyDescriptor> itr = targetProerties.iterator();
		while (itr.hasNext()) {
			PropertyDescriptor tarProp = itr.next();
			if (tarProp.getWriteMethod() == null) {
				continue;
			}
			PropertyDescriptor srcProp = getBeanProperty(source.getClass(), tarProp.getName());
			if (srcProp != null && srcProp.getReadMethod() != null) {
				if (tarProp.getPropertyType().equals(srcProp.getPropertyType())) {
					try {
						Object value = srcProp.getReadMethod().invoke(source, new Object[0]);
						tarProp.getWriteMethod().invoke(target, new Object[] { value });
					} catch (Exception e) {
						
						throw new RuntimeException(e);
					}
				} else {
					try {
						Object srcValue = srcProp.getReadMethod().invoke(source, new Object[0]);
						if (srcValue instanceof Object[]) {
							Object value = fromBeanArray(srcValue, tarProp.getPropertyType().getComponentType());
							tarProp.getWriteMethod().invoke(target, new Object[] { value });
						} else {
							Object value = fromBean(srcValue, tarProp.getPropertyType());
							tarProp.getWriteMethod().invoke(target, new Object[] { value });
						}

					} catch (Exception e) {
						
						throw new RuntimeException(e);
					}

				}
			}
		}
	}

	
	public static HashMap<String, Object> getObjectFields(
			Object target) {

		HashMap<String, Object> resultMap = null;
		if (target != null) {
			resultMap = new HashMap<String, Object>();
			Collection<PropertyDescriptor> targetProerties = getBeanProperties(target.getClass());
			Iterator<PropertyDescriptor> itr = targetProerties.iterator();
			while (itr.hasNext()) {
				PropertyDescriptor tarProp = itr.next();
				if (tarProp.getReadMethod() == null) {
					continue;
				}
				try {
					resultMap.put(tarProp.getName(), tarProp.getReadMethod().invoke(target, new Object[0]));
				} catch (Exception e) {
					
					throw new RuntimeException(e);
				}

			}
		}

		return resultMap;
	}

	
	private static Collection<PropertyDescriptor> getBeanProperties(
			Class<?> clazz) {
		if (!beanInfos.containsKey(clazz)) {
			initBeanInfo(clazz);
		}
		return beanInfos.get(clazz).values();
	}

	
	private static PropertyDescriptor getBeanProperty(
			Class<?> clazz,
			String propName) {
		if (!beanInfos.containsKey(clazz)) {
			initBeanInfo(clazz);
		}
		return beanInfos.get(clazz).get(propName);
	}

	
	protected static String parsePropertyName(
			String name) {
		return name;
	}

	
	private static void initBeanInfo(
			Class<?> clazz) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
			Map<String, PropertyDescriptor> propertiesMap = new HashMap<String, PropertyDescriptor>(beanInfo.getPropertyDescriptors().length);
			for (PropertyDescriptor propDesc : beanInfo.getPropertyDescriptors()) {
				propertiesMap.put(propDesc.getName(), propDesc);
			}
			beanInfos.put(clazz, propertiesMap);
		} catch (IntrospectionException e) {
			
		}
	}
}