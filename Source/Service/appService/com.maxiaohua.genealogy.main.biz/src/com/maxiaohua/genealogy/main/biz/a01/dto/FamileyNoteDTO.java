/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * FamileyNoteDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/01             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家庭节点数据")
public class FamileyNoteDTO implements java.io.Serializable, Comparable<FamileyNoteDTO> {
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

	private FemaleNoteDTO[] wives = null;

	public FemaleNoteDTO[] getWives() {
		return this.wives;
	}

	public void setWives(
			FemaleNoteDTO[] wives) {
		this.wives = wives;
	}

	private Integer weight = null;

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(
			Integer weight) {
		this.weight = weight;
	}

	private Integer plies = null;

	public Integer getPlies() {
		return this.plies;
	}

	public void setPlies(
			Integer plies) {
		this.plies = plies;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FamileyNoteDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
