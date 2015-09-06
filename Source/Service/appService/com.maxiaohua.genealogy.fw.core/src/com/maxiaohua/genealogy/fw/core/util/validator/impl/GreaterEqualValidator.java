package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


@Deprecated
public class GreaterEqualValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            otherValues = new String[] { ((com.maxiaohua.genealogy.fw.core.util.validator.type.GreaterEqual) annotation).compareTo() };
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.GreaterEqual) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.GreaterEqual.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            java.math.BigDecimal fieldValueOriginal = java.math.BigDecimal.valueOf(Double.valueOf((String) fieldValue));
            for (int i = 0; i < otherValues.length; i++) {
                if (fieldValueOriginal.compareTo(java.math.BigDecimal.valueOf(Double.valueOf((String) otherValues[i]))) < 0) {
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
        
        return null;
    }
}