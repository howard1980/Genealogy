/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a03.dto.FsGetFamilyNoticeInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsGetFamilyNoticeOutDTO;

public class FsGetFamilyNotice extends AbstractService<FsGetFamilyNoticeOutDTO, FsGetFamilyNoticeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetFamilyNoticeOutDTO execute(
			FsGetFamilyNoticeInDTO fsGetFamilyNoticeInDTO) {
		FsGetFamilyNoticeOutDTO fsGetFamilyNoticeOutDTO = new FsGetFamilyNoticeOutDTO();
		return fsGetFamilyNoticeOutDTO;
	}
}
