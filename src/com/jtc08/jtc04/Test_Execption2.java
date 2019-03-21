package com.jtc08.jtc04;

public class Test_Execption2 {
	public void  method_1(){
		this.method_2();
		System.out.println("------我是刘大狗2---------");
	}
	public void  method_2(){
		try{
		this.method_3();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("*******8");
		}
		System.out.println("------我是刘二狗2---------");
	}
	public void  method_3() throws ArrayIndexOutOfBoundsException{
		int[] a = new int[4];
		int sb = 0;
		sb = a[10000000];
		
		System.out.println("------我是刘三狗2---------"+sb);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
