package com.maxiaohua.genealogy.fw.core.rft.impl;

import javax.swing.text.StyleConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.TabStop;
import java.util.*;
import java.io.IOException;


class RTFAttributesEx {
    static RTFAttributeEx attributes[];

    static {
        Vector<Object> container = new Vector<Object>();
        int elementCHR = RTFAttributeEx.D_CHARACTER;
        int elementPGF = RTFAttributeEx.D_PARAGRAPH;
        int elementDOC = RTFAttributeEx.D_DOCUMENT;
        int elementPST = RTFAttributeEx.D_META;
        Boolean True = Boolean.valueOf(true);
        Boolean False = Boolean.valueOf(false);

        container.addElement(new BooleanAttribute(elementCHR, StyleConstants.Italic, "i"));
        container.addElement(new BooleanAttribute(elementCHR, StyleConstants.Bold, "b"));
        container.addElement(new BooleanAttribute(elementCHR, StyleConstants.Underline, "ul"));
        container.addElement(new BooleanAttribute(elementCHR, StyleConstants.StrikeThrough, "strike"));
        container.addElement(NumericAttribute.NewTwips(elementPGF, StyleConstants.LeftIndent, "li", 0f, 0));
        container.addElement(NumericAttribute.NewTwips(elementPGF, StyleConstants.RightIndent, "ri", 0f, 0));
        container.addElement(NumericAttribute.NewTwips(elementPGF, StyleConstants.FirstLineIndent, "fi", 0f, 0));

        container.addElement(new AssertiveAttribute(elementPGF, StyleConstants.Alignment, "ql", StyleConstants.ALIGN_LEFT));
        container.addElement(new AssertiveAttribute(elementPGF, StyleConstants.Alignment, "qr", StyleConstants.ALIGN_RIGHT));
        container.addElement(new AssertiveAttribute(elementPGF, StyleConstants.Alignment, "qc", StyleConstants.ALIGN_CENTER));
        container.addElement(new AssertiveAttribute(elementPGF, StyleConstants.Alignment, "qj", StyleConstants.ALIGN_JUSTIFIED));
        container.addElement(NumericAttribute.NewTwips(elementPGF, StyleConstants.SpaceAbove, "sa", 0));
        container.addElement(NumericAttribute.NewTwips(elementPGF, StyleConstants.SpaceBelow, "sb", 0));

        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabAlignmentKey, "tqr", TabStop.ALIGN_RIGHT));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabAlignmentKey, "tqc", TabStop.ALIGN_CENTER));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabAlignmentKey, "tqdec", TabStop.ALIGN_DECIMAL));

        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabLeaderKey, "tldot", TabStop.LEAD_DOTS));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabLeaderKey, "tlhyph", TabStop.LEAD_HYPHENS));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabLeaderKey, "tlul", TabStop.LEAD_UNDERLINE));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabLeaderKey, "tlth", TabStop.LEAD_THICKLINE));
        container.addElement(new AssertiveAttribute(elementPST, RTFReaderEx.TabLeaderKey, "tleq", TabStop.LEAD_EQUALS));

        
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.Caps, "caps"));
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.Outline, "outl"));
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.SmallCaps, "scaps"));
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.Shadow, "shad"));
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.Hidden, "v"));
        container.addElement(new BooleanAttribute(elementCHR, ConstantsEx.Deleted, "deleted"));

        container.addElement(new AssertiveAttribute(elementDOC, "saveformat", "defformat", "RTF"));
        container.addElement(new AssertiveAttribute(elementDOC, "landscape", "landscape"));

        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.PaperWidth, "paperw", 12240));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.PaperHeight, "paperh", 15840));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.MarginLeft, "margl", 1800));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.MarginRight, "margr", 1800));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.MarginTop, "margt", 1440));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.MarginBottom, "margb", 1440));
        container.addElement(NumericAttribute.NewTwips(elementDOC, ConstantsEx.GutterWidth, "gutter", 0));

        container.addElement(new AssertiveAttribute(elementPGF, ConstantsEx.WidowControl, "nowidctlpar", False));
        container.addElement(new AssertiveAttribute(elementPGF, ConstantsEx.WidowControl, "widctlpar", True));
        container.addElement(new AssertiveAttribute(elementDOC, ConstantsEx.WidowControl, "widowctrl", True));

        RTFAttributeEx[] attrs = new RTFAttributeEx[container.size()];
        container.copyInto(attrs);
        attributes = attrs;
    }

    
    static Dictionary<Object, Object> attributesByKeyword() {
        Dictionary<Object, Object> d = new Hashtable<Object, Object>(attributes.length);
        int i, m;

        m = attributes.length;
        for (i = 0; i < m; i++)
            d.put(attributes[i].rtfName(), attributes[i]);

        return d;
    }

    
    static abstract class GenericAttribute {
        int domain;
        Object swingName;
        String rtfName;

        
        protected GenericAttribute(
                int d,
                Object s,
                String r) {
            domain = d;
            swingName = s;
            rtfName = r;
        }

        
        public int domain() {
            return domain;
        }

        
        public Object swingName() {
            return swingName;
        }

        
        public String rtfName() {
            return rtfName;
        }

        
        abstract boolean set(
                MutableAttributeSet target);

        
        abstract boolean set(
                MutableAttributeSet target,
                int parameter);

        
        abstract boolean setDefault(
                MutableAttributeSet target);

        
        public boolean write(
                AttributeSet source,
                RTFGeneratorEx target,
                boolean force) throws IOException {
            return writeValue(source.getAttribute(swingName), target, force);
        }

        
        public boolean writeValue(
                Object value,
                RTFGeneratorEx target,
                boolean force) throws IOException {
            return false;
        }
    }

    
    static class BooleanAttribute extends GenericAttribute implements RTFAttributeEx {
        boolean rtfDefault;
        boolean swingDefault;

        protected static final Boolean True = Boolean.valueOf(true);
        protected static final Boolean False = Boolean.valueOf(false);

        
        public BooleanAttribute(
                int d,
                Object s,
                String r,
                boolean ds,
                boolean dr) {
            super(d, s, r);
            swingDefault = ds;
            rtfDefault = dr;
        }

        
        public BooleanAttribute(
                int d,
                Object s,
                String r) {
            super(d, s, r);

            swingDefault = false;
            rtfDefault = false;
        }

        
        public boolean set(
                MutableAttributeSet target) {
            target.addAttribute(swingName, True);
            return true;
        }

        
        public boolean set(
                MutableAttributeSet target,
                int parameter) {
            
            Boolean value = (parameter != 0 ? True : False);

            target.addAttribute(swingName, value);

            return true; 
        }

        
        public boolean setDefault(
                MutableAttributeSet target) {
            if (swingDefault != rtfDefault || (target.getAttribute(swingName) != null))
                target.addAttribute(swingName, Boolean.valueOf(rtfDefault));
            return true;
        }

        
        public boolean writeValue(
                Object o_value,
                RTFGeneratorEx target,
                boolean force) throws IOException {
            Boolean val;

            if (o_value == null)
                val = Boolean.valueOf(swingDefault);
            else
                val = (Boolean) o_value;

            if (force || (val.booleanValue() != rtfDefault)) {
                if (val.booleanValue()) {
                    target.writeControlWord(rtfName);
                } else {
                    target.writeControlWord(rtfName, 0);
                }
            }
            return true;
        }
    }

    
    static class AssertiveAttribute extends GenericAttribute implements RTFAttributeEx {
        Object swingValue;

        
        public AssertiveAttribute(
                int d,
                Object s,
                String r) {
            super(d, s, r);
            swingValue = Boolean.valueOf(true);
        }

        
        public AssertiveAttribute(
                int d,
                Object s,
                String r,
                Object v) {
            super(d, s, r);
            swingValue = v;
        }

        
        public AssertiveAttribute(
                int d,
                Object s,
                String r,
                int v) {
            super(d, s, r);
            swingValue = new Integer(v);
        }

        
        public boolean set(
                MutableAttributeSet target) {
            if (swingValue == null)
                target.removeAttribute(swingName);
            else
                target.addAttribute(swingName, swingValue);

            return true;
        }

        
        public boolean set(
                MutableAttributeSet target,
                int parameter) {
            return false;
        }

        
        public boolean setDefault(
                MutableAttributeSet target) {
            target.removeAttribute(swingName);
            return true;
        }

        
        public boolean writeValue(
                Object value,
                RTFGeneratorEx target,
                boolean force) throws IOException {
            if (value == null) {
                return !force;
            }

            if (value.equals(swingValue)) {
                target.writeControlWord(rtfName);
                return true;
            }

            return !force;
        }
    }

    
    static class NumericAttribute extends GenericAttribute implements RTFAttributeEx {
        int rtfDefault;
        Number swingDefault;
        float scale;

        
        protected NumericAttribute(
                int d,
                Object s,
                String r) {
            super(d, s, r);
            rtfDefault = 0;
            swingDefault = null;
            scale = 1f;
        }

        
        public NumericAttribute(
                int d,
                Object s,
                String r,
                int ds,
                int dr) {
            this(d, s, r, new Integer(ds), dr, 1f);
        }

        
        public NumericAttribute(
                int d,
                Object s,
                String r,
                Number ds,
                int dr,
                float sc) {
            super(d, s, r);
            swingDefault = ds;
            rtfDefault = dr;
            scale = sc;
        }

        
        public static NumericAttribute NewTwips(
                int d,
                Object s,
                String r,
                float ds,
                int dr) {
            return new NumericAttribute(d, s, r, new Float(ds), dr, 20f);
        }

        
        public static NumericAttribute NewTwips(
                int d,
                Object s,
                String r,
                int dr) {
            return new NumericAttribute(d, s, r, null, dr, 20f);
        }

        
        public boolean set(
                MutableAttributeSet target) {
            return false;
        }

        
        public boolean set(
                MutableAttributeSet target,
                int parameter) {
            Number swingValue;

            if (scale == 1f)
                swingValue = new Integer(parameter);
            else
                swingValue = new Float(parameter / scale);
            target.addAttribute(swingName, swingValue);
            return true;
        }

        
        public boolean setDefault(
                MutableAttributeSet target) {
            Number old = (Number) target.getAttribute(swingName);
            if (old == null)
                old = swingDefault;
            if (old != null && ((scale == 1f && old.intValue() == rtfDefault) || (Math.round(old.floatValue() * scale) == rtfDefault)))
                return true;
            set(target, rtfDefault);
            return true;
        }

        
        public boolean writeValue(
                Object o_value,
                RTFGeneratorEx target,
                boolean force) throws IOException {
            Number value = (Number) o_value;
            if (value == null)
                value = swingDefault;
            if (value == null) {
                return true;
            }
            int int_value = Math.round(value.floatValue() * scale);
            if (force || (int_value != rtfDefault))
                target.writeControlWord(rtfName, int_value);
            return true;
        }
    }
}