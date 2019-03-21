package com.jtc08.gym_a_gym.persons.operaters3.factory;

import com.jtc08.gym_a_gym.persons.operaters3.action.ActionInf;
import com.jtc08.gym_a_gym.persons.operaters3.action.BossActions;
import com.jtc08.gym_a_gym.persons.operaters3.action.ClientActionImp;
import com.jtc08.gym_a_gym.persons.operaters3.action.EmployeeActionImp;

public class ActionsFactory {
	/*
	 * 单例模式的一个应用：确保ActionsFactory类只有一个唯一的实例对象，无论是谁在哪里创建
	 * 本类的实例对象，都是这个唯一的一个实例对象。
	 */
	private static ActionsFactory factory = null;
	private ActionsFactory(){
		
	}
	public static ActionsFactory getInstance(){
		factory = new ActionsFactory();
		return factory;
	}
	
	
	/**
	 * 根据传入的参数信息，自动决定实例化哪种类型的Action实例，并返回
	 * @param doWhat  传递进来需要做那种操作动作的字符串信息，以此作为实例化哪一个Action实例的依据
	 * @return  具体的Action实例对象
	 */
	public ActionInf getInstance(String doWhat){
		
		ActionInf action = null;
		if(doWhat.equals("/增加会员")||doWhat.equals("/删除会员")||
						doWhat.equals("/根据电话号码查询会员")||doWhat.equals("/修改会员信息")){
			
			action = this.getClientActionInstance(doWhat);
			
		}else if(doWhat.equals("/增加员工")||doWhat.equals("/删除员工")||
						doWhat.equals("/根据员工ID查询员工")||doWhat.equals("/修改员工信息")){
			
			action = this.getEmpActionInstance(doWhat);
			
		}else if(doWhat.equals("/boss操作")){
			
			action = this.getBossActionInstance(doWhat);
		}
		
		return action;
	}
	/**
	 * 获得一个"ClientAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getClientActionInstance(String doWhat){
		
		ActionInf clientAction = new ClientActionImp();
		
		return clientAction;
	}
	/**
	 * 获得一个"EmployeeAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getEmpActionInstance(String doWhat){
		
		ActionInf empAction = new EmployeeActionImp();
		
		return empAction;
	}
	/**
	 * 获得一个"BossAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getBossActionInstance(String doWhat){
		
		ActionInf bossAction = new BossActions();
		
		return bossAction;
	}
	
	

}
