/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 修改族人信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("修改族人信息")
public class FsUpdatePeopleLocalInDTO implements java.io.Serializable, Comparable<FsUpdatePeopleLocalInDTO> {
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
	* 经度  
	*/
	@Alias("经度")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Double longitude = null;

	/**
	* <code>经度</code>返回
	* @return <code>经度</code>
	*/
	public Double getLongitude() {
		return this.longitude;
	}

	/**
	* <code>longitude</code>设定
	* @param longitude　<code>longitude</code>设定值
	*/
	public void setLongitude(
			Double longitude) {
		this.longitude = longitude;
	}

	/**
	* 纬度  
	*/
	@Alias("纬度")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Double latitude = null;

	/**
	* <code>纬度</code>返回
	* @return <code>纬度</code>
	*/
	public Double getLatitude() {
		return this.latitude;
	}

	/**
	* <code>latitude</code>设定
	* @param latitude　<code>latitude</code>设定值
	*/
	public void setLatitude(
			Double latitude) {
		this.latitude = latitude;
	}

	/**
	* 地址名称  
	*/
	@Alias("地址名称")
	private String title = null;

	/**
	* <code>地址名称</code>返回
	* @return <code>地址名称</code>
	*/
	public String getTitle() {
		return this.title;
	}

	/**
	* <code>title</code>设定
	* @param title　<code>title</code>设定值
	*/
	public void setTitle(
			String title) {
		this.title = title;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdatePeopleLocalInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
