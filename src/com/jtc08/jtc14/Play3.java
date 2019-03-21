package com.jtc08.jtc14;

public class Play3 {
	
	public String getDays(int d){
		String s = "";
		switch(d){
		case 5: 
			s = "555";
			break;
		case 6:
			s = "666";
			break;
		case 7:
			s = "get a little bitch";
			break;
		default: 
			s = "@#$%^&*";
		}
		return s;
	}
	public int getSum(int a , int b ){
		int sum = 0;
		if(a<b){
			int i = a+1;
			while(i<b){
				sum+=i;
				i++;
			}
		}else if(a>b){
			int i = b+1;
			while(i<a){
				sum+=i;
				i++;
			}
		}else{
			sum = 0;
		}
		return sum;
	}
	public static void main(String[] args) {
		Play3 p = new Play3();
		String s = p.getDays(7);
		System.out.println(s);
		
		Play3 h = new Play3();
		int he = h.getSum(1, 10);
		System.out.println(he);

	}

}
