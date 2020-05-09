package com.zhangjingjie.common.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	/**
	 * 日期测试 第一天的0时0分0秒
	 */
	@Test
	public void testGetDateByInitMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = null;
		try {
			parse = sdf.parse("2020-05-09 08:56:32");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date initMonth = DateUtil.getDateByInitMonth(parse);
		String format = sdf.format(initMonth);
		System.out.println(format);
	}
	
	/**
	 * 日期 获取当月最后一天的0时0分0秒
	 */
	@Test
	public void testGetDateByFullMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = null;
		try {
			parse = sdf.parse("2020-02-09 08:56:32");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date initMonth = DateUtil.getDateByFullMonth(parse);
		String format = sdf.format(initMonth);
		System.out.println(format);
	}
	
	
	/**
	 * 测试把工具类融合到sql语句中
	 */
	@Test
	public void test01() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = null;
		try {
			parse = sdf.parse("2020-05-09 08:56:32");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date initMonth1 = DateUtil.getDateByInitMonth(parse);
		String format1 = sdf.format(initMonth1);
		
		Date parse1 = null;
		try {
			parse1 = sdf.parse("2020-02-09 08:56:32");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date initMonth2 = DateUtil.getDateByFullMonth(parse1);
		String format2 = sdf.format(initMonth2);
		
		String sql = "select * from t_order where create_time>="+format1+" and create_time<="+format2+" ";
		System.out.println(sql);
		
		
	}

}
