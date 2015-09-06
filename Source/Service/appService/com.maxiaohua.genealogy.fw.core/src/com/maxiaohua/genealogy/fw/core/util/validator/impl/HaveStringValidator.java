package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class HaveStringValidator extends AnnotationValidator {
    private String permissionChars = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            permissionChars = ((com.maxiaohua.genealogy.fw.core.util.validator.type.HaveString) annotation).value();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.HaveString) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.HaveString.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || !CommonValidationUtil.hasOnlyPermissionChar(fieldValue.toString(), permissionChars)) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        return new String[] { permissionChars };
    }

}