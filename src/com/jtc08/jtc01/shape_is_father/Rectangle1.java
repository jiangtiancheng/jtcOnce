package com.jtc08.jtc01.shape_is_father;

public class Rectangle1 extends Shape{
	int width;
	int height;

	public  Rectangle1(){
	}
	public  Rectangle1(String color){
	}
	public  Rectangle1(int width, int height,String color) {
		super(color);
		this.width = width;
		this.height = height;
		
	}
	
	public double getArea(){
		area = width *height;
		return area;
	}
	public int getPer(){
		per = (width +height)*2;
		return per;
	}
	public String getColor() {
		return this.color;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void showAll(){
		System.out.println("the R_area is :"+getArea());
		System.out.println("the R_per is :"+getPer());
		System.out.println("the R_color is :"+getColor());
		System.out.println("the height is :"+this.height);
		System.out.println("the width is :"+this.width);
	}

}
