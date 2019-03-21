package com.jtc08.gym.person.test;

import com.jtc08.gym.person.bean.Employee;
import com.jtc08.gym.person.operator.EmployeeHandlerImp;

public class Test {

	public static void main(String[] args) {
		Employee[] allem = new Employee[20];
		for (int i = 0; i < allem.length; i++) {
			Employee e = new Employee();
			e.setEmployeeId(i);
			e.setEmployeeName("kong");
			allem[i] = e;
		}
		 EmployeeHandlerImp em1I = new EmployeeHandlerImp();
		 EmployeeHandlerImp em2I = new EmployeeHandlerImp();
		 em1I.insertNewEmployee(allem, "xiangyu", "15425425869", 18);
		 em2I.insertNewEmployee(allem, "liubang", "13582458968", 35);
		 for (Employee s : allem) {
				String a = s.getEmployeeName();
				int b = s.getEmployeeId();
				System.out.println(a+"   "+"ID:"+b);
			}
	}

}
