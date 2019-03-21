package com.jtc08.gym.person.operator;

import com.jtc08.gym.person.bean.Client;

public interface ClientHandlerInf {
public  Client[] addClient(Client[] allClient,String clientName,String clientPhotoNum,String  sexs,int age,int balance);
	
	public Client[] deleteClientOfPhotoNum(Client[]  allClient,String clientPhotoNum);
	
	
	
	public Client[]   alterClientOfPhotoNum(Client[]  allClient,String clientPhotoNum,int balance);
	
	public Client[]   alterClientOfPhotoNum(Client[]  allClient,String clientPhotoNum,String newPhotoNum);
	
	
	public void inquiryClientOfPhotoNum(Client[]  allClient,String clientPhotoNum);

}
