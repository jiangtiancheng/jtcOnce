package com.jtc08.gym_a_gym.persons.operaters3.action;

import com.jtc08.gym_a_gym.persons.beans.Employee;

public interface EmployeeActionInf extends ActionInf {

	// 员工新增入职
	public String insertNewEmployee(Employee[] emp, Employee e);

	// 根据员工电话信息修改员工 信息
	public String modifyEmplyoeeInfo(String pPhone, Employee[] es, Employee newEmp);

	// 员工信息查询-根据员工电话查询
	public String findEmployeeInforByPhone(String pPhone, Employee[] es);

	// 员工离职,根据员工电话信息删除员工；
	public String dimissionEmployeeInfo(String pPhone, Employee[] es);

}
