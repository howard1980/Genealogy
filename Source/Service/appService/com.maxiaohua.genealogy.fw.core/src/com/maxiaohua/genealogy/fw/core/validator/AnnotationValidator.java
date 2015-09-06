package com.maxiaohua.genealogy.fw.core.validator;

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
    
    protected static final String HANKAKU_KANA_LST = "ｱｲｳｴｵｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎﾏﾐﾐﾑﾒﾓﾔﾕﾖﾗﾘﾙﾚﾛﾜｦﾝｧｨｩｪｫｬｭｮｯｰ｡｢｣､･ﾞﾟ";
    
    protected static final String ZENKAKU_KANA_LST = "ァアィイゥウェエォオカガキギクグケゲコゴサザシジスズセゼソゾタダチヂッツヅテデトドナニヌネノハバパヒビピフブプヘベペホボポマミムメモャヤュユョヨラリルレロヮワヰヱヲンヴヵヶ";

    
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