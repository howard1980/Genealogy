package com.maxiaohua.genealogy.fw.core.validator.impl;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class ZenkakuKanaValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.ZenkakuKana) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.ZenkakuKana.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        if (fieldValue == null) {
            result = false;
        } else {
            String fieldValueStr = fieldValue.toString();
            for (int i = 0; i < fieldValueStr.length(); i++) {
                char checkChar = fieldValueStr.charAt(i);
                if (ZENKAKU_KANA_LST.indexOf(checkChar) < 0) {
                    
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}