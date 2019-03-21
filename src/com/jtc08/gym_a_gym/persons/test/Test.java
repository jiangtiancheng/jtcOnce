package com.jtc08.gym_a_gym.persons.test;

import java.text.DateFormat;

import com.jtc08.gym_a_gym.persons.beans.Client;
import com.jtc08.gym_a_gym.persons.beans.Coach;
import com.jtc08.gym_a_gym.persons.operaters.ClientImp;

public class Test {

	public static void main(String[] args) {
		//构建若干个会员对象，并模拟数据库存储在一个数组里或是集合内,
		//Client 使用的构造方法为：public  Client(Calendar in_time, double fees, Coach coach,String pName,String pPhone,String pSex,int pAge,String id)
		//Coach 使用的构造方法为：public Coach(String cType, double price,String pName,String pPhone,String pSex,int pAge,String id)
		Coach coach1 = new Coach("瑜伽教练",300.0,"乐迪","12352688456","b",26,"201708");
		Coach coach2 = new Coach("形体教练",280.0,"酷飞","12352688457","b",28,"201709");
		Coach coach3 = new Coach("体能教练",260.0,"小爱","12352688458","g",27,"201710");
		Coach coach4 = new Coach("搏击教练",320.0,"大鹏","12352688459","b",30,"201711");
			
		Client c1 = new Client(DateFormat.getInstance().getCalendar(),3880,coach1,"熊大","13904113214","b",18,"170101");
		Client c2 = new Client(DateFormat.getInstance().getCalendar(),3850,coach3,"熊二","13804114254","b",16,"170102");
		Client c3 = new Client(DateFormat.getInstance().getCalendar(),3990,coach2,"毛毛","13704115264","b",28,"170103");
		Client c4 = new Client(DateFormat.getInstance().getCalendar(),4800,coach4,"吉吉","13604116274","b",20,"170104");
		Client c5 = new Client(DateFormat.getInstance().getCalendar(),5180,coach1,"光头强","13504117284","g",28,"170105");
		
		Client c6 = new Client(DateFormat.getInstance().getCalendar(),6666,coach1,"小碧池","15541634612","b",23,"170105");
				
		Client[]  cli ={c1,c2,c3,c4};
				
				
		ClientImp   c = new ClientImp();
		
//		Client[]  test = c.addNewClient(cli, c5);
//		String test = c.addNewClient(cli, c5);//NO.1
//		System.out.println(test);
		
//		String test = c.checkClientByPhone(cli, "13604116255");//NO.2
//		System.out.println(test);
		
		String test = c.changeClientByPhone("13904113214", "170101", cli, c2);
		System.out.println(test);
		
//		for(Client cc:test){
//			String str = cc.getpName();
//			System.out.println(str);
//		}
				

	}

}
