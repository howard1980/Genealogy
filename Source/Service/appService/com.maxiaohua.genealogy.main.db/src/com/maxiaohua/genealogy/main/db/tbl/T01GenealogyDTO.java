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
 * 1.0          2015/09/15             TOOL                 Create
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
	private String firstName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ARMS")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String arms = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VIDEO")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String video = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String infomation = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("OWNER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private Long ownerID = null;

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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(
			String firstName) {
		this.firstName = firstName;
	}

	public String getArms() {
		return this.arms;
	}

	public void setArms(
			String arms) {
		this.arms = arms;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(
			String video) {
		this.video = video;
	}

	public String getInfomation() {
		return this.infomation;
	}

	public void setInfomation(
			String infomation) {
		this.infomation = infomation;
	}

	public Long getOwnerID() {
		return this.ownerID;
	}

	public void setOwnerID(
			Long ownerID) {
		this.ownerID = ownerID;
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
			T01GenealogyDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

