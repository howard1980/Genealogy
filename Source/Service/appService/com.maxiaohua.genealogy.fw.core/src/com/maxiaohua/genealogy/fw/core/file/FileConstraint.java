
package com.maxiaohua.genealogy.fw.core.file;


public class FileConstraint {
    
    public final static String DEFAULT_TARGET_SERVICE_ID = "ALL";
    
    private final static Integer DEDAULT_SIZE_THRESHOLD = 3 * 1024 * 1024;
    
    private final static String DEDAULT_REPOSITORY = "";
    
    private final static Long DEDAULT_SIZE_MAX = Long.valueOf(30 * 1024 * 1024);
    
    private final static Long DEDAULT_FILE_SIZE_MAX = Long.valueOf(3 * 1024 * 1024);
    
    private final static Integer DEDAULT_FILE_COUNT = 10;

    
    private String targetServiceId;
    
    private Integer sizeThreshold;
    
    private String repository;
    
    private Long sizeMax;
    
    private Long fileSizeMax;
    
    private Integer fileCount;

    
    public FileConstraint() {
        super();
        this.targetServiceId = DEFAULT_TARGET_SERVICE_ID;
        this.sizeThreshold = DEDAULT_SIZE_THRESHOLD;
        this.repository = DEDAULT_REPOSITORY;
        this.sizeMax = DEDAULT_SIZE_MAX;
        this.fileSizeMax = DEDAULT_FILE_SIZE_MAX;
        this.fileCount = DEDAULT_FILE_COUNT;
    }

    
    public FileConstraint(
            int sizeThreshold,
            String repository,
            Long sizeMax,
            Long fileSizeMax) {
        super();
        this.targetServiceId = DEFAULT_TARGET_SERVICE_ID;
        this.sizeThreshold = sizeThreshold;
        this.repository = repository;
        this.sizeMax = sizeMax;
        this.fileSizeMax = fileSizeMax;
        this.fileCount = (int) (sizeMax / fileSizeMax);
    }

    
    public FileConstraint(
            int sizeThreshold,
            String repository,
            int fileCount,
            Long fileSizeMax) {
        super();
        this.targetServiceId = DEFAULT_TARGET_SERVICE_ID;
        this.sizeThreshold = sizeThreshold;
        this.repository = repository;
        this.fileCount = fileCount;
        this.fileSizeMax = fileSizeMax;
        this.sizeMax = fileSizeMax * fileCount;
    }

    
    public FileConstraint(
            String targetServiceId,
            int sizeThreshold,
            String repository,
            Long sizeMax,
            Long fileSizeMax) {
        super();
        this.targetServiceId = targetServiceId;
        this.sizeThreshold = sizeThreshold;
        this.repository = repository;
        this.sizeMax = sizeMax;
        this.fileSizeMax = fileSizeMax;
        this.fileCount = (int) (sizeMax / fileSizeMax);
    }

    
    public FileConstraint(
            String targetServiceId,
            Integer sizeThreshold,
            String repository,
            Integer fileCount,
            Long fileSizeMax) {
        super();
        this.targetServiceId = targetServiceId;
        this.sizeThreshold = sizeThreshold;
        this.repository = repository;
        this.fileCount = fileCount;
        this.fileSizeMax = fileSizeMax;
        this.sizeMax = fileSizeMax * fileCount;
    }

    
    public String getTargetServiceId() {
        return targetServiceId;
    }

    
    public void setTargetServiceId(
            String targetServiceId) {
        this.targetServiceId = targetServiceId;
    }

    
    public Integer getSizeThreshold() {
        return sizeThreshold;
    }

    
    public void setSizeThreshold(
            Integer sizeThreshold) {
        this.sizeThreshold = sizeThreshold;
    }

    
    public String getRepository() {
        return repository;
    }

    
    public void setRepository(
            String repository) {
        this.repository = repository;
    }

    
    public Long getSizeMax() {
        return sizeMax;
    }

    
    public void setSizeMax(
            Long sizeMax) {
        this.sizeMax = sizeMax;
    }

    
    public Long getFileSizeMax() {
        return fileSizeMax;
    }

    
    public void setFileSizeMax(
            Long fileSizeMax) {
        this.fileSizeMax = fileSizeMax;
    }

    
    public Integer getFileCount() {
        return fileCount;
    }

    
    public void setFileCount(
            Integer fileCount) {
        this.fileCount = fileCount;
    }
}