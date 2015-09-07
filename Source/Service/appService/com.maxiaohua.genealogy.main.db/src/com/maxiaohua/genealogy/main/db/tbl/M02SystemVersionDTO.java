/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.M02SystemVersionDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("M02_SYSTEM_VERSION")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class M02SystemVersionDTO extends M02SystemVersionDTOSupport implements java.io.Serializable, Comparable<M02SystemVersionDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Integer iD = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IMSI")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer iMSI = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CHANNEL")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer cHANNEL = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VERSION")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double vERSION = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LOAD_PATH")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1000, max = 1000)
	private String lOADPATH = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DESCRIP")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 2000, max = 2000)
	private String dESCRIP = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer dELFLG = null;

	public Integer getID() {
		return this.iD;
	}

	public void setID(
			Integer iD) {
		this.iD = iD;
	}

	public Integer getIMSI() {
		return this.iMSI;
	}

	public void setIMSI(
			Integer iMSI) {
		this.iMSI = iMSI;
	}

	public Integer getCHANNEL() {
		return this.cHANNEL;
	}

	public void setCHANNEL(
			Integer cHANNEL) {
		this.cHANNEL = cHANNEL;
	}

	public Double getVERSION() {
		return this.vERSION;
	}

	public void setVERSION(
			Double vERSION) {
		this.vERSION = vERSION;
	}

	public String getLOADPATH() {
		return this.lOADPATH;
	}

	public void setLOADPATH(
			String lOADPATH) {
		this.lOADPATH = lOADPATH;
	}

	public String getDESCRIP() {
		return this.dESCRIP;
	}

	public void setDESCRIP(
			String dESCRIP) {
		this.dESCRIP = dESCRIP;
	}

	public Integer getDELFLG() {
		return this.dELFLG;
	}

	public void setDELFLG(
			Integer dELFLG) {
		this.dELFLG = dELFLG;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			M02SystemVersionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

