package com.jtc08.gym_a_gym.persons.operaters2;

import com.jtc08.gym_a_gym.persons.beans.Coach;
import com.jtc08.gym_a_gym.persons.beans.Employee;
import com.jtc08.gym_a_gym.persons.beans.Manager;
import com.jtc08.gym_a_gym.persons.beans.Persons;

public interface EmployeeInf2 {
	//员工新增入职
			public String insertNewEmployee(Employee[] em,Manager[] ma,Coach[] co,Persons p);
			
			//根据员工电话信息修改员工 信息
			public String  modifyEmplyoeeInfo(String pPhone,Employee[] es,Employee newEmp);
			
			
			//员工离职,根据员工电话信息删除员工；
			public String dimissionEmployeeInfo(String pPhone,Employee[] es);
			
			//员工信息查询-根据员工电话查询
			public String findEmployeeInforByPhone(String pPhone,Employee[] es);

}
