package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class DateSqlValidator extends AnnotationValidator {
    private FORMAT format = null;

    @Override
    protected void prepare() {
        if (annotation != null) {
            format = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateSql) annotation).format();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateSql) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.DateSql.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (DateUtil.parseToDate(fieldValue.toString(), format) == null) {
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