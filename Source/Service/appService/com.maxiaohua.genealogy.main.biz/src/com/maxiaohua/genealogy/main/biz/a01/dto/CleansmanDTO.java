/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * CleansmanDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族用户单点信息")
public class CleansmanDTO implements java.io.Serializable, Comparable<CleansmanDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private UserInfoDTO[] userIs = null;

	public UserInfoDTO[] getUserIs() {
		return this.userIs;
	}

	public void setUserIs(
			UserInfoDTO[] userIs) {
		this.userIs = userIs;
	}

	private String title = null;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(
			String title) {
		this.title = title;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		CleansmanDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
