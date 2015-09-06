package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;


public class NotAllEmptyValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            errorCode = ((com.maxiaohua.genealogy.fw.core.util.validator.type.NotAllEmpty) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.NotAllEmpty.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;
        if (StringUtil.isEmpty((String) fieldValue)) {
            boolean allEmpty = true;
            for (Object obj : otherValues) {
                if (StringUtil.isNotEmpty((String) obj)) {
                    allEmpty = false;
                    break;
                }
            }
            if (allEmpty) {
                result = false;
            }
        }
        return result;
    }

    @Override
    public String[] getMsgParameters() {
        
        return null;
    }

}