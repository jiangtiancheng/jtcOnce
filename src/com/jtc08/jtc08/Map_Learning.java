package com.jtc08.jtc08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.jtc08.jtc01.bank_card_is_a_game.Card;

public class Map_Learning {

	public static void main(String[] args) {
		Card p1 = new Card("00001","快乐的小碧池");
		Card p2 = new Card("00002","悲伤的小碧池");
		Card p3 = new Card("00003","兴奋的小碧池");
		Card p4 = new Card("00004","失恋的小碧池");
		Card p5 = new Card("00005","积极的小碧池");
		Card p6 = new Card("00006","不知道啥玩意儿");
		
		HashMap<Card,Card>  hs = new HashMap<Card,Card>();
		//
		hs.put(p1, p1);
		hs.put(p2, p2);
		hs.put(p3, p3);
		hs.put(p4, p4);
		hs.put(p5, p5);
		hs.put(p6, p6);
		//
		String s =hs.get(p3).getCardName();
//		System.out.println(s);
		//
		
		//
		Collection<Card> col = hs.values();
		Iterator<Card> it = col.iterator();
		while(it.hasNext()){
			Card  c = (Card)it.next();
			String num = c.getCardNumber();
			String nam = c.getCardName();
			System.out.println("***"+"Name: "+nam+"   Number:"+num+"***");
		}
	}

}
