package com.jtc08.jtc03.try_to_fly;

public class String_Int_Training {

	public static void main(String[] args) {
		String str = "123456";

		int p = Integer.parseInt(str);// 直接String----->int
		System.out.println("p:  " + p);
		double d = Double.parseDouble(str);
		System.out.println("d:  " + d);

		Integer in = new Integer(str);// String----->int
		int new_in = in;
		System.out.println(new_in);
		Double dou = new Double(str);// String----->double
		double new_dou = dou;
		System.out.println(new_dou);
		// Character cha = new Character(str);
		// char new_cha=cha;

		String str1 = new_in + "";//////////// int----->String
		String str2 = String.valueOf(new_in);
		String str3 = Integer.toString(new_in);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		String str4 = new_dou + "";// double----->String
		String str5 = String.valueOf(new_dou);
		String str6 = Double.toString(new_dou);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		int i=10;
		Integer b_in = 1234;// Integer---->int
		int x=b_in;
		System.out.println("x:   "+x);//Integer---->int
		int b = b_in.intValue();
		System.out.println("b:   "+b);
		Integer  b_in1 = new Integer(i);//int --->Integer
		Integer  b_in2 = Integer.valueOf(i);//int --->Integer
		System.out.println("b_in1:  " + b_in1);
		System.out.println("b_in2:  " + b_in2);
		
		String i_str = b_in.toString();//Integer----->String
		System.out.println(i_str);
		
		Integer b_in3 = Integer.valueOf(str);//String--->Integer
		System.out.println("b_in3:  " + b_in3);
		
		
		
		
		
		
		
		
		
		
	}

}
