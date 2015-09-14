/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T12PerHisCommentDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/09/14             TOOL                 Create
*
 */
public abstract class T12PerHisCommentDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T12_PER_HIS_COMMENT_INSERT";

	public static final String FULL_UPDATE = "T12_PER_HIS_COMMENT_FULL_UPDATE";

	public static final String UPDATE = "T12_PER_HIS_COMMENT_UPDATE";

	public static final String DELETE = "T12_PER_HIS_COMMENT_DELETE";

	public static final String FIND = "T12_PER_HIS_COMMENT_FIND";

	public static final String FIND_FOR_UPDATE = "T12_PER_HIS_COMMENT_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T12_PER_HIS_COMMENT_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T12_PER_HIS_COMMENT_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T12_PER_HIS_COMMENT_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T12_PER_HIS_COMMENT_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T12_PER_HIS_COMMENT_SQL_SEARCH";

	public static final String COUNT = "T12_PER_HIS_COMMENT_COUNT";

	public static final String COUNT_OR = "T12_PER_HIS_COMMENT_COUNT_OR";

	public static final String COUNT_SEARCH = "T12_PER_HIS_COMMENT_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_HIS_ID = "HIS_ID";

	public static final String COLUMN_PER_ID = "PER_ID";

	public static final String COLUMN_COMMENT = "COMMENT";

	public static final String TABLE = "T12_PER_HIS_COMMENT";

	public static T12PerHisCommentDTO setDefaultValue() {
		T12PerHisCommentDTO defaultDTO = new T12PerHisCommentDTO();

		defaultDTO.setID(0l);

		defaultDTO.setHISID(0l);

		defaultDTO.setPERID(0l);

		defaultDTO.setCOMMENT(StringUtil.EMPTY);

		return defaultDTO;
	}
}
