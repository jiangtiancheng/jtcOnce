package com.jtc08.jtc15;

import java.io.File;
import java.io.IOException;


public class Java_java {

	public static void main(String[] args) {
		File f = new File("E:\\java\\jtc.txt");
		File f1 = new File("E:\\java\\jtd.txt");
		File f2 = new File("E:\\java\\jtd.txt");
		f.mkdirs();
//		boolean b1 = false;
//		try {
//			 b1=f1.createNewFile();
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		boolean b1 = f.exists();
//		System.out.println(b1);
//		f.renameTo(f1);
//		boolean b2 = f1.equals(f2);
//		System.out.println(b2);
//		
//		File f3 = new File("e:\\myJava\\src");
//		boolean b3 = f3.mkdirs();
//		System.out.println(b3);
//		boolean b11 = f3.isDirectory();
//		boolean b22 = f3.isFile();
//		System.out.println(b11+"   "+b22);
//
//		String name = f3.getName();
//		String parent = f3.getParent();
//		System.out.println(name+"   "+parent);
		boolean b1111 = false;
		File f4 = new File(f,"myText");
		try {
			b1111=f4.createNewFile();
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(b1111);
//		
//		File f21 = new File("e:\\myJava\\src\\a.txt");
//		boolean b4 = f21.isDirectory();
//		boolean b5 = f21.isFile();
//		System.out.println(b4+"   "+b5);
//		
//		boolean b6 = f21.canExecute();
//		boolean b7 = f21.canRead();
//		boolean b8 = f21.canWrite();
//		boolean b9 = f21.isHidden();
//		System.out.println(b6+"   "+b7+"   "+b8+"   "+b9);
//		
//		File f31 = new File("e:\\myJava\\src\\b.txt");
//		boolean b10 = f31.exists();
//		System.out.println(b10);
//		
//		try {
//			boolean b111 = f3.createNewFile();
//			System.out.println("文件创建成功"+b111);
//		}
//		catch (IOException e) {
//			
//			e.printStackTrace();
//		}

	}

}
