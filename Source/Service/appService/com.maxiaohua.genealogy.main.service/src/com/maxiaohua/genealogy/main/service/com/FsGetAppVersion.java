/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.main.biz.com.HbSystemInfo;
import com.maxiaohua.genealogy.main.biz.com.dto.AppVersionDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetAppVersionInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetAppVersionOutDTO;

public class FsGetAppVersion extends AbstractService<FsGetAppVersionOutDTO, FsGetAppVersionInDTO> {

	@AutoInject
	private HbSystemInfo hbSystemInfo;
	
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetAppVersionOutDTO execute(
			FsGetAppVersionInDTO fsGetAppVersionInDTO) {
		FsGetAppVersionOutDTO fsGetAppVersionOutDTO = new FsGetAppVersionOutDTO();
		AppVersionDTO appVersion = hbSystemInfo.getAppVersion(
				fsGetAppVersionInDTO.getVersion(), 
				fsGetAppVersionInDTO.getChannel(), 
				fsGetAppVersionInDTO.getType());
		fsGetAppVersionOutDTO.setUpdate(appVersion.getUpdate());
		fsGetAppVersionOutDTO.setDescrip(appVersion.getDescrip());
		fsGetAppVersionOutDTO.setDownloadUrl(appVersion.getDownloadUrl());
		return fsGetAppVersionOutDTO;
	}
}
