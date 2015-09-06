/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetClansmanOutDTO;

public class FsGetClansman extends AbstractService<FsGetClansmanOutDTO, FsGetClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetClansmanOutDTO execute(
			FsGetClansmanInDTO fsGetClansmanInDTO) {
		FsGetClansmanOutDTO fsGetClansmanOutDTO = new FsGetClansmanOutDTO();
		return fsGetClansmanOutDTO;
	}
}
