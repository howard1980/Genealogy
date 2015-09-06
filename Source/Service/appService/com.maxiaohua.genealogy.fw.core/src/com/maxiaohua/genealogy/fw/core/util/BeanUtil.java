package com.maxiaohua.genealogy.fw.core.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtils;


abstract public class BeanUtil {

    
    public static void setBeanProperty(
            Object bean,
            String property,
            Object value) throws BeanPropertyException {
        try {
            PropertyUtils.setProperty(bean, property, value);
        } catch (IllegalArgumentException e) {
            throw new BeanPropertyException(e);
        } catch (IllegalAccessException e) {
            throw new BeanPropertyException(e);
        } catch (InvocationTargetException e) {
            throw new BeanPropertyException(e.getTargetException());
        } catch (NoSuchMethodException e) {
            throw new BeanPropertyException(e);
        }
    }

    
    public static Object getBeanProperty(
            Object bean,
            String property) throws BeanPropertyException {

        Object value = null;
        try {
            value = PropertyUtils.getProperty(bean, property);
        } catch (IllegalArgumentException e) {
            throw new BeanPropertyException(e);
        } catch (IllegalAccessException e) {
            throw new BeanPropertyException(e);
        } catch (InvocationTargetException e) {
            throw new BeanPropertyException(e.getTargetException());
        } catch (NoSuchMethodException e) {
            throw new BeanPropertyException(e);
        }
        return value;
    }

    
    public static Class<?> getBeanPropertyType(
            Object bean,
            String property) throws BeanPropertyException {
        try {
            Class<?> type = null;
            if (bean instanceof DynaBean) {
                DynaProperty descriptor = ((DynaBean) bean).getDynaClass().getDynaProperty(property);
                if (descriptor != null) {
                    type = descriptor.getType();
                }
            } else {
                type = PropertyUtils.getPropertyType(bean, property);
            }
            return type;
        } catch (IllegalArgumentException e) {
            throw new BeanPropertyException(e);
        } catch (IllegalAccessException e) {
            throw new BeanPropertyException(e);
        } catch (InvocationTargetException e) {
            throw new BeanPropertyException(e);
        } catch (NoSuchMethodException e) {
            throw new BeanPropertyException(e);
        }
    }

    
    public static Object create(
            String className) throws BeanException {
        Object object = null;
        Thread t = Thread.currentThread();
        ClassLoader cl = t.getContextClassLoader();
        try {
            object = cl.loadClass(className).newInstance();
        } catch (InstantiationException e) {
            throw new BeanException(e);
        } catch (IllegalAccessException e) {
            throw new BeanException(e);
        } catch (ClassNotFoundException e) {
            throw new BeanException(e);
        }
        return object;
    }

    
    public static Object create(
            String className,
            Object[] constructorParameter) throws BeanException {
        Constructor<?>[] constructors = null;
        Thread t = Thread.currentThread();
        ClassLoader cl = t.getContextClassLoader();
        try {
            constructors = cl.loadClass(className).getConstructors();
        } catch (SecurityException e) {
            throw new BeanException(e);
        } catch (ClassNotFoundException e) {
            throw new BeanException(e);
        }
        for (int i = 0; i < constructors.length; i++) {
            Object object = null;
            try {
                object = constructors[i].newInstance(constructorParameter);
            } catch (IllegalArgumentException e) {
                continue;
            } catch (InstantiationException e) {
                throw new BeanException(e);
            } catch (IllegalAccessException e) {
                throw new BeanException(e);
            } catch (InvocationTargetException e) {
                throw new BeanException(e);
            }
            if (object != null) {
                return object;
            }
        }
        throw new BeanException(new IllegalArgumentException("class name : " + className));
    }

    
    public static Map<String, Method> getSetters(
            Class<?> clazz) {
        BeanInfo beanInfo;
        Map<String, Method> methodMap = new HashMap<String, Method>();
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
            for (PropertyDescriptor prop : beanInfo.getPropertyDescriptors()) {
                if (prop.getWriteMethod() != null) {
                    methodMap.put(prop.getName(), prop.getWriteMethod());
                }
            }
        } catch (IntrospectionException e) {
            methodMap = null;
        }
        return methodMap;
    }

    
    public static Map<String, Method> getGetters(
            Class<?> clazz) {
        BeanInfo beanInfo;
        Map<String, Method> methodMap = new HashMap<String, Method>();
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
            for (PropertyDescriptor prop : beanInfo.getPropertyDescriptors()) {
                if (prop.getReadMethod() != null) {
                    methodMap.put(prop.getName(), prop.getReadMethod());
                }
            }
        } catch (IntrospectionException e) {
            methodMap = null;
        }
        return methodMap;
    }

    
    public static Map<String, Object> getBeanProperties(
            Object bean,
            Map<String, Method> getters) throws Exception {
        Map<String, Object> props = new HashMap<String, Object>();

        Class<?> clazz = bean.getClass();
        if (getters == null) {
            getters = getGetters(clazz);
        }
        for (Map.Entry<String, Method> entry : getters.entrySet()) {
            String prop = entry.getKey();
            Method getter = entry.getValue();
            Object value = getter.invoke(bean, new Object[] {});
            props.put(prop, value);
        }

        return props;
    }

    
    public static void setBeanProperties(
            Object bean,
            Map<String, Method> setters,
            Map<String, Object> values) throws Exception {
        Class<?> clazz = bean.getClass();
        if (setters == null) {
            setters = getSetters(clazz);
        }

        for (Map.Entry<String, Object> entry : values.entrySet()) {
            String prop = entry.getKey();
            Object value = entry.getValue();
            Method setter = setters.get(prop);
            if (setter != null) {
                if (value == null) {
                    setter.invoke(bean, new Object[] { null });
                } else {
                    Class<?> setterParamType = setter.getParameterTypes()[0];
                    if (!value.getClass().equals(setterParamType)) {
                        value = convertValueType(value, value.getClass(), setterParamType);
                    }
                    if (setterParamType.isInstance(value)) {
                        setter.invoke(bean, new Object[] { value });
                    }
                }
            }
        }
    }

    
    public static Object convertValueType(
            Object fromValue,
            Class<?> fromType,
            Class<?> toType) {
        if (fromValue == null || fromType == null || toType == null) {
            return fromValue;
        }
        if (toType.equals(String.class) && !fromType.equals(String.class)) {
            
            return StringUtil.objectToString(fromValue);
        } else if (!toType.equals(String.class) && fromType.equals(String.class)) {
            
            if (toType.equals(Integer.class)) {
                
                return StringUtil.toInteger((String) fromValue);
            } else if (toType.equals(Long.class)) {
                
                return StringUtil.toLong((String) fromValue);
            } else if (toType.equals(Short.class)) {
                
                return StringUtil.toShort((String) fromValue);
            } else if (toType.equals(BigInteger.class)) {
                
                return StringUtil.toBigInteger((String) fromValue);
            } else if (toType.equals(BigDecimal.class)) {
                
                return StringUtil.toBigDecimal((String) fromValue);
            } else if (toType.equals(Boolean.class)) {
                
                return StringUtil.toBool((String) fromValue);
            } else if (toType.equals(Float.class)) {
                
                return StringUtil.toFloat((String) fromValue);
            } else if (toType.equals(Double.class)) {
                
                return StringUtil.toDouble((String) fromValue);
            } else {
                return fromValue;
            }
        } else if (!toType.equals(String.class) && fromType.equals(BigDecimal.class)) {
            
            if (toType.equals(BigInteger.class)) {
                
                return BigInteger.valueOf(((BigDecimal) fromValue).longValue());
            } else if (toType.equals(Integer.class)) {
                
                return ((BigDecimal) fromValue).intValue();
            } else if (toType.equals(Long.class)) {
                return ((BigDecimal) fromValue).longValue();
            } else if (toType.equals(Short.class)) {
                
                return (short) (((BigDecimal) fromValue).shortValue());
            } else if (toType.equals(Double.class)) {
                
                return ((BigDecimal) fromValue).doubleValue();
            } else if (toType.equals(Float.class)) {
                
                return ((BigDecimal) fromValue).floatValue();
            } else {
                return fromValue;
            }
        } else if (toType.equals(BigDecimal.class) && fromValue instanceof Number) {
            
            return new BigDecimal(fromValue.toString());
        } else if (!toType.equals(String.class) && fromType.equals(BigInteger.class)) {
            
            if (toType.equals(Integer.class)) {
                
                return ((BigInteger) fromValue).intValue();
            } else if (toType.equals(Long.class)) {
                
                return ((BigInteger) fromValue).longValue();
            } else if (toType.equals(Short.class)) {
                
                return (short) (((BigInteger) fromValue).intValue());
            } else if (toType.equals(Double.class)) {
                
                return ((BigInteger) fromValue).doubleValue();
            } else if (toType.equals(Float.class)) {
                
                return ((BigInteger) fromValue).floatValue();
            } else {
                return fromValue;
            }
        } else if (toType.equals(BigInteger.class) && (fromType.equals(Integer.class) || fromType.equals(Long.class) || fromType.equals(Short.class))) {
            
            return new BigInteger(fromValue.toString());
        } else {
            return fromValue;
        }
    }

}