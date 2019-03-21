package com.jtc08.jtc08.welcome_to_the_hero_alliance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UniversityImp implements UniversityInf {

	public University buildAUniversity() {
		University aUniversity = new University();
		HashMap<String, College> colleges = new HashMap<String, College>();
		for (int i = 1; i <= 3; i++) {
			College col = new College("学院-" + i, "教学楼-" + i, "院长-" + i);
			ArrayList<C_Class> c_classs = new ArrayList<C_Class>();
			for (int j = 1; j <= 3; j++) {
				C_Class cla = new C_Class("班级" + j, j+"层", "老师" + j);
				Student[] students = new Student[6];
				for (int k = 0; k < 6; k++) {
					Student student = new Student("0" + i+"0"+j + "0" + (k+1), "学生" + (k+1), "专业" + j,k%2==0?"男":"女",18);
					students[k] = student;
				}
				cla.setC_student(students);
				c_classs.add(cla);
			}
			col.setC$class(c_classs);
			colleges.put("院长" + i, col);
		}
		aUniversity.setCollege(colleges);
		;
		return aUniversity;
	}

	public void listAUniversity(University aUniversity) {
		HashMap<String, College> colleges = aUniversity.getCollege();
		if (!colleges.isEmpty()) {
			Set<String> str = colleges.keySet();
			
			System.out.println("学院：");
			for (String str1 : str) {
				College col =colleges.get(str1);
				System.out.println("   "+col.getC$location()+"   "+col.getC$name()+"    "+col.getC$president());
				ArrayList<C_Class> c_classs = colleges.get(str1).getC$class();
				System.out.println("    班级：");
				for (C_Class cal : c_classs) {
					System.out.println("   " + cal.toString());
					Student[] students = cal.getC_student();
					System.out.println("    学生：");
					for (Student st : students) {
						System.out.println("   " + st.toString());
					}
				}
				System.out.println(   );

			}
		}
		else {
			System.out.println("**************");
		}

	}

	public static void main(String[] args) {
		UniversityImp a = new UniversityImp();
		a.listAUniversity(a.buildAUniversity());
		
		

	}

}
