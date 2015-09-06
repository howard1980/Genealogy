package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class BigDecimalValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.BigDecimal) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.BigDecimal.DEFAULT_ERROR_CODE;
        }
    }

    
    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            
            java.lang.Long.parseLong(fieldValue.toString());
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