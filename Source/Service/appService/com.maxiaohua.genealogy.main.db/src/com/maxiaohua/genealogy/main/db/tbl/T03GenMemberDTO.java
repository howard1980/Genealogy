/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T03GenMemberDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T03_GEN_MEMBER")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T03GenMemberDTO extends T03GenMemberDTOSupport implements java.io.Serializable, Comparable<T03GenMemberDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("GEN_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long genID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long perID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FAR_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long farID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MOT_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long motID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ONWER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long onwerID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time createTime = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getGenID() {
		return this.genID;
	}

	public void setGenID(
			Long genID) {
		this.genID = genID;
	}

	public Long getPerID() {
		return this.perID;
	}

	public void setPerID(
			Long perID) {
		this.perID = perID;
	}

	public Long getFarID() {
		return this.farID;
	}

	public void setFarID(
			Long farID) {
		this.farID = farID;
	}

	public Long getMotID() {
		return this.motID;
	}

	public void setMotID(
			Long motID) {
		this.motID = motID;
	}

	public Long getOnwerID() {
		return this.onwerID;
	}

	public void setOnwerID(
			Long onwerID) {
		this.onwerID = onwerID;
	}

	public java.sql.Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(
			java.sql.Date createDate) {
		this.createDate = createDate;
	}

	public java.sql.Time getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(
			java.sql.Time createTime) {
		this.createTime = createTime;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T03GenMemberDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

