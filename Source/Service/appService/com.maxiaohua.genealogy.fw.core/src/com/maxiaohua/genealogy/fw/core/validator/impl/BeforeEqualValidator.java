package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


@Deprecated
public class BeforeEqualValidator extends AnnotationValidator {
    private String dateStr = null;
    private java.sql.Date compareToSql = null;
    private java.util.Date compareToUtil = null;

    @Override
    protected void prepare() {
        try {
            if (otherValues != null) { 
                errorCode = com.maxiaohua.genealogy.fw.core.validator.type.BeforeEqual.DEFAULT_ERROR_CODE;
                dateStr = otherValues[0].toString();
            } else {
                errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.BeforeEqual) annotation).errorCode();
                dateStr = ((com.maxiaohua.genealogy.fw.core.validator.type.BeforeEqual) annotation).compareTo();
            }
            compareToSql = java.sql.Date.valueOf(dateStr);
            compareToUtil = DateUtil.parseToDate(dateStr, FORMAT.YYYYMMDDHyphen);
        } catch (Exception e) {
            
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (fieldValue instanceof java.util.Date) {
                result = ((java.util.Date) fieldValue).compareTo(compareToUtil) <= 0;
            } else if (fieldValue instanceof java.sql.Date) {
                result = ((java.sql.Date) fieldValue).compareTo(compareToSql) <= 0;
            } else {
                result = java.sql.Date.valueOf(fieldValue.toString()).compareTo(compareToSql) <= 0;
            }
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        return new String[] { dateStr };
    }

}