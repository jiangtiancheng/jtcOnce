package com.jtc08.jtc15;

public class Rabbit {
	/**
	 * 1,1,2,3,5,8,13,21,34.....
	 * 有一对兔子，从出生后三个月起每个月生一对小兔子，假设小兔子长到三个月后每个月生一对兔子
	 * 兔子都不死，问每个月兔子的对数？？
	 * @param n  兔子繁衍到的月份
	 * @return    兔子的总数
	 */
	public int bitch(int n){
		if(n==1|n==2){
			return 1;
		}else{
			return bitch(n-1)+bitch(n-2);
		}
	}

	public static void main(String[] args) {
		int a = 6;
		Rabbit r = new Rabbit();
		int s = r.bitch(a);
		System.out.println(s);

	}

}
