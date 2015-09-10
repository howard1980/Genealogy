﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.biz.com.GbPersonal;
import com.maxiaohua.genealogy.main.service.com.dto.FsRegistInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.FsRegistOutDTO;

public class FsRegist extends AbstractService<FsRegistOutDTO, FsRegistInDTO> {
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
	public FsRegistOutDTO execute(
			FsRegistInDTO fsRegistInDTO) {
		FsRegistOutDTO fsRegistOutDTO = new FsRegistOutDTO();
		fsRegistOutDTO.setUserID(
				gbCustomer.regist(
						fsRegistInDTO.getMobile(), 
						fsRegistInDTO.getValidCode(), 
						fsRegistInDTO.getLongitude(), 
						fsRegistInDTO.getLatitude(), 
						fsRegistInDTO.getCityCode(), 
						fsRegistInDTO.getRegisitrationID(), 
						fsRegistInDTO.getImsi()));
		return fsRegistOutDTO;
	}
}
