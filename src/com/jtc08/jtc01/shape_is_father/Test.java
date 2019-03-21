package com.jtc08.jtc01.shape_is_father;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 s = new Rectangle1();
		
		TestInstanceOf a=new TestInstanceOf();
		a.addOne(s);
		
		Triangle1 s1 = new Triangle1();
		TestInstanceOf b=new TestInstanceOf();
		b.addOne(s1);
		
	}

}
