﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.TcomblcmDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
public abstract class TcomblcmDTOSupport extends BaseTableDTO {

	public static final String INSERT = "TCOMBLCM_INSERT";

	public static final String FULL_UPDATE = "TCOMBLCM_FULL_UPDATE";

	public static final String UPDATE = "TCOMBLCM_UPDATE";

	public static final String DELETE = "TCOMBLCM_DELETE";

	public static final String FIND = "TCOMBLCM_FIND";

	public static final String FIND_FOR_UPDATE = "TCOMBLCM_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "TCOMBLCM_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "TCOMBLCM_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "TCOMBLCM_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "TCOMBLCM_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "TCOMBLCM_SQL_SEARCH";

	public static final String COUNT = "TCOMBLCM_COUNT";

	public static final String COUNT_OR = "TCOMBLCM_COUNT_OR";

	public static final String COUNT_SEARCH = "TCOMBLCM_COUNT_SEARCH";

	public static final String COLUMN_APPL_ID = "APPL_ID";

	public static final String COLUMN_FUNCTION_ID = "FUNCTION_ID";

	public static final String COLUMN_ITEM_ID = "ITEM_ID";

	public static final String COLUMN_VALUE = "VALUE";

	public static final String COLUMN_NOTES = "NOTES";

	public static final String COLUMN_LAST_OP_ID = "LAST_OP_ID";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "TCOMBLCM";

	public static TcomblcmDTO setDefaultValue() {
		TcomblcmDTO defaultDTO = new TcomblcmDTO();

		defaultDTO.setApplId(StringUtil.EMPTY);

		defaultDTO.setFunctionId(StringUtil.EMPTY);

		defaultDTO.setItemId(StringUtil.EMPTY);

		defaultDTO.setValue(StringUtil.EMPTY);

		defaultDTO.setNotes(StringUtil.EMPTY);

		defaultDTO.setLastOpId(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
