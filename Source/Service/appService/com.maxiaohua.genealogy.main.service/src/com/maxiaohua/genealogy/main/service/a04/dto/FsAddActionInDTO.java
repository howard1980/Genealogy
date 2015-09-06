/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a04.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a04.dto.ActionDTO;

/**
 * 添加个人事件的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("添加个人事件")
public class FsAddActionInDTO implements java.io.Serializable, Comparable<FsAddActionInDTO> {
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
	* 事件  
	*/
	@Alias("事件")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private ActionDTO action = null;

	/**
	* <code>事件</code>返回
	* @return <code>事件</code>
	*/
	public ActionDTO getAction() {
		return this.action;
	}

	/**
	* <code>action</code>设定
	* @param action　<code>action</code>设定值
	*/
	public void setAction(
			ActionDTO action) {
		this.action = action;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsAddActionInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
