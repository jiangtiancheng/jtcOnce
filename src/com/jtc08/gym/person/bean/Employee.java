package com.jtc08.gym.person.bean;

public class Employee {
	private String employeeName;
	private String  employeePhotoNum;
	private int employeeAge;
	private int  employeeId=0;
	public Employee() {
		super();
	}
	public Employee(String employeeName, String employeePhotoNum, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeePhotoNum = employeePhotoNum;
		this.employeeAge = employeeAge;
	}






	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePhotoNum() {
		return employeePhotoNum;
	}
	public void setEmployeePhotoNum(String employeePhotoNum) {
		this.employeePhotoNum = employeePhotoNum;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	
	
	
	
	

}
