package com.jtc07.jtc31;
//输出给定数组的排序
public class Sort {
	public  int[]  getSortAtoB(int[] a){
		int temp=0;
		int size=a.length;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public  int[]  getSortBtoA(int[] a){
		int temp=0;
		int size=a.length;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = {-2,2,3,4,10,0,5};
		Sort t=new Sort();
		for(int s:t.getSortAtoB(a)){
			System.out.print("   "+s);
		}
		System.out.println();
		Sort t1=new Sort();
		for(int s:t1.getSortBtoA(a)){
			System.out.print("   "+s);
		}

	}

}
