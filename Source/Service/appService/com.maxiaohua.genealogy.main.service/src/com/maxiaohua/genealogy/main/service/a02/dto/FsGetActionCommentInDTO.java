﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得事件评论的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得事件评论")
public class FsGetActionCommentInDTO implements java.io.Serializable, Comparable<FsGetActionCommentInDTO> {
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
	* 活动ID  
	*/
	@Alias("活动ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String actionID = null;

	/**
	* <code>活动ID</code>返回
	* @return <code>活动ID</code>
	*/
	public String getActionID() {
		return this.actionID;
	}

	/**
	* <code>actionID</code>设定
	* @param actionID　<code>actionID</code>设定值
	*/
	public void setActionID(
			String actionID) {
		this.actionID = actionID;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetActionCommentInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
