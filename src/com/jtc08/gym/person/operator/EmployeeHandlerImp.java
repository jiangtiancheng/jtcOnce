package com.jtc08.gym.person.operator;

import com.jtc08.gym.person.bean.Employee;

public class EmployeeHandlerImp implements EmployeeHandlerInf{

	//新增员工入职
	public Employee[] insertNewEmployee(Employee[] allem,String employeeName,String employeePhotoNum,int employeeAge) {
	
		for(int i=0;i<allem.length;i++){
			if(allem[i].getEmployeeName().equals("kong")){
				allem[i] = new Employee(employeeName,employeePhotoNum,employeeAge);
				allem[i] .setEmployeeId(allem[i] .getEmployeeId()+i);
				break;
			}
		}
		return allem;
	}
	
	//员工信息查询-根据员工电话查询
		public void enquiryEmployeeOfPhoto(String PhotoNum,Employee[] allem){
			for(int i=0;i<allem.length;i++){
				if(allem[i].getEmployeePhotoNum().equals(PhotoNum)){
				System.out.println("姓名:"+allem[i].getEmployeeName()+"Id:"+allem[i].getEmployeeId()+"年龄:"+allem[i].getEmployeeAge());
				}else{
				System.out.println("查无此人！！！！！");	
				}
			}
		
		}
		
		
		//员工信息查询-根据员工ID查询
		public void enquiryEmployeeOfId(int idNum,Employee[] allem){
			for(int i=0;i<allem.length;i++){
				if(allem[i].getEmployeeId()==idNum){
				System.out.println("姓名:"+allem[i].getEmployeeName()+"电话号码:"+allem[i].getEmployeePhotoNum()+"年龄:"+allem[i].getEmployeeAge());
				}else{
				System.out.println("查无此人！！！！！");	
				}
			}	
		}
		
		//员工信息查询-根据员工姓名
		public void enquiryEmployeeOfName(String esName,Employee[] allem){
			for(int i=0;i<allem.length;i++){
				if(allem[i].getEmployeeName().equals(esName)){
				System.out.println("姓名:"+esName+"电话号码:"+allem[i].getEmployeePhotoNum()+"年龄:"+allem[i].getEmployeeAge()+"Id:"+allem[i].getEmployeeId());
				}else{
				System.out.println("查无此人！！！！！");	
				}
			}
		}

		//根据员工id信息修改员工 信息
	public Employee[] modifyEmplyoeeInfo(int id, Employee[] allem, Employee newEmp) {
		for(int i=0;i<allem.length;i++){
			if(allem[i].getEmployeeId()==id){
				allem[i].setEmployeeAge(newEmp.getEmployeeAge());
				allem[i].setEmployeePhotoNum(newEmp.getEmployeePhotoNum());
			}else{
			System.out.println("查无此人！！！！！");	
			}
		}
		return allem;
	}

	//员工离职
		public Employee[] dimissionEmployeeInfo(int id,String name,Employee[] allem){
			for(int i=0;i<allem.length;i++){
				if(allem[i].getEmployeeId()==id){
					if(allem[i].getEmployeeName().equals(name)){
						allem[i].setEmployeeAge(0);	
						allem[i].setEmployeePhotoNum(null);
						allem[i].setEmployeeName(null);
					}else{
						System.out.println("不是本人！！！！！");
					}
				}else{
				System.out.println("查无此人！！！！！");	
				}
			}
			return allem;	
		}

}
