
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.CharacterValidator;


@RuleDescriptor("Character")
@Constraint(validator = CharacterValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Character {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.E_ARG_INPUT_CHARACTER;

    
    public int junban() default 1;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}