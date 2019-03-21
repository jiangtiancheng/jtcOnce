package com.jtc08.jtc01.shape_is_father;

public class Triangle1 extends Shape{
	int a;
	int b;
	int c;

	public Triangle1() {
		super();
	}
	public Triangle1(String color) {
		super(color);
	}
	public Triangle1(int a, int b, int c,String color) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea() {
		double s = 1 / 2 * (a + b + c);
		 area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}
	public int getPer() {
		 per = a + b + c;
		return per;
	}
	public String getColor(){
		return this.color;
	}
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void showAll(){
		System.out.println("T_area:   "+getArea());
		System.out.println("T_per:    "+getPer());
		System.out.println("T_color is :"+getColor());
		System.out.println("the a is :"+this.a);
		System.out.println("the b is :"+this.b);
		System.out.println("the c is :"+this.c);
	}

}
