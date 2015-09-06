/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 上传评论的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("上传评论")
public class FsUploadCommentInDTO implements java.io.Serializable, Comparable<FsUploadCommentInDTO> {
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

	/**
	* 评论  
	*/
	@Alias("评论")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String comment = null;

	/**
	* <code>评论</code>返回
	* @return <code>评论</code>
	*/
	public String getComment() {
		return this.comment;
	}

	/**
	* <code>comment</code>设定
	* @param comment　<code>comment</code>设定值
	*/
	public void setComment(
			String comment) {
		this.comment = comment;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUploadCommentInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
