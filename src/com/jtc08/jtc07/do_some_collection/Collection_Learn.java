package com.jtc08.jtc07.do_some_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Learn {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("快乐的小碧池");
		str.add("悲伤的小碧池");
		str.add("兴奋的小碧池");
		str.add("忧郁的小碧池");
		str.add("无聊的小碧池");
		str.add("失恋的小碧池");
		str.add("积极的小碧池");
		str.add("不知道啥玩意儿");
		
		//输出集合的长度
		int  length = str.size();
		System.out.println(length);
		
		//输出集合中第5个对象
		String str1 = str.get(4);
		System.out.println(str1);
		
		//遍历集合中的对象
		for(int i=0;i<length;i++){
			String str2 = str.get(i);
			System.out.println("第"+(i+1)+"个是："+str2);
		}
		
		//使用集合框架遍历集合
		Iterator<String> it = str.iterator();
		while(it.hasNext()){
			String str3 = it.next();
			System.out.println("********"+str3);
		}
		
		
	}

}
