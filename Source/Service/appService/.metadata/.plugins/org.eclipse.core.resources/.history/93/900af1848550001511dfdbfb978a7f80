package com.maxiaohua.genealogy.main.db.base;

import com.maxiaohua.genealogy.main.db.constant.SQLConstant;

import com.maxiaohua.genealogy.fw.core.util.CollectionUtil;
import com.maxiaohua.genealogy.fw.core.util.CompareUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;

/**
 * SQL条件を処理する共通クラスです。
 *
 * @author IBM GDC
 */
public class StatementUtil {

	/**
	 * パラメーター正規表現
	 */
	private static final String PARAMETER_EXPRESSION = "[?]";

	/**
	 * LIKEのモード:valueの先頭に%を追加
	 */
	private static final int MODE_BEFORE = 0;

	/**
	 * LIKEのモード:valueの末尾に%を追加
	 */
	private static final int MODE_AFTER = 1;

	/**
	 * LIKEのモード:valueの両端に%を追加
	 */
	private static final int MODE_ALL = 2;

	/**
	 * SQL文のキーワード
	 */
	public static enum KEYWORD {
		/**
		 * SQL文：LIKE
		 */
		LIKE {
			@Override
			public String toString() {
				return SQLConstant.LIKE;
			}
		},
		/**
		 * SQL文：=
		 */
		EQUAL {
			@Override
			public String toString() {
				return SQLConstant.EQUAL;
			}
		},
		/**
		 * SQL文：>
		 */
		GREATER_THAN {
			@Override
			public String toString() {
				return SQLConstant.GREATER_THAN;
			}
		},
		/**
		 * SQL文：>=
		 */
		GREATER_EQUAL_THAN {
			@Override
			public String toString() {
				return SQLConstant.GREATER_EQUAL_THAN;
			}
		},
		/**
		 * SQL文： <
		 */
		LESS_THAN {
			@Override
			public String toString() {
				return SQLConstant.LESS_THAN;
			}
		},
		/**
		 * SQL文：<=
		 */
		LESS_EQUAL_THAN {
			@Override
			public String toString() {
				return SQLConstant.LESS_EQUAL_THAN;
			}
		},
		/**
		 * SQL文：<>
		 */
		NOT_EQUALN {
			@Override
			public String toString() {
				return SQLConstant.NOT_EQUALN;
			}
		},
		/**
		 * SQL文：IN
		 */
		IN {
			@Override
			public String toString() {
				return SQLConstant.IN;
			}
		},
		/**
		 * SQL文：NOT IN
		 */
		NOT_IN {
			@Override
			public String toString() {
				return SQLConstant.NOT_IN;
			}
		},
		/**
		 * SQL文：DESC
		 */
		DESC {
			@Override
			public String toString() {
				return SQLConstant.DESC;
			}
		},
		/**
		 * SQL文：DESC
		 */
       GROUP_BY {
			@Override
			public String toString() {
				return SQLConstant.GROUP_BY;
			}
		}
	};

	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value		値
	 */
	public static void andWhere(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_AND, value, MODE_ALL);

	}
	
	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value		値
	 */
	public static void andWhere2(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_AND, value, MODE_ALL);

	}

	/**
	 * SQLのwhere条件に条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param operator	オペレータ
	 * @param value		値
	 * @param mode	keywordがLIKEの場合
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 */
	private static void addWhere(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			String operator,
			Object value,
			int mode) {
		StringBuilder statement = dto.get_dynamicWhereCondition();
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition(statement);
		} else {
			statement.append(operator);
		}
		String parameterValue = "";
		if (CompareUtil.equalTo(keyword, KEYWORD.LIKE)) {
			parameterValue = setLikeValue(value, dto, mode);
		} else {
			parameterValue = setValue(value);
		}
		statement.append(columnName);
		statement.append(SQLConstant.SPACE);
		statement.append(keyword.toString());
		statement.append(SQLConstant.SPACE);
		statement.append(parameterValue);
		statement.append(SQLConstant.SPACE);

	}
	
	private static void addWhere2(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			String operator,
			Object value,
			int mode) {
		StringBuilder statement = dto.get_dynamicWhereCondition2();
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition2(statement);
		} else {
			statement.append(operator);
		}
		String parameterValue = "";
		if (CompareUtil.equalTo(keyword, KEYWORD.LIKE)) {
			parameterValue = setLikeValue(value, dto, mode);
		} else {
			parameterValue = setValue(value);
		}
		statement.append(columnName);
		statement.append(SQLConstant.SPACE);
		statement.append(keyword.toString());
		statement.append(SQLConstant.SPACE);
		statement.append(parameterValue);
		statement.append(SQLConstant.SPACE);

	}

	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param values	値
	 */
	public static void andWhereForInAndNotIn(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object[] values) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_AND, values);

	}
	
	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param values	値
	 */
	public static void andWhere2ForInAndNotIn(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object[] values) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_AND, values);

	}

	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param values	値
	 */
	public static void orWhereForInAndNotIn(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object[] values) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_OR, values);

	}
	
	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param values	値
	 */
	public static void orWhere2ForInAndNotIn(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object[] values) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_OR, values);

	}

	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value	値
	 * @param mode
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 */
	public static void andWhereForLikeByMode(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value,
			int mode) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_AND, value, mode);

	}
	
	/**
	 * SQLのwhere条件にAND関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value	値
	 * @param mode
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 */
	public static void andWhere2ForLikeByMode(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value,
			int mode) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_AND, value, mode);

	}

	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value	値
	 * @param mode
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 */
	public static void orWhereForLikeByMode(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value,
			int mode) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_OR, value, mode);

	}
	
	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value	値
	 * @param mode
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 */
	public static void orWhere2ForLikeByMode(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value,
			int mode) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_OR, value, mode);

	}

	/**
	 * SQLのwhere条件に条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param operator	オペレータ
	 * @param values	値
	 */
	private static void addWhere(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			String operator,
			Object[] values) {
		StringBuilder statement = dto.get_dynamicWhereCondition();
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition(statement);
		} else {
			statement.append(operator);
		}
		if (values != null) {
			String parameterValue = "";
			if (CompareUtil.equalTo(keyword, KEYWORD.IN) || CompareUtil.equalTo(keyword, KEYWORD.NOT_IN)) {
				parameterValue = setInValue(dto, values);
			}
			statement.append(columnName);
			statement.append(SQLConstant.SPACE);
			statement.append(keyword.toString());
			statement.append(SQLConstant.SPACE);
			statement.append(parameterValue);
			statement.append(SQLConstant.SPACE);
		}

	}
	
	/**
	 * SQLのwhere条件に条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param operator	オペレータ
	 * @param values	値
	 */
	private static void addWhere2(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			String operator,
			Object[] values) {
		StringBuilder statement = dto.get_dynamicWhereCondition2();
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition2(statement);
		} else {
			statement.append(operator);
		}
		if (values != null) {
			String parameterValue = "";
			if (CompareUtil.equalTo(keyword, KEYWORD.IN) || CompareUtil.equalTo(keyword, KEYWORD.NOT_IN)) {
				parameterValue = setInValue(dto, values);
			}
			statement.append(columnName);
			statement.append(SQLConstant.SPACE);
			statement.append(keyword.toString());
			statement.append(SQLConstant.SPACE);
			statement.append(parameterValue);
			statement.append(SQLConstant.SPACE);
		}

	}

	/**
	 * SQLのwhere条件にAND関係の条件追加
	 * AND条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param values	値
	 */
	public static void andWhere(
			StatementDTO dto,
			String sql,
			Object[] values) {
		addWhere(dto, sql, SQLConstant.SQL_AND, values);

	}
	
	/**
	 * SQLのwhere条件にAND関係の条件追加
	 * AND条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param values	値
	 */
	public static void andWhere2(
			StatementDTO dto,
			String sql,
			Object[] values) {
		addWhere2(dto, sql, SQLConstant.SQL_AND, values);

	}

	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value		値
	 */
	public static void orWhere(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value) {
		addWhere(dto, columnName, keyword, SQLConstant.SQL_OR, value, MODE_ALL);
	}
	
	/**
	 * SQLのwhere条件にOR関係の条件追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 * @param value		値
	 */
	public static void orWhere2(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword,
			Object value) {
		addWhere2(dto, columnName, keyword, SQLConstant.SQL_OR, value, MODE_ALL);
	}

	/**
	 * SQLのwhere条件にOR関係の条件追加
	 * OR条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param values	値
	 */
	public static void orWhere(
			StatementDTO dto,
			String sql,
			Object[] values) {
		addWhere(dto, sql, SQLConstant.SQL_OR, values);

	}
	
	/**
	 * SQLのwhere条件にOR関係の条件追加
	 * OR条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param values	値
	 */
	public static void orWhere2(
			StatementDTO dto,
			String sql,
			Object[] values) {
		addWhere2(dto, sql, SQLConstant.SQL_OR, values);

	}

	/**
	 * SQLのwhere条件に検索条件追加
	 * AND条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param operator	オペレータ
	 * @param values	値
	 */
	private static void addWhere(
			StatementDTO dto,
			String sql,
			String operator,
			Object[] values) {
		StringBuilder statement = dto.get_dynamicWhereCondition();
		String currentSql = "";
		String nextSql = sql;
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition(statement);
		} else {
			statement.append(operator);
		}
		if (values != null) {
			for (Object value : values) {
				currentSql = nextSql.substring(0, nextSql.indexOf(SQLConstant.QUESTION_MARK));
				if (currentSql.contains(KEYWORD.LIKE.toString())) {
					sql = sql.substring(0, sql.indexOf(SQLConstant.QUESTION_MARK)) + setLikeValue(value, dto, MODE_ALL)
							+ sql.substring(sql.indexOf(SQLConstant.QUESTION_MARK) + 1);
				} else {
					sql = sql.replaceFirst(PARAMETER_EXPRESSION, setValue(value));
				}
				nextSql = nextSql.substring(nextSql.indexOf(SQLConstant.QUESTION_MARK) + 1);

			}
			statement.append(SQLConstant.BRACKET_LEFT + sql + SQLConstant.BRACKET_RIGHT);
		}

	}

	/**
	 * SQLのwhere条件に検索条件追加
	 * AND条件に複数列がある
	 *
	 * @param dto	SQL条件DTO
	 * @param sql	SQL文
	 * @param operator	オペレータ
	 * @param values	値
	 */
	private static void addWhere2(
			StatementDTO dto,
			String sql,
			String operator,
			Object[] values) {
		StringBuilder statement = dto.get_dynamicWhereCondition2();
		String currentSql = "";
		String nextSql = sql;
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_dynamicWhereCondition2(statement);
		} else {
			statement.append(operator);
		}
		if (values != null) {
			for (Object value : values) {
				currentSql = nextSql.substring(0, nextSql.indexOf(SQLConstant.QUESTION_MARK));
				if (currentSql.contains(KEYWORD.LIKE.toString())) {
					sql = sql.substring(0, sql.indexOf(SQLConstant.QUESTION_MARK)) + setLikeValue(value, dto, MODE_ALL)
							+ sql.substring(sql.indexOf(SQLConstant.QUESTION_MARK) + 1);
				} else {
					sql = sql.replaceFirst(PARAMETER_EXPRESSION, setValue(value));
				}
				nextSql = nextSql.substring(nextSql.indexOf(SQLConstant.QUESTION_MARK) + 1);

			}
			statement.append(SQLConstant.BRACKET_LEFT + sql + SQLConstant.BRACKET_RIGHT);
		}

	}
	
	/**
	 * パラメーター値の追加
	 * @param value		検索値
	 * @return	parameterValue	sql文値
	 */
	private static String setValue(
			Object value) {
		String parameterValue = "";
		if (value != null) {
			if (value instanceof String) {
				parameterValue = SQLConstant.SINGLE_QUOTES + checkValue((String) value) + SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.sql.Date) {
				parameterValue = SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.sql.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen)
						+ SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.sql.Time) {
				parameterValue = SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.sql.Time) value, DateUtil.FORMAT.HHcolonMMcolonSS)
						+ SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.sql.Timestamp) {
				parameterValue = SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.util.Date) value, DateUtil.FORMAT.YYYYMMDDHHMMSS_SSSHyphen)
						+ SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.util.Date) {
				parameterValue = SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.util.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen)
						+ SQLConstant.SINGLE_QUOTES;
			} else {
				parameterValue = value.toString();
			}
		}
		return parameterValue;
	}

	/**
	 * パラメーター値（LIKE条件）の追加
	 * @param value		検索値
	 * @param dto	SQL条件DTO
	 * @param mode	keywordがLIKEの場合
	 *			モード（0=valueの先頭に%を追加、1=valueの末尾に%を追加、2=valueの両端に%を追加）
	 * @return	parameterValue	sql文値
	 */
	private static String setLikeValue(
			Object value,
			StatementDTO dto,
			int mode) {
		String parameterValue = "";
		String beforePercent = "";
		String afterPercent = "";
		if (value != null) {
			if (mode == MODE_BEFORE) {
				beforePercent = SQLConstant.PERCENT;
			} else if (mode == MODE_AFTER) {
				afterPercent = SQLConstant.PERCENT;
			} else if (mode == MODE_ALL) {
				beforePercent = SQLConstant.PERCENT;
				afterPercent = SQLConstant.PERCENT;
			}

			if (value instanceof String) {
				parameterValue = SQLConstant.SINGLE_QUOTES + beforePercent + checkLikeValue((String) value, dto) + afterPercent
						+ SQLConstant.SINGLE_QUOTES;
				if (dto.isEscapeFlag()) {
					parameterValue = parameterValue + SQLConstant.SQL_ESCAPE + SQLConstant.SINGLE_QUOTES + SQLConstant.ESCAPE
							+ SQLConstant.SINGLE_QUOTES;
				}
			} else if (value instanceof java.sql.Date) {
				parameterValue = SQLConstant.SINGLE_QUOTES + beforePercent
						+ DateUtil.dateToString((java.sql.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen) + afterPercent + SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.sql.Time) {
				parameterValue = SQLConstant.SINGLE_QUOTES + beforePercent
						+ DateUtil.dateToString((java.sql.Time) value, DateUtil.FORMAT.HHcolonMMcolonSS) + afterPercent + SQLConstant.SINGLE_QUOTES;
			} else if (value instanceof java.util.Date) {
				parameterValue = SQLConstant.SINGLE_QUOTES + beforePercent
						+ DateUtil.dateToString((java.util.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen) + afterPercent + SQLConstant.SINGLE_QUOTES;
			} else {
				parameterValue = SQLConstant.SINGLE_QUOTES + beforePercent + value.toString() + afterPercent + SQLConstant.SINGLE_QUOTES;
			}
		}
		dto.setEscapeFlag(false);
		return parameterValue;
	}

	/**
	 * パラメーター値（IN或いはNOT IN条件）の追加
	 * @param dto	SQL条件DTO
	 * @param values	検索値
	 * @return	parameterValue	sql文値
	 */
	private static String setInValue(
			StatementDTO dto,
			Object[] values) {
		StringBuilder parameterValue = new StringBuilder();
		if (CollectionUtil.isNotEmpty(values)) {
			parameterValue.append(SQLConstant.BRACKET_LEFT);
			for (Object value : values) {
				if (value instanceof String) {
					parameterValue.append(SQLConstant.SINGLE_QUOTES + checkValue((String) value) + SQLConstant.SINGLE_QUOTES);
				} else if (value instanceof java.sql.Date) {
					parameterValue.append(SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.sql.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen)
							+ SQLConstant.SINGLE_QUOTES);
				} else if (value instanceof java.sql.Time) {
					parameterValue.append(SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.sql.Time) value, DateUtil.FORMAT.HHcolonMMcolonSS)
							+ SQLConstant.SINGLE_QUOTES);
				} else if (value instanceof java.util.Date) {
					parameterValue.append(SQLConstant.SINGLE_QUOTES + DateUtil.dateToString((java.util.Date) value, DateUtil.FORMAT.YYYYMMDDHyphen)
							+ SQLConstant.SINGLE_QUOTES);
				} else {
					parameterValue.append(value.toString());
				}
				parameterValue.append(SQLConstant.COMMA);

			}
			parameterValue = parameterValue.replace(parameterValue.length() - 2, parameterValue.length(), "");
			parameterValue.append(SQLConstant.BRACKET_RIGHT);

		}
		return parameterValue.toString();
	}

	/**
	 * パラメーター値のエスケープをチェックする
	 * @param value		転換前値
	 * @return	value	転換後値
	 */
	private static String checkValue(
			String value) {
		if (value.contains(SQLConstant.SINGLE_QUOTES)) {
			value = value.replace(SQLConstant.SINGLE_QUOTES, SQLConstant.SINGLE_QUOTES + SQLConstant.SINGLE_QUOTES);
		}

		return value;
	}

	/**
	 * パラメーター値（LIKE条件）のエスケープをチェックする
	 * @param value		転換前値
	 * @param dto	SQL条件DTO
	 * @return	value	転換後値
	 */
	private static String checkLikeValue(
			String value,
			StatementDTO dto) {
		if (value.contains(SQLConstant.PERCENT)) {
			value = value.replace(SQLConstant.ESCAPE, SQLConstant.ESCAPE + SQLConstant.ESCAPE);
			value = value.replace(SQLConstant.PERCENT, SQLConstant.ESCAPE + SQLConstant.PERCENT);
			dto.setEscapeFlag(true);
		}
		if (value.contains(SQLConstant.UNDER_PAR)) {
			if (!dto.isEscapeFlag()) {
				value = value.replace(SQLConstant.ESCAPE, SQLConstant.ESCAPE + SQLConstant.ESCAPE);
			}
			value = value.replace(SQLConstant.UNDER_PAR, SQLConstant.ESCAPE + SQLConstant.UNDER_PAR);
			dto.setEscapeFlag(true);
		}
		value = checkValue(value);

		return value;
	}

	/**
	 * SQL文を戻す
	 * @param dto	SQL条件DTO
	 * @return	sql	sql文
	 */
	public static String getSqlStatement(
			StatementDTO dto) {
		if (dto.get_dynamicWhereCondition() == null) {
			return null;
		}
		return dto.get_dynamicWhereCondition().toString();
	}
	
	/**
	 * SQL文を戻す
	 * @param dto	SQL条件DTO
	 * @return	sql	sql文
	 */
	public static String getSqlStatement2(
			StatementDTO dto) {
		if (dto.get_dynamicWhereCondition2() == null) {
			return null;
		}
		return dto.get_dynamicWhereCondition2().toString();
	}

	/**
	 * SQLのOrderBy条件に追加
	 *
	 * @param dto	SQL条件DTO
	 * @param columnName	列名
	 * @param keyword	SQLのキーワード
	 */
	public static void addOrderBy(
			StatementDTO dto,
			String columnName,
			KEYWORD keyword) {
		StringBuilder statement = dto.get_orderByCondition();
		if (statement == null) {
			statement = new StringBuilder();
			dto.set_orderByCondition(statement);
		} else {
			statement.append(SQLConstant.COMMA);
		}
		statement.append(columnName);
		if (keyword != null) {
			statement.append(keyword.toString());
		}

	}
}
