/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a04;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a04.dto.FsGetSettingInDTO;
import com.maxiaohua.genealogy.main.service.a04.dto.FsGetSettingOutDTO;

public class FsGetSetting extends AbstractService<FsGetSettingOutDTO, FsGetSettingInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetSettingOutDTO execute(
			FsGetSettingInDTO fsGetSettingInDTO) {
		FsGetSettingOutDTO fsGetSettingOutDTO = new FsGetSettingOutDTO();
		return fsGetSettingOutDTO;
	}
}
