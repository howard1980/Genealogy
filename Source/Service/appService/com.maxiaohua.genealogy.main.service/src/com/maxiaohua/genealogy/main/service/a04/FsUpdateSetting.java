/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateSettingInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsUpdateSettingOutDTO;

public class FsUpdateSetting extends AbstractService<FsUpdateSettingOutDTO, FsUpdateSettingInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public FsUpdateSettingOutDTO execute(
			FsUpdateSettingInDTO fsUpdateSettingInDTO) {
		FsUpdateSettingOutDTO fsUpdateSettingOutDTO = new FsUpdateSettingOutDTO();
		return fsUpdateSettingOutDTO;
	}
}
