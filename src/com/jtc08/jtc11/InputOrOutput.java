package com.jtc08.jtc11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOrOutput {

	public static void main(String[] args) {
		
		try {
			FileInputStream  f1 = new FileInputStream("E:\\QWDownload1\\d.txt");
			BufferedInputStream b1 = new BufferedInputStream(f1);
			int size =b1.available();
			System.out.println("size:   "+size);
			byte[]  b = new byte[size];
			int reads = b1.read(b);
			System.out.println("reads:   "+reads);
			String str = new String(b);
			System.out.println("str:  "+str);
			b1.close();
			FileOutputStream f2 = new FileOutputStream("E:\\QWDownload1\\e.txt");
			BufferedOutputStream b2 = new BufferedOutputStream(f2);
			
			
			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
