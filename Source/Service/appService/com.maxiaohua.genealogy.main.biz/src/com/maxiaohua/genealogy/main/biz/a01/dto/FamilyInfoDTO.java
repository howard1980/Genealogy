/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

/**
 * FamilyInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族信息")
public class FamilyInfoDTO implements java.io.Serializable, Comparable<FamilyInfoDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private String familyID = null;

	public String getFamilyID() {
		return this.familyID;
	}

	public void setFamilyID(
			String familyID) {
		this.familyID = familyID;
	}

	private String arms = null;

	public String getArms() {
		return this.arms;
	}

	public void setArms(
			String arms) {
		this.arms = arms;
	}

	private String famileyName = null;

	public String getFamileyName() {
		return this.famileyName;
	}

	public void setFamileyName(
			String famileyName) {
		this.famileyName = famileyName;
	}

	private String introductionText = null;

	public String getIntroductionText() {
		return this.introductionText;
	}

	public void setIntroductionText(
			String introductionText) {
		this.introductionText = introductionText;
	}

	private String introductionPicture = null;

	public String getIntroductionPicture() {
		return this.introductionPicture;
	}

	public void setIntroductionPicture(
			String introductionPicture) {
		this.introductionPicture = introductionPicture;
	}

	private String introductionVideo = null;

	public String getIntroductionVideo() {
		return this.introductionVideo;
	}

	public void setIntroductionVideo(
			String introductionVideo) {
		this.introductionVideo = introductionVideo;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		FamilyInfoDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
