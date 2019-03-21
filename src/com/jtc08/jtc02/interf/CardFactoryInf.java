package com.jtc08.jtc02.interf;

import com.jtc08.jtc01.bank_card_is_a_game.Card;

public interface CardFactoryInf {
	
	public String[] getLast4Numbers(int count);

	public Card[] buildCardObjects(int count,String begin_nums,String[]  Last4Numbers,int account);

	public Card[] buildLuckeyCardObjects(Card[] userCards, String luckyNum);
	
	public void listAllOfCards(Card[] userCards);

}
