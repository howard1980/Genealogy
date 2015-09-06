/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T07PerSetDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
public abstract class T07PerSetDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T07_PER_SET_INSERT";

	public static final String FULL_UPDATE = "T07_PER_SET_FULL_UPDATE";

	public static final String UPDATE = "T07_PER_SET_UPDATE";

	public static final String DELETE = "T07_PER_SET_DELETE";

	public static final String FIND = "T07_PER_SET_FIND";

	public static final String FIND_FOR_UPDATE = "T07_PER_SET_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T07_PER_SET_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T07_PER_SET_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T07_PER_SET_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T07_PER_SET_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T07_PER_SET_SQL_SEARCH";

	public static final String COUNT = "T07_PER_SET_COUNT";

	public static final String COUNT_OR = "T07_PER_SET_COUNT_OR";

	public static final String COUNT_SEARCH = "T07_PER_SET_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_SHOW_TYPE = "SHOW_TYPE";

	public static final String COLUMN_CONTACT_SHOW = "CONTACT_SHOW";

	public static final String COLUMN_VOICE_TYPE = "VOICE_TYPE";

	public static final String TABLE = "T07_PER_SET";

	public static T07PerSetDTO setDefaultValue() {
		T07PerSetDTO defaultDTO = new T07PerSetDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPERID(0l);

		defaultDTO.setSHOWTYPE(StringUtil.EMPTY);

		defaultDTO.setCONTACTSHOW(StringUtil.EMPTY);

		defaultDTO.setVOICETYPE(StringUtil.EMPTY);

		return defaultDTO;
	}
}
