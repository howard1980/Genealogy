package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.awt.Color;

import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;


public class HTMLStateDTO implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String alignNames[] = { "left", "center", "right" };
    
    private String fontName;
    
    private Color color;
    
    private int size;
    
    private int alignment;
    
    private boolean bold;
    
    private boolean italic;
    
    private boolean underline;
    
    private boolean strikeThrough;
    
    private double firstLineIndent;
    
    private double oldLeftIndent;
    
    private double oldRightIndent;
    
    private double leftIndent;
    
    private double rightIndent;
    
    private boolean firstLine;

    
    public HTMLStateDTO() {
        fontName = "";
        alignment = -1;
        bold = false;
        italic = false;
        underline = false;
        strikeThrough = false;
        color = null;
        size = -1;
        firstLineIndent = 0.0D;
        oldLeftIndent = 0.0D;
        oldRightIndent = 0.0D;
        leftIndent = 0.0D;
        rightIndent = 0.0D;
        firstLine = false;
    }

    
    public void updateState(
            AttributeSet attributeSet,
            StringBuffer buf,
            Element element) {
        String s = element.getName();
        if (s.equalsIgnoreCase("paragraph")) {
            firstLine = true;
        }
        leftIndent = updateDouble(attributeSet, leftIndent, StyleConstants.LeftIndent);
        rightIndent = updateDouble(attributeSet, rightIndent, StyleConstants.RightIndent);
        if (leftIndent != oldLeftIndent || rightIndent != oldRightIndent) {
            closeIndentTable(buf, oldLeftIndent, oldRightIndent);
        }
        bold = updateBoolean(attributeSet, StyleConstants.Bold, "b", bold, buf);
        italic = updateBoolean(attributeSet, StyleConstants.Italic, "i", italic, buf);
        underline = updateBoolean(attributeSet, StyleConstants.Underline, "u", underline, buf);
        strikeThrough = updateBoolean(attributeSet, StyleConstants.StrikeThrough, "s", strikeThrough, buf);
        size = updateFontSize(attributeSet, size, buf);
        color = updateFontColor(attributeSet, color, buf);
        alignment = updateAlignment(attributeSet, alignment, buf);
        firstLineIndent = updateDouble(attributeSet, firstLineIndent, StyleConstants.FirstLineIndent);
        fontName = updateFontName(attributeSet, fontName, buf);
        if (leftIndent != oldLeftIndent || rightIndent != oldRightIndent) {
            openIndentTable(buf, leftIndent, rightIndent);
            oldLeftIndent = leftIndent;
            oldRightIndent = rightIndent;
        }
    }

    
    private void openIndentTable(
            StringBuffer buf,
            double value1,
            double value2) {
        if (value1 != 0.0D || value2 != 0.0D) {
            closeSubsetTags(buf);
            buf.append("<table><tr>");
            String s = getSpaceTab((int) (value1 / 4D));
            if (s.length() > 0) {
                buf.append("<td>" + s + "</td>");
            }
            buf.append("<td>");
        }
    }

    
    private void closeIndentTable(
            StringBuffer buf,
            double value1,
            double value2) {
        if (value1 != 0.0D || value2 != 0.0D) {
            closeSubsetTags(buf);
            buf.append("</td>");
            String s = getSpaceTab((int) (value2 / 4D));
            if (s.length() > 0) {
                buf.append("<td>" + s + "</td>");
            }
            buf.append("</tr></table>");
        }
    }

    
    public void closeTags(
            StringBuffer buf) {
        closeSubsetTags(buf);
        closeTag(alignment, -1, "div", buf);
        alignment = -1;
        closeIndentTable(buf, oldLeftIndent, oldRightIndent);
    }

    
    private void closeSubsetTags(
            StringBuffer buf) {
        closeTag(bold, "b", buf);
        closeTag(italic, "i", buf);
        closeTag(underline, "u", buf);
        closeTag(strikeThrough, "s", buf);
        closeTag(color, "font", buf);
        closeTag(fontName, "font", buf);
        closeTag(size, -1, "font", buf);
        bold = false;
        italic = false;
        underline = false;
        strikeThrough = false;
        color = null;
        fontName = "";
        size = -1;
    }

    
    private void closeTag(
            boolean flag,
            String value,
            StringBuffer buf) {
        if (flag) {
            buf.append("</" + value + ">");
        }
    }

    
    private void closeTag(
            Color color,
            String value,
            StringBuffer buf) {
        if (color != null) {
            buf.append("</" + value + ">");
        }
    }

    
    private void closeTag(
            String tagStr,
            String value,
            StringBuffer buf) {
        if (tagStr.length() > 0) {
            buf.append("</" + value + ">");
        }
    }

    
    private void closeTag(
            int i,
            int j,
            String tagStr,
            StringBuffer buf) {
        if (i > j) {
            buf.append("</" + tagStr + ">");
        }
    }

    
    private int updateAlignment(
            AttributeSet attributeSet,
            int idx,
            StringBuffer buf) {
        int i = idx;
        Object obj = attributeSet.getAttribute(StyleConstants.Alignment);
        if (obj == null)
            return i;
        int j = ((Integer) obj).intValue();
        if (j == 3) {
            j = 0;
        }
        if (j != i && j >= 0 && j <= 2) {
            if (i > -1) {
                buf.append("</div>");
            }
            buf.append("<div align=\"" + alignNames[j] + "\">");
            i = j;
        }
        return i;
    }

    
    private Color updateFontColor(
            AttributeSet attributeSet,
            Color color,
            StringBuffer buf) {
        Color color1 = color;
        Object obj = attributeSet.getAttribute(StyleConstants.Foreground);
        if (obj == null)
            return color1;
        Color color2 = (Color) obj;
        if (color2 != color1) {
            if (color1 != null) {
                buf.append("</font>");
            }
            if (color2 != null) {
                buf.append("<font color=\"#" + makeColorString(color2) + "\">");
            }
        }
        color1 = color2;
        return color1;
    }

    
    private double updateDouble(
            AttributeSet attributeSet,
            double value,
            Object obj) {
        double d = value;
        Object obj1 = attributeSet.getAttribute(obj);
        if (obj1 != null) {
            d = ((Float) obj1).floatValue();
        }
        return d;
    }

    
    private String updateFontName(
            AttributeSet attributeSet,
            String fontNameStr,
            StringBuffer buf) {
    	Object obj = attributeSet.getAttribute(StyleConstants.Family);
    	if (obj != null) {
    		String fontNameInRtf = obj.toString();
    		if (!fontNameInRtf.equals(fontNameStr)) {
    			if (fontNameStr != null && !fontNameStr.equals("")) {
    				buf.append("</font>");
    			}
    			if (obj != null && !"聜l聜r 聜o聝S聝V聝b聝N".equals(fontNameInRtf) && !"".equals(fontNameInRtf)) {
    				buf.append("<font style=\"font-family:").append(fontNameInRtf).append("\">");
    			}

    		}
    	}
        return fontNameStr;
    }

    
    private int updateFontSize(
            AttributeSet attributeSet,
            int idx,
            StringBuffer buf) {
        int i = idx;
        Object obj = attributeSet.getAttribute(StyleConstants.FontSize);
        if (obj == null)
            return i;
        int j = ((Integer) obj).intValue();
        if (j != i) {
            if (i != -1) {
                buf.append("</font>");
            }
            buf.append("<font size=\"" + j / 4 + "\">");
        }
        i = j;
        return i;
    }

    
    private boolean updateBoolean(
            AttributeSet attributeSet,
            Object obj,
            String strValue,
            boolean flagVar,
            StringBuffer buf) {
        boolean flag = flagVar;
        Object obj1 = attributeSet.getAttribute(obj);
        if (obj1 != null) {
            boolean flag1 = ((Boolean) obj1).booleanValue();
            if (flag1 != flag) {
                if (flag1) {
                    buf.append("<" + strValue + ">");
                } else {
                    buf.append("</" + strValue + ">");
                }
            }
            flag = flag1;
        }
        return flag;
    }

    
    private String makeColorString(
            Color color) {
        String s = Long.toString(color.getRGB() & 0xffffff, 16);
        if (s.length() < 6) {
            StringBuffer stringbuffer = new StringBuffer();
            for (int i = s.length(); i < 6; i++) {
                stringbuffer.append("0");
            }
            stringbuffer.append(s);
            s = stringbuffer.toString();
        }
        return s;
    }

    
    public String performFirstLineIndent(
            String strValue) {
        String s = strValue;
        if (firstLine) {
            if (firstLineIndent != 0.0D) {
                int i = (int) (firstLineIndent / 4D);
                s = getSpaceTab(i) + s;
            }
            firstLine = false;
        }
        return s;
    }

    
    public String getSpaceTab(
            int idx) {
        StringBuffer stringbuffer = new StringBuffer();
        for (int j = 0; j < idx; j++) {
            
            stringbuffer.append("&nbsp;");
        }
        return stringbuffer.toString();
    }

}