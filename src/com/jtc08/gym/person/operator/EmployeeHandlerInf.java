package com.jtc08.gym.person.operator;

import com.jtc08.gym.person.bean.Employee;

public interface EmployeeHandlerInf {

	public static final String GYM_NAME = "GYMJTC";
	
	//员工新增入职
	public Employee[] insertNewEmployee(Employee[] allem,String employeeName,String employeePhotoNum,int employeeAge);
	
	
	
	//员工离职
	public Employee[] dimissionEmployeeInfo(int id,String name,Employee[] allem);
	
	//根据员工id信息修改员工 信息
			public Employee[] modifyEmplyoeeInfo(int id,Employee[] es,Employee newEmp);
	
	//员工信息查询-根据员工电话查询
	public void enquiryEmployeeOfPhoto(String employeePhotoNum,Employee[] allem);
	
	//员工信息查询-根据员工ID查询
	public void enquiryEmployeeOfId(int idNum,Employee[] allem);
	
	//员工信息查询-根据员工姓名
	public void enquiryEmployeeOfName(String esName,Employee[] allem);
	
	

}
