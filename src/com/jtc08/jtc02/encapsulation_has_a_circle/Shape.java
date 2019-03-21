package com.jtc08.jtc02.encapsulation_has_a_circle;

public class Shape {
	private String color;
	 private double area;
	private int per;
	public Shape() {
	}
	public Shape(String color) {
		this.color = color;
	}
	public Shape(String color, double area, int per) {
		this.color = color;
		this.area = area;
		this.per = per;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return this.area;
	}
	public double getArea(int length,int width) {//方法的重载
		double area = length * width;
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getPer() {
		return this.per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
	
	
	
	
	

}
