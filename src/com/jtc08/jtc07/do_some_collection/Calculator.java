package com.jtc08.jtc07.do_some_collection;

public class Calculator {
	
	
	
	public void  getCalculator(double a,String c,double b){
		switch(c){
		case "*":
			System.out.println(a+c+b+"="+(a*b));
			break;
		case "/":
			if(b==0.0){
				System.out.println("your math teacher  died!!!");
			}else{
			System.out.println(a+c+b+"="+(a/b));
			}
			break;	
		case "+":
			System.out.println(a+c+b+"="+(a+b));
			break;	
		case "-":
			System.out.println(a+c+b+"="+(a-b));
			break;
		case "%":
			System.out.println(a+c+b+"="+(a%b));
			break;
		case "^":
			double y = Math.pow(a, b);
			System.out.println(a+c+b+"="+y);
			break;
			default:
				System.out.println("你的计算器爸爸不认识这个符号..........");
		}
	
	}
	
	
	
	

	public static void main(String[] args) {
		Calculator s = new Calculator();
		s.getCalculator(27,"/", 0);
		
		
		
		// TODO Auto-generated method stub

	}

}
