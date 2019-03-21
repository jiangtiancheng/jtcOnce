package com.jtc08.jtc01.shape_is_father;

public class Test_jicheng {

	public static void main(String[] args) {

		Shape s1 = new Shape();
	
		Triangle1 t1 = new Triangle1(3, 4, 5, "lan");
		
		Circle c1 = new Circle(3.1415,5,"huang");
		
		Rectangle1 r1 = new Rectangle1(5,6,"lv");
		
		
		s1.showAll();
		t1.showAll();
		c1.showAll();
		r1.showAll();
	}

}
