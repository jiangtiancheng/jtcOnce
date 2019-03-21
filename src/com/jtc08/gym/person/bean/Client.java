package com.jtc08.gym.person.bean;

public class Client {
	private String clientName;
	private String clientPhotoNum;
	private String clientSex;
	private int age;
	private int balance;
	public Client() {
		super();
	}
	
	public Client(String clientPhotoNum, String clientSex, int age, int balance) {
		super();
		this.clientPhotoNum = clientPhotoNum;
		this.clientSex = clientSex;
		this.age = age;
		this.balance = balance;
	}

	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientPhotoNum() {
		return clientPhotoNum;
	}
	public void setClientPhotoNum(String clientPhotoNum) {
		this.clientPhotoNum = clientPhotoNum;
	}
	public String getClientSex() {
		return clientSex;
	}
	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
