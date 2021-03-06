package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class BeforeTimestampValidator extends AnnotationValidator implements MessageCode {
    private String timestampStr = null;
    private boolean ifEqual = false;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            timestampStr = ((com.maxiaohua.genealogy.fw.core.validator.type.BeforeTimestamp) annotation).compareTo();
            ifEqual = ((com.maxiaohua.genealogy.fw.core.validator.type.BeforeTimestamp) annotation).ifEqual();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.BeforeTimestamp) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.BeforeTimestamp.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.sql.Timestamp targetDate = java.sql.Timestamp.valueOf(fieldValue.toString());

            try {

                if (ifEqual) {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(timestampStr, DateUtil.FORMAT.YYYYMMDDHHMMSSHyphen)) > 0) {
                        result = false;
                        errorCode = M10630CM;
                    }
                } else {
                    if (DateUtil.compare(targetDate, DateUtil.parseToTimestamp(timestampStr, DateUtil.FORMAT.YYYYMMDDHHMMSSHyphen)) >= 0) {
                        result = false;
                        errorCode = M10650CM;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Timestamp.DEFAULT_ERROR_CODE;
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
            msgParameters[0] = timestampStr;
            break;
        }
        return msgParameters;
    }

}