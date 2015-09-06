/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 以树的形式获得家族情况的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("以树的形式获得家族情况")
public class FsGetClansmanTreeInDTO implements java.io.Serializable, Comparable<FsGetClansmanTreeInDTO> {
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

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetClansmanTreeInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
