
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
public @interface PutIntoSession {
    
    public String key();

    
    public String field() default "";
}