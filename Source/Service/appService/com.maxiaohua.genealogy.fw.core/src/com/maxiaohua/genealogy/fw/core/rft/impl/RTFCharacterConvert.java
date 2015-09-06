package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class RTFCharacterConvert {

    static CFontSet myFonts = new CFontSet();

    
    private static class CFontSet {
        ArrayList<Integer> fontNum, fontEnc;
        final String[] rtfFontset = new String[1500];

        
        public CFontSet() {
            fontNum = new ArrayList<Integer>();
            fontEnc = new ArrayList<Integer>();
            for (int i = 0; i < 1500; i++) {
                {
                    rtfFontset[i] = "";
                }
            }

            rtfFontset[0] = "iso-8859-1";
            rtfFontset[1] = "SJIS"; 
            rtfFontset[2] = "MacSymbol"; 
            rtfFontset[3] = ""; 

            rtfFontset[77] = "MacRoman"; 
            rtfFontset[78] = "SJIS"; 
            rtfFontset[79] = "Cp950";
            rtfFontset[80] = "MS936"; 

            rtfFontset[102] = "MS936";
            rtfFontset[128] = "MS932"; 
            rtfFontset[129] = "MS949"; 
            rtfFontset[130] = "x-Johab"; 
            rtfFontset[134] = "MS936"; 
            rtfFontset[136] = "Big5"; 
            rtfFontset[161] = "Cp1253"; 
            rtfFontset[162] = "Cp1254"; 
            rtfFontset[163] = "Cp1258"; 
            rtfFontset[177] = "Cp1255"; 
            rtfFontset[178] = "Cp1256"; 
            rtfFontset[179] = "Cp1256"; 
            rtfFontset[180] = "Cp864"; 
            rtfFontset[181] = "Cp862"; 
            rtfFontset[186] = "Cp775"; 

            rtfFontset[204] = "Cp866"; 
            rtfFontset[238] = "Cp1250"; 
            rtfFontset[222] = "Cp874"; 
            rtfFontset[254] = "Cp437"; 
            rtfFontset[255] = "SJIS"; 
            rtfFontset[256] = "MacRoman"; 

            rtfFontset[437] = "Cp437"; 

            rtfFontset[708] = "Cp1256"; 
            rtfFontset[709] = "Cp1256"; 
            rtfFontset[710] = "Cp1256"; 
            rtfFontset[711] = "Cp1256"; 
            rtfFontset[720] = "Cp1256"; 
            rtfFontset[819] = "Cp1250"; 
                                        
            rtfFontset[850] = "Cp850"; 
            rtfFontset[852] = "Cp852"; 
            rtfFontset[860] = "Cp860"; 
            rtfFontset[862] = "Cp862"; 
            rtfFontset[863] = "Cp863"; 
            rtfFontset[864] = "Cp864"; 
            rtfFontset[865] = "Cp865"; 
            rtfFontset[866] = "Cp866"; 
            rtfFontset[874] = "MS874"; 
            rtfFontset[932] = "MS932"; 
            rtfFontset[936] = "MS936"; 
            rtfFontset[949] = "MS949"; 
            rtfFontset[950] = "MS950"; 
            rtfFontset[1250] = "Cp1250"; 
            rtfFontset[1251] = "Cp1251"; 
            rtfFontset[1252] = "Cp1252"; 
            rtfFontset[1253] = "Cp1253"; 
            rtfFontset[1254] = "Cp1254"; 
            rtfFontset[1255] = "Cp1255"; 
            rtfFontset[1256] = "Cp1256"; 
            rtfFontset[1257] = "Cp1257"; 
            rtfFontset[1258] = "Cp1258"; 
            rtfFontset[1361] = "x-Johab"; 
        }

        
        public void add(
                final int n_font,
                final int n_fcharset) {
            for (int i = 0; i < fontNum.size(); i++) {
                if (n_font == ((Integer) fontNum.get(i)).intValue()) {
                    fontEnc.set(i, new Integer(n_fcharset));
                    return;
                }
            }
            fontNum.add(new Integer(n_font));
            fontEnc.add(new Integer(n_fcharset));
        }

        
        public String get(
                final int n_font) {
            for (int i = 0; i < fontNum.size(); i++) {
                if (n_font == ((Integer) fontNum.get(i)).intValue()) {
                    int cset = ((Integer) fontEnc.get(i)).intValue();
                    if (cset >= 0 && cset < 1500) {
                        return rtfFontset[cset];
                    }
                    return "";
                }
            }
            return "";
        }
    }

    
    private static StringBuffer readString(
            String rtfString) {
        StringBuffer inb = new StringBuffer();
        try {
            String str = "";
            InputStreamReader fis = new InputStreamReader(new ByteArrayInputStream(rtfString.getBytes()));
            BufferedReader br = new BufferedReader(fis);
            while ((str = br.readLine()) != null) {
                inb.append(str);
                inb.append("\n");
            }
            br.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return inb;
    }

    
    private static void getRTFfontset(
            final StringBuffer inb) {
        boolean ffont = false;
        int n_font = -1;
        for (int i = 0; i < inb.length(); i++) {
            if (ffont && inb.charAt(i) == ';') {
                ffont = false;
                n_font = -1;
                continue;
            }
            
            if (!ffont && checkCode(inb, i, "\\f")) {
                int fnum = getNumber(inb, i, "\\f");
                if (fnum != 0xffff) {
                    n_font = fnum;
                    ffont = true;
                }
            }
            
            if (ffont && checkCode(inb, i, "\\fcharset")) {
                int n_fcharset = getNumber(inb, i, "\\fcharset");
                if (n_fcharset != 0xffff) {
                    if (n_fcharset >= 0) {
                        myFonts.add(n_font, n_fcharset);
                        myFonts.get(n_font);
                    }
                } else {
                    n_font = -1;
                }
            }
        }
    }

    
    public static String convertJapanese(
            String rtfString) {
        String result = null;
        try {
            byte b1[] = new byte[1];
            byte b2[] = new byte[2];
            int skip = 0, n_font = -1, n_unicode = -1;
            String cset = "";
            boolean breadrule = false;
            boolean bsymbol = false;
            boolean bbackslash = false;
            boolean breadfont = false;

            StringBuffer inb = readString(rtfString);
            StringBuffer resultBuffer = new StringBuffer();

            
            getRTFfontset(inb);

            
            for (int i = 0; i < inb.length(); i++, skip = 0) {
                
                if (checkCode(inb, i, "\\f")) {
                    int fnum = getNumber(inb, i, "\\f");
                    if (fnum != 0xffff) {
                        n_font = fnum;
                        cset = myFonts.get(n_font);
                        if (cset.equals("MacSymbol")) {
                            bsymbol = true;
                        } else {
                            bsymbol = false;
                        }
                    }
                }
                
                if (checkCode(inb, i, "\\fcharset")) {
                    breadfont = true;
                }
                
                if (checkCode(inb, i, "\\*\\fchars")) {
                    breadrule = true;
                }
                if (checkCode(inb, i, "\\*\\lchars")) {
                    breadrule = true;
                }
                
                if (checkCode(inb, i, "\\u")) {
                    int un = getNumber(inb, i, "\\u");
                    if (un != 0xffff) {
                        n_unicode = un;
                    }
                }
                
                if (!breadfont && i < inb.length() - 8 && inb.substring(i, i + 2).equals("\\\'")) {
                    byte v1, v2;

                    v1 = (byte) Character.digit((char) inb.substring(i + 2, i + 4).getBytes("iso-8859-1")[0], 16);
                    v2 = (byte) Character.digit((char) inb.substring(i + 3, i + 4).getBytes("iso-8859-1")[0], 16);
                    String code = "";

                    if (!bsymbol && !breadrule) {
                        b2[0] = (byte) (v1 * 16 + v2);
                        if (inb.substring(i + 4, i + 6).equals("\\\'")) {
                            v1 = (byte) Character.digit((char) inb.substring(i + 6, i + 7).getBytes("iso-8859-1")[0], 16);
                            v2 = (byte) Character.digit((char) inb.substring(i + 7, i + 8).getBytes("iso-8859-1")[0], 16);
                            b2[1] = (byte) (v1 * 16 + v2);
                            if (cset.equals("")) {
                                code = new String(b2, "Windows-31J");
                            } else {
                                code = new String(b2, cset);
                            }
                            skip += 7;
                        } else {
                            v1 = v2 = 0;
                            if (isRtfChar(inb.substring(i + 4, i + 5).charAt(0))) {
                                b2[1] = inb.substring(i + 4, i + 5).getBytes("iso-8859-1")[0];
                                if (cset.equals("")) {
                                    code = new String(b2, "Windows-31J");
                                } else {
                                    code = new String(b2, cset);
                                }
                                skip += 4;
                            } else {
                                b1[0] = b2[0];
                                if (cset.equals("")) {
                                    code = new String(b1, "iso-8859-1");
                                } else {
                                    code = new String(b1, cset);
                                }
                                skip += 3;
                            }
                        }
                    } else {
                        b1[0] = (byte) (v1 * 16 + v2);
                        if (!breadrule) {
                            code = new String(b1, cset);
                            if (cset.equals("")) {
                                code = new String(b1, "iso-8859-1");
                            } else {
                                code = new String(b1, cset);
                            }
                        } else {
                            code = new String(b1, "iso-8859-1");
                        }
                        skip += 3;
                    }
                    String ascii = escapeString(code, n_unicode);
                    if (ascii.indexOf("\\u65533") > 0) {

                        skip -= 7;
                        v1 = (byte) Character.digit((char) inb.substring(i + 2, i + 4).getBytes("iso-8859-1")[0], 16);
                        v2 = (byte) Character.digit((char) inb.substring(i + 3, i + 4).getBytes("iso-8859-1")[0], 16);
                        b2[0] = (byte) (v1 * 16 + v2);
                        b2[1] = (byte) (v1 * 16 + v2);
                        if (cset.equals(""))
                            code = new String(b2, "Windows-31J");
                        else
                            code = new String(b2, cset);
                        if (code != null && code.length() > 1) {
                            code = code.substring(0, 1);
                        }
                        skip += 3;

                        ascii = escapeString(code, n_unicode);
                    }
                    resultBuffer.append(new String(ascii.getBytes("iso-8859-1")));
                    i += skip;
                    bbackslash = false;
                    n_unicode = -1;
                } else {
                    char ch = inb.charAt(i);
                    if (ch == '\\') {
                        bbackslash = true;
                    } else if (!isRtfChar(ch)) {
                        bbackslash = false;
                    }
                    if (breadfont || bbackslash || !bsymbol || !isRtfChar(ch)) {
                        resultBuffer.append(ch);
                    } else {
                        byte[] sb = new byte[1];
                        sb[0] = inb.substring(i, i + 1).getBytes()[0];
                        String ascii = escapeString(new String(sb, "MacSymbol"), -1);
                        resultBuffer.append(new String(ascii.getBytes("iso-8859-1")));
                    }
                }
                if (breadfont) {
                    if (inb.substring(i, i + 1).equals(";")) {
                        breadfont = false;
                    }
                }
                if (breadrule) {
                    if (inb.substring(i, i + 1).equals("}")) {
                        breadrule = false;
                    }
                }
            }
            result = resultBuffer.toString();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    
    private static boolean checkCode(
            final StringBuffer inb,
            final int pos,
            final String com) {
        if (pos < inb.length() - com.length() && inb.substring(pos, pos + com.length()).equals(com)) {
            return true;
        }
        return false;
    }

    
    private static int getNumber(
            final StringBuffer inb,
            final int pos,
            final String com) {
        int value = 0xffff;
        char pm = inb.substring(pos + com.length(), pos + com.length() + 1).charAt(0);
        if (Character.isDigit(pm) || pm == '-') {
            for (int i = 1; i < 10; i++) {
                int ii = pos + com.length() + i;
                if (ii >= inb.length()) {
                    break;
                }
                if (!Character.isDigit(inb.substring(ii, ii + 1).charAt(0))) {
                    try {
                        if (pm == '-') {
                            value = -Integer.valueOf(inb.substring(pos + com.length() + 1, ii)).intValue();
                        } else {
                            value = Integer.valueOf(inb.substring(pos + com.length(), ii)).intValue();
                        }
                        break;
                    } catch (java.lang.NumberFormatException e) {
                        value = 0xffff;
                        break;
                    }
                }
            }
            if (value != 0xffff) {
                return value;
            }
        }
        return 0xffff;
    }

    
    private static boolean isRtfChar(
            final char c) {
        if (c == '\r' || c == '\n') {
            return false;
        }
        if (c == '\\' || c == '{' || c == '}' || c == ' ') {
            return false;
        }
        return true;
    }

    
    private static String escapeString(
            final String str,
            final int n_unicode) throws IOException {
        StringBuffer sb = new StringBuffer();
        if (str == null) {
            return "";
        }
        int sz;
        sz = str.length();
        for (int i = 0; i < sz; i++) {
            char ch = str.charAt(i);
            int v = ch;
            
            if (ch > 0xfff) {
                if (n_unicode > 0) {
                    if (v != n_unicode) {
                        sb.append("{\\u");
                        sb.append(v);
                        sb.append("}");
                    }
                } else {
                    if (v != 0x10000 + n_unicode) {
                        sb.append("{\\u");
                        sb.append(v);
                        sb.append("}");
                    }
                }
            } else if (ch > 0xff) {
                sb.append("\\u");
                sb.append(v);
                sb.append("? ");
            } else if (ch > 0x7f) {
                sb.append("\\u");
                sb.append(v);
                sb.append("? ");
            } else if (ch < 32) {
                switch (ch) {
                case '\b':
                    sb.append('\\');
                    sb.append('b');
                    break;
                case '\n':
                    sb.append('\\');
                    sb.append('n');
                    break;
                case '\t':
                    sb.append('\\');
                    sb.append('t');
                    break;
                case '\f':
                    sb.append('\\');
                    sb.append('f');
                    break;
                case '\r':
                    sb.append('\\');
                    sb.append('r');
                    break;
                default:
                    if (ch > 0xf) {
                        sb.append("\\u" + v);
                    } else {
                        sb.append("\\u" + v);
                    }
                    break;
                }
            } else {
                switch (ch) {
                case '\'':
                case '"':
                case '\\':
                case '{':
                case '}':
                    sb.append('\\');
                    sb.append(ch);
                    break;
                default:
                    sb.append(ch);
                    break;
                }
            }
        }
        return new String(sb);
    }


























}