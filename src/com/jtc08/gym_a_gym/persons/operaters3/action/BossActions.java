package com.jtc08.gym_a_gym.persons.operaters3.action;

import com.jtc08.gym_a_gym.persons.beans.Client;
import com.jtc08.gym_a_gym.persons.beans.Coach;
import com.jtc08.gym_a_gym.persons.beans.Employee;
import com.jtc08.gym_a_gym.persons.beans.Manager;
import com.jtc08.gym_a_gym.persons.beans.Persons;

public class BossActions implements ActionInf{
	/*
	 * 圣诞节期间，为员工薪资增长原来薪资的10%；
	 * 			给会员的会费增加原来的15%的储值；
	 * 			给员工团队负责人的薪资增加12%；
	 * 			给私人教练的单价提升5%的奖励；
	 * 返回值说明：根据传入的对象不同，返回值字符串的信息内容要有鲜明区分。
	 */
	public String sendGifts(Persons p){
		String msg = "";
		if(p instanceof Client){
			Client client = (Client)p;
			client.setFees(client.getFees()*1.15d);
			msg = "会员见到圣诞老人后，他的余额为："+client.getFees();
		}else if(p instanceof Employee){
			Employee emp = (Employee)p;
			emp.setSalary(emp.getSalary()*1.1d);
			msg = "员工见到圣诞老人后，他的薪资为："+emp.getSalary();
			
		}else if(p instanceof Manager){
			Manager manager = (Manager)p;
			manager.setSalary(manager.getSalary()*1.12d);
			msg = "经理见到圣诞老人后，他的薪资为："+manager.getSalary();
		}else if(p instanceof Coach){
			Coach coach = (Coach)p;
			coach.setPrice(coach.getPrice()*1.05d);
			msg = "教练见到圣诞老人后，他的身价为："+coach.getPrice();
		}
		
		return msg;
	}
}
