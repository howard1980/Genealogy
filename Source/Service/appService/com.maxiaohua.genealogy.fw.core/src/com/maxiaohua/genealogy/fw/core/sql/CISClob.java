package com.maxiaohua.genealogy.fw.core.sql;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;

public class CISClob implements Clob, Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final String ERR_HAS_FREEED = "data has been freeed.";
    private static final String ERR_OUT_OF_BOUNDARY = "out of boundary.";
    private static final String ERR_NOT_ENOUGH = "no enough data.";
    
    private char[] data;
    
    private Boolean hasFreeed = false;

    
    public CISClob(
            final char[] chars) {
        this.data = chars;
        hasFreeed = false;
    }

    @Override
    public long length() throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        return lchars.length;
    }

    public String getString() throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        return new String(lchars);
    }

    @Override
    public String getSubString(
            long pos,
            int length) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        pos--;
        if (pos < 0 || pos > dlen) {
            throw new SQLException(ERR_OUT_OF_BOUNDARY);
        }
        if (length < 0 || length > dlen - pos) {
            throw new SQLException(ERR_NOT_ENOUGH);
        }

        final char[] out = new char[length];
        System.arraycopy(lchars, (int) pos, out, 0, length);
        return new String(out);
    }

    @Override
    public Reader getCharacterStream() throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        return new CharArrayReader(lchars);
    }

    @Override
    public InputStream getAsciiStream() throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        StringBuilder content = new StringBuilder();
        for (char c : lchars) {
            content.append((int) c);
        }
        return new ByteArrayInputStream(content.toString().getBytes());
    }

    @Override
    public long position(
            String searchstr,
            long start) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        if (start > dlen || searchstr == null) {
            return -1;
        } else if (start < 1) {
            start = 0;
        } else {
            start--;
        }
        final char[] pattern = searchstr.toCharArray();
        final int plen = pattern.length;
        if (plen == 0 || start > dlen - plen) {
            return -1;
        }

        final int stop = dlen - plen;
        final char b0 = pattern[0];

        outer_loop: for (int i = (int) start; i <= stop; i++) {
            if (lchars[i] != b0) {
                continue;
            }
            int len = plen;
            int doffset = i;
            int poffset = 0;
            while (len-- > 0) {
                if (lchars[doffset++] != pattern[poffset++]) {
                    continue outer_loop;
                }
            }
            return i + 1;
        }
        return -1;
    }

    @Override
    public long position(
            Clob searchstr,
            long start) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        if (start > dlen || searchstr == null) {
            return -1;
        } else if (start < 1) {
            start = 0;
        } else {
            start--;
        }

        final long plen = searchstr.length();
        if (plen == 0 || start > ((long) dlen) - plen) {
            return -1;
        }

        final int iplen = (int) plen;
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(searchstr.getCharacterStream());
            String line = null;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            throw new SQLException(e.getMessage());
        }
        char[] bap = content.toString().toCharArray();
        final int stop = dlen - iplen;
        final char b0 = bap[0];

        outer_loop: for (int i = (int) start; i <= stop; i++) {
            if (lchars[i] != b0) {
                continue;
            }

            int len = iplen;
            int doffset = i;
            int poffset = 0;

            while (len-- > 0) {
                if (lchars[doffset++] != bap[poffset++]) {
                    continue outer_loop;
                }
            }
            return i + 1;
        }
        return -1;
    }

    
    public void setString(
            String str) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        if (str == null) {
            this.data = null;
        } else {
            this.data = str.toCharArray();
        }
    }

    @Override
    public int setString(
            long pos,
            String str) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final int dlen = data.length;
        pos--;
        if (pos < 0 || pos > dlen) {
            return 0;
        }

        if (str == null) {
            this.data = null;
            return 0;
        } else {
            char[] chars = str.toCharArray();
            int length = chars.length;
            if (length <= 0 || length > dlen - pos) {
                return 0;
            }
            System.arraycopy(chars, 0, data, (int) pos, length);
            return length;
        }
    }

    @Override
    public int setString(
            long pos,
            String str,
            int offset,
            int len) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final int dlen = data.length;

        pos--;
        if (pos < 0 || pos > dlen) {
            return 0;
        }

        if (str == null) {
            this.data = null;
            return 0;
        } else {
            char[] chars = str.toCharArray();
            int writeLength = chars.length - offset;
            if (writeLength <= 0 || writeLength > dlen - pos) {
                return 0;
            }
            System.arraycopy(chars, offset, data, (int) pos, writeLength);
            return writeLength;
        }
    }

    @Override
    public OutputStream setAsciiStream(
            long pos) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        StringBuilder content = new StringBuilder();
        for (char c : lchars) {
            content.append((int) c);
        }
        final char[] asciiData = content.toString().toCharArray();
        final int dlen = asciiData.length;

        pos--;
        if (pos < 0 || pos > dlen) {
            throw new SQLException(ERR_OUT_OF_BOUNDARY);
        } else {
            return new ByteArrayOutputStream(dlen - (int) pos);
        }
    }

    @Override
    public Writer setCharacterStream(
            long pos) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        pos--;
        if (pos < 0 || pos > dlen) {
            throw new SQLException(ERR_OUT_OF_BOUNDARY);
        } else {
            return new CharArrayWriter(dlen - (int) pos);
        }
    }

    @Override
    public void truncate(
            long len) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        if (len > dlen) {
            throw new SQLException(ERR_NOT_ENOUGH);
        } else {
            int writeLenth = dlen - (int) len;
            char[] newData = new char[writeLenth];
            System.arraycopy(lchars, (int) len, newData, 0, writeLenth);
            data = newData;
        }
    }

    @Override
    public void free() throws SQLException {
        if (!hasFreeed) {
            final int dlen = data.length;
            char[] newData = new char[dlen];
            System.arraycopy(newData, 0, data, 0, dlen);
            hasFreeed = true;
        }
    }

    @Override
    public Reader getCharacterStream(
            long pos,
            long length) throws SQLException {
        if (hasFreeed) {
            throw new SQLException(ERR_HAS_FREEED);
        }
        final char[] lchars = data;
        final int dlen = lchars.length;

        pos--;
        if (pos < 0 || pos > dlen) {
            throw new SQLException(ERR_OUT_OF_BOUNDARY);
        }
        if (length < 0 || length > dlen - pos) {
            throw new SQLException(ERR_NOT_ENOUGH);
        }

        final char[] newData = new char[(int) length];
        System.arraycopy(lchars, (int) pos, newData, 0, (int) length);
        return new CharArrayReader(newData);
    }

}