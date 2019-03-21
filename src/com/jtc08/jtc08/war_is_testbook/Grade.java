package com.jtc08.jtc08.war_is_testbook;



public class Grade {
	private String g_name;
	private String g_location;
	private String g_teacherName;
	private Student1 g_student;

	public Grade() {
		super();
	}
	
	public Grade(String g_name, String g_location, String g_teacherName, Student1 s) {
		super();
		this.g_name = g_name;
		this.g_location = g_location;
		this.g_teacherName = g_teacherName;
		this.g_student = s;
	}
	
	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_location() {
		return g_location;
	}

	public void setG_location(String g_location) {
		this.g_location = g_location;
	}

	public String getG_teacherName() {
		return g_teacherName;
	}

	public void setG_teacherName(String g_teacherName) {
		this.g_teacherName = g_teacherName;
	}

	public Student1 getG_student() {
		return g_student;
	}

	public void setG_student(Student1 g_student) {
		this.g_student = g_student;
	}
	public Grade[] getGrade(Student1[] s){
		Grade[]  g = new Grade[60];
		
		for(int i=0;i<s.length;i++){
			if(i<10){
				g[i] = new Grade("1班","教室1","老师1",s[i]);
			}else if(i<20){
				g[i] = new Grade("2班","教室2","老师2",s[i]);
			}else if(i<30){
				g[i] = new Grade("3班","教室3","老师3",s[i]);
			}else if(i<40){
				g[i] = new Grade("4班","教室4","老师4",s[i]);
			}else if(i<50){
				g[i] = new Grade("5班","教室5","老师5",s[i]);
			}else if(i<60){
				g[i] = new Grade("6班","教室6","老师6",s[i]);
			}
			
		}
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
