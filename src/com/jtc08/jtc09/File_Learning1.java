package com.jtc08.jtc09;

import java.io.File;
import java.io.IOException;

public class File_Learning1 {

	public static void main(String[] args) {
		File test = new File("E:\\QWDownload1\\a\\b\\w");
////		test.mkdirs();
//		boolean s;
//		try {
////			s = test.createNewFile();
//			System.out.println(s);
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		System.out.println(s);
//		test.mkdirs();
		File test1 = new File("E:\\QWDownload1\\a\\b\\ybkhd");
		test1.mkdirs();
		int a = test.compareTo(test1);//返回一个int型的数字，值为文件名不同 名处开始两个首字符之间ASCII码的差值 前 减 后
		System.out.println(a);
		
		
	}

}
