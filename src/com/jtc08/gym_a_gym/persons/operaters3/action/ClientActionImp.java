package com.jtc08.gym_a_gym.persons.operaters3.action;

import com.jtc08.gym_a_gym.persons.beans.Client;

public class ClientActionImp implements ClientActionInf {
	// 客户增加
	public String addNewClient(Client[] clients, Client c) {
		String eg = "";
		int newl = clients.length + 1;
		Client[] newClients = new Client[newl];
		for (int i = 0; i < clients.length; i++) {
			Client temp = clients[i];
			String phone = temp.getpPhone();
			if (phone.equals(c.getpPhone())) {
				eg = "该用户已注册！！！";
				// System.out.println("该用户已注册！！！");
				return eg;
			}
			newClients[i] = temp;
		}
		newClients[clients.length] = c;
		eg = "新增客户信息：" + c.toString();
		return eg;
	}

	// 根据电话号查询用户信息
	public String checkClientByPhone(Client[] clients, String phoneNum) {
		String eg = "";
		for (int i = 0; i < clients.length; i++) {
			Client temp = clients[i];
			String phone = temp.getpPhone();
			if (phone.equals(phoneNum)) {
				eg = "用户信息为：" + temp.toString();
			}
			else {
				eg = "该用户不存在！！！！！";
			}
		}
		return eg;
	}

	// 根据电话号码更改姓名
	public String changeClientByPhone(String phone_num, String client_id, Client[] clients, Client c) {
		String eg = "";
		for (int i = 0; i < clients.length; i++) {
			Client temp = clients[i];
			String phone = temp.getpPhone();
			String id = temp.getId();
			if (phone.equals(phone_num) && (id.equals(client_id))) {
				clients[i] = c;
				eg = "新的姓名为：" + clients[i].getpName();
				break;
			}
			else {
				eg = "该用户手机号码不正确！！！！！";
			}
		}
		return eg;
	}
	//删除会员
	public String deleteClientByPhone(Client[] clients, String phoneNum) {
		String eg = "";
		for (int i = 0; i < clients.length; i++) {
			Client temp = clients[i];
			String phone = temp.getpPhone();
			if (phone.equals(phoneNum)) {
				temp.setpName(temp.getpName() + "*");
				eg = "被删用户信息为：" + temp.toString();
			}
			else {
				eg = "该用户不存在！！！！！";
			}
		}
		return eg;
	}

}
