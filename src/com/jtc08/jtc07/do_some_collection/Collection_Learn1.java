package com.jtc08.jtc07.do_some_collection;

import java.util.LinkedList;

public class Collection_Learn1 {

	public static void main(String[] args) {
		LinkedList<String> str_List =  new LinkedList<String>();
		str_List.add("答案      不过是场  好觉睡醒");
		str_List.add("爱      终究是来日方长的秘密");
		str_List.add("等不到人 也至少盼着自己");
		str_List.add("我说爱  或许是来日方长的事情");
		str_List.add("只怪那输得起的，遇不上看得起的，找谁对不起");
		str_List.add("总是妄想，借半生流离，换某人怜悯");
		str_List.add("惯了借叹息喘息，在试着碰碰运气，总要过下去");
		str_List.add("有些东西，你要是不提，我不去回忆");
		
		
		int chang = str_List.size();
//		System.out.println(chang);
		
		
		for(int i=0;i<str_List.size();i++){
			
//			String temp = str_List.get(i);
//			String temp = str_List.getLast();
			
			String temp = str_List.get(chang-1-i);
			System.out.println(temp);
//			str_List.remove(0);
			
//			str_List.remove(chang-i-1);
//			str_List.remove(i);
//			str_List.removeLast();
//			str_List.removeLastOccurrence(temp);
		}
		
		while(!str_List.isEmpty()){
			System.out.println(str_List.remove());
		}

	}

}
