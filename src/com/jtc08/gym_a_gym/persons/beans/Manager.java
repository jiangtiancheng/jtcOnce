package com.jtc08.gym_a_gym.persons.beans;

public class Manager extends Persons{
	private String depertment;   //所属部门
	private  double salary;
	public Manager() {
		super();
	}

	public Manager(String depertment,String pName,String pPhone,String pSex,int pAge,String id) {
		super(pName,pPhone,pSex,pAge,id);
		this.depertment = depertment;
	}
	public String toString(){
		String msg ="    "+this.getId()+"-" + this.getpName() + "-" + this.getpSex() + "-" 
							+ this.getpAge() + "-" + this.getpPhone()+"-"
							  +this.getDepertment();
		return msg;
	}

	public String getDepertment() {
		return depertment;
	}

	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
