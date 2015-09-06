/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T13NoticeDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
public abstract class T13NoticeDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T13_NOTICE_INSERT";

	public static final String FULL_UPDATE = "T13_NOTICE_FULL_UPDATE";

	public static final String UPDATE = "T13_NOTICE_UPDATE";

	public static final String DELETE = "T13_NOTICE_DELETE";

	public static final String FIND = "T13_NOTICE_FIND";

	public static final String FIND_FOR_UPDATE = "T13_NOTICE_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T13_NOTICE_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T13_NOTICE_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T13_NOTICE_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T13_NOTICE_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T13_NOTICE_SQL_SEARCH";

	public static final String COUNT = "T13_NOTICE_COUNT";

	public static final String COUNT_OR = "T13_NOTICE_COUNT_OR";

	public static final String COUNT_SEARCH = "T13_NOTICE_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NOTICE = "NOTICE";

	public static final String COLUMN_NOTICE_DATE = "NOTICE_DATE";

	public static final String COLUMN_NOTICE_TIME = "NOTICE_TIME";

	public static final String COLUMN_LATITUDE = "LATITUDE";

	public static final String COLUMN_LONGITUDE = "LONGITUDE";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_CREATE_PER = "CREATE_PER";

	public static final String TABLE = "T13_NOTICE";

	public static T13NoticeDTO setDefaultValue() {
		T13NoticeDTO defaultDTO = new T13NoticeDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNOTICE(StringUtil.EMPTY);

		defaultDTO.setNOTICEDATE(DateUtil.getDefaultDate());

		defaultDTO.setNOTICETIME(DateUtil.getDefaultTime());

		defaultDTO.setLATITUDE(0.0);

		defaultDTO.setLONGITUDE(0.0);

		defaultDTO.setCREATEDATE(DateUtil.getDefaultDate());

		defaultDTO.setCREATETIME(DateUtil.getDefaultTime());

		defaultDTO.setCREATEPER(0l);

		return defaultDTO;
	}
}
