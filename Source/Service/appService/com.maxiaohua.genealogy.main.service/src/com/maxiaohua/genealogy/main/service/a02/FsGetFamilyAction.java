/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a02.dto.FsGetFamilyActionInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.FsGetFamilyActionOutDTO;

public class FsGetFamilyAction extends AbstractService<FsGetFamilyActionOutDTO, FsGetFamilyActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetFamilyActionOutDTO execute(
			FsGetFamilyActionInDTO fsGetFamilyActionInDTO) {
		FsGetFamilyActionOutDTO fsGetFamilyActionOutDTO = new FsGetFamilyActionOutDTO();
		return fsGetFamilyActionOutDTO;
	}
}
