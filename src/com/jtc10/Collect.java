package com.jtc10;


public class Collect {
	 public int fun(int month){  
	        if(month==1||month==2)  
	            return 1;  
	        else   
	            return fun(month-1)+fun(month-2);  
	    }  
	public static void main(String[] args) {
		Collect c = new Collect();
		System.out.println(c.fun(5));
	
	}
}
