package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;


abstract class AbstractFilterEx extends OutputStream {
    
    protected char translationTable[];
    
    protected boolean specialsTable[];

    
    static final char latin1TranslationTable[];
    
    static final boolean noSpecialsTable[];
    
    static final boolean allSpecialsTable[];

    static {
        int i;

        noSpecialsTable = new boolean[256];
        for (i = 0; i < 256; i++)
            noSpecialsTable[i] = false;

        allSpecialsTable = new boolean[256];
        for (i = 0; i < 256; i++)
            allSpecialsTable[i] = true;

        latin1TranslationTable = new char[256];
        for (i = 0; i < 256; i++)
            latin1TranslationTable[i] = (char) i;
    }

    
    public void readFromStream(
            InputStream in) throws IOException {
        byte buf[];
        int count;

        buf = new byte[16384];

        while (true) {
            count = in.read(buf);
            if (count < 0)
                break;

            this.write(buf, 0, count);
        }
    }

    
    public void readFromReader(
            Reader in) throws IOException {
        char buf[];
        int count;

        buf = new char[2048];

        while (true) {
            count = in.read(buf);
            if (count < 0)
                break;
            for (int i = 0; i < count; i++) {
                this.write(buf[i]);
            }
        }
    }

    
    public AbstractFilterEx() {
        translationTable = latin1TranslationTable;
        specialsTable = noSpecialsTable;
    }

    
    public void write(
            int b) throws IOException {
        if (b < 0)
            b += 256;
        if (specialsTable[b])
            writeSpecial(b);
        else {
            char ch = translationTable[b];
            if (ch != (char) 0)
                write(ch);
        }
    }

    
    public void write(
            byte[] buf,
            int off,
            int len) throws IOException {
        StringBuffer accumulator = null;
        while (len > 0) {
            short b = (short) buf[off];

            
            if (b < 0)
                b += 256;

            if (specialsTable[b]) {
                if (accumulator != null) {
                    write(accumulator.toString());
                    accumulator = null;
                }
                writeSpecial(b);
            } else {
                char ch = translationTable[b];
                if (ch != (char) 0) {
                    if (accumulator == null)
                        accumulator = new StringBuffer();
                    accumulator.append(ch);
                }
            }

            len--;
            off++;
        }

        if (accumulator != null)
            write(accumulator.toString());
    }

    
    public void write(
            String s) throws IOException {
        int index, length;

        length = s.length();
        for (index = 0; index < length; index++) {
            write(s.charAt(index));
        }
    }

    
    protected abstract void write(
            char ch) throws IOException;

    
    protected abstract void writeSpecial(
            int b) throws IOException;
}