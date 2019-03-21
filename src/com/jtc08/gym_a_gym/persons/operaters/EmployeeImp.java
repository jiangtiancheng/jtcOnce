package com.jtc08.gym_a_gym.persons.operaters;

//import com.jtc08.gym_a_gym.persons.beans.Coach;
import com.jtc08.gym_a_gym.persons.beans.Employee;
//import com.jtc08.gym_a_gym.persons.beans.Manager;
//import com.jtc08.gym_a_gym.persons.beans.Persons;


public  class EmployeeImp implements  EmployeeInf{

	//员工新增入职
		public String insertNewEmployee(Employee[] emp,Employee e){
			String msg = "";
			int newl = emp.length + 1;
			Employee[] newEmployees = new Employee[newl];
			for (int i = 0; i < emp.length; i++) {
				Employee temp = emp[i];
				String phone = temp.getpPhone();
				if (phone.equals(e.getpPhone())) {
					msg = "该员工已注册！！！";
					return msg;
				}
				newEmployees[i] = temp;
			}
			newEmployees[emp.length] = e;
			  msg = "新增员工信息：" + e.toString();
			
			return msg;
		}
		//员工新增入职
//	public String  insertNewEmployee(Employee[] em,Manager[] ma,Coach[] co,Persons p) {
//		String eg = "";
//		if(p instanceof Employee){
//			Employee emp = (Employee)p;
//			int newl = em.length + 1;
//			Employee[] newEmployees = new Employee[newl];
//			for (int i = 0; i < em.length; i++) {
//				Employee temp = em[i];01
//				String phone = temp.getpPHone();
//				if (phone.equals(emp.getpPHone())) {
//					eg = "该员工已注册！！！";
//				}
//				newEmployees[i] = temp;
//			}
//			newEmployees[em.length] = emp;
//			eg = "新增员工信息：" + emp.toString();
//		
//		}else if(p instanceof Manager){
//			Manager manager = (Manager)p;
//			int newl = ma.length + 1;
//			Manager[] newManagers = new Manager[newl];
//			for (int i = 0; i < ma.length; i++) {
//				Manager temp = ma[i];
//				String phone = temp.getpPHone();
//				if (phone.equals(manager.getpPHone())) {
//					eg = "该经理已注册！！！";
//				}
//				newManagers[i] = temp;
//			}
//			newManagers[ma.length] = manager;
//			eg = "新增经理信息：" + manager.toString();
//	
//		}else if(p instanceof Coach){
//			Coach coach = (Coach)p;
//			int newl = co.length + 1;
//			Coach[] newCoachs = new Coach[newl];
//			for (int i = 0; i < co.length; i++) {
//				Coach temp = co[i];
//				String phone = temp.getpPHone();
//				if (phone.equals(coach.getpPHone())) {
//					eg = "该教练已注册！！！";
//				}
//				newCoachs[i] = temp;
//			}
//			newCoachs[co.length] = coach;
//			eg = "新增教练信息：" + coach.toString();
//		
//		}
//		return eg;
//	}

	//根据员工电话信息修改员工 信息
	public String modifyEmplyoeeInfo(String pPhone, Employee[] es, Employee newEmp) {
		String eg = "";
		for (int i = 0; i < es.length; i++){
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				es[i]=newEmp;
				eg = "新信息为："+es[i].toString();
//				return  es;
				break;
			}else{
				eg = "该员工不存在！！！！！";
			}
		}
		return  eg;
	}

	//员工离职,根据员工电话信息删除员工；
	public String  dimissionEmployeeInfo(String pPhone, Employee[] es) {
		String eg = "";
		int newl = es.length - 1;
		Employee[] newEmployees = new Employee[newl];
		int j =0;
		for (int i = 0; i < es.length; i++) {
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				eg = "离职的员工为"+temp.getpName();
				continue;
			}
			newEmployees[j] = temp;
			j++;
		}
		return eg;
	}

	//员工信息查询-根据员工电话查询
	public String findEmployeeInforByPhone(String pPhone, Employee[] es) {
		String eg = "";
		for (int i = 0; i < es.length; i++){
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				eg = "员工信息为："+temp.toString();
				break;
			}else{
				eg = "该员工不存在！！！！！";
			}
		}
		return  eg;
	}




}
