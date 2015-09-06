package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.validator.CommonValidationUtil;


public class ZenkakuValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Zenkaku) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Zenkaku.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null) {
            result = false;
        } else {
            String fieldValueStr = fieldValue.toString();
            result = CommonValidationUtil.isZenkakuString(fieldValueStr);
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}