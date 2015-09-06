
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface RightChar {
    
    public String value();

    
    public boolean beforePadding() default false;

    
    public boolean notNullPadding() default false;
}