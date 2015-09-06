/*
 * CCIS
 * (C) Copyright Code MZ, Ltd. 2014,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T10PerStreamDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T10_PER_STREAM")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T10PerStreamDTO extends T10PerStreamDTOSupport implements java.io.Serializable, Comparable<T10PerStreamDTO> {

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

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T10PerStreamDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

