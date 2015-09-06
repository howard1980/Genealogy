/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T15NoticeAttentionDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/06             TOOL                 Create
*
 */
public abstract class T15NoticeAttentionDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T15_NOTICE_ATTENTION_INSERT";

	public static final String FULL_UPDATE = "T15_NOTICE_ATTENTION_FULL_UPDATE";

	public static final String UPDATE = "T15_NOTICE_ATTENTION_UPDATE";

	public static final String DELETE = "T15_NOTICE_ATTENTION_DELETE";

	public static final String FIND = "T15_NOTICE_ATTENTION_FIND";

	public static final String FIND_FOR_UPDATE = "T15_NOTICE_ATTENTION_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T15_NOTICE_ATTENTION_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T15_NOTICE_ATTENTION_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T15_NOTICE_ATTENTION_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T15_NOTICE_ATTENTION_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T15_NOTICE_ATTENTION_SQL_SEARCH";

	public static final String COUNT = "T15_NOTICE_ATTENTION_COUNT";

	public static final String COUNT_OR = "T15_NOTICE_ATTENTION_COUNT_OR";

	public static final String COUNT_SEARCH = "T15_NOTICE_ATTENTION_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NOT_ID = "NOT_ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String TABLE = "T15_NOTICE_ATTENTION";

	public static T15NoticeAttentionDTO setDefaultValue() {
		T15NoticeAttentionDTO defaultDTO = new T15NoticeAttentionDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNOTID(0l);

		defaultDTO.setPERID(0l);

		return defaultDTO;
	}
}
