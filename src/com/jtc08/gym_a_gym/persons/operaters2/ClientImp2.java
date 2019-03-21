package com.jtc08.gym_a_gym.persons.operaters2;

import java.util.ArrayList;
import java.util.LinkedList;

import com.jtc08.gym_a_gym.persons.beans.Client;

public class ClientImp2 implements ClientInf2{

	 //客户增加
	public String addNewClient(LinkedList<Client> clients, Client c) {
		String eg = "";
		for (int i = 0; i < clients.size(); i++) {
			String phone = clients.get(i).getpPhone();
			if (phone.equals(c.getpPhone())){
				eg="该用户已注册！！！";
				return eg;
//				return clients;
			}
		}
		clients.add(c);
		eg = "新增客户信息：" + c.toString();
		return eg;
//		return clients;
	}
	//根据电话号查询用户信息
	public String checkClientByPhone(ArrayList<Client> clients,String phoneNum){
		String eg = "";
		for (int i = 0; i < clients.size(); i++){
			String phone = clients.get(i).getpPhone();
			if (phone.equals(phoneNum)) {
				eg = "用户信息为："+clients.get(i).toString();
				break;
			}else{
				eg = "该用户不存在！！！！！";
			}
		}
		return  eg;
	}
	//根据电话号码更改姓名
	public String changeClientByPhone(LinkedList<Client> clients,String pName,String phoneNum){
		String eg = "";
		for (int i = 0; i < clients.size(); i++){
			String phone = clients.get(i).getpPhone();
			if (phone.equals(phoneNum)) {
				clients.get(i).setpName(pName);
				eg = "新的姓名为："+clients.get(i).getpName();
				break;
			}else{
				eg = "该用户不存在！！！！！";
			}
		}
		return  eg;
	}
	//删除会员
		public LinkedList<Client> deleteClientByPhone(LinkedList<Client> clients,String phoneNum){
//			String eg = "";
			for (int i = 0; i < clients.size(); i++){
				String phone = clients.get(i).getpPhone();
				if (phone.equals(phoneNum)) {
					clients.remove(i);
					return  clients;
//					eg = "被删用户信息为："+temp.toString();
				}
//					eg = "该用户不存在！！！！！";
			}
			System.out.println("该用户不存在！！！！！");
			return  clients;
		}
	
}
