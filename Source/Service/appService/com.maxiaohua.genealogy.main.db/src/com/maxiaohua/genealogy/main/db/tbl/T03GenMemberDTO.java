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
 * 1.0          2015/09/14             TOOL                 Create
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
	private Long gENID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long pERID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FAR_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long fARID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MOT_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long mOTID = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public Long getGENID() {
		return this.gENID;
	}

	public void setGENID(
			Long gENID) {
		this.gENID = gENID;
	}

	public Long getPERID() {
		return this.pERID;
	}

	public void setPERID(
			Long pERID) {
		this.pERID = pERID;
	}

	public Long getFARID() {
		return this.fARID;
	}

	public void setFARID(
			Long fARID) {
		this.fARID = fARID;
	}

	public Long getMOTID() {
		return this.mOTID;
	}

	public void setMOTID(
			Long mOTID) {
		this.mOTID = mOTID;
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

