/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T09PerHisStreamDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T09_PER_HIS_STREAM")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T09PerHisStreamDTO extends T09PerHisStreamDTOSupport implements java.io.Serializable, Comparable<T09PerHisStreamDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("HIS_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long hISID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String tYPE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PATH")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String pATH = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REMARKS")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String rEMARKS = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date cREATEDATE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time cREATETIME = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getHISID() {
		return this.hISID;
	}

	public void setHISID(
			Long hISID) {
		this.hISID = hISID;
	}

	public String getTYPE() {
		return this.tYPE;
	}

	public void setTYPE(
			String tYPE) {
		this.tYPE = tYPE;
	}

	public String getPATH() {
		return this.pATH;
	}

	public void setPATH(
			String pATH) {
		this.pATH = pATH;
	}

	public String getREMARKS() {
		return this.rEMARKS;
	}

	public void setREMARKS(
			String rEMARKS) {
		this.rEMARKS = rEMARKS;
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
			T09PerHisStreamDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

