/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a04.dto;

import com.maxiaohua.genealogy.main.biz.com.dto.AddressInfoDTO;

/**
 * ActionDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("事件信息")
public class ActionDTO implements java.io.Serializable, Comparable<ActionDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String actionID = null;

	public String getActionID() {
		return this.actionID;
	}

	public void setActionID(
			String actionID) {
		this.actionID = actionID;
	}

	private String descriptions = null;

	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(
			String descriptions) {
		this.descriptions = descriptions;
	}

	private Integer type = null;

	public Integer getType() {
		return this.type;
	}

	public void setType(
			Integer type) {
		this.type = type;
	}

	private java.sql.Date date = null;

	public java.sql.Date getDate() {
		return this.date;
	}

	public void setDate(
			java.sql.Date date) {
		this.date = date;
	}

	private java.sql.Time time = null;

	public java.sql.Time getTime() {
		return this.time;
	}

	public void setTime(
			java.sql.Time time) {
		this.time = time;
	}

	private AddressInfoDTO location = null;

	public AddressInfoDTO getLocation() {
		return this.location;
	}

	public void setLocation(
			AddressInfoDTO location) {
		this.location = location;
	}

	private String coverImage = null;

	public String getCoverImage() {
		return this.coverImage;
	}

	public void setCoverImage(
			String coverImage) {
		this.coverImage = coverImage;
	}

	private String[] pictures = null;

	public String[] getPictures() {
		return this.pictures;
	}

	public void setPictures(
			String[] pictures) {
		this.pictures = pictures;
	}

	private String[] videos = null;

	public String[] getVideos() {
		return this.videos;
	}

	public void setVideos(
			String[] videos) {
		this.videos = videos;
	}

	private String introduction = null;

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(
			String introduction) {
		this.introduction = introduction;
	}

	private Integer isPublic = null;

	public Integer getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(
			Integer isPublic) {
		this.isPublic = isPublic;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		ActionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
