package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class DoubleMaxValidator extends AnnotationValidator implements MessageCode {
    private double max = -1;
    private boolean ifEqual = true;

    @Override
    protected void prepare() {
        if (annotation != null) {
            ifEqual = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMax) annotation).ifEqual();
            max = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMax) annotation).max();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMax) annotation).errorCode();
        } else { 
            ifEqual = true;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.DoubleMax.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (ifEqual) {
                if (java.lang.Double.valueOf(fieldValue.toString()) > max) {
                    errorCode = M10520CM;
                    result = false;
                }

            } else {
                if (java.lang.Double.valueOf(fieldValue.toString()) >= max) {
                    errorCode = M10300CM;
                    result = false;
                }
            }
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        return new String[] { String.valueOf(max) };
    }
}