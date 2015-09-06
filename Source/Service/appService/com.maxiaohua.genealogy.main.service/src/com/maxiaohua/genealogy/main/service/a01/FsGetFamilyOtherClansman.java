/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetFamilyOtherClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetFamilyOtherClansmanOutDTO;

public class FsGetFamilyOtherClansman extends AbstractService<FsGetFamilyOtherClansmanOutDTO, FsGetFamilyOtherClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetFamilyOtherClansmanOutDTO execute(
			FsGetFamilyOtherClansmanInDTO fsGetFamilyOtherClansmanInDTO) {
		FsGetFamilyOtherClansmanOutDTO fsGetFamilyOtherClansmanOutDTO = new FsGetFamilyOtherClansmanOutDTO();
		return fsGetFamilyOtherClansmanOutDTO;
	}
}
