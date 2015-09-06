package com.maxiaohua.genealogy.fw.core.file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FileConfig {
    
    public static final String DEFAULT_CHARSET = "UTF-8";
    
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    
    public static final String DELIMIT_HT = "\t";

    
    public static final String DELIMIT_COMMA = ",";

    
    public static final String DOUBLE_QUOTE = "\"";

    
    public static final String ESCAPED_DOUBLE_QUOTE = "\"\"";

    
    public static final String LOCK_NONE = "NONE";

    
    public static final String LOCK_SHARE = "SHARE";

    
    public static final String LOCK_EXCLUSIVE = "EXCLUSIVE";
    
    String charSet = DEFAULT_CHARSET;

    
    String separatorChar = DELIMIT_COMMA;

    
    String transferChar = DOUBLE_QUOTE;

    
    Map<Class<?>, List<String>> usedColumns = new HashMap<Class<?>, List<String>>();

    
    public List<String> getUsedColumns(
            Class<?> dtoClazz) {
        return usedColumns.get(dtoClazz);
    }

    
    public synchronized void addUsedColumns(
            Class<?> dtoClazz,
            List<String> columns) {
        List<String> target = usedColumns.get(dtoClazz);
        if (target == null) {
            usedColumns.put(dtoClazz, new ArrayList<String>());
            target = usedColumns.get(dtoClazz);
        }
        target.addAll(columns);
    }

    
    public synchronized void removeUsedColumns(
            Class<?> dtoClazz) {
        usedColumns.remove(dtoClazz);
    }

    
    public String getCharSet() {
        return charSet;
    }

    
    public void setCharSet(
            String charSet) {
        this.charSet = charSet;
    }

    
    public String getSeparatorChar() {
        return separatorChar;
    }

    
    public void setSeparatorChar(
            String separatorChar) {
        this.separatorChar = separatorChar;
    }

    
    public String getTransferChar() {
        return transferChar;
    }

    
    public void setTransferChar(
            String transferChar) {
        this.transferChar = transferChar;
    }
}