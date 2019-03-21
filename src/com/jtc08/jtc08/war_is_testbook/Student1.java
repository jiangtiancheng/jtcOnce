package com.jtc08.jtc08.war_is_testbook;

public class Student1 {
	private String s_number;
	private String s_name;
	private String s_major;
	private String s_sex;
	private int s_age;
	
	public Student1() {
		super();
	}

	public Student1(String s_number, String s_name, String s_major, String s_sex, int s_age) {
		super();
		this.s_number = s_number;
		this.s_name = s_name;
		this.s_major = s_major;
		this.s_sex = s_sex;
		this.s_age = s_age;
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
	public Student1[] getStudents(){
		Student1[]  s = new Student1[60];
//		for(int i=0;i<s.length;i++){
//			int n = 10+i;
//			Student1 a = new Student1("201708"+n,"小碧池"+i,"专业"+i,i%2==0?"男":"女",18);
//			s[i]=a;
//		}
		for(int i=0;i<s.length;i++){
			int n = 10+i;
			if(i<10){
				s[i] = new Student1("201708"+n,"小碧池"+i,"计算机专业",i%2==0?"男":"女",18);
			}else if(i<20){
				s[i] = new Student1("201708"+n,"小碧池"+i,"网页设计专业",i%2==0?"男":"女",18);
			}else if(i<30){
				s[i] = new Student1("201708"+n,"小碧池"+i,"市场营销专业",i%2==0?"男":"女",18);
			}else if(i<40){
				s[i] = new Student1("201708"+n,"小碧池"+i,"人力资源专业",i%2==0?"男":"女",18);
			}else if(i<50){
				s[i] = new Student1("201708"+n,"小碧池"+i,"室内设计专业",i%2==0?"男":"女",18);
			}else if(i<60){
				s[i] = new Student1("201708"+n,"小碧池"+i,"绘画专业",i%2==0?"男":"女",18);
			}
			
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
