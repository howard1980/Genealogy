﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * FemaleNoteDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("女性节点数据")
public class FemaleNoteDTO implements java.io.Serializable, Comparable<FemaleNoteDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private UserInfoDTO userInfo = null;

	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	private FamileyNoteDTO[] familey = null;

	public FamileyNoteDTO[] getFamiley() {
		return this.familey;
	}

	public void setFamiley(
			FamileyNoteDTO[] familey) {
		this.familey = familey;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FemaleNoteDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
