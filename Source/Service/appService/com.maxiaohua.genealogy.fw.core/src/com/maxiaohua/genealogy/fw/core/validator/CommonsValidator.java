package com.maxiaohua.genealogy.fw.core.validator;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.UrlValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorException;
import org.apache.commons.validator.ValidatorResources;
import org.apache.commons.validator.ValidatorResults;

import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class CommonsValidator extends Validator {
    
    private static final long serialVersionUID = 1L;
    
    private ValidatorException validatorException;

    
    public CommonsValidator(
            ValidatorResources resources,
            String formName) {
        super(resources, formName);
    }

    
    public boolean matchRegexp(
            String value,
            String mask) {
        if (!StringUtils.isEmpty(value) && !GenericValidator.matchRegexp(value, mask)) {
            return false;
        }
        return true;
    }

    
    public boolean isAlphaNumericString(
            String value) {
        return matchRegexp(value, "^([0-9]|[a-z]|[A-Z])*$");
    }

    
    public boolean isUpperAlphaNumericString(
            String value) {
        return matchRegexp(value, "^([0-9]|[A-Z])*$");
    }

    
    public boolean isNumericString(
            String value) {
        return matchRegexp(value, "^([0-9])*$");
    }

    
    public boolean isMoneyString(
            String value) {
        boolean ret = matchRegexp(value, "^[0-9]+[\\.][0-9]{0,2}$");
        if (!ret) {
            ret = matchRegexp(value, "^([0-9])*$");
        }
        return ret;

    }

    
    public boolean isDateString(
            String value) {
        return matchRegexp(value, "^([0-9]{4})-([0-9]{2})-([0-9]{2})$");
    }

    
    public boolean isNumber(
            BigDecimal value,
            int integerLength,
            boolean isAccordedInteger,
            int scaleLength,
            boolean isAccordedScale) {
        if (value == null) {
            return true;
        }
        BigInteger bi = value.toBigInteger().abs();
        int length = bi.toString().length();
        if (!checkNumberFigures(length, integerLength, isAccordedInteger)) {
            return false;
        }

        int scale = value.scale();
        if (!checkNumberFigures(scale, scaleLength, isAccordedScale)) {
            return false;
        }

        return true;
    }

    
    protected boolean checkNumberFigures(
            int length,
            int checkLength,
            boolean accorded) {
        if (length > checkLength) {
            return false;
        }

        if (accorded) {
            if (length != checkLength) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean hasNotProhibitedChar(
            String value,
            String prohibitedChars) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        char[] chars = value.toCharArray();

        if (prohibitedChars == null || "".equals(prohibitedChars)) {
            return true;
        }

        for (int i = 0; i < chars.length; i++) {
            if (prohibitedChars.indexOf(chars[i]) >= 0) {
                return false;
            }
        }
        return true;
    }

    
    public boolean isArrayInRange(
            Object obj,
            int min,
            int max) {
        int targetLength = 0;
        if (obj == null) {
            targetLength = 0;
        } else if (obj instanceof Collection) {
            targetLength = ((Collection<?>) obj).size();
        } else if (obj.getClass().isArray()) {
            targetLength = Array.getLength(obj);
        } else {
            throw new IllegalArgumentException(obj.getClass().getName() + " is neither Array nor Collection.");
        }

        if (!GenericValidator.isInRange(targetLength, min, max)) {
            return false;
        }
        return true;
    }

    
    public boolean isUrl(
            String value,
            boolean allowallschemes,
            boolean allow2slashes,
            boolean nofragments,
            String schemesVar) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        int options = 0;
        if (allowallschemes) {
            options += UrlValidator.ALLOW_ALL_SCHEMES;
        }
        if (allow2slashes) {
            options += UrlValidator.ALLOW_2_SLASHES;
        }
        if (nofragments) {
            options += UrlValidator.NO_FRAGMENTS;
        }

        if (options == 0 && schemesVar == null) {
            if (GenericValidator.isUrl(value)) {
                return true;
            }
            return false;
        }

        String[] schemes = null;
        if (schemesVar != null) {

            StringTokenizer st = new StringTokenizer(schemesVar, ",");
            schemes = new String[st.countTokens()];

            int i = 0;
            while (st.hasMoreTokens()) {
                schemes[i++] = st.nextToken().trim();
            }
        }
        UrlValidator urlValidator = new UrlValidator(schemes, options);
        if (urlValidator.isValid(value)) {
            return true;
        }
        return false;
    }

    
    public boolean isByteInRange(
            String value,
            String encoding,
            int min,
            int max) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        
        int bytesLength = 0;
        try {
            bytesLength = StringUtil.getByteLength(value, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        
        if (!GenericValidator.isInRange(bytesLength, min, max)) {
            return false;
        }
        return true;
    }

    
    public boolean isDateInRange(
            String value,
            String startDateStr,
            String endDateStr,
            String datePattern,
            String datePatternStrict) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        
        Date result = DateUtil.toDate(value, datePattern, datePatternStrict);
        if (result == null) {
            return false;
        }

        if (GenericValidator.isBlankOrNull(startDateStr) && GenericValidator.isBlankOrNull(endDateStr)) {
            return true;
        }

        
        if (!GenericValidator.isBlankOrNull(startDateStr)) {
            Date startDate = DateUtil.toDate(startDateStr, datePattern, datePatternStrict);

            if (startDate == null) {
                throw new IllegalArgumentException("startDate is unparseable[" + startDateStr + "]");
            }

            if (result.before(startDate)) {
                return false;
            }
        }

        
        if (!GenericValidator.isBlankOrNull(endDateStr)) {
            Date endDate = DateUtil.toDate(endDateStr, datePattern, datePatternStrict);

            if (endDate == null) {
                throw new IllegalArgumentException("endDate is unparseable[" + endDateStr + "]");
            }

            if (result.after(endDate)) {
                return false;
            }
        }

        return true;
    }

    
    public boolean isAsciiChar(
            char value) {
        return value >= '\u0020' && value <= '\u007e';
    }

    
    public boolean isAsciiNSChar(
            char value) {
        return value >= '\u0021' && value <= '\u007e';
    }

    
    public boolean isAlphaString(
            String value) {
        return matchRegexp(value, "^([a-z]|[A-Z])*$");
    }

    
    public boolean isHexNumericString(
            String value) {
        return matchRegexp(value, "^([0-9]|[a-f]|[A-F])*$");
    }

    
    public boolean isAsciiString(
            String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!isAsciiChar(chars[i])) {
                return false;
            }
        }
        return true;
    }

    
    public boolean isAsciiNSString(
            String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!isAsciiNSChar(chars[i])) {
                return false;
            }
        }
        return true;
    }

    
    public boolean isTelNumberString(
            String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        
        while (value.startsWith("*") || value.startsWith("#")) {
            value = value.substring(1);
        }
        
        while (value.endsWith("*") || value.endsWith("#")) {
            value = value.substring(0, value.length() - 1);
        }
        return isNumericString(value);
    }

    
    public ValidatorException getValidatorException() {
        return validatorException;
    }

    
    @Override
    public ValidatorResults validate() throws ValidatorException {
        try {
            return super.validate();
        } catch (ValidatorException e) {
            validatorException = e;
            throw e;
        }
    }

    
    @Override
    public void clear() {
        super.clear();
        this.validatorException = null;
    }
}