package com.jtc08.jtc10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1 = new FileInputStream("E:\\QWDownload1\\a.txt");
			BufferedInputStream b1 = new BufferedInputStream(f1);
//			DataInputStream  d1 = new DataInputStream(b1);
//			d1.readInt();
			
			int size = f1.available();
			System.out.println("size:" + size);
			byte[] bu = new byte[size];
//			byte[] bu1 = new byte[size];
			
			int read = f1.read(bu);
//			int read1 = b1.read(bu1, size, size);
			String str = new String(bu);
//			String str1 = new String(bu1);
//			System.out.println("read:" + read);
			System.out.println("str:" + str);
//			System.out.println("read1:" + read1);
//			System.out.println("str1:" + str1);
			f1.close();
//			FileOutputStream f2 = new FileOutputStream("E:\\QWDownload1\\a\\b\\c\\e.txt");
//			f2.write(bu);
//			f2.flush();
//			f2.close();
//			FileOutputStream f3 = new FileOutputStream("E:\\QWDownload1\\a\\b\\c\\f.txt");
//			BufferedOutputStream b3 = new BufferedOutputStream(f3);
//			
//			b3.write("jfnjd".getBytes());
//			
//			b3.flush();
//			b3.close();
//			

		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
