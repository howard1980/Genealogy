package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class HankakuValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Hankaku) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Hankaku.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null) {
            result = false;
        } else {
            String fieldValueStr = fieldValue.toString();
            result = CommonValidationUtil.isHankakuString(fieldValueStr);
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}