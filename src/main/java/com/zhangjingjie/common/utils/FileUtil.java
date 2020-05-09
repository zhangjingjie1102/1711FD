package com.zhangjingjie.common.utils;
/**
 * 文件工具类
 * @author Zhangjingjie
 *
 */
public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		
		int index = fileName.lastIndexOf(".");
		
		if(index == -1) {
			return null;
		}
		String result = fileName.substring(index);
		
		return result;
	}
}
