package com.jtc08.jtc08.welcome_to_the_hero_alliance;



public class C_Class {
	private String c_name;
	private String c_location;
	private String c_teacherName;
	private Student[] c_student;
	
	public C_Class() {
		super();
	}
	public C_Class(String c_name, String c_location, String c_teacherName, Student[] c_student) {
		super();
		this.c_name = c_name;
		this.c_location = c_location;
		this.c_teacherName = c_teacherName;
		this.c_student = c_student;
	}
	
	public C_Class(String c_name, String c_location, String c_teacherName) {
		super();
		this.c_name = c_name;
		this.c_location = c_location;
		this.c_teacherName = c_teacherName;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_location() {
		return c_location;
	}
	public void setC_location(String c_location) {
		this.c_location = c_location;
	}
	public String getC_teacherName() {
		return c_teacherName;
	}
	public void setC_teacherName(String c_teacherName) {
		this.c_teacherName = c_teacherName;
	}
	public Student[] getC_student() {
		return c_student;
	}
	public void setC_student(Student[] students) {
		this.c_student = students;
	}
	 public String toString() {
	        return c_name+"   "+"地点："+c_location+"    "+"老师："+c_teacherName;
	    }


}
