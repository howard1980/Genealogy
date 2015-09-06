
package com.maxiaohua.genealogy.fw.core.file;

import com.maxiaohua.genealogy.fw.core.type.Alias;


public class FileInfoDTO implements java.io.Serializable {
    
    @Alias("銉曘偂銈ゃ儷鍚�")
    private String fileName;

    
    @Alias("銉曘偂銈ゃ儷銉汇偪銈ゃ儣")
    private String fileType;

    
    @Alias("鏂囧瓧銈炽兗銉�")
    private String charEncoding;

    
    @Alias("銉曘偂銈ゃ儷涓�?")
    private byte[] fileContent;

    
    @Alias("銉曘偂銈ゃ儷涓�?")
    private String encodedFileContent;

    
    @Alias("闁㈤�ｃ儐銉笺儢銉�")
    private String relatedTable;

    
    @Alias("闁㈤�ｃ偝銉┿儬")
    private String relatedColumn;

    
    public String getFileName() {
        return fileName;
    }

    
    public void setFileName(
            String fileName) {
        this.fileName = fileName;
    }

    
    public String getFileType() {
        return fileType;
    }

    
    public void setFileType(
            String fileType) {
        this.fileType = fileType;
    }

    
    public String getCharEncoding() {
        return charEncoding;
    }

    
    public void setCharEncoding(
            String charEncoding) {
        this.charEncoding = charEncoding;
    }

    
    public byte[] getFileContent() {
        return fileContent;
    }

    
    public void setFileContent(
            byte[] fileContent) {
        this.fileContent = fileContent;
    }

    
    public String getEncodedFileContent() {
        return encodedFileContent;
    }

    
    public void setEncodedFileContent(
            String encodedFileContent) {
        this.encodedFileContent = encodedFileContent;
    }

    
    public String getRelatedTable() {
        return relatedTable;
    }

    
    public void setRelatedTable(
            String relatedTable) {
        this.relatedTable = relatedTable;
    }

    
    public String getRelatedColumn() {
        return relatedColumn;
    }

    
    public void setRelatedColumn(
            String relatedColumn) {
        this.relatedColumn = relatedColumn;
    }

    
    private static final long serialVersionUID = 1L;
}