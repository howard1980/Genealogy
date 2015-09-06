package com.maxiaohua.genealogy.fw.core.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;


abstract public class NumberUtil {
	
	private static final String ZERO_STR = "0";

	
	private static final String PLUS_STR = "+";

	
	private static final String MINUS_STR = "-";

	
	private static final String NUMBER_FORMAT = "#.###";

	
	public static int sumAsInt(
			Integer... values) {
		int result = 0;
		if (values == null) {
			return result;
		}
		for (Integer value : values) {
			if (value != null) {
				result += value;
			}
		}
		return result;
	}

	
	public static Integer sumAsInteger(
			Integer... values) {
		if (values == null) {
			return null;
		}
		boolean isNullFlg = true;
		for (Integer value : values) {
			if (value != null) {
				isNullFlg = false;
				break;
			}
		}
		if (isNullFlg) {
			return null;
		}

		int result = 0;
		for (Integer value : values) {
			if (value != null) {
				result += value;
			}
		}
		return result;
	}

	
	public static int sumAsInt(
			String... values) {
		int result = 0;
		if (values == null) {
			return result;
		}
		for (String value : values) {
			if (StringUtil.isNotEmpty(value)) {
				result += toInt(value);
			}
		}
		return result;
	}

	
	public static Integer sumAsInteger(
			String... values) {
		if (values == null) {
			return null;
		}
		boolean isNullFlg = true;
		for (String value : values) {
			if (StringUtil.isNotEmpty(value)) {
				isNullFlg = false;
				break;
			}
		}
		if (isNullFlg) {
			return null;
		}

		int result = 0;
		for (String value : values) {
			if (StringUtil.isNotEmpty(value)) {
				result += toInt(value);
			}
		}
		return result;
	}

	
	public static int sumAsInt(
			List<?> values) {
		int result = 0;
		if (values == null) {
			return result;
		}
		Iterator<?> it = values.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			if (ob != null) {
				result += toInt(ob.toString());
			}
		}
		return result;
	}

	
	public static Integer sumAsInteger(
			List<?> values) {
		if (values == null) {
			return null;
		}
		boolean isNullFlg = true;
		Iterator<?> it1 = values.iterator();
		Iterator<?> it2 = values.iterator();
		while (it1.hasNext()) {
			if (it1.next() != null) {
				isNullFlg = false;
				break;
			}
		}
		if (isNullFlg) {
			return null;
		}

		int result = 0;
		while (it2.hasNext()) {
			Object ob = it2.next();
			if (ob != null) {
				result += toInt(ob.toString());
			}
		}
		return result;
	}

	
	public static long sumAsLong(
			Integer... values) {
		long result = 0L;
		if (values == null) {
			return result;
		}
		for (Integer value : values) {
			if (value != null) {
				result += value;
			}
		}
		return result;
	}

	
	public static long sumAsLong(
			Long... values) {
		long result = 0L;
		if (values == null) {
			return result;
		}
		for (Long value : values) {
			if (value != null) {
				result += value;
			}
		}
		return result;
	}

	
	public static long sumAsLong(
			String... values) {
		long result = 0L;
		if (values == null) {
			return result;
		}
		for (String value : values) {
			if (StringUtil.isNotEmpty(value)) {
				result += StringUtil.toLong(value);
			}
		}
		return result;
	}

	
	public static long sumAsLong(
			List<?> values) {
		long result = 0L;
		if (values == null) {
			return result;
		}
		Iterator<?> it = values.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			if (ob != null) {
				result += StringUtil.toLong(ob.toString());
			}
		}
		return result;
	}

	
	public static BigDecimal sumAsBigDecimal(
			String... values) {
		BigDecimal result = BigDecimal.valueOf(0);
		if (values == null) {
			return result;
		}
		for (String value : values) {
			if (StringUtil.isNotEmpty(value)) {
				result = result.add(toBigDecimal(value));
			}
		}
		return result;
	}

	
	public static BigDecimal sumAsBigDecimal(
			BigDecimal... values) {
		BigDecimal result = BigDecimal.valueOf(0);
		if (values == null) {
			return result;
		}
		for (BigDecimal value : values) {
			if (value != null) {
				result = result.add(value);
			}
		}
		return result;
	}

	
	public static BigInteger sumAsBigInteger(
			BigInteger... values) {
		BigInteger result = BigInteger.valueOf(0);
		if (values == null) {
			return result;
		}
		for (BigInteger value : values) {
			if (value != null) {
				result = result.add(value);
			}
		}
		return result;
	}

	
	public static long toLong(
			BigDecimal value) {
		return value.longValue();
	}

	
	public static long toLong(
			BigInteger value) {
		return value.longValue();
	}

	
	public static int toInt(
			BigDecimal value) {
		return value.intValue();
	}

	
	public static int toInt(
			BigInteger value) {
		return value.intValue();
	}

	
	public static BigInteger toBigInteger(
			Number value) {
		return value == null ? null : BigInteger.valueOf(value.longValue());
	}

	
	public static BigDecimal toBigDecimal(
			Number value) {
		return value == null ? null : new BigDecimal(value.toString());
	}

	
	public static long toLong(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toLong(value);
	}

	
	public static int toInt(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toInteger(value);
	}

	
	public static short toShort(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toShort(value);
	}

	
	public static BigInteger toBigInteger(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toBigInteger(value);
	}

	
	public static BigDecimal toBigDecimal(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toBigDecimal(value);
	}

	
	public static double toDouble(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toDouble(value);
	}

	
	public static float toFloat(
			String value) {
		if (StringUtil.isEmpty(value)) {
			value = ZERO_STR;
		}
		return StringUtil.toFloat(value);
	}

	
	public static BigDecimal round(
			BigDecimal value,
			int scale,
			RoundingMode roundingMode) {
		MathContext mathContext = new MathContext(value.precision() - value.scale() + scale);
		if (roundingMode instanceof RoundingMode) {
			mathContext = new MathContext(value.precision() - value.scale() + scale, roundingMode);
		}
		value = value.round(mathContext);
		return value;
	}

	
	public static BigDecimal round(
			String value,
			int scale,
			RoundingMode roundingMode) {
		return round(StringUtil.toBigDecimal(value), scale, roundingMode);
	}

	
	public static BigDecimal add(
			Object operand1,
			Object operand2) {
		BigDecimal op1 = StringUtil.toBigDecimal(StringUtil.objectToString(operand1));
		BigDecimal op2 = StringUtil.toBigDecimal(StringUtil.objectToString(operand2));
		return op1.add(op2);
	}

	
	public static BigDecimal sub(
			Object operand1,
			Object operand2) {
		BigDecimal op1 = StringUtil.toBigDecimal(StringUtil.objectToString(operand1));
		BigDecimal op2 = StringUtil.toBigDecimal(StringUtil.objectToString(operand2));
		return op1.subtract(op2);
	}

	
	public static BigDecimal mul(
			Object operand1,
			Object operand2) {
		BigDecimal op1 = StringUtil.toBigDecimal(StringUtil.objectToString(operand1));
		BigDecimal op2 = StringUtil.toBigDecimal(StringUtil.objectToString(operand2));
		return op1.multiply(op2);
	}

	
	public static BigDecimal div(
			Object operand1,
			Object operand2,
			int scale) {
		return div(operand1, operand2, scale, RoundingMode.HALF_UP);
	}

	
	public static BigDecimal div(
			Object operand1,
			Object operand2,
			int scale,
			RoundingMode roundMode) {
		BigDecimal op1 = StringUtil.toBigDecimal(StringUtil.objectToString(operand1));
		BigDecimal op2 = StringUtil.toBigDecimal(StringUtil.objectToString(operand2));
		return op1.divide(op2, scale, roundMode);
	}

	
	public static String getSignum(
			Number value) {
		String result = null;
		if (value != null) {
			if (new BigDecimal(value.toString()).compareTo(BigDecimal.ZERO) >= 0) {
				result = PLUS_STR;
			} else {
				result = MINUS_STR;
			}
		}
		return result;
	}

	
	public static String getAbsValue(
			Number value) {
		return value == null ? null : StringUtil.objectToString((new BigDecimal(value.toString()).abs()));
	}

	
	public static boolean isAllNotNull(
			Object... values) {
		for (Object value : values) {
			if (value == null) {
				return false;
			}
		}
		return true;
	}

	
	public static String div(
			Object operand1,
			Object operand2,
			int scale,
			RoundingMode roundMode,
			int mode) {
		DecimalFormat format = new DecimalFormat(NUMBER_FORMAT);
		return format.format(div(operand1, operand2, scale, roundMode));
	}
}