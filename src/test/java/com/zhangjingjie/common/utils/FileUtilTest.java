package com.zhangjingjie.common.utils;


import org.junit.Test;

public class FileUtilTest {
	
	
	/**
	 * 获取文件的扩展名
	 */
	@Test
	public void testGetExtendName() {
		
		String name = FileUtil.getExtendName("aaa.jpg");
		System.out.println(name);
	}

}
