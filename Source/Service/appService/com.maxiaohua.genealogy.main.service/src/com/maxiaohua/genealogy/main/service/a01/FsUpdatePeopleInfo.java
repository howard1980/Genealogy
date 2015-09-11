/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.biz.com.GbPersonal;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdatePeopleInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.FsUpdatePeopleInfoOutDTO;

public class FsUpdatePeopleInfo extends AbstractService<FsUpdatePeopleInfoOutDTO, FsUpdatePeopleInfoInDTO> {
	@AutoInject
	private GbPersonal gbCustomer;
	
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdatePeopleInfoOutDTO execute(
			FsUpdatePeopleInfoInDTO fsUpdatePeopleInfoInDTO) {
		gbCustomer.updateInfo(fsUpdatePeopleInfoInDTO.getUserID(), fsUpdatePeopleInfoInDTO.getUserInfo());
		FsUpdatePeopleInfoOutDTO fsUpdatePeopleInfoOutDTO = new FsUpdatePeopleInfoOutDTO();
		return fsUpdatePeopleInfoOutDTO;
	}
}
