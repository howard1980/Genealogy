package com.maxiaohua.genealogy.fw.core.validator.impl;

import java.util.Collection;

import org.apache.wink.json4j.JSONArray;

import com.maxiaohua.genealogy.fw.core.validator.AnnotationValidator;
import com.maxiaohua.genealogy.fw.core.validator.type.Size;


public class SizeValidator extends AnnotationValidator {
    private int max = 0;
    private int min = 0;

    @Override
    protected void prepare() {
        if (annotation != null) {
            max = ((Size) annotation).max();
            min = ((Size) annotation).min();
            errorCode = ((Size) annotation).errorCode();
        } else { 
            errorCode = com.maxiaohua.genealogy.fw.core.validator.type.Size.DEFAULT_ERROR_CODE;
        }
    }

    @Override
    protected boolean isValid() {
        boolean result = true;

        try {
            if (fieldValue.getClass().isArray()) {
                Object[] array = (Object[]) fieldValue;
                if (array.length < min || array.length > max) {
                    result = false;
                }
            } else if (fieldValue instanceof JSONArray) {
                JSONArray array = (JSONArray) fieldValue;
                if (array.length() < min || array.length() > max) {
                    result = false;
                }
            } else if (fieldValue instanceof Collection) {
                Collection<?> collection = (Collection<?>) fieldValue;
                if (collection.size() < min || collection.size() > max) {
                    result = false;
                }
            } else if (fieldValue instanceof String) {
                String str = fieldValue.toString();
                if (str.length() < min || str.length() > max) {
                    result = false;
                }
            } else {
                result = false;
            }
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    @Override
    public String[] getMsgParameters() {
        return new String[] { String.valueOf(min), String.valueOf(max) };
    }
}