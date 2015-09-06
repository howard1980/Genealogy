/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 退出的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("退出")
public class FsLogoutInDTO implements java.io.Serializable, Comparable<FsLogoutInDTO> {
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

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsLogoutInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
