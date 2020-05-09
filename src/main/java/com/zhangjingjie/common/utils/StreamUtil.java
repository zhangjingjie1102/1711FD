package com.zhangjingjie.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 流处理工具类
 * @author Zhangjingjie
 *
 */
public class StreamUtil {
	
	
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(Closeable...ios){
		for (Closeable io : ios) {
			if(io!=null) {
				try {
					io.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src){
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(src, "utf-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		String line = null;
		String text = "";
		try {
			while((line = reader.readLine())!= null) {
				text+=line;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	//TODO 实现代码
	}
	
	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		InputStream in = null;
		String textFile = "";
		try {
			in = new FileInputStream(txtFile);
			textFile = readTextFile(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		closeAll(in);
		return textFile;
	}
	
	
}
