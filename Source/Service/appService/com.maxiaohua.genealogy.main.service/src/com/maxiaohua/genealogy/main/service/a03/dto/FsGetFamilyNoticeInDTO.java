/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得家族事件通告的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族事件通告")
public class FsGetFamilyNoticeInDTO implements java.io.Serializable, Comparable<FsGetFamilyNoticeInDTO> {
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
	* 状态  
	*/
	@Alias("状态")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer state = null;

	/**
	* <code>状态</code>返回
	* @return <code>状态</code>
	*/
	public Integer getState() {
		return this.state;
	}

	/**
	* <code>state</code>设定
	* @param state　<code>state</code>设定值
	*/
	public void setState(
			Integer state) {
		this.state = state;
	}

	/**
	* 页数  
	*/
	@Alias("页数")
	private Integer pages = null;

	/**
	* <code>页数</code>返回
	* @return <code>页数</code>
	*/
	public Integer getPages() {
		return this.pages;
	}

	/**
	* <code>pages</code>设定
	* @param pages　<code>pages</code>设定值
	*/
	public void setPages(
			Integer pages) {
		this.pages = pages;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetFamilyNoticeInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
