package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class MinValidator extends AnnotationValidator implements MessageCode {
    private long min = -1;
    private boolean ifEqual = true;

    @Override
    protected void prepare() {
        if (annotation != null) {
            ifEqual = ((com.maxiaohua.genealogy.fw.core.validator.type.Min) annotation).ifEqual();
            min = ((com.maxiaohua.genealogy.fw.core.validator.type.Min) annotation).min();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.Min) annotation).errorCode();
        } else { 
            ifEqual = true;
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Min.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (ifEqual) {
                if (java.lang.Long.valueOf(fieldValue.toString()) < min) {
                    errorCode = M10570CM;
                    result = false;
                }
            } else {
                if (java.lang.Long.valueOf(fieldValue.toString()) <= min) {
                    errorCode = M10550CM;
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