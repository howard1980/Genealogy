/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.FsUpdateFamilyNoticeInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.FsUpdateFamilyNoticeOutDTO;

public class FsUpdateFamilyNotice extends AbstractService<FsUpdateFamilyNoticeOutDTO, FsUpdateFamilyNoticeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdateFamilyNoticeOutDTO execute(
			FsUpdateFamilyNoticeInDTO fsUpdateFamilyNoticeInDTO) {
		FsUpdateFamilyNoticeOutDTO fsUpdateFamilyNoticeOutDTO = new FsUpdateFamilyNoticeOutDTO();
		return fsUpdateFamilyNoticeOutDTO;
	}
}
