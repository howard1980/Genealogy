﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T06PerHistoryDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T06_PER_HISTORY")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T06PerHistoryDTO extends T06PerHistoryDTOSupport implements java.io.Serializable, Comparable<T06PerHistoryDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 45, max = 45)
	private String pERID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String eVENTTYPE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date eVENTDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time eVENTTIME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lATITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double lONGITUDE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("TITLE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String tITLE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PRAISE")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer pRAISE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("SHOW_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String sHOWTYPE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REMARKS")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 4000, max = 4000)
	private String rEMARKS = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Timestamp cREATETIME = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public String getPERID() {
		return this.pERID;
	}

	public void setPERID(
			String pERID) {
		this.pERID = pERID;
	}

	public String getEVENTTYPE() {
		return this.eVENTTYPE;
	}

	public void setEVENTTYPE(
			String eVENTTYPE) {
		this.eVENTTYPE = eVENTTYPE;
	}

	public java.sql.Date getEVENTDATE() {
		return this.eVENTDATE;
	}

	public void setEVENTDATE(
			java.sql.Date eVENTDATE) {
		this.eVENTDATE = eVENTDATE;
	}

	public java.sql.Time getEVENTTIME() {
		return this.eVENTTIME;
	}

	public void setEVENTTIME(
			java.sql.Time eVENTTIME) {
		this.eVENTTIME = eVENTTIME;
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

	public String getTITLE() {
		return this.tITLE;
	}

	public void setTITLE(
			String tITLE) {
		this.tITLE = tITLE;
	}

	public Integer getPRAISE() {
		return this.pRAISE;
	}

	public void setPRAISE(
			Integer pRAISE) {
		this.pRAISE = pRAISE;
	}

	public String getSHOWTYPE() {
		return this.sHOWTYPE;
	}

	public void setSHOWTYPE(
			String sHOWTYPE) {
		this.sHOWTYPE = sHOWTYPE;
	}

	public String getREMARKS() {
		return this.rEMARKS;
	}

	public void setREMARKS(
			String rEMARKS) {
		this.rEMARKS = rEMARKS;
	}

	public java.sql.Timestamp getCREATETIME() {
		return this.cREATETIME;
	}

	public void setCREATETIME(
			java.sql.Timestamp cREATETIME) {
		this.cREATETIME = cREATETIME;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T06PerHistoryDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

