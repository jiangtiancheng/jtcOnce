package com.jtc08.jtc04.try_throw;

public class Test_Execption1 {
	public void  method_1(){
		this.method_2();
		System.out.println("------我是刘大狗---------");
	}
	public void  method_2(){
		this.method_3();
		System.out.println("------我是刘二狗---------");
	}
	public void  method_3(){
		int[] a = new int[4];
		int sb = 0;
		try{
		sb = a[10000000];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("klshdgouien");
		}
		System.out.println("------我是刘三狗---------"+sb);
	}

}
