package com.jtc08.jtc09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;



public class Map_Learn {

	public static void main(String[] args) {
		
		HashMap<String,String> ha = new HashMap<String,String>();
		ha.put("01", "快乐的小碧池");
		ha.put("02", "悲伤的小碧池");
		ha.put("03", "兴奋的小碧池");
		ha.put("04", "忧郁的小碧池");
		ha.put("05", "无聊的小碧池");
		ha.put("06", "失恋的小碧池");
		ha.put("07", "积极的小碧池");
		ha.put("08", "不知道啥玩意儿");	
		
		Collection<String> col = ha.values();//将hashmap的values直接放入collection中
		
		Iterator<String> it = col.iterator();//利用迭代器的方法遍历collection
		while(it.hasNext()){
			String snam = it.next();
			System.out.println("你是什么："+snam);
		}

	}

}
