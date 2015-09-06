/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.biz.com.dto;

/**
 * AddressInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("地址信息")
public class AddressInfoDTO implements java.io.Serializable, Comparable<AddressInfoDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String title = null;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(
			String title) {
		this.title = title;
	}

	private Double longitude = null;

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(
			Double longitude) {
		this.longitude = longitude;
	}

	private Double latitude = null;

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(
			Double latitude) {
		this.latitude = latitude;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		AddressInfoDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
