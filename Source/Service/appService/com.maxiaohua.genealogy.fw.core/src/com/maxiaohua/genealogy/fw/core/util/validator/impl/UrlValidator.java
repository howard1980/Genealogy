package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.CommonValidationUtil;


public class UrlValidator extends AnnotationValidator {
    private boolean allowallschemes = false;
    private boolean allow2slashes = false;
    private boolean nofragments = false;
    private String schemes = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            allowallschemes = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Url) annotation).allowallschemes();
            allow2slashes = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Url) annotation).allow2slashes();
            nofragments = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Url) annotation).nofragments();
            schemes = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Url) annotation).schemes();
            if (StringUtil.isEmpty(schemes)) {
                schemes = null;
            }
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Url) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Url.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null || !CommonValidationUtil.isUrl(fieldValue.toString(), allowallschemes, allow2slashes, nofragments, schemes)) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}