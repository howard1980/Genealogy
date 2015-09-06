package com.maxiaohua.genealogy.fw.core.dao;


public interface UpdateDAO {

	
	<E> int update(
			String sqlId,
			E params);

	
	<E> int updateOne(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams);

	
	<E> int updateImmediately(
			String sqlId,
			E params);

	
	<E> int updateOneImmediately(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams);

	
	<E> E insertOneImmediatelyByCheckKey(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams);

}