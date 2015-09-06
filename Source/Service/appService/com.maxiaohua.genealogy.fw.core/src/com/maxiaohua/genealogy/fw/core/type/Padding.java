
package com.maxiaohua.genealogy.fw.core.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Padding {
    
    public final char LEFT = 'L';
    
    public final char RIGHT = 'R';
    
    public final char ZERO = '0';
    
    public final char SPACE = ' ';

    
    public char type();

    
    public char value() default SPACE;
}