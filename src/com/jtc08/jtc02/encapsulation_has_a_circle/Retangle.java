package com.jtc08.jtc02.encapsulation_has_a_circle;

class Retangle extends Shape {
	int length;
	int width;

	public Retangle() {
		super();
	}

	public void Shape(String color) {

	}

	public Retangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}
	public int getPer(){
		int per=2*(length+width);
		return per;
		
	}

}
