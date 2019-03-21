package com.jtc08.gym_a_gym.persons.operaters;

import com.jtc08.gym_a_gym.persons.beans.Client;
//import com.jtc08.gym_a_gym.persons.beans.Coach;

public interface ClientInf {

	// 客户增加
	public String addNewClient(Client[] clients, Client c);

	// 根据电话号查询用户信息
	public String checkClientByPhone(Client[] clients, String phoneNum);

	// 根据电话号码更改姓名
	public String changeClientByPhone(String phone_num, String client_id, Client[] clients, Client c);
	// 选择教练后交费

	// 删除会员
	public String deleteClientByPhone(Client[] clients, String phoneNum);

}
