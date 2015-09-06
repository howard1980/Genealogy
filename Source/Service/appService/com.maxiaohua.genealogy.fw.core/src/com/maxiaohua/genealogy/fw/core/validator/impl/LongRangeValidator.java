package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class LongRangeValidator extends AnnotationValidator implements MessageCode {
    private java.lang.Long lagerEqual;
    private java.lang.Long lagerThan;
    private java.lang.Long lessEqual;
    private java.lang.Long lessThan;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lagerEqual())) {
                lagerEqual = java.lang.Long.valueOf(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lagerEqual());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lagerThan())) {
                lagerThan = java.lang.Long.valueOf(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lagerThan());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lessEqual())) {
                lessEqual = java.lang.Long.valueOf(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lessEqual());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lessThan())) {
                lessThan = java.lang.Long.valueOf(((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).lessThan());
            }

            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.LongRange) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.LongRange.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.lang.Long targetNum = java.lang.Long.valueOf(fieldValue.toString());

            try {

                if (lagerEqual != null) {
                    if (targetNum < lagerEqual) {
                        result = false;
                        errorCode = M10570CM;
                        errortype = 1;
                    }
                } else if (lagerThan != null) {
                    if (targetNum <= lagerThan) {
                        result = false;
                        errorCode = M10550CM;
                        errortype = 2;
                    }
                } else if (lessEqual != null) {
                    if (targetNum > lessEqual) {
                        result = false;
                        errorCode = M10560CM;
                        errortype = 3;
                    }
                } else if (lessThan != null) {
                    if (targetNum >= lessThan) {
                        result = false;
                        errorCode = M10540CM;
                        errortype = 4;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Long.DEFAULT_ERROR_CODE;
            errortype = 5;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        String[] msgParameters = new String[1];

        switch (errortype) {
        case 1:
            msgParameters[0] = String.valueOf(lagerEqual);
            break;
        case 2:
            msgParameters[0] = String.valueOf(lagerThan);
            break;
        case 3:
            msgParameters[0] = String.valueOf(lessEqual);
            break;
        case 4:
            msgParameters[0] = String.valueOf(lessThan);
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