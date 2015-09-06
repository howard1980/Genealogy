package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class NotHaveStringValidator extends AnnotationValidator {
    private String prohibitedChars = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            prohibitedChars = ((com.maxiaohua.genealogy.fw.core.util.validator.type.NotHaveString) annotation).value();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.NotHaveString) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.NotHaveString.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || !CommonValidationUtil.hasNotProhibitedChar(fieldValue.toString(), prohibitedChars)) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        return new String[] { prohibitedChars };
    }

}