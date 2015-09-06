package com.maxiaohua.genealogy.fw.core.util;

import java.lang.annotation.Annotation;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.maxiaohua.genealogy.fw.core.type.ConstValue;
import com.maxiaohua.genealogy.fw.core.type.DateConvert;
import com.maxiaohua.genealogy.fw.core.type.ExFormatter;
import com.maxiaohua.genealogy.fw.core.type.LeftChar;
import com.maxiaohua.genealogy.fw.core.type.Length;
import com.maxiaohua.genealogy.fw.core.type.Padding;
import com.maxiaohua.genealogy.fw.core.type.RightChar;
import com.maxiaohua.genealogy.fw.core.type.SignedNumber;


public class BeanFieldFormatter implements BeanFormatUtil.Formatter {
    
    public Object format(
            String name,
            Object value,
            Class<?> type,
            Annotation[] annotations) {
        if (value == null) {
            return null;
        }
        if (type == null) {
            type = value.getClass();
        }
        if (type.equals(String.class)) {
            return doSringFormat(name, (String) value, type, annotations);
        }

        return StringUtil.toObject(doSringFormat(name, StringUtil.objectToString(value), type, annotations), type);
    }

    
    private String doSringFormat(
            String name,
            String value,
            Class<?> type,
            Annotation[] annotations) {
        value = value == null ? "" : value;

        
        String constChar = null;
        String dateFormatFrom = null;
        String dateFormattTo = null;
        int length = -1;
        int precision = -1;
        SignedNumber.Type signedNumber = null;
        Character paddingType = null;
        Character paddingChar = null;
        String leftChar = null;
        boolean leftCharBeforePadding = false;
        String rightChar = null;
        boolean rightCharBeforePadding = false;
        Class<? extends BeanFormatUtil.Formatter> exFormatter = null;

        for (Annotation anno : annotations) {
            
            Class<? extends Annotation> annoType = anno.annotationType();
            if (ConstValue.class.equals(annoType)) {
                constChar = ((ConstValue) anno).value();
            } else if (DateConvert.class.equals(annoType)) {
                dateFormatFrom = ((DateConvert) anno).from();
                dateFormattTo = ((DateConvert) anno).to();
            } else if (Length.class.equals(annoType)) {
                length = ((Length) anno).max();
                precision = ((Length) anno).precision();
            } else if (SignedNumber.class.equals(annoType)) {
                signedNumber = ((SignedNumber) anno).value();
            } else if (Padding.class.equals(annoType)) {
                paddingType = ((Padding) anno).type();
                paddingChar = ((Padding) anno).value();
            } else if (LeftChar.class.equals(annoType)) {
                leftChar = ((LeftChar) anno).value();
                leftCharBeforePadding = ((LeftChar) anno).beforePadding();
            } else if (RightChar.class.equals(annoType)) {
                rightChar = ((RightChar) anno).value();
                rightCharBeforePadding = ((RightChar) anno).beforePadding();
            } else if (ExFormatter.class.equals(annoType)) {
                exFormatter = ((ExFormatter) anno).value();
            }
        }

        
        if (constChar != null) {
            
            return constChar;
        }
        if (dateFormatFrom != null && dateFormattTo != null) {
            value = doDateConvert(value, dateFormatFrom, dateFormattTo);
        }

        if (leftCharBeforePadding) {
            
            value = leftChar + value;
        }
        if (rightCharBeforePadding) {
            
            value = value + rightChar;
        }

        if (precision != -1 && StringUtil.isNotEmpty(value)) {
            
            value = doDecimalPadding(value, length, precision);
        }
        if (paddingType != null) {
            
            paddingChar = paddingChar == null ? Padding.SPACE : paddingChar;
            value = doPadding(value, length, signedNumber, paddingType, paddingChar);
        } else if (paddingType == null && length != -1) {
            
            paddingType = Padding.LEFT;
            paddingChar = paddingChar == null ? Padding.SPACE : paddingChar;
            value = doPadding(value, length, signedNumber, paddingType, paddingChar);
        }

        if (leftChar != null && rightChar != null) {
            
            value = leftChar + value + rightChar;
        } else if (leftChar != null) {
            
            value = leftChar + value;
        } else if (rightChar != null) {
            
            value = value + rightChar;
        }

        if (exFormatter != null && !exFormatter.equals(BeanFieldFormatter.class)) {
            
            BeanFormatUtil.Formatter instance = null;
            try {
                instance = exFormatter.newInstance();
                value = StringUtil.objectToString(instance.format(name, value, type, annotations));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return value;
    }

    
    protected String doDecimalPadding(
            String value,
            int len,
            int precision) {
        String signed = "";
        if (value.startsWith("-")) {
            signed = "-";
            value = value.substring(1);
        } else if (value.startsWith("+")) {
            signed = "+";
            value = value.substring(1);
        }

        if (value.contains(".") && precision != -1) {
            String intValue = value.substring(0, value.indexOf("."));
            String scaleValue = value.substring(value.indexOf(".") + 1);
            scaleValue = doPadding(scaleValue, precision, null, Padding.LEFT, Padding.ZERO);
            value = intValue + "." + scaleValue;
            int paddingLen = len - precision - 1;
            if (value.length() < paddingLen) {
                value = doPadding(value, paddingLen, null, Padding.RIGHT, Padding.ZERO);
            }
        } else if (!value.contains(".") && precision != -1) {
            value = value + ".";
            value = doPadding(value, len, null, Padding.LEFT, Padding.ZERO);
        } else {
            value = doPadding(value, len, null, Padding.RIGHT, Padding.ZERO);
        }

        return signed + value;
    }

    
    protected String doPadding(
            String value,
            int length,
            SignedNumber.Type signedNumber,
            Character paddingType,
            Character paddingChar) {
        if (length <= 0 || value.length() >= length) {
            return value;
        }
        String signed = "";
        if (signedNumber != null) {
            if (value.startsWith("-")) {
                signed = "-";
                value = value.substring(1);
                length = length - 1;
            } else if (value.startsWith("+") && !SignedNumber.Type.PLUS_REMOVE.equals(signedNumber)) {
                signed = "+";
                value = value.substring(1);
                length = length - 1;
            } else if (value.startsWith("+") && SignedNumber.Type.PLUS_REMOVE.equals(signedNumber)) {
                value = value.substring(1);
            } else if (!value.startsWith("+") && SignedNumber.Type.PLUS_APPEND.equals(signedNumber)) {
                signed = "+";
                length = length - 1;
            }
        }

        int loopCnt = length - value.length();
        StringBuffer buf = !"".endsWith(signed) && StringUtil.isEmpty(value) ? new StringBuffer(" ") : new StringBuffer(signed);

        if (Padding.RIGHT == paddingType) {
            for (int i = 0; i < loopCnt; i++) {
                buf.append(paddingChar);
            }
            buf.append(value);
        } else {
            buf.append(value);
            for (int i = 0; i < loopCnt; i++) {
                buf.append(paddingChar);
            }
        }
        value = buf.toString();

        return value;
    }

    
    protected String doDateConvert(
            String value,
            String fromStr,
            String toStr) {
        SimpleDateFormat fromFormat = new SimpleDateFormat(fromStr);
        SimpleDateFormat toFormat = new SimpleDateFormat(toStr);
        java.util.Date fromDate = null;
        try {
            fromDate = fromFormat.parse(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return fromDate != null ? toFormat.format(fromDate) : null;
    }
}