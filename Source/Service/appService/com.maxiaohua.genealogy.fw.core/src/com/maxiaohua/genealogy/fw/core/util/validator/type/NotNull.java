
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.NotNullValidator;


@RuleDescriptor("NotNull")
@Constraint(validator = NotNullValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10400CM;

    
    public String errorCode() default DEFAULT_ERROR_CODE;

    
    public int junban() default 0;
}