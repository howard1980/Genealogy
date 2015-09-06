package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.io.IOException;

import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;


public interface RTFAttributeEx {
    static final int D_CHARACTER = 0;
    static final int D_PARAGRAPH = 1;
    static final int D_SECTION = 2;
    static final int D_DOCUMENT = 3;
    static final int D_META = 4;

    
    public int domain();

    
    public Object swingName();

    
    public String rtfName();

    
    public boolean set(
            MutableAttributeSet target);

    
    public boolean set(
            MutableAttributeSet target,
            int parameter);

    
    public boolean setDefault(
            MutableAttributeSet target);

    
    public boolean write(
            AttributeSet source,
            RTFGeneratorEx target,
            boolean force) throws IOException;

    
    public boolean writeValue(
            Object value,
            RTFGeneratorEx target,
            boolean force) throws IOException;
}