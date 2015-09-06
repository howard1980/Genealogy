package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class BeforeValidator extends AnnotationValidator {
    private String dateStr = null;
    private java.sql.Date compareToSql = null;
    private java.util.Date compareToUtil = null;
    private boolean ifEqual = false;

    @Override
    protected void prepare() {
        try {
            if (otherValues != null) { 
                ifEqual = false;
                errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Before.DEFAULT_ERROR_CODE;
                dateStr = otherValues[0].toString();
            } else {
                ifEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Before) annotation).ifEqual();
                errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Before) annotation).errorCode();
                dateStr = ((com.maxiaohua.genealogy.fw.core.util.validator.type.Before) annotation).compareTo();
            }
            compareToUtil = DateUtil.parseToDate(dateStr, FORMAT.YYYYMMDDHyphen);
            compareToSql = new java.sql.Date(compareToUtil.getTime());
        } catch (Exception e) {
            
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (fieldValue instanceof java.util.Date) {
                if (ifEqual) {
                    result = ((java.util.Date) fieldValue).compareTo(compareToUtil) <= 0;
                } else {
                    result = ((java.util.Date) fieldValue).before(compareToUtil);
                }
            } else if (fieldValue instanceof java.sql.Date) {
                if (ifEqual) {
                    result = ((java.sql.Date) fieldValue).compareTo(compareToSql) <= 0;
                } else {
                    result = ((java.sql.Date) fieldValue).before(compareToSql);
                }
            } else {
                if (ifEqual) {
                    result = new java.sql.Date(DateUtil.parseToDate(fieldValue.toString(), FORMAT.YYYYMMDDHyphen).getTime()).compareTo(compareToSql) <= 0;
                } else {
                    result = new java.sql.Date(DateUtil.parseToDate(fieldValue.toString(), FORMAT.YYYYMMDDHyphen).getTime()).before(compareToSql);
                }
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