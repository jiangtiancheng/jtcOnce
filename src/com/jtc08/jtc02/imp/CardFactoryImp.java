package com.jtc08.jtc02.imp;

import com.jtc08.jtc01.bank_card_is_a_game.Card;

import com.jtc08.jtc02.interf.CardFactoryInf;

public class CardFactoryImp implements CardFactoryInf {
	/**
	 * @param count
	 *            创建的数量
	 * @return 返回一个用于持有这些count数量的4位数字 Last4Numbers
	 */
	public String[] getLast4Numbers(int count) {
		String[] Last4Numbers = new String[count];

		for (int i = 0; i < count; i++) {

			int randomNum = (int) (Math.random() * 10000);

			Integer intRandomNum = new Integer(randomNum);
			String temp = intRandomNum.toString();
			int length = temp.length();
			if (length == 3) {
				temp = "0" + temp;
			}
			else if (length == 2) {
				temp = "00" + temp;
			}
			else if (length == 1) {
				temp = "000" + temp;
			}
			Last4Numbers[i] = temp;
		}
		return Last4Numbers;
	}

	/**
	 * 创建一个装载有card对象的数组 public card[] buildCardObjects(int count,String
	 * begin_nums,String[] Last4Numbers,int account);
	 * 
	 * @param count
	 *            创建card对象的数量
	 * @param begin_nums
	 *            卡号的前十五位号段
	 * @param Last4Numbers
	 *            卡号的后四位
	 * @param account
	 *            信用卡里的初始余额
	 * @return 返回card[]类型的数组
	 * 
	 */
	public Card[] buildCardObjects(int count, String begin_nums, String[] Last4Numbers, int account) {
		if(count==Last4Numbers.length){
			Card[] full = new Card[count];
			for (int i = 0; i < count; i++){
				String fullNum=begin_nums.concat(Last4Numbers[i]);
				String userName = "二狗子"+i;
				Card c=new Card(fullNum,userName,account);
				full[i]=c;
			}
			return full;
		}else {
			System.out.println("你输入的是啥！！！！");
			return null;
		}
		
	}

	/**
	 * 根据幸运数字将符合卡号幸运数字的用户信用额度增加2000；
	 * 
	 * @param userCards
	 *            之前生成的数组
	 * @param luckyNum
	 *            幸运数字
	 * @return 返回值是Card[]类型的数组
	 * 
	 */
	public Card[] buildLuckeyCardObjects(Card[] userCards, String luckyNum) {
		
		int count = 0;
		for (int i = 0; i < userCards.length; i++) {
			Card c = userCards[i];
			String luckey_str = c.getCardNumber();
			if (luckey_str.endsWith(luckyNum)) {
				count++;
			}

		}
		Card[] luckeycards = new Card[count];
		int a = 0;
		for (int i = 0; i < userCards.length; i++) {
			Card c = userCards[i];
			String cardsNum = c.getCardNumber();
			if (cardsNum.endsWith(luckyNum)){
				c.setCreditLimit(c.getCreditLimit()+2000);
				luckeycards[a]=c;
				a++;
			}
		}

		return luckeycards;

	}

	public void listAllOfCards(Card[] userCards) {

		for (Card c : userCards) {
			System.out.println(c.getCardName()+" "+c.getCardNumber()+"  "+c.getCreditLimit());
		}

	}

}
