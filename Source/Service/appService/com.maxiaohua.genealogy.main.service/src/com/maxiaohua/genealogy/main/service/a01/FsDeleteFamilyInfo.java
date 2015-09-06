/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsDeleteFamilyInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsDeleteFamilyInfoOutDTO;

public class FsDeleteFamilyInfo extends AbstractService<FsDeleteFamilyInfoOutDTO, FsDeleteFamilyInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsDeleteFamilyInfoOutDTO execute(
			FsDeleteFamilyInfoInDTO fsDeleteFamilyInfoInDTO) {
		FsDeleteFamilyInfoOutDTO fsDeleteFamilyInfoOutDTO = new FsDeleteFamilyInfoOutDTO();
		return fsDeleteFamilyInfoOutDTO;
	}
}
