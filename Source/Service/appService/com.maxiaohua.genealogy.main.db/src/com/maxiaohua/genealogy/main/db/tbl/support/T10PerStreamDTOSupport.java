/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T10PerStreamDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/15             TOOL                 Create
*
 */
public abstract class T10PerStreamDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T10_PER_STREAM_INSERT";

	public static final String FULL_UPDATE = "T10_PER_STREAM_FULL_UPDATE";

	public static final String UPDATE = "T10_PER_STREAM_UPDATE";

	public static final String DELETE = "T10_PER_STREAM_DELETE";

	public static final String FIND = "T10_PER_STREAM_FIND";

	public static final String FIND_FOR_UPDATE = "T10_PER_STREAM_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T10_PER_STREAM_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T10_PER_STREAM_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T10_PER_STREAM_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T10_PER_STREAM_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T10_PER_STREAM_SQL_SEARCH";

	public static final String COUNT = "T10_PER_STREAM_COUNT";

	public static final String COUNT_OR = "T10_PER_STREAM_COUNT_OR";

	public static final String COUNT_SEARCH = "T10_PER_STREAM_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_TYPE = "TYPE";

	public static final String COLUMN_PATH = "PATH";

	public static final String COLUMN_REMARKS = "REMARKS";

	public static final String TABLE = "T10_PER_STREAM";

	public static T10PerStreamDTO setDefaultValue() {
		T10PerStreamDTO defaultDTO = new T10PerStreamDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPerID(0l);

		defaultDTO.setType(StringUtil.EMPTY);

		defaultDTO.setPath(StringUtil.EMPTY);

		defaultDTO.setRemarks(StringUtil.EMPTY);

		return defaultDTO;
	}
}
