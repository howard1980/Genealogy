/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetPeopleInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsGetPeopleOutDTO;

public class FsGetPeople extends AbstractService<FsGetPeopleOutDTO, FsGetPeopleInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsGetPeopleOutDTO execute(
			FsGetPeopleInDTO fsGetPeopleInDTO) {
		FsGetPeopleOutDTO fsGetPeopleOutDTO = new FsGetPeopleOutDTO();
		return fsGetPeopleOutDTO;
	}
}
