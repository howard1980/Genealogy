package com.maxiaohua.genealogy.fw.core.util.validator;

import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.ResourceBundle;

import com.maxiaohua.genealogy.fw.core.validator.type.MultiField;


public abstract class AnnotationValidator {
    
    protected static final String HANKAKU_NUMERIC_LST = "0123456789";
    
    protected static final String HANKAKU_LOWER_ALPHABET_LST = "abcdefghijklmnopqrstuvwxyz";
    
    protected static final String HANKAKU_UPPER_ALPHABET_LST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    protected static final String HANKAKU_ALPHABET_LST = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    protected static final String HANKAKU_ALPHABET_NUMERIC_LST = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    protected static final String HANKAKU_CHAR_LST = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
    
    protected static final String HANKAKU_KANA_LST = "锝憋讲锝筹酱锝碉蕉锝凤礁锝癸胶锝伙郊锝斤骄锝匡線锞侊緜锞冿緞锞咃締锞囷緢锞夛緤锞嬶緦锞嶏編锞忥緪锞愶緫锞掞緭锞旓緯锞栵緱锞橈緳锞氾緵锞滐溅锞濓涧锝僵锝将锝江锝蒋锝帮健锝剑锝わ渐锞烇緹";
    
    protected static final String ZENKAKU_KANA_LST = "銈°偄銈ｃ偆銈ャ偊銈с偍銈┿偑銈偓銈偖銈偘銈便偛銈炽偞銈点偠銈枫偢銈广偤銈汇偧銈姐偩銈裤儉銉併儌銉冦儎銉呫儐銉囥儓銉夈儕銉嬨儗銉嶃儙銉忋儛銉戙儝銉撱償銉曘儢銉椼儤銉欍儦銉涖儨銉濄優銉熴儬銉°儮銉ｃ儰銉ャ儲銉с儴銉┿儶銉儸銉儺銉儼銉便儾銉炽兇銉点�?";

    
    private static ResourceBundle validatorMapping = ResourceBundle.getBundle("validatorMapping", Locale.getDefault());
    
    protected Annotation annotation = null;
    
    protected int junban = 1;
    
    protected String errorCode = null;
    
    protected Object fieldValue = null;
    
    protected Object[] otherValues = null;
    
    protected Object[] parameters = null;

    
    private void initialize(
            Annotation annotation,
            Object value,
            Object... parameters) throws RuntimeException {
        this.parameters = parameters;
        if (annotation instanceof MultiField) { 
            Object[] all = (Object[]) value;
            if (all == null || all.length < 2) {
                throw new RuntimeException();
            } else {
                fieldValue = all[0];
                otherValues = new Object[all.length - 1];
                for (int i = 1; i < all.length; i++) {
                    otherValues[i - 1] = all[i];
                }
            }
        } else {
            this.annotation = annotation;
            fieldValue = value;
        }
        prepare();
    }

    
    protected abstract void prepare();

    
    public boolean validate(
            Annotation annotation,
            Object value,
            Object... parameters) {
        boolean result = true;
        try {
            initialize(annotation, value, parameters);
            result = isValid();
        } catch (RuntimeException e) {
            result = false;
        }
        return result;
    }

    
    protected abstract boolean isValid();

    
    public abstract String[] getMsgParameters();

    
    public String getRuleDescriptor() {
        String ruleDescriptor = getClass().getSimpleName();
        ruleDescriptor = ruleDescriptor.substring(0, ruleDescriptor.indexOf("Validator"));
        if (validatorMapping.containsKey(getClass().getSimpleName())) { 
            ruleDescriptor = validatorMapping.getString(getClass().getSimpleName());
        }

        return ruleDescriptor;
    }

    
    public static boolean isValidationAnnotation(
            Annotation annotation) {
        boolean result = false;

        String annotationName = annotation.annotationType().getName();
        if (validatorMapping.containsKey(annotationName)) { 
            result = true;
        }

        return result;
    }

    
    public Object getFieldValue() {
        return fieldValue;
    }

    
    public void setFieldValue(
            Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    
    public Object[] getOtherValues() {
        return otherValues;
    }

    
    public void setOtherValues(
            Object[] otherValues) {
        this.otherValues = otherValues;
    }

    
    public Annotation getAnnotation() {
        return annotation;
    }

    
    public void setAnnotation(
            Annotation annotation) {
        this.annotation = annotation;
    }

    
    public int getJunban() {
        return junban;
    }

    
    public void setJunban(
            int junban) {
        this.junban = junban;
    }

    
    public String getErrorCode() {
        return errorCode;
    }

    
    public void setErrorCode(
            String errorCode) {
        this.errorCode = errorCode;
    }
}