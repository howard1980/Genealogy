package com.maxiaohua.genealogy.fw.core.validator.impl;

import org.apache.wink.json4j.JSONArray;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;


public class NotValueArrayValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            otherValues = ((com.maxiaohua.genealogy.fw.core.validator.type.NotValueArray) annotation).values();
            errorCode = ((com.maxiaohua.genealogy.fw.core.validator.type.NotValueArray) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.NotValueArray.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        boolean exist = false;
        try {
            if (fieldValue.getClass().isArray()) {
                Object[] array = (Object[]) fieldValue;
                for (Object objInArray : array) {
                    for (Object obj : otherValues) {
                        if (objInArray.toString().equals((String) obj)) {
                            exist = true;
                            break;
                        }
                    }
                    if (exist) {
                        result = false;
                        break;
                    }
                }
            } else if (fieldValue instanceof JSONArray) {
                JSONArray array = (JSONArray) fieldValue;
                for (Object objInArray : array) {
                    for (Object obj : otherValues) {
                        if (objInArray.toString().equals((String) obj)) {
                            exist = true;
                            break;
                        }
                    }
                    if (exist) {
                        result = false;
                        break;
                    }
                }
            } else {
                for (Object obj : otherValues) {
                    if (fieldValue.toString().equals((String) obj)) {
                        exist = true;
                        break;
                    }
                }
                if (exist) {
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