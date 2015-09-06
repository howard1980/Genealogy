package com.maxiaohua.genealogy.main.biz.com.util;

import java.util.Random;

public class RandomUtil {
	
	public static String getVerifyCode() {
		String charValue = "";
	    for (int i = 0; i < 6; i++){
		    char c = (char)(randomInt(0, 10) + '0');
		    charValue += String.valueOf(c);
	    }
		return charValue;
	}
	
	 private static int randomInt(int from, int to){
		  Random r = new Random();
		  return from + r.nextInt(to - from);
	}
}
