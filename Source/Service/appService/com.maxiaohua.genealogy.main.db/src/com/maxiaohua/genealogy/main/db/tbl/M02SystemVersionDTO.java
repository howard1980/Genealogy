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
 * 1.0          2015/09/15             TOOL                 Create
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
	private Integer channel = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VERSION")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double version = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LOAD_PATH")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1000, max = 1000)
	private String loadPath = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DESCRIP")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 2000, max = 2000)
	private String descrip = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer delFlg = null;

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

	public Integer getChannel() {
		return this.channel;
	}

	public void setChannel(
			Integer channel) {
		this.channel = channel;
	}

	public Double getVersion() {
		return this.version;
	}

	public void setVersion(
			Double version) {
		this.version = version;
	}

	public String getLoadPath() {
		return this.loadPath;
	}

	public void setLoadPath(
			String loadPath) {
		this.loadPath = loadPath;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(
			String descrip) {
		this.descrip = descrip;
	}

	public Integer getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(
			Integer delFlg) {
		this.delFlg = delFlg;
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

