package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class FloatValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Float) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Float.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.lang.Float.valueOf(fieldValue.toString());
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}