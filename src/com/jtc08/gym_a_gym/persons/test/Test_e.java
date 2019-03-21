package com.jtc08.gym_a_gym.persons.test;

import com.jtc08.gym_a_gym.persons.beans.Employee;
import com.jtc08.gym_a_gym.persons.beans.Manager;
import com.jtc08.gym_a_gym.persons.operaters.EmployeeImp;

public class Test_e {

	public static void main(String[] args) {
		//构建若干个员工对象，并模拟数据库存储在一个数组里或是集合内,
		// Manager使用的构造方法为：public Manager(String depertment,String pName,String pPhone,String pSex,int pAge,String id)
		//Employee 使用的构造方法为：public Employee(String etype, Manager manager, double salary,String pName
		//                                            ,String pPhone,String pSex,int pAge,String id)
		Manager m1 = new Manager("财务部","杨经理","15842635781","b",43,"20170808");
		Manager m2 = new Manager("人事部","王经理","15679541999","b",40,"20170809");
		Manager m3 = new Manager("宣传部","张经理","15842635782","b",45,"20170810");
		
		Employee e1 = new Employee("会计",m1, 3600.0,"小碧池1号","13586869000","b",23,"00000001");
		Employee e2 = new Employee("设计",m3, 5000.0,"小碧池2号","13586869001","g",23,"00000002");
		Employee e3 = new Employee("管理",m2, 3800.0,"小碧池3号","13586869002","b",23,"00000003");
		Employee e4 = new Employee("管理",m2, 3800.0,"小碧池4号","13586869003","b",23,"00000004");
		Employee e5 = new Employee("会计",m1, 3600.0,"小碧池5号","13586869004","g",23,"00000005");
		Employee e6 = new Employee("管理",m2, 3800.0,"小碧池6号","13586869005","b",23,"00000006");
		
		Employee[] emp = {e1,e2,e3,e4,e5};
		
		EmployeeImp em = new EmployeeImp();
		
//		Employee[] str = em.insertNewEmployee(emp, e6);
//		System.out.println(str[5].getpName());
//		for(int i=0;i<str.length;i++){
//			String s = str[i].getpName();
//			System.out.println(s);
//		}
		
//		String str = em.findEmployeeInforByPhone("13586869010", emp);//NO.2
//		System.out.println(str);
		
//		String str = em.modifyEmplyoeeInfo("13586869001", emp, e6);
//		System.out.println(str);
//		for(int i=0;i<str.length;i++){
//			String s = str[i].getpName();
//			System.out.println(s);
//		}
		
//		Employee[] str = em.dimissionEmployeeInfo("13586869001", emp);
//		for(int i=0;i<str.length;i++){
//			String s = str[i].getpName();
//			System.out.println(s);
//		}
		
		

	}

}
