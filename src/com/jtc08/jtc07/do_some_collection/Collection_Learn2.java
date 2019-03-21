package com.jtc08.jtc07.do_some_collection;

import java.util.LinkedList;


public class Collection_Learn2 {

	public static void main(String[] args) {
		LinkedList<String> str_List =  new LinkedList<String>();
		str_List.add("快乐的小碧池");
		str_List.add("悲伤的小碧池");
		str_List.add("兴奋的小碧池");
		str_List.add("忧郁的小碧池");
		str_List.add("无聊的小碧池");
		str_List.add("失恋的小碧池");
		str_List.add("积极的小碧池");
		str_List.add("不知道啥玩意儿");
		while(!str_List.isEmpty()){
			System.out.println(str_List.remove());
		}

	}

}
