package com.jtc08.gym_a_gym.persons.beans;

public class Employee extends Persons{
	private  String etype;     //员工类别
	private  Manager  manager; //员工领导
	private  double salary;    //员工薪资
	public Employee() {
		super();
	}
	public Employee(String etype, Manager manager, double salary,String pName,String pPhone,String pSex,int pAge,String id) {
		super(pName,pPhone,pSex,pAge,id);
		this.etype = etype;
		this.manager = manager;
		this.salary = salary;
	}
	public String toString(){
		String msg ="    " + this.getId()+"-"+this.getpName() + "-" + this.getpSex() + "-" + this.getpAge() 
										+ "-" + this.getpPhone()+"-"+this.getEtype()+"-"
										+this.getManager().getpName()+"-"+this.getSalary();
		return msg;
	}
	
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
