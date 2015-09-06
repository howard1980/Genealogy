/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a04.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 提交建议与反馈的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/06         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("提交建议与反馈")
public class FsUpdateQuestionInDTO implements java.io.Serializable, Comparable<FsUpdateQuestionInDTO> {
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
	* 建议与反馈  
	*/
	@Alias("建议与反馈")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String question = null;

	/**
	* <code>建议与反馈</code>返回
	* @return <code>建议与反馈</code>
	*/
	public String getQuestion() {
		return this.question;
	}

	/**
	* <code>question</code>设定
	* @param question　<code>question</code>设定值
	*/
	public void setQuestion(
			String question) {
		this.question = question;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsUpdateQuestionInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
