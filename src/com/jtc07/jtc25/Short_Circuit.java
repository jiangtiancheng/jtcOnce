package com.jtc07.jtc25;

public class Short_Circuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		boolean b=i !=1&&(i++)==2;//短路，不运行i++;
		System.out.println("初值为1:");
		System.out.print("短路:"+b);//f
		System.out.println("     "+"i="+i);//1
		b=i!=1&(i++)==2;//不短路;
		System.out.print("不短路:"+b);//f
		System.out.println("  "+i);//i=2
		b=i==2||(i++)==2;//短路，不运行i++
		System.out.print(b);//T
		System.out.println("   "+i);//2
		b=i==2|(i++)==2;//不短路
		System.out.print(b);//T
		System.out.println("   "+i);//3

	}

}
