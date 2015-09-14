/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T02PersonalDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T02_PERSONAL")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T02PersonalDTO extends T02PersonalDTOSupport implements java.io.Serializable, Comparable<T02PersonalDTO> {

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
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String firstName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String lastName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String nO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MOBILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String mobile = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MAILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 100, max = 100)
	private String maile = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIRTH_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date birthDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIRTH_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time birthTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("SEX")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	private Integer sex = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COVER")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String cover = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("HEAD_PORTRAIT")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String headPortrait = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VIDEO")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String video = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(12)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String infomation = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(13)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double latitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(14)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double longitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGEDIT_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(15)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date regeditDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGEDIT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(16)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time regeditTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("OWNER_ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(17)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	private Long ownerID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(18)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date createDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(19)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
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

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(
			String lastName) {
		this.lastName = lastName;
	}

	public String getNO() {
		return this.nO;
	}

	public void setNO(
			String nO) {
		this.nO = nO;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	public String getMaile() {
		return this.maile;
	}

	public void setMaile(
			String maile) {
		this.maile = maile;
	}

	public java.sql.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(
			java.sql.Date birthDate) {
		this.birthDate = birthDate;
	}

	public java.sql.Time getBirthTime() {
		return this.birthTime;
	}

	public void setBirthTime(
			java.sql.Time birthTime) {
		this.birthTime = birthTime;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(
			Integer sex) {
		this.sex = sex;
	}

	public String getCover() {
		return this.cover;
	}

	public void setCover(
			String cover) {
		this.cover = cover;
	}

	public String getHeadPortrait() {
		return this.headPortrait;
	}

	public void setHeadPortrait(
			String headPortrait) {
		this.headPortrait = headPortrait;
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

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(
			Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(
			Double longitude) {
		this.longitude = longitude;
	}

	public java.sql.Date getRegeditDate() {
		return this.regeditDate;
	}

	public void setRegeditDate(
			java.sql.Date regeditDate) {
		this.regeditDate = regeditDate;
	}

	public java.sql.Time getRegeditTime() {
		return this.regeditTime;
	}

	public void setRegeditTime(
			java.sql.Time regeditTime) {
		this.regeditTime = regeditTime;
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
			T02PersonalDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

