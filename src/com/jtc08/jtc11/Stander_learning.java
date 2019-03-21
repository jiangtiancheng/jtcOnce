package com.jtc08.jtc11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Stander_learning {

	public static void main(String[] args) {
		String s;
		InputStream inSys = System.in;
		Reader r = new InputStreamReader(inSys);
		BufferedReader bu = new BufferedReader(r);
		System.out.println("键盘输入：");
		try {
			while ((s = bu.readLine()) != null) {
				System.out.println("输入的是：" + s);
				
				if (s.equalsIgnoreCase("exit")) {
					break;
				}
			}
			
			bu.close();
			System.out.println("程序关闭！！！");
		}
		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
