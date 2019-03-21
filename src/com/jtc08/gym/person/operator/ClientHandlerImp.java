package com.jtc08.gym.person.operator;

import com.jtc08.gym.person.operator.ClientHandlerInf;
import com.jtc08.gym.person.bean.Client;

public class ClientHandlerImp implements ClientHandlerInf {
	// 会员的增加
	public Client[] addClient(Client[] allClient, String clientName, String clientPhotoNum, String sexs, int age, int balance) {
		for (int i = 0; i < allClient.length; i++) {
			if (allClient[i].getClientPhotoNum().equals(clientPhotoNum)) {
				System.out.println("该顾客已注册！！！");
			}
			else {
				Client c = new Client(clientPhotoNum, sexs, age, balance);
				c.setClientName(clientName + "*");
				allClient[i] = c;
			}
		}
		return allClient;
	}

	// 会员的注销
	public Client[] deleteClientOfPhotoNum(Client[] allClient, String clientPhotoNum) {
		for (int i = 0; i < allClient.length; i++) {
			if (allClient[i].getClientName().endsWith("*")) {
				Client c = new Client();
				c.setClientName(c.getClientName() + "#");
				allClient[i] = c;
			}
			else {
				System.out.println("这人不是会员！！！");
			}
		}
		return allClient;
	}

	// 根据电话号码，修改余额
	public Client[] alterClientOfPhotoNum(Client[] allClient, String clientPhotoNum, int balance) {
		for (int i = 0; i < allClient.length; i++) {
			if (allClient[i].getClientPhotoNum().equals(clientPhotoNum)) {
				Client c = new Client();
				c.setBalance(c.getBalance() + balance);
				allClient[i] = c;
			}
			else {
				System.out.println("未注册！！！！");
			}
		}
		return allClient;
	}

	// 根据电话号码修改电话号码
	public Client[] alterClientOfPhotoNum(Client[] allClient, String clientPhotoNum, String newPhotoNum) {
		for (int i = 0; i < allClient.length; i++) {
			if (allClient[i].getClientPhotoNum().equals(clientPhotoNum)) {
				Client c = new Client();
				c.setClientPhotoNum(newPhotoNum);
				allClient[i] = c;
			}
			else {
				System.out.println(" 未注册！！！！ ");
			}
		}
		return allClient;
	}

	// 根据电话号码 查询信息
	public void inquiryClientOfPhotoNum(Client[] allClient, String clientPhotoNum) {
		for (int i = 0; i < allClient.length; i++) {
			if (allClient[i].getClientPhotoNum().equals(clientPhotoNum)) {
				System.out.println(
						allClient[i].getClientName() + allClient[i].getClientSex() + allClient[i].getAge() + allClient[i].getBalance());
			}
		}
	}

}
