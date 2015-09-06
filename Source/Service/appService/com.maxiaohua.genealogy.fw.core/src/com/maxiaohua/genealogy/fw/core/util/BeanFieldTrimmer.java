package com.maxiaohua.genealogy.fw.core.util;

import java.lang.annotation.Annotation;


public class BeanFieldTrimmer implements BeanFormatUtil.Formatter {
    
    public Object format(
            String name,
            Object value,
            Class<?> fieldType,
            Annotation[] annotations) {
        if (value != null && value instanceof String) {
            return ((String) value).trim();
        }
        return value;
    }
}