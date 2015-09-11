package com.maxiaohua.genealogy.main.biz.com.impl;

import java.util.Random;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.fw.core.sms.SMSManager;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.main.biz.com.GbValidCode;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.HbMessageCode;

public class GbValidCodeImpl extends AbstractDBLogic implements GbValidCode, HbMessageCode, CommonConstant, 
		CtgCodeConstant {
    @AutoInject(name = "sMSManger")
    protected SMSManager sMSManger;
    
	public void sendValidCode(String mobile){
		String code = null;
		code = queryKeyValue.queryForString(mobile);
		if(code == null){
			Random random=new Random();
			code=String.valueOf(random.nextInt(8999)+1000);
			updateKeyValue.update(mobile, code);
		}
		sMSManger.sendVerifyCode(mobile, code);
	}
}