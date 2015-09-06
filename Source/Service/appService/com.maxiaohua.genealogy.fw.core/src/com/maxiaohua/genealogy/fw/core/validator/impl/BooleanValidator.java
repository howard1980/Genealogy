package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class BooleanValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Boolean) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Boolean.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;
        try {
            if (!fieldValue.toString().equalsIgnoreCase("true") && !fieldValue.toString().equalsIgnoreCase("false")) {
                result = false;
            }
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