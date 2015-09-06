/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 对家族事件的评论的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("对家族事件的评论")
public class FsCommentNoticeInDTO implements java.io.Serializable, Comparable<FsCommentNoticeInDTO> {
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
	* 通告ID  
	*/
	@Alias("通告ID")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String noticeID = null;

	/**
	* <code>通告ID</code>返回
	* @return <code>通告ID</code>
	*/
	public String getNoticeID() {
		return this.noticeID;
	}

	/**
	* <code>noticeID</code>设定
	* @param noticeID　<code>noticeID</code>设定值
	*/
	public void setNoticeID(
			String noticeID) {
		this.noticeID = noticeID;
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
    		FsCommentNoticeInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
