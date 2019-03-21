package com.jtc08.jtc03.try_to_fly;

public class String_Zhuanhuan_Training {

	public static void main(String[] args) {
		String str=" egiohn-knd kjndg-kdn dndion*js%$#@%^,d mklfmd   ";
		
		
		
		
		char[] cha=str.toCharArray();//String--->char[]
		for(char s:cha){
			System.out.print("   "+s);
		}
          System.out.println();
		String new_str = new String(cha);//char[]--->String
		System.out.print(new_str);
		System.out.println();
		byte[] by = new_str.getBytes();//String--->byte[]
//		int a=by.length;
		for(byte s:by){
			System.out.print("   "+s);
		}
		System.out.println();
//		System.out.print(a);
		String str1 = new String(by);//byte[]--->String 
		System.out.print("   "+str1);
		
		
	}

}
