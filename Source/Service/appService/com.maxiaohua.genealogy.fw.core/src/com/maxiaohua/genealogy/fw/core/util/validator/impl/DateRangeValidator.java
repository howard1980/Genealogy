package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class DateRangeValidator extends AnnotationValidator implements MessageCode {
    private String lagerEqual = null;
    private String lagerThan = null;
    private String lessEqual = null;
    private String lessThan = null;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            lagerEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange) annotation).lagerEqual();
            lagerThan = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange) annotation).lagerThan();
            lessEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange) annotation).lessEqual();
            lessThan = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange) annotation).lessThan();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.DateRange.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.sql.Date targetDate = java.sql.Date.valueOf(fieldValue.toString());

            try {

                if (!StringUtil.isEmpty(lagerEqual)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(lagerEqual, DateUtil.FORMAT.YYYYMMDDHyphen)) < 0) {
                        result = false;
                        errorCode = M10210CM;
                        errortype = 1;
                    }
                } else if (!StringUtil.isEmpty(lagerThan)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(lagerThan, DateUtil.FORMAT.YYYYMMDDHyphen)) <= 0) {
                        result = false;
                        errorCode = M10230CM;
                        errortype = 2;
                    }
                } else if (!StringUtil.isEmpty(lessEqual)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(lessEqual, DateUtil.FORMAT.YYYYMMDDHyphen)) > 0) {
                        result = false;
                        errorCode = M10220CM;
                        errortype = 3;
                    }
                } else if (!StringUtil.isEmpty(lessThan)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToDate(lessThan, DateUtil.FORMAT.YYYYMMDDHyphen)) >= 0) {
                        result = false;
                        errorCode = M10240CM;
                        errortype = 4;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.DateSql.DEFAULT_ERROR_CODE;
            errortype = 5;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        String[] msgParameters = new String[1];

        switch (errortype) {
        case 1:
            msgParameters[0] = lagerEqual;
            break;
        case 2:
            msgParameters[0] = lagerThan;
            break;
        case 3:
            msgParameters[0] = lessEqual;
            break;
        case 4:
            msgParameters[0] = lessThan;
            break;
        case 5:
            msgParameters = null;
            break;
        default:
            msgParameters = null;
            break;
        }
        
        return msgParameters;
    }

}