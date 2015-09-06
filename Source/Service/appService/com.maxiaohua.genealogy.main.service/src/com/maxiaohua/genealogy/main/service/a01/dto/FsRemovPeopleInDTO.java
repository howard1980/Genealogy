﻿/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 删除族人信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("删除族人信息")
public class FsRemovPeopleInDTO implements java.io.Serializable, Comparable<FsRemovPeopleInDTO> {
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
	* 家族ID  
	*/
	@Alias("家族ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer familyID = null;

	/**
	* <code>家族ID</code>返回
	* @return <code>家族ID</code>
	*/
	public Integer getFamilyID() {
		return this.familyID;
	}

	/**
	* <code>familyID</code>设定
	* @param familyID　<code>familyID</code>设定值
	*/
	public void setFamilyID(
			Integer familyID) {
		this.familyID = familyID;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsRemovPeopleInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}