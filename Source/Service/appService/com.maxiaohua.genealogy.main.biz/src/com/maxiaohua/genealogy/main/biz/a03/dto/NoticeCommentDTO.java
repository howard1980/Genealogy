/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a03.dto;

/**
 * NoticeCommentDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("通知评论")
public class NoticeCommentDTO implements java.io.Serializable, Comparable<NoticeCommentDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String userFace = null;

	public String getUserFace() {
		return this.userFace;
	}

	public void setUserFace(
			String userFace) {
		this.userFace = userFace;
	}

	private String userName = null;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(
			String userName) {
		this.userName = userName;
	}

	private java.sql.Date date = null;

	public java.sql.Date getDate() {
		return this.date;
	}

	public void setDate(
			java.sql.Date date) {
		this.date = date;
	}

	private java.sql.Time time = null;

	public java.sql.Time getTime() {
		return this.time;
	}

	public void setTime(
			java.sql.Time time) {
		this.time = time;
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
    		NoticeCommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
