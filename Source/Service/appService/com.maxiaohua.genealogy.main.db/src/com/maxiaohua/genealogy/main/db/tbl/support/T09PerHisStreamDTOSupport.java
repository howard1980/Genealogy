/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T09PerHisStreamDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
public abstract class T09PerHisStreamDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T09_PER_HIS_STREAM_INSERT";

	public static final String FULL_UPDATE = "T09_PER_HIS_STREAM_FULL_UPDATE";

	public static final String UPDATE = "T09_PER_HIS_STREAM_UPDATE";

	public static final String DELETE = "T09_PER_HIS_STREAM_DELETE";

	public static final String FIND = "T09_PER_HIS_STREAM_FIND";

	public static final String FIND_FOR_UPDATE = "T09_PER_HIS_STREAM_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T09_PER_HIS_STREAM_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T09_PER_HIS_STREAM_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T09_PER_HIS_STREAM_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T09_PER_HIS_STREAM_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T09_PER_HIS_STREAM_SQL_SEARCH";

	public static final String COUNT = "T09_PER_HIS_STREAM_COUNT";

	public static final String COUNT_OR = "T09_PER_HIS_STREAM_COUNT_OR";

	public static final String COUNT_SEARCH = "T09_PER_HIS_STREAM_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_HIS_ID = "HIS_ID";

	public static final String COLUMN_TYPE = "TYPE";

	public static final String COLUMN_PATH = "PATH";

	public static final String COLUMN_REMARKS = "REMARKS";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String TABLE = "T09_PER_HIS_STREAM";

	public static T09PerHisStreamDTO setDefaultValue() {
		T09PerHisStreamDTO defaultDTO = new T09PerHisStreamDTO();

		defaultDTO.setID(0l);

		defaultDTO.setHISID(0l);

		defaultDTO.setTYPE(StringUtil.EMPTY);

		defaultDTO.setPATH(StringUtil.EMPTY);

		defaultDTO.setREMARKS(StringUtil.EMPTY);

		defaultDTO.setCREATEDATE(DateUtil.getDefaultDate());

		defaultDTO.setCREATETIME(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
