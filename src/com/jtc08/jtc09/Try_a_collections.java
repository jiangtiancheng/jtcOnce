package com.jtc08.jtc09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Try_a_collections {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
			a.add(11);
			a.add(25);
			a.add(12);
			a.add(158);
			a.add(57);
			a.add(66);
			a.add(88);
			List<Integer> b = new ArrayList<Integer>();
			b.add(255);
			b.add(8);
			b.add(58);
			b.add(99);
			List<Integer> c = new ArrayList<Integer>();
			c.add(58);
			
			//对集合进行排序
			Collections.sort(a);
			System.out.println("排序："+a);
			
			//集合中的元素向后移动2位，最后的元素出现在开始的位置
			Collections.rotate(a, 2);
			System.out.println("后移2位："+a);
			
			//将集合反转
			Collections.reverse(a);
			System.out.println("反转："+a);
			
			//对集合进行随机排序
			Collections.shuffle(a);
			System.out.println("随机："+a);
			
			//将集合b中的元素复制到a中，并覆盖相应位置的元素
			Collections.copy(a, b);
			System.out.println("复制:"+a);
			
			//交换指定元素的位置
			Collections.swap(a, 0, 5);
			System.out.println("交换:"+a);
			
			//返回a集合中第一次出现c集合的起始位置
			int s = Collections.indexOfSubList(a, c);
			System.out.println("第一次:"+s);
			
			//将集合中的元素用对象覆盖
			Collections.fill(b, 66);
			System.out.println("覆盖:"+b);
			
			//返回一个传统的遍历接口枚举方法
			Enumeration<Integer>  en =  Collections.enumeration(a);
			while(en.hasMoreElements()){
				System.out.println("枚举:"+en.nextElement());
			}
		
			
			
			
			
			
			
			
			
			

	}

}
