package com.jtc07.jtc31;
//将数组中给定尾数的元素存入另一个数组中输出出来；
public class Mantissa {
	public int[] getMantissa(int[] a,int mantissaNum){
		int sizeMan=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%10==mantissaNum){
				sizeMan++;
			}
		}
		int[] mantissa_arr =new int[sizeMan];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%10==mantissaNum){
				mantissa_arr[j]=a[i];
				j++;
			}
		}
		return mantissa_arr;
	}

	public static void main(String[] args) {
		int[] a={1243,2155,1521,5455,4745,1478,2365,5963,2487,5699,3589,5472,6324};
		Mantissa t= new Mantissa();
		for(int s:t.getMantissa(a, 5)){
			System.out.println(s);
		}

	}

}
