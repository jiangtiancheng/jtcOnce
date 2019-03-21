package com.jtc08.jtc08.war_is_testbook;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
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
	public ArrayList<Grade> getGrade(Student1[] s){
		ArrayList<Grade> arr_gar = new ArrayList<Grade>();
		
		for(int i=0;i<s.length;i++){
			if(i<10){
				Grade temp = new Grade("1班","教室1","老师1",s[i]);
				arr_gar.add(temp);
			}else if(i<20){
				Grade temp = new Grade("2班","教室2","老师2",s[i]);
				arr_gar.add(temp);
			}else if(i<30){
				Grade temp = new Grade("3班","教室3","老师3",s[i]);
				arr_gar.add(temp);
			}else if(i<40){
				Grade temp = new Grade("4班","教室4","老师4",s[i]);
				arr_gar.add(temp);
			}else if(i<50){
				Grade temp = new Grade("5班","教室5","老师5",s[i]);
				arr_gar.add(temp);
			}else if(i<60){
				Grade temp = new Grade("6班","教室6","老师6",s[i]);
				arr_gar.add(temp);
			}
			
		}
		return arr_gar;
	}
//	public ArrayList<Institute> getInstitute(ArrayList<Grade> arr_gar){
//		HashMap<String,Object> ha = new HashMap<String,Object>();
//		
//		for(int i=0;i<60;i++){
//			if(i<20){
//				ins[i] = new Institute("计算机学院","科技楼","赵院长",arr_gar);
//				ar_ins.add(ins[i]);
//			}else if(i<40){
//				ins[i] = new Institute("经济学院","经法楼","李院长",g[i]);
//				ar_ins.add(ins[i]);
//			}else if(i<60){
//				ins[i] = new Institute("艺术学院","科技楼","杨院长",g[i]);
//				ar_ins.add(ins[i]);
//			}
//			
//		}
//		return ar_ins;
//	}
////	public void getUniversityMap(Institute[] ins){
////		University uni = new University();
//		HashMap<String,> hs = new HashMap();
//		hs.put("赵院长", ins);
//		
//		
//	}
	

	public static void main(String[] args) {
		Test b = new Test();
		b.getStudents();
		for(int i=0;i<60;i++){
//			System.out.println(b.getStudents()[i].getS_number());
			
		}
		
		for(int i=0;i<60;i++){
			
			
//			System.out.println(s.getG_location()+s.getG_student().getS_major());
			
		}
//		for(int i=0;i<b.getInstitute(b.getGrade(b.getStudents())).size();i++){
//			ArrayList<Institute> arr = b.getInstitute(b.getGrade(b.getStudents()));
//
//			System.out.println(arr);
//		}
		
	}

}
