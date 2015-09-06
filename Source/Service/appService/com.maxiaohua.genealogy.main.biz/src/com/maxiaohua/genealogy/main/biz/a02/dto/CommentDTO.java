/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a02.dto;

import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * CommentDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("评论数据")
public class CommentDTO implements java.io.Serializable, Comparable<CommentDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private UserInfoDTO userInfo = null;

	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	private String comment = null;

	public String getComment() {
		return this.comment;
	}

	public void setComment(
			String comment) {
		this.comment = comment;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		CommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
