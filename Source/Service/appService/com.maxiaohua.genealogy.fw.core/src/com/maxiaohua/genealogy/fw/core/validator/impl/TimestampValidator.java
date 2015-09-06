package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class TimestampValidator extends AnnotationValidator {
    private FORMAT format = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            format = ((com.maxiaohua.genealogy.fw.core.validator.type.Timestamp) annotation).format();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Timestamp) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Timestamp.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            new java.sql.Timestamp(DateUtil.parseToDate(fieldValue.toString(), format).getTime());
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