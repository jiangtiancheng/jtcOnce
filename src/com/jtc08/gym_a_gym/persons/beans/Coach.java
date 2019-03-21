package com.jtc08.gym_a_gym.persons.beans;

public class Coach extends Persons{
	private  String  cType;   //教练类型
	private  double  price;   //教练价格
	public Coach() {
		super();
	}
	public Coach(String cType, double price,String pName,String pPhone,String pSex,int pAge,String id) {
		super(pName,pPhone,pSex,pAge,id);
		this.cType = cType;
		this.price = price;
	}
	public String toString(){
		String msg ="    " +this.getId()+"-"+ this.getpName() + "-" + this.getpSex() + "-" 
							+ this.getpAge() + "-" + this.getpPhone()+"-"
							  +this.getcType()+"-" +this.getPrice();
		return msg;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
