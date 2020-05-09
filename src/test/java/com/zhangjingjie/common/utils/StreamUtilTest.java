package com.zhangjingjie.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() {
		InputStream in = null;
			try {
				in = new FileInputStream("D:/goo.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String textFile = StreamUtil.readTextFile(in);
			System.out.println(textFile);
	}
	
	//测时流传入一个文件获取文本内容
	@Test
	public void testReadTextFileFile() {
		String textFile = StreamUtil.readTextFile(new File("D:/goo.txt"));
		System.out.println(textFile);
		
	}

}
