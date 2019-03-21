package com.jtc08.jtc03.try_to_fly;

import com.jtc08.jtc01.bank_card_is_a_game.Card;

public class Equals_Training {

	public static void main(String[] args) {
	   
		int a=5;
		int b=5;
		boolean s1=a==b;
		System.out.println("s1: "+s1);//基本类型比较值
		
		Card a1=new Card();
		Card b1=new Card();
		boolean s2=a1.equals(b1);
		boolean s3=a1==b1;//比较地址
		System.out.println("s2;  "+s2);
		System.out.println("s3:  "+s3);
		
		String a2 = "qwertyuiop";
		String b2 = "qwertyuiop";
		boolean s4=a2.equals(a2);
		System.out.println("s4: "+s4);//比较地址
		boolean s5=a2==b2;
		System.out.println("s5:  "+s5);//堆地址
		
		String a3 = new String();
		String b3 = new String();
		boolean s6=a3.equals(b3);
		System.out.println("s6: "+s6);
		boolean s7=a3==b3;
		System.out.println("s7:  "+s7);//地址
	}

}
