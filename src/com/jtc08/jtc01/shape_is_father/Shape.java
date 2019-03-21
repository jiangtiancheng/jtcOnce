package com.jtc08.jtc01.shape_is_father;

public class Shape {
	String color;
	double area;
	int per;

	public Shape() {
	}
	public Shape(String color) {
		this.color = color;
	}

	public double getArea() {
		return this.area;
	}
	public int getPer() {
		return this.per;
	}
	public String getColor() {
		return this.color;
	}
	
	
	public void showAll(){
		System.out.println("S_color:  "+getColor());
		System.out.println("S_area:   "+getArea());
		System.out.println("S_per:    "+getPer());
	}

}
