/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T07PerSetDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T07_PER_SET")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T07PerSetDTO extends T07PerSetDTOSupport implements java.io.Serializable, Comparable<T07PerSetDTO> {

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

	@com.maxiaohua.genealogy.fw.core.type.Alias("SHOW_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String sHOWTYPE = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CONTACT_SHOW")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String cONTACTSHOW = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VOICE_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 45, max = 45)
	private String vOICETYPE = null;

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

	public String getSHOWTYPE() {
		return this.sHOWTYPE;
	}

	public void setSHOWTYPE(
			String sHOWTYPE) {
		this.sHOWTYPE = sHOWTYPE;
	}

	public String getCONTACTSHOW() {
		return this.cONTACTSHOW;
	}

	public void setCONTACTSHOW(
			String cONTACTSHOW) {
		this.cONTACTSHOW = cONTACTSHOW;
	}

	public String getVOICETYPE() {
		return this.vOICETYPE;
	}

	public void setVOICETYPE(
			String vOICETYPE) {
		this.vOICETYPE = vOICETYPE;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T07PerSetDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

