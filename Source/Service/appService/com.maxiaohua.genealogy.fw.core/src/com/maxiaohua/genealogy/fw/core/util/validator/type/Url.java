
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.UrlValidator;


@RuleDescriptor("Url")
@Constraint(validator = UrlValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Url {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.E_ARG_INPUT_VALID_URL;

    
    public int junban() default 1;

    
    public boolean allowallschemes() default false;

    
    public boolean allow2slashes() default false;

    
    public boolean nofragments() default false;

    
    public String schemes() default "";

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}