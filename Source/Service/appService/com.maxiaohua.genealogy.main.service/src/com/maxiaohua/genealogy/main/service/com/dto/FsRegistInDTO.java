/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 注册用户信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("注册用户信息")
public class FsRegistInDTO implements java.io.Serializable, Comparable<FsRegistInDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 手机号  
	*/
	@Alias("手机号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String mobile = null;

	/**
	* <code>手机号</code>返回
	* @return <code>手机号</code>
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
	* 验证码  
	*/
	@Alias("验证码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String validCode = null;

	/**
	* <code>验证码</code>返回
	* @return <code>验证码</code>
	*/
	public String getValidCode() {
		return this.validCode;
	}

	/**
	* <code>validCode</code>设定
	* @param validCode　<code>validCode</code>设定值
	*/
	public void setValidCode(
			String validCode) {
		this.validCode = validCode;
	}

	/**
	* 操作系统类型  
	*/
	@Alias("操作系统类型")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer imsi = null;

	/**
	* <code>操作系统类型</code>返回
	* @return <code>操作系统类型</code>
	*/
	public Integer getImsi() {
		return this.imsi;
	}

	/**
	* <code>imsi</code>设定
	* @param imsi　<code>imsi</code>设定值
	*/
	public void setImsi(
			Integer imsi) {
		this.imsi = imsi;
	}

	/**
	* 极光推送ID  
	*/
	@Alias("极光推送ID")
	private String regisitrationID = null;

	/**
	* <code>极光推送ID</code>返回
	* @return <code>极光推送ID</code>
	*/
	public String getRegisitrationID() {
		return this.regisitrationID;
	}

	/**
	* <code>regisitrationID</code>设定
	* @param regisitrationID　<code>regisitrationID</code>设定值
	*/
	public void setRegisitrationID(
			String regisitrationID) {
		this.regisitrationID = regisitrationID;
	}

	/**
	* 经度  
	*/
	@Alias("经度")
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
	* 维度  
	*/
	@Alias("维度")
	private Double latitude = null;

	/**
	* <code>维度</code>返回
	* @return <code>维度</code>
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
	* 城市CD  
	*/
	@Alias("城市CD")
	private String cityCode = null;

	/**
	* <code>城市CD</code>返回
	* @return <code>城市CD</code>
	*/
	public String getCityCode() {
		return this.cityCode;
	}

	/**
	* <code>cityCode</code>设定
	* @param cityCode　<code>cityCode</code>设定值
	*/
	public void setCityCode(
			String cityCode) {
		this.cityCode = cityCode;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsRegistInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
