package com.jtc08.gym_a_gym.persons.operaters3.action;

import com.jtc08.gym_a_gym.persons.beans.Employee;

public class EmployeeActionImp implements EmployeeActionInf {
	// 员工新增入职
	public String insertNewEmployee(Employee[] emp, Employee e) {
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

	// 根据员工电话信息修改员工 信息
	public String modifyEmplyoeeInfo(String pPhone, Employee[] es, Employee newEmp) {
		String eg = "";
		for (int i = 0; i < es.length; i++) {
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				es[i] = newEmp;
				eg = "新信息为：" + es[i].toString();

				break;
			}
			else {
				eg = "该员工不存在！！！！！";
			}
		}
		return eg;
	}

	// 员工离职,根据员工电话信息删除员工；
	public String dimissionEmployeeInfo(String pPhone, Employee[] es) {
		String eg = "";
		int newl = es.length - 1;
		Employee[] newEmployees = new Employee[newl];
		int j = 0;
		for (int i = 0; i < es.length; i++) {
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				eg = "离职的员工为" + temp.getpName();
				continue;
			}
			newEmployees[j] = temp;
			j++;
		}
		return eg;
	}

	// 员工信息查询-根据员工电话查询
	public String findEmployeeInforByPhone(String pPhone, Employee[] es) {
		String eg = "";
		for (int i = 0; i < es.length; i++) {
			Employee temp = es[i];
			String phone = temp.getpPhone();
			if (phone.equals(pPhone)) {
				eg = "员工信息为：" + temp.toString();
				break;
			}
			else {
				eg = "该员工不存在！！！！！";
			}
		}
		return eg;
	}
}
