/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T16NoticeCommentDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T16_NOTICE_COMMENT")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T16NoticeCommentDTO extends T16NoticeCommentDTOSupport implements java.io.Serializable, Comparable<T16NoticeCommentDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NOT_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long nOTID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long pERID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COMMENT")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String cOMMENT = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date cREATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time cREATETIME = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getNOTID() {
		return this.nOTID;
	}

	public void setNOTID(
			Long nOTID) {
		this.nOTID = nOTID;
	}

	public Long getPERID() {
		return this.pERID;
	}

	public void setPERID(
			Long pERID) {
		this.pERID = pERID;
	}

	public String getCOMMENT() {
		return this.cOMMENT;
	}

	public void setCOMMENT(
			String cOMMENT) {
		this.cOMMENT = cOMMENT;
	}

	public java.sql.Date getCREATEDATE() {
		return this.cREATEDATE;
	}

	public void setCREATEDATE(
			java.sql.Date cREATEDATE) {
		this.cREATEDATE = cREATEDATE;
	}

	public java.sql.Time getCREATETIME() {
		return this.cREATETIME;
	}

	public void setCREATETIME(
			java.sql.Time cREATETIME) {
		this.cREATETIME = cREATETIME;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T16NoticeCommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

