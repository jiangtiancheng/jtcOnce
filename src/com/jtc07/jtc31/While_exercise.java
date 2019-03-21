package com.jtc07.jtc31;
//1+2+3+4+.......+10
public class While_exercise {

	public static void main(String[] args) {
		int bb = 50;int c= 0;
		for(int i=1;i<=bb;i++){
			if(i%3==0){
				bb++;
			}
			c++;
		}
		System.out.println(c);
	}

}
