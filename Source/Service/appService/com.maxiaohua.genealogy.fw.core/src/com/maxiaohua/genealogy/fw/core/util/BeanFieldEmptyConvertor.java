package com.maxiaohua.genealogy.fw.core.util;

import java.lang.annotation.Annotation;

import com.maxiaohua.genealogy.fw.core.type.EmptyReplaceValue;


public class BeanFieldEmptyConvertor implements BeanFormatUtil.Formatter {
    
    private static final String EMPTY_STR = "";

    
    public Object format(
            String fieldName,
            Object value,
            Class<?> fieldType,
            Annotation[] annotations) {
        Object resultValue = value;
        for (int i = 0; annotations != null && i < annotations.length; i++) {
            if (annotations[i].annotationType().equals(EmptyReplaceValue.class)) {
                if (value == null || EMPTY_STR.equals(value.toString())) {
                    resultValue = ((EmptyReplaceValue) annotations[i]).value();
                    break;
                }
            }
        }
        return resultValue;
    }
}