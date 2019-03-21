package com.jtc07.jtc26;

public class Play_a_odd {

	public static void main(String[] args) {
		//随机输出三位奇数，如果是两位以下，输出“我是个两位数”
		int a = (int) (Math.random() * 1000);
		if(a>=100&&a<1000){
			if(a%2==1){
				System.out.println(a);
			}else{
				
				System.out.println(a+1);//变奇数
			}
		}else{
			System.out.println("我是个两位数");
			
		}

	}

}
