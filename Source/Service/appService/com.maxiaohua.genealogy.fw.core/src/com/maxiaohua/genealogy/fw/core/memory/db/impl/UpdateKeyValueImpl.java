package com.maxiaohua.genealogy.fw.core.memory.db.impl;

public class UpdateKeyValueImpl extends MemoryDBSupport implements com.maxiaohua.genealogy.fw.core.memory.db.UpdateKeyValue {

	@Override
	public String update(String key, String value) {
		return this.setex(key, value, 60 * 20);
	}
}