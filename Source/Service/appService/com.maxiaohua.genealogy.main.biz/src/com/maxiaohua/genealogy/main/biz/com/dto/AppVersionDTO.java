/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.com.dto;

/**
 * AppVersionDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/05/22             TOOL                Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("程序版本")
public class AppVersionDTO implements java.io.Serializable, Comparable<AppVersionDTO> {
	/**
	* System ID
	*/
	private static final long serialVersionUID = 1L;

	private Boolean update = null;

	public Boolean getUpdate() {
		return this.update;
	}

	public void setUpdate(
			Boolean update) {
		this.update = update;
	}

	private String descrip = null;

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(
			String descrip) {
		this.descrip = descrip;
	}

	private String downloadUrl = null;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(
			String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
    		AppVersionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}
