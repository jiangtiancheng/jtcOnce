package com.jtc08.jtc01.vehicle_are_bongxiakalaka;

public class Vehicle {
	double speed;
	 String color;
	 String brand;
	String impetus;
	public Vehicle() {
		super();
	}
	public Vehicle(String color) {
		this.color = color;
	}
	public Vehicle(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	public double getSpeed() {
		return speed;
	}
	public String getColor() {
		return this.color;
	}
	public String getBrand() {
		return brand;
	}
	public String getImpetus() {
		return impetus;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
