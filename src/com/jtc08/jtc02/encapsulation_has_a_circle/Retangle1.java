package com.jtc08.jtc02.encapsulation_has_a_circle;

public class Retangle1 {
	int length;
	int width;
	public Retangle1() {
		super();
	}

	public void Shape(String color) {

	}

	public Retangle1(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		double area = length + width;
		return area;
	}

}
