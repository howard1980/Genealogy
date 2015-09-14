/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T08PerPushDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T08_PER_PUSH")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T08PerPushDTO extends T08PerPushDTOSupport implements java.io.Serializable, Comparable<T08PerPushDTO> {

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
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long perID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGISITRATIONID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 15, max = 15)
	private String regisitrationID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IMSI")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Integer iMSI = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getPerID() {
		return this.perID;
	}

	public void setPerID(
			Long perID) {
		this.perID = perID;
	}

	public String getRegisitrationID() {
		return this.regisitrationID;
	}

	public void setRegisitrationID(
			String regisitrationID) {
		this.regisitrationID = regisitrationID;
	}

	public Integer getIMSI() {
		return this.iMSI;
	}

	public void setIMSI(
			Integer iMSI) {
		this.iMSI = iMSI;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T08PerPushDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

