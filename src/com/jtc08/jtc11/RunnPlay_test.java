package com.jtc08.jtc11;

public class RunnPlay_test {

	public static void main(String[] args) {
		RunnPlay  a = new RunnPlay();
		Thread t1= new  Thread (a,"11111");
		t1.start();
		Thread t2= new  Thread (a,"22222");
		t2.start();
		Thread t3= new  Thread (a,"33333");
		t3.start();
		

	}

}
