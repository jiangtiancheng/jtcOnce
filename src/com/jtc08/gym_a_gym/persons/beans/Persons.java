package com.jtc08.gym_a_gym.persons.beans;

public class Persons {
	protected String pName;    //姓名
	protected String pPhone;   //电话号
	protected String pSex;     //性别
	protected int pAge;        //年龄
	protected String Id;

	public Persons() {
		super();
	}

	public Persons(String pName, String pPhone, String pSex, int pAge, String id) {
		super();
		this.pName = pName;
		this.pPhone = pPhone;
		this.pSex = pSex;
		this.pAge = pAge;
		Id = id;
	}



	public String toString() {
		String msg = "    " + this.getpName() + "-" + this.getpSex() + "-" + this.getpAge() + "-" + this.getpPhone()+"-"+this.Id;
		return msg;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSex() {
		return pSex;
	}

	public void setpSex(String pSex) {
		this.pSex = pSex;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpPhone() {
		return pPhone;
	}

	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

}
