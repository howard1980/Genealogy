
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.validator.impl.DateValidator;


@RuleDescriptor("java.util.Date")
@Constraint(validator = DateValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10290CM;

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;

    
    public FORMAT format() default DateUtil.FORMAT.YYYYMMDDHyphen;
}