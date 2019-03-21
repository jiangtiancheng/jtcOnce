package com.jtc07.jtc31;
//将给定数组的奇数和偶数分别存入新的数组中输出出来
public class Extract {
	public int[] getOddExtract(int[] a){
		int sizeodd=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==1||a[i]%2==-1){
				sizeodd++;
			}else{
			}
		}
		int[] odd =new int[sizeodd];
		int j=0;
		for(int i=0;i<=a.length-1;i++){
			if(a[i]%2==1||a[i]%2==-1){
				odd[j]=a[i];
				j++;
			}
		}
		return odd;
	}
	
	public int[] getEvenExtract(int[] a){
		int sizeEven=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				sizeEven++;
			}else{
			}
		}
		int[] even =new int[sizeEven];
		int j=0;
		for(int i=0;i<=a.length-1;i++){
			if(a[i]%2==0){
				even[j]=a[i];
				j++;
			}
		}
		return even;
	}

	public static void main(String[] args) {
		int[] a = {12,56,7,8,90,-34,-7,123,0};
		Extract t = new Extract();
		for(int s:t.getOddExtract(a)){
			System.out.print("奇数是:"+s);
		}
		System.out.println();
		for(int s1:t.getEvenExtract(a)){
			System.out.print("偶数是:"+s1);
		}

	}

}
