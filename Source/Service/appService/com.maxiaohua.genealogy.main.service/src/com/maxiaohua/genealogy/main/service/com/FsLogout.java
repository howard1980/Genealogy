/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.com.dto.FsLogoutInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsLogoutOutDTO;

public class FsLogout extends AbstractService<FsLogoutOutDTO, FsLogoutInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsLogoutOutDTO execute(
			FsLogoutInDTO fsLogoutInDTO) {
		FsLogoutOutDTO fsLogoutOutDTO = new FsLogoutOutDTO();
		return fsLogoutOutDTO;
	}
}
