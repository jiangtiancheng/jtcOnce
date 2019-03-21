package com.jtc08.jtc01.shape_is_father;

public class Circle extends Shape{
	public  double pi;
	private int r;
	
	
	public Circle() {
		super();
	}
	public Circle(double pi){
		this.pi = pi;
	}
	public Circle(double pi, int r,String color) {
		super(color);
		this.pi = pi;
		this.r = r;
	}
	public double getPi() {
		return this.pi;
	}
	public double getArea(){
		return pi*r*r;
	}
	public int getPer(){
		return (int) (pi*r*2);
	}
	public String getColor(){
		return this.color;
	}
	public int getR() {
		return this.r;
	}
	
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	public void showAll(){
		System.out.println("the C_area is :"+getArea());
		System.out.println("the C_per is :"+getPer());
		System.out.println("the C_color is :"+getColor());
		System.out.println("the pi is :"+this.pi);
		System.out.println("the r is :"+this.r);
	}

}
