/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.main.biz.com.GbValidCode;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetValidCodeInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsGetValidCodeOutDTO;

public class FsGetValidCode extends AbstractService<FsGetValidCodeOutDTO, FsGetValidCodeInDTO> {
	
	@AutoInject
	private GbValidCode gbValidCode;
	
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public FsGetValidCodeOutDTO execute(
			FsGetValidCodeInDTO fsGetValidCodeInDTO) {
		FsGetValidCodeOutDTO fsGetValidCodeOutDTO = new FsGetValidCodeOutDTO();
		gbValidCode.sendValidCode(fsGetValidCodeInDTO.getMobile());
		return fsGetValidCodeOutDTO;
	}
}
