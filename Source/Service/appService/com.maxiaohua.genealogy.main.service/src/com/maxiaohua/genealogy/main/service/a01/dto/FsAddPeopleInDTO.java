﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * 新增族人信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/14         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("新增族人信息")
public class FsAddPeopleInDTO implements java.io.Serializable, Comparable<FsAddPeopleInDTO> {
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
	private String familyID = null;

	/**
	* <code>家族ID</code>返回
	* @return <code>家族ID</code>
	*/
	public String getFamilyID() {
		return this.familyID;
	}

	/**
	* <code>familyID</code>设定
	* @param familyID　<code>familyID</code>设定值
	*/
	public void setFamilyID(
			String familyID) {
		this.familyID = familyID;
	}

	/**
	* 被选用户  
	*/
	@Alias("被选用户")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String selectedUserID = null;

	/**
	* <code>被选用户</code>返回
	* @return <code>被选用户</code>
	*/
	public String getSelectedUserID() {
		return this.selectedUserID;
	}

	/**
	* <code>selectedUserID</code>设定
	* @param selectedUserID　<code>selectedUserID</code>设定值
	*/
	public void setSelectedUserID(
			String selectedUserID) {
		this.selectedUserID = selectedUserID;
	}

	/**
	* 关系  
	*/
	@Alias("关系")
	private Integer relation = null;

	/**
	* <code>关系</code>返回
	* @return <code>关系</code>
	*/
	public Integer getRelation() {
		return this.relation;
	}

	/**
	* <code>relation</code>设定
	* @param relation　<code>relation</code>设定值
	*/
	public void setRelation(
			Integer relation) {
		this.relation = relation;
	}

	/**
	* 族人信息  
	*/
	@Alias("族人信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private UserInfoDTO userInfo = null;

	/**
	* <code>族人信息</code>返回
	* @return <code>族人信息</code>
	*/
	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	/**
	* <code>userInfo</code>设定
	* @param userInfo　<code>userInfo</code>设定值
	*/
	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsAddPeopleInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}