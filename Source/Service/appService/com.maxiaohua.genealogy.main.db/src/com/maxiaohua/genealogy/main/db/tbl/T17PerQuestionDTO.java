/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T17PerQuestionDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
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
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date cREATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time cREATETIME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("UPDATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATETIME")
	private java.sql.Timestamp uPDATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("UPDATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time uPDATETIME = null;

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

	public java.sql.Timestamp getUPDATEDATE() {
		return this.uPDATEDATE;
	}

	public void setUPDATEDATE(
			java.sql.Timestamp uPDATEDATE) {
		this.uPDATEDATE = uPDATEDATE;
	}

	public java.sql.Time getUPDATETIME() {
		return this.uPDATETIME;
	}

	public void setUPDATETIME(
			java.sql.Time uPDATETIME) {
		this.uPDATETIME = uPDATETIME;
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

