/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 修改族人信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/14         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("修改族人信息")
public class FsUpdatePeopleInfoInDTO implements java.io.Serializable, Comparable<FsUpdatePeopleInfoInDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 用户ID  
	*/
	@Alias("用户ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String userID = null;

	/**
	* <code>用户ID</code>返回
	* @return <code>用户ID</code>
	*/
	public String getUserID() {
		return this.userID;
	}

	/**
	* <code>userID</code>设定
	* @param userID　<code>userID</code>设定值
	*/
	public void setUserID(
			String userID) {
		this.userID = userID;
	}

	/**
	* 族人ID  
	*/
	@Alias("族人ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String clansmanID = null;

	/**
	* <code>族人ID</code>返回
	* @return <code>族人ID</code>
	*/
	public String getClansmanID() {
		return this.clansmanID;
	}

	/**
	* <code>clansmanID</code>设定
	* @param clansmanID　<code>clansmanID</code>设定值
	*/
	public void setClansmanID(
			String clansmanID) {
		this.clansmanID = clansmanID;
	}

	/**
	* 姓氏  
	*/
	@Alias("姓氏")
	private String fisrtName = null;

	/**
	* <code>姓氏</code>返回
	* @return <code>姓氏</code>
	*/
	public String getFisrtName() {
		return this.fisrtName;
	}

	/**
	* <code>fisrtName</code>设定
	* @param fisrtName　<code>fisrtName</code>设定值
	*/
	public void setFisrtName(
			String fisrtName) {
		this.fisrtName = fisrtName;
	}

	/**
	* 名称  
	*/
	@Alias("名称")
	private String lastName = null;

	/**
	* <code>名称</code>返回
	* @return <code>名称</code>
	*/
	public String getLastName() {
		return this.lastName;
	}

	/**
	* <code>lastName</code>设定
	* @param lastName　<code>lastName</code>设定值
	*/
	public void setLastName(
			String lastName) {
		this.lastName = lastName;
	}

	/**
	* 性别  
	*/
	@Alias("性别")
	private Integer sex = null;

	/**
	* <code>性别</code>返回
	* @return <code>性别</code>
	*/
	public Integer getSex() {
		return this.sex;
	}

	/**
	* <code>sex</code>设定
	* @param sex　<code>sex</code>设定值
	*/
	public void setSex(
			Integer sex) {
		this.sex = sex;
	}

	/**
	* 出生年月日  
	*/
	@Alias("出生年月日")
	private java.sql.Date birthday = null;

	/**
	* <code>出生年月日</code>返回
	* @return <code>出生年月日</code>
	*/
	public java.sql.Date getBirthday() {
		return this.birthday;
	}

	/**
	* <code>birthday</code>设定
	* @param birthday　<code>birthday</code>设定值
	*/
	public void setBirthday(
			java.sql.Date birthday) {
		this.birthday = birthday;
	}

	/**
	* 出生时间  
	*/
	@Alias("出生时间")
	private java.sql.Time birthTime = null;

	/**
	* <code>出生时间</code>返回
	* @return <code>出生时间</code>
	*/
	public java.sql.Time getBirthTime() {
		return this.birthTime;
	}

	/**
	* <code>birthTime</code>设定
	* @param birthTime　<code>birthTime</code>设定值
	*/
	public void setBirthTime(
			java.sql.Time birthTime) {
		this.birthTime = birthTime;
	}

	/**
	* 手机  
	*/
	@Alias("手机")
	private String mobile = null;

	/**
	* <code>手机</code>返回
	* @return <code>手机</code>
	*/
	public String getMobile() {
		return this.mobile;
	}

	/**
	* <code>mobile</code>设定
	* @param mobile　<code>mobile</code>设定值
	*/
	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	/**
	* 邮箱  
	*/
	@Alias("邮箱")
	private String maile = null;

	/**
	* <code>邮箱</code>返回
	* @return <code>邮箱</code>
	*/
	public String getMaile() {
		return this.maile;
	}

	/**
	* <code>maile</code>设定
	* @param maile　<code>maile</code>设定值
	*/
	public void setMaile(
			String maile) {
		this.maile = maile;
	}

	/**
	* 背景  
	*/
	@Alias("背景")
	private String backPath = null;

	/**
	* <code>背景</code>返回
	* @return <code>背景</code>
	*/
	public String getBackPath() {
		return this.backPath;
	}

	/**
	* <code>backPath</code>设定
	* @param backPath　<code>backPath</code>设定值
	*/
	public void setBackPath(
			String backPath) {
		this.backPath = backPath;
	}

	/**
	* 头像  
	*/
	@Alias("头像")
	private String selfPath = null;

	/**
	* <code>头像</code>返回
	* @return <code>头像</code>
	*/
	public String getSelfPath() {
		return this.selfPath;
	}

	/**
	* <code>selfPath</code>设定
	* @param selfPath　<code>selfPath</code>设定值
	*/
	public void setSelfPath(
			String selfPath) {
		this.selfPath = selfPath;
	}

	/**
	* 图片  
	*/
	@Alias("图片")
	private String[] picture = null;

	/**
	* <code>图片</code>返回
	* @return <code>图片</code>
	*/
	public String[] getPicture() {
		return this.picture;
	}

	/**
	* <code>picture</code>设定
	* @param picture　<code>picture</code>设定值
	*/
	public void setPicture(
			String[] picture) {
		this.picture = picture;
	}

	/**
	* 视频  
	*/
	@Alias("视频")
	private String[] video = null;

	/**
	* <code>视频</code>返回
	* @return <code>视频</code>
	*/
	public String[] getVideo() {
		return this.video;
	}

	/**
	* <code>video</code>设定
	* @param video　<code>video</code>设定值
	*/
	public void setVideo(
			String[] video) {
		this.video = video;
	}

	/**
	* 简介  
	*/
	@Alias("简介")
	private String profile = null;

	/**
	* <code>简介</code>返回
	* @return <code>简介</code>
	*/
	public String getProfile() {
		return this.profile;
	}

	/**
	* <code>profile</code>设定
	* @param profile　<code>profile</code>设定值
	*/
	public void setProfile(
			String profile) {
		this.profile = profile;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdatePeopleInfoInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
