
package com.maxiaohua.genealogy.fw.core.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.validator.impl.PatternValidator;


@RuleDescriptor("Pattern")
@Constraint(validator = PatternValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Pattern {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10430CM;

    
    public int junban() default 1;

    
    public String value();

    
    public String bungen() default "正規表現";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}