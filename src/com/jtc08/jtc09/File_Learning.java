package com.jtc08.jtc09;

import java.io.File;

public class File_Learning {

	public static void main(String[] args) {
		File f = new File("E:\\QMDownload");
		boolean b = f.canRead();
		boolean b1 = f.canRead();
		boolean b2 = f.canWrite();
		boolean b3 = f.isHidden();
		boolean b4 = f.isDirectory();
		String  b5 = f.getPath();
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("ijdo"+b5);
//		System.out.println(b);
//		System.out.println(b);
//		System.out.println(b);
//		System.out.println(b);
		File f1 = new File("E:\\QMDownload\\jjfxdgn\\adjfau/22/f148dakl");
		boolean b6=f1.mkdirs();
		System.out.println("####"+b6);
		File f2 = new File("E:\\QMDownload\\A\\B\\C\\D");
//		boolean b7=f2.mkdirs();
//		System.out.println(b7);
		File f3 = new File("E:/QMDownload/j/adju/22/dkl");
		f3.mkdirs();
		File f4 = new File("E:/QMDownload/h\\au/22/dkl");
		f4.mkdirs();
	}

}
