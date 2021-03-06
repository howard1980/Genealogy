
package com.maxiaohua.genealogy.fw.core.util.validator.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil.FORMAT;
import com.maxiaohua.genealogy.fw.core.util.validator.impl.DateSqlValidator;


@RuleDescriptor("java.sql.Date")
@Constraint(validator = DateSqlValidator.class)
@Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateSql {
    
    public static final String DEFAULT_ERROR_CODE = MessageCode.M10290CM;

    
    public int junban() default 1;

    
    public FORMAT format() default DateUtil.FORMAT.YYYYMMDDHyphen;

    
    public String errorCode() default DEFAULT_ERROR_CODE;
}