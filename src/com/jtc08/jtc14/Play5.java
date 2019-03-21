package com.jtc08.jtc14;

import java.util.Arrays;

public class Play5 {
	public int getMax(int[] a){
		Arrays.sort(a);
		return a[a.length-1];
	}
	public int getMix(int[] a){
		Arrays.sort(a);
		return a[0];
	}
	public int getSum(int[] a){
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Play5 p = new Play5();
	      int[]   s = {2,4,100,-10,9};
	      int max = p.getMax(s);
	      int mix = p.getMix(s);
	      int sum = p.getSum(s);
	      System.out.println("MAX:"+max+"   MIX:"+mix+"   SUM:"+sum);
	}

}
