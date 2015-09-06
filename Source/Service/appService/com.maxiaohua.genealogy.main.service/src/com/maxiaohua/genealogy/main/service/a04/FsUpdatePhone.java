/*
 * SXXC
 * (C) Copyright RedDirver, Ltd. 2015,  All Rights Reserved.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdatePhoneInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdatePhoneOutDTO;

public class FsUpdatePhone extends AbstractService<FsUpdatePhoneOutDTO, FsUpdatePhoneInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdatePhoneOutDTO execute(
			FsUpdatePhoneInDTO fsUpdatePhoneInDTO) {
		FsUpdatePhoneOutDTO fsUpdatePhoneOutDTO = new FsUpdatePhoneOutDTO();
		return fsUpdatePhoneOutDTO;
	}
}
