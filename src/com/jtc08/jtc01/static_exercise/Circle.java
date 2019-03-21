package com.jtc08.jtc01.static_exercise;

public class Circle {
	static String color="huang";
	 double r=1.0;

	public Circle() {
	
	}

	public static String getColor() {
	
		return color;
	}

	public static String setColor(String color) {
		Circle.color = color;
		return Circle.color;
	}

	public  double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
