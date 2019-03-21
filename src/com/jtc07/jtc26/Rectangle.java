package com.jtc07.jtc26;

public class Rectangle {
	private String color;
	private double length;
	private double width;
	

	public Rectangle() {
		super();
	}
	

	public Rectangle(String color, double length, double width) {
		super();
		this.color = color;
		this.length = length;
		this.width = width;
	}
	public String toString(){
		String msg = this.getColor()+"     "+this.getLength()+"      "+this.getWidth();
		return msg;
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}
	public double getAreas(double a,double b){
		return a*b;
	}
	public double getPer(double a,double b){
		return 2*(a+b);
	}

	public static void main(String[] args) {
		
		Rectangle  r = new  Rectangle("lan",5,8);
		String s = r.toString();
		double d1 = r.getAreas(r.getLength(), r.getWidth());
		double d2 = r.getPer(r.getLength(), r.getWidth());
		System.out.println(s+"  "+d1+"  "+d2);
		
		
		
		

	}

}
