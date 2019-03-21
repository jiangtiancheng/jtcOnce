package com.jtc08.gym_a_gym.persons.operaters2;

import java.util.ArrayList;
import java.util.LinkedList;

import com.jtc08.gym_a_gym.persons.beans.Client;
import com.jtc08.gym_a_gym.persons.beans.Coach;

public interface ClientInf2 {
	 //客户增加
	public String addNewClient(LinkedList<Client> clients, Client c);
	//根据电话号查询用户信息
	public String checkClientByPhone(ArrayList<Client> clients,String phoneNum);
	//根据电话号码更改姓名
	public String changeClientByPhone(LinkedList<Client> clients,String pName,String phoneNum);
	//选择教练后交费
	
	//删除会员
	public LinkedList<Client> deleteClientByPhone(LinkedList<Client> clients,String phoneNum);
}
