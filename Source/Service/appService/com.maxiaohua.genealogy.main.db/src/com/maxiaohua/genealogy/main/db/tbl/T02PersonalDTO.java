﻿/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T02PersonalDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T02_PERSONAL")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T02PersonalDTO extends T02PersonalDTOSupport implements java.io.Serializable, Comparable<T02PersonalDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FIRST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String fIRSTNAME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String lASTNAME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String nO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MOBILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String mOBILE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MAILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 100, max = 100)
	private String mAILE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIRTH_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date bIRTHDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("SEX")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer sEX = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COVER")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String cOVER = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("HEAD_PORTRAIT")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String hEADPORTRAIT = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VIDEO")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String vIDEO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String iNFOMATION = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(12)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lATITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(13)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lONGITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGEDIT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(14)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Timestamp rEGEDITTIME = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public String getFIRSTNAME() {
		return this.fIRSTNAME;
	}

	public void setFIRSTNAME(
			String fIRSTNAME) {
		this.fIRSTNAME = fIRSTNAME;
	}

	public String getLASTNAME() {
		return this.lASTNAME;
	}

	public void setLASTNAME(
			String lASTNAME) {
		this.lASTNAME = lASTNAME;
	}

	public String getNO() {
		return this.nO;
	}

	public void setNO(
			String nO) {
		this.nO = nO;
	}

	public String getMOBILE() {
		return this.mOBILE;
	}

	public void setMOBILE(
			String mOBILE) {
		this.mOBILE = mOBILE;
	}

	public String getMAILE() {
		return this.mAILE;
	}

	public void setMAILE(
			String mAILE) {
		this.mAILE = mAILE;
	}

	public java.sql.Date getBIRTHDATE() {
		return this.bIRTHDATE;
	}

	public void setBIRTHDATE(
			java.sql.Date bIRTHDATE) {
		this.bIRTHDATE = bIRTHDATE;
	}

	public Integer getSEX() {
		return this.sEX;
	}

	public void setSEX(
			Integer sEX) {
		this.sEX = sEX;
	}

	public String getCOVER() {
		return this.cOVER;
	}

	public void setCOVER(
			String cOVER) {
		this.cOVER = cOVER;
	}

	public String getHEADPORTRAIT() {
		return this.hEADPORTRAIT;
	}

	public void setHEADPORTRAIT(
			String hEADPORTRAIT) {
		this.hEADPORTRAIT = hEADPORTRAIT;
	}

	public String getVIDEO() {
		return this.vIDEO;
	}

	public void setVIDEO(
			String vIDEO) {
		this.vIDEO = vIDEO;
	}

	public String getINFOMATION() {
		return this.iNFOMATION;
	}

	public void setINFOMATION(
			String iNFOMATION) {
		this.iNFOMATION = iNFOMATION;
	}

	public Double getLATITUDE() {
		return this.lATITUDE;
	}

	public void setLATITUDE(
			Double lATITUDE) {
		this.lATITUDE = lATITUDE;
	}

	public Double getLONGITUDE() {
		return this.lONGITUDE;
	}

	public void setLONGITUDE(
			Double lONGITUDE) {
		this.lONGITUDE = lONGITUDE;
	}

	public java.sql.Timestamp getREGEDITTIME() {
		return this.rEGEDITTIME;
	}

	public void setREGEDITTIME(
			java.sql.Timestamp rEGEDITTIME) {
		this.rEGEDITTIME = rEGEDITTIME;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T02PersonalDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
