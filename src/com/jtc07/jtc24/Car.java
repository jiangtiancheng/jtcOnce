package com.jtc07.jtc24;

public class Car {
	String brand;
	int plateNumber;
	double sweptVolume;

	public Car(String brand, int plateNumber) {
		this.brand = brand;
		this.plateNumber = plateNumber;
	}

	public Car() {

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.plateNumber = 20170725;
		c1.brand = "baoma";
		c1.sweptVolume = 5.6;
		String g1 = c1.brand;
		System.out.println(g1);
		Car c2 = new Car("aodi", 554652556);
		String str1 = c2.brand;
		int str2 = c2.plateNumber;
		System.out.println(str1 + "---" + str2);
		Car s1 = new Car();
		s1.brand = c1.brand;
		s1.sweptVolume = c1.sweptVolume;
		s1.plateNumber = c2.plateNumber;
		System.out.println(s1.brand + "//" + s1.plateNumber + "//" + s1.sweptVolume);

	}

}
