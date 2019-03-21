package com.jtc08.jtc01;

public class String_Exercise {

	public static void main(String[] args) {
		String str="   gvdjhdg-mkdbd-mdjndk nbb-mnd-smdnm  kjshs   ";
		
		int s1= str.length();
		System.out.println(s1);
		
		int s2= str.indexOf('k');
		System.out.println(s2);
		
		String s3= str.trim();
		System.out.println(s3);
		
		String s4= str.substring(15);
		System.out.println(s4);
		
		char s5= str.charAt(15);
		System.out.println(s5);
		
		boolean s6= str.equals(str);
		System.out.println(s6);
		
		boolean s7= str.matches("vdjh");
		System.out.println(s7);
		
		int s8= str.codePointAt(15);
		System.out.println(s8);

	}

}
