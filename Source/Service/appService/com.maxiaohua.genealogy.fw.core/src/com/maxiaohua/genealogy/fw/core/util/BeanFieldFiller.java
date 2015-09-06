package com.maxiaohua.genealogy.fw.core.util;

import java.lang.annotation.Annotation;

import com.maxiaohua.genealogy.fw.core.type.Length;


public class BeanFieldFiller implements BeanFormatUtil.Formatter {
    
    private char fillChar;

    
    public BeanFieldFiller() {
        this.fillChar = ' ';
    }

    
    public BeanFieldFiller(
            char fillChar) {
        this.fillChar = fillChar;
    }

    
    public Object format(
            String name,
            Object value,
            Class<?> fieldType,
            Annotation[] annotations) {
        if (!String.class.equals(fieldType) || value != null) {
            return value;
        }

        Integer length = null;
        for (Annotation anno : annotations) {
            if (Length.class.equals(anno.annotationType())) {
                length = ((Length) anno).max();
                break;
            }
        }
        if (length == null) {
            return value;
        }

        StringBuilder fillingStr = new StringBuilder();
        for (int i = 0; i < length; i++) {
            fillingStr.append(fillChar);
        }
        return fillingStr.toString();
    }
}