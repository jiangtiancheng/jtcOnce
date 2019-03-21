package com.jtc08.jtc02.imp;

import com.jtc08.jtc01.bank_card_is_a_game.Card;
import com.jtc08.jtc02.interf.CardFactoryInf;

public class TestCardFactory {

	public static void main(String[] args) {

		CardFactoryInf tr = new CardFactoryImp();
		String[] last4Num = tr.getLast4Numbers(30);
		for (String s:last4Num) {
			System.out.println(s);
		}

		Card[] cards = tr.buildCardObjects(30, "1314-1314-1314-", last4Num, 20000);
		tr.listAllOfCards(cards);
		
		Card[] luckyCards = tr.buildLuckeyCardObjects(cards, "4");
		tr.listAllOfCards(luckyCards);
		
	
	}

}
