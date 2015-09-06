package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class AfterTimeValidator extends AnnotationValidator implements MessageCode {
    private String timeStr = null;
    private boolean ifEqual = false;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            timeStr = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterTime) annotation).compareTo();
            ifEqual = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterTime) annotation).ifEqual();
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.AfterTime) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.AfterTime.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.sql.Time targetDate = java.sql.Time.valueOf(fieldValue.toString());

            try {

                if (ifEqual) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTime(timeStr, DateUtil.FORMAT.HHcolonMMcolonSS)) < 0) {
                        result = false;
                        errorCode = M10580CM;
                    }
                } else {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTime(timeStr, DateUtil.FORMAT.HHcolonMMcolonSS)) <= 0) {
                        result = false;
                        errorCode = M10600CM;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Time.DEFAULT_ERROR_CODE;
            errortype = 1;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        String[] msgParameters = new String[1];

        switch (errortype) {
        case 1:
            msgParameters[0] = null;
            break;
        default:
            msgParameters[0] = timeStr;
            break;
        }
        return msgParameters;
    }

}