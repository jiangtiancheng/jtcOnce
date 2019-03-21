package com.jtc08.jtc07.do_some_collection;

public class Test_List {

	public static void main(String[] args) {
		Linkeds a = new Linkeds();
		a.put("a");
		a.put("b");
		a.put("c");
		a.put("d");
		
		while(!a.isEmpty()){
			System.out.println(a.get());
		}
		
		System.out.println(a.isEmpty());
		

	}

}
