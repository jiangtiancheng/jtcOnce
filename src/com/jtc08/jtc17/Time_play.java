package com.jtc08.jtc17;

public class Time_play {
	
	private static int n = 0;
	
	public int getTimes(){
		return n++;
	}
	

	public static void main(String[] args) {
		Time_play t = new Time_play();
		int a = t.getTimes();
		System.out.println(a);
		int b = t.getTimes();
		System.out.println(b);
		int c = t.getTimes();
		System.out.println(c);
		int d = t.getTimes();
		System.out.println(d);
		int e = t.getTimes();
		System.out.println(e);
	}

}
