/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.FsGetFamilyNoticeInfoInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsGetFamilyNoticeInfoOutDTO;

public class FsGetFamilyNoticeInfo extends AbstractService<FsGetFamilyNoticeInfoOutDTO, FsGetFamilyNoticeInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsGetFamilyNoticeInfoOutDTO execute(
			FsGetFamilyNoticeInfoInDTO fsGetFamilyNoticeInfoInDTO) {
		FsGetFamilyNoticeInfoOutDTO fsGetFamilyNoticeInfoOutDTO = new FsGetFamilyNoticeInfoOutDTO();
		return fsGetFamilyNoticeInfoOutDTO;
	}
}
