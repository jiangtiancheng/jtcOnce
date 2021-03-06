package com.jtc08.gym_a_gym.persons.operaters3.proxy;

import java.util.HashMap;
import java.util.Set;

import com.jtc08.gym_a_gym.persons.beans.Client;
import com.jtc08.gym_a_gym.persons.beans.Coach;
import com.jtc08.gym_a_gym.persons.beans.Employee;
import com.jtc08.gym_a_gym.persons.beans.Manager;
import com.jtc08.gym_a_gym.persons.beans.Persons;
import com.jtc08.gym_a_gym.persons.operaters3.action.ClientActionInf;
import com.jtc08.gym_a_gym.persons.operaters3.action.EmployeeActionInf;
import com.jtc08.gym_a_gym.persons.operaters3.factory.ActionsFactory;



public class Proxy {
	//在代理中，获得唯一的一个ActionsFactory对象
		ActionsFactory factory  = ActionsFactory.getInstance(); 
		
		private static Proxy proxy = null;
		
		private Proxy(){}
		
		//代理Proxy类也需要用单例模式来创建唯一实例
		public static Proxy getInstance(){
			proxy = new Proxy();
			return proxy;
		}
		/*
		 * keyInfor  参数内容格式规定为“11位的手机号-6位客户/员工编号”，总长度18位。
		 * keyInfor  构成的特殊情况（1）：只有手机号时的格式：“11位手机号-”；
		 * 						（2）：只有编号时的格式：“-6位员工/客户编号”；
		 * 返回值说明：返回值为Map类型，键存储keyInfor;值存储Client对象实例或Employee对象实例或Manager对象实例或Coach对象实例。
		 */
		public HashMap<String,Persons> doWhat(String keyInfor,Persons p){
			HashMap<String,Persons> h = new HashMap<String,Persons>();
			if(p instanceof Client){
				Client client = (Client)p;
				h.put(keyInfor, client);
			}else if(p instanceof Employee){
				Employee emp = (Employee)p;
				h.put(keyInfor,emp);
			}else if(p instanceof Manager){
				Manager manager = (Manager)p;
				h.put(keyInfor,manager);
			}else if(p instanceof Coach){
				Coach coach = (Coach)p;
				h.put(keyInfor,coach);
			}
			return h;
		}
		/**
		 * 
		 * @param actionType 告诉代理你需要他做什么，比如：/增加会员   /修改员工；
		 * @param personInfor HashMap类型，键：手机号+会员编号、手机号-、-会员编号；值：会员实体类对象；
		 * @param clients	原有存放所有会员对象的数组或是集合
		 * @return String   消息内容：任何一个操作完成后的提示信息
		 */
		public String handleCenter(String actionType,HashMap<String,Persons> personInfor,Client[] clients){
			
			String msg = "";
			String[] actionTypes = {"/增加会员","/删除会员","/根据电话号码查询会员","/修改会员信息"};
			ClientActionInf clientAction = null;
			for(int i=0;i<actionTypes.length;i++){
				if(actionType.equals(actionTypes[i])){
					clientAction = (ClientActionInf)factory.getInstance(actionType);
				}
			}
			if(actionType.equals("/增加会员")){
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				//判断keyInfor的格式与长度，分析该值是完整的手机号+编号，还是只有手机号，还是只有编号?
				if(key.length() ==18){
					msg = clientAction.addNewClient(clients, (Client)personInfor.get(key));
				}else{
					msg = "你输入的电话号码和会员编号有误，总长度需要18位，格式为‘13900012345-201701’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/删除会员")){		//删除会员的业务，需要手机号和会员编号同时传入。
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				//判断keyInfor的格式与长度，分析该值是完整的手机号+编号，还是只有手机号，还是只有编号?
				if(key.length() ==18){
					//开始根据事先约定的构成结构进行截取出相应的两个号码，供后续方法的参数使用:13940821448-201701
					String[] phone_id = key.split("-");
					String phoneNum = phone_id[0];
					//调用业务方法：deleteClient();传入需要的手机号、会员编号、会员数组对象
					 msg = clientAction.deleteClientByPhone(clients, phoneNum);	
				}else{
					msg = "你输入的电话号码和会员编号有误，总长度需要18位，格式为‘13900012345-201701’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/根据电话号码查询会员")){
				Set<String> keyInfor = personInfor.keySet();	//该业务需要电话号，根据传值的规则约束，电话号码后面需要带“-”。我们获得该值后需要去除掉末尾的“-”。
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				if(key.length() ==18){
					//开始根据事先约定的构成结构进行截取出相应的两个号码，供后续方法的参数使用:13940821448-201701
					String[] phone_id = key.split("-");
					String phoneNum = phone_id[0];
					//调用业务方法：deleteClient();传入需要的手机号、会员编号、会员数组对象
					 msg =  clientAction.checkClientByPhone(clients, phoneNum);
				}else{
					msg = "你输入的电话号码和会员编号有误，总长度需要18位，格式为‘13900012345-201701’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/修改会员信息")){	//该业务需要电话号、会员编号，根据传值的规则约束，它们之间是使用“-”链接。
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				Client value = (Client)personInfor.get(key);
				if(key.length() ==18){
					//开始根据事先约定的构成结构进行截取出相应的两个号码，供后续方法的参数使用:13940821448-201701
					String[] phone_id = key.split("-");
					String phoneNum = phone_id[0];
					String client_id = phone_id[1];
					//调用业务方法：changeClientByPhone(String phone_num,String client_id,Client[] clients,Client c)
					msg = clientAction.changeClientByPhone(phoneNum, client_id, clients, value);	
				}else{
					msg = "你输入的电话号码和会员编号有误，总长度需要18位，格式为‘13900012345-201701’，请核实后继续操作！";
				}
			}else{
				msg = "就问你想干啥！！！！！！！！！！！！！！！！！！！！！！";
			}
			return msg;
		}
		/**
		 * @param actionType 告诉代理你需要他做什么，比如：/增加员工   /修改员工；
		 * @param personInfor HashMap类型，键：手机号+会员编号、手机号-、-会员编号；值：会员实体类对象；
		 * @param emp	原有存放所有员工对象的数组或是集合
		 * @return String   消息内容：任何一个操作完成后的提示信息
		 */
		public String handleCenter(String actionType,HashMap<String,Persons> personInfor,Employee[] emp){
			String msg = "";
			String[] actionTypes = {"/增加员工","/删除员工","/根据电话号码查找员工","/修改员工"};
			EmployeeActionInf empAction = null;
			for(int i=0;i<actionTypes.length;i++){
				if(actionType.equals(actionTypes[i])){
					empAction = (EmployeeActionInf)factory.getInstance(actionType);
				}
			}
			if(actionType.equalsIgnoreCase("/增加员工")){
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				//判断keyInfor的格式与长度，分析该值是完整的手机号+编号，还是只有手机号，还是只有编号?
				if(key.length() ==18){
					msg = empAction.insertNewEmployee(emp, (Employee)personInfor.get(key));
				}else{
					msg = "你输入的电话号码和会员编号有误，总长度需要18位，格式为‘13900012345-201701’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/删除员工")){		//删除员工的业务，需员工编号的传入。
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				Employee e = (Employee)personInfor.get(key);
				if(key.length()==18){
					 msg = empAction.dimissionEmployeeInfo(e.getpPhone(), emp);
				}else{
					msg = "你输入的电话号码有误，总长度需要11位，格式为‘15541634612’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/根据电话号码查找员工")){
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				Employee e = (Employee)personInfor.get(key);
				if(key.length()==18){
					 msg = empAction.findEmployeeInforByPhone(e.getpPhone(), emp);
				}else{
					msg = "你输入的电话号码有误，总长度需要11位，格式为‘15541634612’，请核实后继续操作！";
				}
			}else if(actionType.equalsIgnoreCase("/根据电话号码修改员工信息")){	
				Set<String> keyInfor = personInfor.keySet();
				String key ="";
				for(String k:keyInfor){
					key = k;
				}
				Employee e = (Employee)personInfor.get(key);
				if(key.length()==18){
					 msg = empAction.modifyEmplyoeeInfo(e.getpPhone(), emp, e);
				}else{
					msg = "你输入的电话号码有误，总长度需要11位，格式为‘15541634612’，请核实后继续操作！";
				}
			}else{
				msg =  "就问你想干啥！！！！！！！！！！！！！！！！！！！！！！";
			}
			return msg;
		}

}
