package com.maxiaohua.genealogy.fw.core.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.apache.commons.validator.GenericTypeValidator;


abstract public class DateUtil {
	
	private static final String EMPTY = "";

	
	private static final String DEFAULT_DATE = "1000-01-01";

	
	private static final String MAX_DATE = "9999-12-31";

	
	private static final String MIN_DATE = "1000-01-01";

	
	private static final String MAX_TIMESTAMP = "9999-12-31 23:59:59.999999";

	
	private static final String MIN_TIMESTAMP = "1000-01-01 00:00:00.000000";

	
	private static final String DEFAULT_TIME = "00:00:01";

	
	public static enum FORMAT {
		
		YYYYMMDDHHMMSSMMM {
			@Override
			public String toString() {
				return "yyyyMMddHHmmssSSS";
			}
		},
		
		YYYYMMDDHHMMSS {
			@Override
			public String toString() {
				return "yyyyMMddHHmmss";
			}
		},
		
		YYMMDDHHMMSS {
			@Override
			public String toString() {
				return "yyMMddHHmmss";
			}
		},
		
		YYYYMMDD_HHcolonMM {
			@Override
			public String toString() {
				return "yyyyMMdd HH:mm";
			}
		},
		
		YYYYMMDDHHMM {
			@Override
			public String toString() {
				return "yyyyMMddHHmm";
			}
		},
		
		YYYYMMDD {
			@Override
			public String toString() {
				return "yyyyMMdd";
			}
		},
		
		YYMMDD {
			@Override
			public String toString() {
				return "yyMMdd";
			}
		},
		
		MMDD {
			@Override
			public String toString() {
				return "MMdd";
			}
		},
		
		HHMM {
			@Override
			public String toString() {
				return "HHmm";
			}
		},
		
		HHcolonMM {
			@Override
			public String toString() {
				return "HH:mm";
			}
		},
		
		HHcolonMMcolonSS {
			@Override
			public String toString() {
				return "HH:mm:ss";
			}
		},
		
		YYYYMMHyphen {
			@Override
			public String toString() {
				return "yyyy-MM";
			}
		},
		
		MMDDHyphen {
			@Override
			public String toString() {
				return "MM-dd";
			}
		},
		
		YYYYMMDDHyphen {
			@Override
			public String toString() {
				return "yyyy-MM-dd";
			}
		},
		
		YYYYMMDDHHMMSSHyphen {
			@Override
			public String toString() {
				return "yyyy-MM-dd HH:mm:ss";
			}
		},
		
		YYYYMMDDHHMMSS_SSSHyphen {
			@Override
			public String toString() {
				return "yyyy-MM-dd HH:mm:ss.SSS";
			}
		}
	};

	
	public static Date toDate(
			String value,
			String pattern,
			String strict) {
		if (value == null || value.trim().equals(EMPTY)) {
			return null;
		}

		Date result = null;

		if (pattern != null && pattern.length() > 0) {
			result = GenericTypeValidator.formatDate(value, pattern, false);
		} else if (strict != null && strict.length() > 0) {
			result = GenericTypeValidator.formatDate(value, strict, true);
		} else {
			throw new IllegalArgumentException("datePattern or datePatternStrict must be specified.");
		}

		return result;
	}

	
	public static java.sql.Date toDate(
			Timestamp value) {
		java.sql.Date result = null;

		if (value != null) {
			result = new java.sql.Date(value.getTime());
		}

		return result;
	}

	
	public static String dateToString(
			java.util.Date value,
			FORMAT format,
			Locale locale) {
		locale = locale == null ? Locale.ENGLISH : locale;
		SimpleDateFormat formatter = new SimpleDateFormat(format.toString(), locale);
		String result = null;
		try {
			formatter.setLenient(false);
			result = formatter.format(value);
		} catch (Exception e) {
			result = null;
		}
		return result != null ? result.toUpperCase() : result;
	}

	
	public static String dateToString(
			java.util.Date value,
			FORMAT format) {
		return dateToString(value, format, null);
	}

	
	public static java.util.Date parseToDate(
			String value,
			FORMAT format,
			Locale locale) {
		locale = locale == null ? Locale.ENGLISH : locale;
		java.util.Date result = null;
		SimpleDateFormat formatter = new SimpleDateFormat(format.toString(), locale);
		try {
			formatter.setLenient(false);
			result = formatter.parse(value);
		} catch (ParseException e) {
			result = null;
		}
		return result;
	}

	
	public static java.util.Date parseToDate(
			String value,
			FORMAT format) {
		return parseToDate(value, format, null);
	}

	
	public static java.sql.Time parseToTime(
			String value,
			FORMAT format) {

		return new java.sql.Time(parseToDate(value, format, null).getTime());
	}

	
	public static java.sql.Timestamp parseToTimestamp(
			String value,
			FORMAT format) {

		return new java.sql.Timestamp(parseToDate(value, format, null).getTime());
	}

	
	public static String convertFormat(
			String value,
			FORMAT fromFormat,
			FORMAT toFormat) {
		java.util.Date date = parseToDate(value, fromFormat, null);
		return dateToString(date, toFormat);
	}

	
	public static String convertFormat(
			String value,
			FORMAT fromFormat,
			FORMAT toFormat,
			Locale locale) {
		java.util.Date date = parseToDate(value, fromFormat, locale);
		return dateToString(date, toFormat);
	}

	
	public static int compare(
			String strDate1,
			String strDate2,
			FORMAT format) {
		
		if (strDate1 == null || strDate2 == null) {
			return 0;
		}
		java.util.Date date1 = parseToDate(strDate1, format, null);
		java.util.Date date2 = parseToDate(strDate2, format, null);
		return date1.compareTo(date2);
	}

	
	public static int compare(
			java.util.Date date1,
			java.util.Date date2) {
		
		if (date1 == null || date2 == null) {
			return 0;
		}
		return date1.compareTo(date2);
	}

	
	public static int compare(
			java.sql.Time time1,
			java.sql.Time time2) {
		
		if (time1 == null || time2 == null) {
			return 0;
		}
		java.sql.Time newTime1 = parseToTime(dateToString(time1, FORMAT.HHcolonMMcolonSS), FORMAT.HHcolonMMcolonSS);
		java.sql.Time newTime2 = parseToTime(dateToString(time2, FORMAT.HHcolonMMcolonSS), FORMAT.HHcolonMMcolonSS);
		return newTime1.compareTo(newTime2);
	}

	
	public static int compare(
			java.sql.Timestamp timestamp1,
			java.sql.Timestamp timestamp2) {
		
		if (timestamp1 == null || timestamp2 == null) {
			return 0;
		}
		return timestamp1.compareTo(timestamp2);
	}

	
	public static String getYear(
			String value,
			FORMAT format) {
		String str = convertFormat(value, format, FORMAT.YYYYMMDDHHMMSSMMM);
		return str.substring(0, 4);
	}

	
	public static String getYear(
			Date value) {
		return getYear(dateToString(value, FORMAT.YYYYMMDDHHMMSSMMM), FORMAT.YYYYMMDDHHMMSSMMM);
	}

	
	public static String getMonth(
			String value,
			FORMAT format) {
		String str = convertFormat(value, format, FORMAT.YYYYMMDDHHMMSSMMM);
		return str.substring(4, 6);
	}

	
	public static String getMonth(
			Date value) {
		return getMonth(dateToString(value, FORMAT.YYYYMMDDHHMMSSMMM), FORMAT.YYYYMMDDHHMMSSMMM);
	}

	
	public static String getDay(
			String value,
			FORMAT format) {
		String str = convertFormat(value, format, FORMAT.YYYYMMDDHHMMSSMMM);
		return str.substring(6, 8);
	}

	
	public static String getDay(
			Date value) {
		return getDay(dateToString(value, FORMAT.YYYYMMDDHHMMSSMMM), FORMAT.YYYYMMDDHHMMSSMMM);
	}

	
	public static String getHour(
			String value,
			FORMAT format) {
		String str = convertFormat(value, format, FORMAT.YYYYMMDDHHMM);
		return str.substring(8, 10);
	}

	
	public static String getHour(
			Date value) {
		return getHour(dateToString(value, FORMAT.YYYYMMDDHHMMSSMMM), FORMAT.YYYYMMDDHHMMSSMMM);
	}

	
	public static String getMinute(
			String value,
			FORMAT format) {
		String str = convertFormat(value, format, FORMAT.YYYYMMDDHHMM);
		return str.substring(10, 12);
	}

	
	public static String getMinute(
			Date value) {
		return getMinute(dateToString(value, FORMAT.YYYYMMDDHHMMSSMMM), FORMAT.YYYYMMDDHHMMSSMMM);
	}

	
	public static Calendar parseToCalendar(
			String value,
			FORMAT format) {
		Date date = parseToDate(value, format, null);
		Calendar calender = null;
		if (date != null) {
			calender = new GregorianCalendar();
			calender.setTime(date);
		}
		return calender;
	}

	
	public static java.sql.Date getDateAfterDay(
			java.util.Date dt,
			int day) {
		Calendar cale = Calendar.getInstance();
		
		cale.setTime(dt);

		cale.add(Calendar.DAY_OF_MONTH, day);

		
		return new java.sql.Date(cale.getTimeInMillis());
	}

	
	public static java.sql.Date getDateAfterMonth(
			java.util.Date dt,
			int month) {
		Calendar cale = Calendar.getInstance();

		
		cale.setTime(dt);

		cale.add(Calendar.MONTH, month);

		
		return new java.sql.Date(cale.getTimeInMillis());
	}

	
	public static java.sql.Date getDateAfterYear(
			java.util.Date dt,
			int year) {
		Calendar cale = Calendar.getInstance();

		
		cale.setTime(dt);

		cale.add(Calendar.YEAR, year);

		
		return new java.sql.Date(cale.getTimeInMillis());
	}

	
	public static int getDifferenceDay(
			java.util.Date fromDt,
			java.util.Date toDt) {

		final int int1000 = 1000;
		final int int60 = 60;
		final int int24 = 24;

		
		boolean minus = false;
		long gap = toDt.getTime() - fromDt.getTime();
		if (gap < 0) {
			minus = true;
			gap = 0 - gap;
		}
		int rtn = (int) (gap / (int1000 * int60 * int60 * int24));
		if (minus) {
			rtn = 0 - rtn;
		}

		
		return rtn;
	}

	
	public static int getDifferenceDayOnly(
			java.util.Date fromDt,
			java.util.Date toDt) {

		
		Integer ageDay = -1;
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		Calendar beforeEnd = Calendar.getInstance();
		start.setTime(fromDt);
		end.setTime(toDt);
		beforeEnd.setTime(DateUtil.getDateAfterMonth(toDt, -1));
		if (end.after(start)) {
			Integer startMonthDay = start.get(Calendar.DAY_OF_MONTH);
			Integer endMonthDay = end.get(Calendar.DAY_OF_MONTH);
			ageDay = endMonthDay - startMonthDay;
			if (startMonthDay > endMonthDay) {
				ageDay = beforeEnd.getActualMaximum(Calendar.DAY_OF_MONTH) - startMonthDay + endMonthDay;
			}
		} else {
			ageDay = -getDifferenceDayOnly(toDt, fromDt);
		}
		return ageDay;
	}

	
	public static int getDifferenceMonth(
			java.util.Date fromDt,
			java.util.Date toDt) {
		if (fromDt.compareTo(toDt) <= 0) {
			
			return getdifMonth(fromDt, toDt);
		} else {
			
			return -getdifMonth(toDt, fromDt);
		}
	}

	
	public static int getDifferenceYear(
			java.util.Date fromDt,
			java.util.Date toDt) {
		if (fromDt.compareTo(toDt) <= 0) {
			return compDate(fromDt, toDt);
		} else {
			return -compDate(toDt, fromDt);
		}
	}

	
	private static int compDate(
			Date sDay,
			Date eDay) {
		
		Calendar sCal = Calendar.getInstance();
		sCal.setTime(sDay);
		
		Calendar eCal = Calendar.getInstance();
		eCal.setTime(eDay);
		
		int result = eCal.get(Calendar.YEAR) - sCal.get(Calendar.YEAR);
		sCal.set(Calendar.YEAR, eCal.get(Calendar.YEAR));
		int ret = sCal.compareTo(eCal);
		if (0 < ret) {
			result -= 1;
		}
		return result;
	}

	
	private static int getdifMonth(
			Date fromDt,
			Date toDt) {
		
		Calendar calendarFrom = Calendar.getInstance();
		calendarFrom.setTime(fromDt);
		
		Calendar calendarTo = Calendar.getInstance();
		calendarTo.setTime(toDt);
		
		int fromDay = calendarFrom.get(Calendar.DAY_OF_MONTH);
		int toDay = calendarTo.get(Calendar.DAY_OF_MONTH);
		int fromDtMonth = getMonthNum(fromDt);
		int toDtMonth = getMonthNum(toDt);
		
		if (fromDay <= toDay) {
			return (toDtMonth - fromDtMonth);
		} else {
			if ((toDtMonth - fromDtMonth) == 0) {
				return 0;
			} else {
				return (toDtMonth - fromDtMonth - 1);
			}
		}
	}

	
	private static int getMonthNum(
			Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		final int intNum = 12;
		
		int year = calendar.get(Calendar.YEAR);
		
		int month = calendar.get(Calendar.MONTH);
		return year * intNum + month;
	}

	
	public static Date getEndOfMonth(
			Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int end = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, end);
		return cal.getTime();

	}

	
	public static java.sql.Date getDefault(
			java.sql.Date date) {
		
		if (date == null) {
			return null;
		}

		Date defaultDate = parseToDate(DEFAULT_DATE, DateUtil.FORMAT.YYYYMMDDHyphen);

		if (date.compareTo(defaultDate) == 0) {
			return null;
		} else {
			return date;
		}
	}

	
	public static java.sql.Date getDefault(
			java.sql.Date date,
			boolean maxDateFlag) {
		
		if (date == null) {
			return null;
		}

		date = getDefault(date);

		if (date != null && maxDateFlag) {
			Date maxDate = parseToDate(MAX_DATE, DateUtil.FORMAT.YYYYMMDDHyphen);

			if (date.compareTo(maxDate) == 0) {
				date = null;
			}
		}

		return date;
	}

	
	public static java.sql.Date setDefault(
			java.sql.Date date) {
		
		if (date == null) {
			return new java.sql.Date(parseToDate(DEFAULT_DATE, DateUtil.FORMAT.YYYYMMDDHyphen).getTime());
		} else {
			return date;
		}

	}

	
	public static java.sql.Date getDefaultDate() {
		return java.sql.Date.valueOf(DEFAULT_DATE);

	}

	
	public static java.sql.Time getDefault(
			java.sql.Time time) {
		
		if (time == null) {
			return null;
		}

		java.sql.Time defaultTime = parseToTime(DEFAULT_TIME, DateUtil.FORMAT.HHcolonMMcolonSS);

		if (time.compareTo(defaultTime) == 0) {
			return null;
		} else {
			return time;
		}
	}

	
	public static java.sql.Time setDefault(
			java.sql.Time time) {
		
		if (time == null) {
			return parseToTime(DEFAULT_TIME, DateUtil.FORMAT.HHcolonMMcolonSS);
		} else {
			return time;
		}
	}

	
	public static java.sql.Time getDefaultTime() {
		return parseToTime(DEFAULT_TIME, DateUtil.FORMAT.HHcolonMMcolonSS);
	}

	
	public static java.sql.Date getMaxDate() {
		return java.sql.Date.valueOf(MAX_DATE);

	}

	
	public static java.sql.Date getMinDate() {
		return java.sql.Date.valueOf(MIN_DATE);

	}

	
	public static java.sql.Timestamp getMaxTimestamp() {
		return java.sql.Timestamp.valueOf(MAX_TIMESTAMP);

	}

	
	public static java.sql.Timestamp getMinTimestamp() {
		return java.sql.Timestamp.valueOf(MIN_TIMESTAMP);

	}

}