/* SXXC
* (C) Red Dirver, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a02.dto.CommentDTO;

/**
 * 获得事件评论的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/01         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得事件评论")
public class FsGetActionCommentOutDTO implements java.io.Serializable, Comparable<FsGetActionCommentOutDTO> {
	/**
	* Serial ID
	*/
	private static final long serialVersionUID = 1L;

	/**
	* 事件评论  
	*/
	@Alias("事件评论")
	private CommentDTO[] comments = null;

	/**
	* <code>事件评论</code>返回
	* @return <code>事件评论</code>
	*/
	public CommentDTO[] getComments() {
		return this.comments;
	}

	/**
	* <code>comments</code>设定
	* @param comments　<code>comments</code>设定值
	*/
	public void setComments(
			CommentDTO[] comments) {
		this.comments = comments;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsGetActionCommentOutDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
