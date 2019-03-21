package com.jtc08.gym_a_gym.persons.beans;

import java.util.Calendar;

public class Client extends Persons{
	private Calendar in_time;
	private double  fees;
	private  Coach coach;
	public Client() {
		super();
	}
	public Client(Calendar in_time, double fees, Coach coach,String pName,String pPhone,String pSex,int pAge,String id) {
		super(pName,pPhone,pSex,pAge,id);
		this.in_time = in_time;
		this.fees = fees;
		this.coach = coach;
	}
//	+"-"+this.getIn_time().toString()
	public String toString(){
		String msg ="    " +this.getId()+"-"+ this.getpName() + "-" + this.getpSex() + "-" + this.getpAge() 
										+ "-" + this.getpPhone()+"-"
										+this.getCoach().getpName()+"-"+this.getFees()+"-"+this.in_time.getTime().toString();
		return msg;
	}
	public Calendar getIn_time() {
		return in_time;
	}
	public void setIn_time(Calendar in_time) {
		this.in_time = in_time;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	

}
