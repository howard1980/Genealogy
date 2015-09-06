/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T17PerQuestionDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T17_PER_QUESTION")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T17PerQuestionDTO extends T17PerQuestionDTOSupport implements java.io.Serializable, Comparable<T17PerQuestionDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long pERID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("QUESTION")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String qUESTION = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("STATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String sTATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	private java.sql.Timestamp cREATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("UPDATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	private java.sql.Timestamp uPDATEDATE = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getPERID() {
		return this.pERID;
	}

	public void setPERID(
			Long pERID) {
		this.pERID = pERID;
	}

	public String getQUESTION() {
		return this.qUESTION;
	}

	public void setQUESTION(
			String qUESTION) {
		this.qUESTION = qUESTION;
	}

	public String getSTATE() {
		return this.sTATE;
	}

	public void setSTATE(
			String sTATE) {
		this.sTATE = sTATE;
	}

	public java.sql.Timestamp getCREATEDATE() {
		return this.cREATEDATE;
	}

	public void setCREATEDATE(
			java.sql.Timestamp cREATEDATE) {
		this.cREATEDATE = cREATEDATE;
	}

	public java.sql.Timestamp getUPDATEDATE() {
		return this.uPDATEDATE;
	}

	public void setUPDATEDATE(
			java.sql.Timestamp uPDATEDATE) {
		this.uPDATEDATE = uPDATEDATE;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T17PerQuestionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

