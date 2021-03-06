package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class PatternValidator extends AnnotationValidator {
    private String mask = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            mask = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Pattern) annotation).value();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Pattern) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Pattern.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || !CommonValidationUtil.matchRegexp(fieldValue.toString(), mask)) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return new String[] { mask };
    }

}