
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.NotHaveStringValidator;


@RuleDescriptor("NotHaveString")
@Constraint(validator = NotHaveStringValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotHaveString {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10390CM;

    
    public int junban() default 1;

    
    public String value();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}