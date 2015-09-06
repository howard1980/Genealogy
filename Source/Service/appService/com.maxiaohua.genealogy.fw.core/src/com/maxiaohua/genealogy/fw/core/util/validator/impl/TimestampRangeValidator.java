package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class TimestampRangeValidator extends AnnotationValidator implements MessageCode {
    private String lagerEqual = null;
    private String lagerThan = null;
    private String lessEqual = null;
    private String lessThan = null;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            lagerEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange) annotation).lagerEqual();
            lagerThan = ((com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange) annotation).lagerThan();
            lessEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange) annotation).lessEqual();
            lessThan = ((com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange) annotation).lessThan();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.TimestampRange.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.sql.Timestamp targetDate = java.sql.Timestamp.valueOf(fieldValue.toString());

            try {

                if (!StringUtil.isEmpty(lagerEqual)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(lagerEqual, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen)) < 0) {
                        result = false;
                        errorCode = M10620CM;
                        errortype = 1;
                    }
                } else if (!StringUtil.isEmpty(lagerThan)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(lagerThan, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen)) <= 0) {
                        result = false;
                        errorCode = M10640CM;
                        errortype = 2;
                    }
                } else if (!StringUtil.isEmpty(lessEqual)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(lessEqual, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen)) > 0) {
                        result = false;
                        errorCode = M10630CM;
                        errortype = 3;
                    }
                } else if (!StringUtil.isEmpty(lessThan)) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(lessThan, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen)) >= 0) {
                        result = false;
                        errorCode = M10650CM;
                        errortype = 4;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Timestamp.DEFAULT_ERROR_CODE;
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