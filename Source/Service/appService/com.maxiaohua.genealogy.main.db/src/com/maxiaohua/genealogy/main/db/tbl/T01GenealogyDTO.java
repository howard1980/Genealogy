/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T01GenealogyDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T01_GENEALOGY")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T01GenealogyDTO extends T01GenealogyDTOSupport implements java.io.Serializable, Comparable<T01GenealogyDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FIRST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String fIRSTNAME = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ARMS")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String aRMS = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VIDEO")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String vIDEO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String iNFOMATION = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long bIGINT = null;

	public Long getID() {
		return this.iD;
	}

	public void setID(
			Long iD) {
		this.iD = iD;
	}

	public String getFIRSTNAME() {
		return this.fIRSTNAME;
	}

	public void setFIRSTNAME(
			String fIRSTNAME) {
		this.fIRSTNAME = fIRSTNAME;
	}

	public String getARMS() {
		return this.aRMS;
	}

	public void setARMS(
			String aRMS) {
		this.aRMS = aRMS;
	}

	public String getVIDEO() {
		return this.vIDEO;
	}

	public void setVIDEO(
			String vIDEO) {
		this.vIDEO = vIDEO;
	}

	public String getINFOMATION() {
		return this.iNFOMATION;
	}

	public void setINFOMATION(
			String iNFOMATION) {
		this.iNFOMATION = iNFOMATION;
	}

	public Long getBIGINT() {
		return this.bIGINT;
	}

	public void setBIGINT(
			Long bIGINT) {
		this.bIGINT = bIGINT;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T01GenealogyDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

