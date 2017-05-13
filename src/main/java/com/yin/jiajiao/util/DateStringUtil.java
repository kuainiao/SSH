package com.yin.jiajiao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describe: 日期 - 字符串互转工具类
 * @ClassName: com.yin.jiajiao.util.DateStringUtil
 * @WriterName: QQ
 * @CreateDate: 2017年5月11日 下午3:30:32
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class DateStringUtil {

	/**
	 * @return 字符串类型 年-月-日 时:分:秒。 获得当前系统时间，yyyy-MM-dd HH:mm:ss 类型的时间格式
	 */
	public static String getCurTime_yyyyMMddHHmmss() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = sdf.format(new Date());
		return dateTime;
	}

	/**
	 * @return 字符串类型 年-月-日。 获得当前系统时间，yyyy-MM-dd 类型的时间格式
	 */
	public static String getCurDate_yyyyMMdd() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String curDate = sdf.format(new Date());
		return curDate;
	}
	
	/**
	 * @return 日期类型 年-月-日。 把字符串类型的日期，转成日期类型
	 */
	public static Date String2Date(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date toDate = null;
		try {
			toDate = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return toDate;
	}
	
	/**
	 * @return 日期类型 年-月-日 时:分:秒。 把字符串类型的日期，转成日期时间类型
	 */
	public static Date String2DateTime(String strDate) {
		Date toDateTime = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			toDateTime = sdf.parse(strDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toDateTime;
	}
}
