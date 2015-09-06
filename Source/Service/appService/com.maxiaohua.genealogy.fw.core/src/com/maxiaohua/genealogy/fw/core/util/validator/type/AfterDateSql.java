
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.AfterDateSqlValidator;


@RuleDescriptor("AfterDateSql")
@Constraint(validator = AfterDateSqlValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterDateSql {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10210CM;

    
    public int junban() default 1;

    
    public boolean ifEqual();

    
    public String compareTo();

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}