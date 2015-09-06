package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class DoubleMinValidator extends AnnotationValidator implements MessageCode {
    private double min = -1;
    private boolean ifEqual = true;

    @Override
    protected void prepare() {
        if (annotation != null) {
            ifEqual = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMin) annotation).ifEqual();
            min = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMin) annotation).min();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.DoubleMin) annotation).errorCode();
        } else { 
            ifEqual = true;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.DoubleMin.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (ifEqual) {
                if (java.lang.Double.valueOf(fieldValue.toString()) < min) {
                    errorCode = M10530CM;
                    result = false;
                }

            } else {
                if (java.lang.Double.valueOf(fieldValue.toString()) <= min) {
                    errorCode = M10310CM;
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
        return new String[] { String.valueOf(min) };
    }
}