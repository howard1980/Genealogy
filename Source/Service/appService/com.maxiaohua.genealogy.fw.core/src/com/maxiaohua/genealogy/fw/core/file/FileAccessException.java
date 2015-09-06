package com.maxiaohua.genealogy.fw.core.file;


public class FileAccessException extends RuntimeException {

    
    private static final long serialVersionUID = -2102971991492853225L;

    
    protected String line;

    
    protected int rowCnt;

    
    public FileAccessException(
            Exception e) {
        super(e);
    }

    
    public FileAccessException(
            String message) {
        super(message);
    }

    
    public FileAccessException(
            String message,
            Exception e) {
        super(message, e);
    }

    
    public FileAccessException(
            Exception e,
            String line,
            int rowCnt) {
        super(e);
        this.line = line;
        this.rowCnt = rowCnt;
    }

    
    public FileAccessException(
            String message,
            String line,
            int rowCnt) {
        super(message);
        this.line = line;
        this.rowCnt = rowCnt;
    }

    
    public String getLine() {
        return line;
    }

    
    public int getRowCnt() {
        return rowCnt;
    }
}