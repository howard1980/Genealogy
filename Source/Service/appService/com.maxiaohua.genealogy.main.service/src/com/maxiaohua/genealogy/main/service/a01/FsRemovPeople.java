/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsRemovPeopleInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsRemovPeopleOutDTO;

public class FsRemovPeople extends AbstractService<FsRemovPeopleOutDTO, FsRemovPeopleInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsRemovPeopleOutDTO execute(
			FsRemovPeopleInDTO fsRemovPeopleInDTO) {
		FsRemovPeopleOutDTO fsRemovPeopleOutDTO = new FsRemovPeopleOutDTO();
		return fsRemovPeopleOutDTO;
	}
}
