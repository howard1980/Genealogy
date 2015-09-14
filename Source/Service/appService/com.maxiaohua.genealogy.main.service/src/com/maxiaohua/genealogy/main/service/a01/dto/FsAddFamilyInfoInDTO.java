/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 增加家族信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2015/09/14         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("增加家族信息")
public class FsAddFamilyInfoInDTO implements java.io.Serializable, Comparable<FsAddFamilyInfoInDTO> {
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
	* 族徽  
	*/
	@Alias("族徽")
	private String arms = null;

	/**
	* <code>族徽</code>返回
	* @return <code>族徽</code>
	*/
	public String getArms() {
		return this.arms;
	}

	/**
	* <code>arms</code>设定
	* @param arms　<code>arms</code>设定值
	*/
	public void setArms(
			String arms) {
		this.arms = arms;
	}

	/**
	* 族姓  
	*/
	@Alias("族姓")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String famileyName = null;

	/**
	* <code>族姓</code>返回
	* @return <code>族姓</code>
	*/
	public String getFamileyName() {
		return this.famileyName;
	}

	/**
	* <code>famileyName</code>设定
	* @param famileyName　<code>famileyName</code>设定值
	*/
	public void setFamileyName(
			String famileyName) {
		this.famileyName = famileyName;
	}

	/**
	* 介绍（文字）  
	*/
	@Alias("介绍（文字）")
	private String introductionText = null;

	/**
	* <code>介绍（文字）</code>返回
	* @return <code>介绍（文字）</code>
	*/
	public String getIntroductionText() {
		return this.introductionText;
	}

	/**
	* <code>IntroductionText</code>设定
	* @param IntroductionText　<code>IntroductionText</code>设定值
	*/
	public void setIntroductionText(
			String introductionText) {
		this.introductionText = introductionText;
	}

	/**
	* 介绍（图片）  
	*/
	@Alias("介绍（图片）")
	private String introductionPicture = null;

	/**
	* <code>介绍（图片）</code>返回
	* @return <code>介绍（图片）</code>
	*/
	public String getIntroductionPicture() {
		return this.introductionPicture;
	}

	/**
	* <code>IntroductionPicture</code>设定
	* @param IntroductionPicture　<code>IntroductionPicture</code>设定值
	*/
	public void setIntroductionPicture(
			String introductionPicture) {
		this.introductionPicture = introductionPicture;
	}

	/**
	* 介绍（视频）  
	*/
	@Alias("介绍（视频）")
	private String introductionVideo = null;

	/**
	* <code>介绍（视频）</code>返回
	* @return <code>介绍（视频）</code>
	*/
	public String getIntroductionVideo() {
		return this.introductionVideo;
	}

	/**
	* <code>IntroductionVideo</code>设定
	* @param IntroductionVideo　<code>IntroductionVideo</code>设定值
	*/
	public void setIntroductionVideo(
			String introductionVideo) {
		this.introductionVideo = introductionVideo;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FsAddFamilyInfoInDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
