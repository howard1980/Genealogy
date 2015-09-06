package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class DoubleRangeValidator extends AnnotationValidator implements MessageCode {
    private java.lang.Double lagerEqual;
    private java.lang.Double lagerThan;
    private java.lang.Double lessEqual;
    private java.lang.Double lessThan;
    private int errortype = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lagerEqual())) {
                lagerEqual = java.lang.Double.valueOf(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lagerEqual());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lagerThan())) {
                lagerThan = java.lang.Double.valueOf(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lagerThan());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lessEqual())) {
                lessEqual = java.lang.Double.valueOf(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lessEqual());
            }
            if (!StringUtil.isEmpty(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lessThan())) {
                lessThan = java.lang.Double.valueOf(((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).lessThan());
            }

            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.DoubleRange.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.lang.Double targetNum = java.lang.Double.valueOf(fieldValue.toString());

            try {

                if (lagerEqual != null) {
                    if (targetNum < lagerEqual) {
                        result = false;
                        errorCode = M10530CM;
                        errortype = 1;
                    }
                } else if (lagerThan != null) {
                    if (targetNum <= lagerThan) {
                        result = false;
                        errorCode = M10310CM;
                        errortype = 2;
                    }
                } else if (lessEqual != null) {
                    if (targetNum > lessEqual) {
                        result = false;
                        errorCode = M10520CM;
                        errortype = 3;
                    }
                } else if (lessThan != null) {
                    if (targetNum >= lessThan) {
                        result = false;
                        errorCode = M10300CM;
                        errortype = 4;
                    }
                }
            } catch (Exception e) {
                result = false;
            }
        } catch (Exception e) {
            result = false;
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.Double.DEFAULT_ERROR_CODE;
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