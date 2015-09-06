package com.maxiaohua.genealogy.fw.core.bean.impl;

import java.lang.reflect.Field;

import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;


public class InjectionUtil {
    
    private static final String MANAGED_CLASS_PACKAGE_PREFIX = "com.maxiaohua.genealogy";

    
    public static void inject(
            Object instance,
            Class<?> clazz,
            BeanFactory beanFactory) throws Exception {
        
        Class<?> superClazz = clazz.getSuperclass();

        if (superClazz.getName().startsWith(MANAGED_CLASS_PACKAGE_PREFIX)) {
            
            inject(instance, superClazz, beanFactory);
        }

        
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            AutoInject anno = field.getAnnotation(AutoInject.class);

            if (anno != null) {
                Object implObj = null;
                String injectInstanceName = anno.name();
                if (AutoInject.DEFAULT.equals(injectInstanceName)) {
                    
                    Class<?> interfaceClazz = field.getType();
                    
                    implObj = beanFactory.beanOfType(interfaceClazz);
                } else {
                    implObj = beanFactory.beanOfName(injectInstanceName);

                }
                
                field.setAccessible(true);
                field.set(instance, implObj);
            }
        }
    }
}