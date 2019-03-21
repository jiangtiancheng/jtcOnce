package com.jtc08.jtc08.welcome_to_the_hero_alliance;

public class Student {
	private String s_number;
	private String s_name;
	private String s_major;
	private String s_sex;
	private  int s_age;
	public Student() {
		super();
	}
	public Student(String s_number, String s_name, String s_major, String s_sex, int s_age) {
		super();
		this.s_number = s_number;
		this.s_name = s_name;
		this.s_major = s_major;
		this.s_sex = s_sex;
		this.s_age = s_age;
	}
	
	public Student(String s_number, String s_name, String s_major) {
		super();
		this.s_number = s_number;
		this.s_name = s_name;
		this.s_major = s_major;
	}
	public String getS_number() {
		return s_number;
	}
	public void setS_number(String s_number) {
		this.s_number = s_number;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_major() {
		return s_major;
	}
	public void setS_major(String s_major) {
		this.s_major = s_major;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
	 public String toString() {
	        return "     "+"学号："+s_number+"      "+"姓名："+s_name+"      "+"专业："+s_major+"   性别："+s_sex+"  年龄："+s_age;
	    }
	

}
