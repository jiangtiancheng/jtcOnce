package com.jtc07.jtc26;

public class Math_Methods {
	/**
	 * 圆面积
	 * 
	 * @param r=半径
	 * @return 面积
	 * @author 蒋天成
	 * @serialData 07.26
	 */
	public double getArea(double r) {
		double s = 3.1415 * r * r;
		return s;
	}

	/**
	 * 
	 * @serialData 07 26 p
	 * 
	 * @param num
	 * @return 由大到小的阶乘
	 */

	public int getJiCheng(int num) {
		int i;
		int sum = 1;
		for (i = num; i >= 1; i--) {
			sum = sum * i;
		}
		return sum;
	}
	/**
	 * 
	 * @since
	 * @author 蒋天成
	 * 
	 * @return  随机数
	 */
	public int getSuiJi() {
		int a = (int) (Math.random() * 1000);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
