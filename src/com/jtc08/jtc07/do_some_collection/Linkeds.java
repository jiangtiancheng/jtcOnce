package com.jtc08.jtc07.do_some_collection;

import java.util.LinkedList;
import java.util.List;

public class Linkeds {
	LinkedList<Object> lists = new LinkedList<Object>();;
	public void put(Object o) {
		lists.addFirst(o);;
	}

	public Object get() {
		return lists.removeLast();
	}

	public boolean isEmpty() {
		
		return lists.isEmpty();
	}

	
}
