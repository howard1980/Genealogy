/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetValidCodeInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetValidCodeOutDTO;

public class FsGetValidCode extends AbstractService<FsGetValidCodeOutDTO, FsGetValidCodeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetValidCodeOutDTO execute(
			FsGetValidCodeInDTO fsGetValidCodeInDTO) {
		FsGetValidCodeOutDTO fsGetValidCodeOutDTO = new FsGetValidCodeOutDTO();
		return fsGetValidCodeOutDTO;
	}
}
