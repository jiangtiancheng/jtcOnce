package com.jtc07.jtc31;
//星期五输出；；；星期六输出‘’‘星期日输出、、、其他日期输出【【【【
public class Switch_Exercise {

	public static void main(String[] args) {
		int days = 2;
		switch (days) {
		case 5:
			System.out.println("Finally Friday!");
			break;
		case 6:
			System.out.println("Super Saturday!");
			break;
		case 7:
			System.out.println("Sleepy Sunday!");
			break;
		default:
			System.out.println("I hope for my weekend!");
		}

	}

}
