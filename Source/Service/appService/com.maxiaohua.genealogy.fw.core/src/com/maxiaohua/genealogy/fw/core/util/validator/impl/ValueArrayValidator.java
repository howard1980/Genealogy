package com.maxiaohua.genealogy.fw.core.util.validator.impl;

import org.apache.wink.json4j.JSONArray;

import com.maxiaohua.genealogy.fw.core.util.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.util.validator.type.ValueArray;


public class ValueArrayValidator extends AnnotationValidator {
    @Override
    protected void prepare() {
        if (annotation != null) {
            otherValues = ((ValueArray) annotation).values();
            errorCode = ((ValueArray) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.util.validator.type.ValueArray.DEFAULT_ERROR_CODE;
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
                    exist = false;
                    for (Object obj : otherValues) {
                        if (objInArray.toString().equals((String) obj)) {
                            exist = true;
                            break;
                        }
                    }
                    if (!exist) {
                        result = false;
                        break;
                    }
                }
            } else if (fieldValue instanceof JSONArray) {
                JSONArray array = (JSONArray) fieldValue;
                for (Object objInArray : array) {
                    exist = false;
                    for (Object obj : otherValues) {
                        if (objInArray.toString().equals((String) obj)) {
                            exist = true;
                            break;
                        }
                    }
                    if (!exist) {
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
                if (!exist) {
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
        if (otherValues == null || otherValues.length == 0) {
            return null;
        } else {
            StringBuffer msgParameters = new StringBuffer((String) otherValues[0]);
            for (int i = 1; i < otherValues.length; i++) {
                msgParameters.append(" or ").append((String) otherValues[i]);
            }
            return new String[] { msgParameters.toString() };
        }
    }
}