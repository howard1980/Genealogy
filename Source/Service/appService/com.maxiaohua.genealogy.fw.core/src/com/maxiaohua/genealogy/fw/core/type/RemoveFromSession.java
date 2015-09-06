
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
public @interface RemoveFromSession {
    
    public static final String KEY_ALL = "all";

    
    public String[] value();
}