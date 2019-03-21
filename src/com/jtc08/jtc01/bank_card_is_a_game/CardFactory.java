package com.jtc08.jtc01.bank_card_is_a_game;

public class CardFactory {
	// 11111111111111111111111111111111111111111111111
	public String[] getLast4Numbers(int count) {

		String[] Last4Numbers = new String[count];

		for (int i = 0; i < count; i++) {

			int randomNum = (int) (Math.random() * 10000);

			Integer intRandomNum = new Integer(randomNum);
			String temp = intRandomNum.toString();

			// String aa = Integer.toString(randomNum);

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

	// 222222222222222222222222222222222222222222222222222222
	public String[] produceFullCardNum(String a, String[] b) {

		String[] full = new String[30];
		int length1 = b.length;
		for (int j = 0; j < length1; j++) {
			full[j] = a + b[j];
		}
		return full;
	}

	// 3333333333333333333333333333333333333333333333333333333333333333333333
	// 返回型是Card类型的数组
	public Card[] produceCardObject(String[] full, String userName) {
		Card[] cards = new Card[full.length];
		for (int i = 0; i < full.length; i++) {
			String cardNum = full[i];
			String user = userName;// +i;
			Card c = new Card();
			c.setCardName(user);
			c.setCardNumber(cardNum);
			cards[i] = c;
		}
		return cards;
	}

	// 4444444444444444444444444444444444444444444444444444444444444444444444444
	// 定义一个方法，将给定尾数为幸运值的用户的creditLimit增加5000；
	public Card[] getLuckycard(Card[] userCards, String luckyNum) {
		for (int i = 0; i < userCards.length; i++) {
			Card c = userCards[i];
			String cardsNum = c.getCardNumber();
			
//			char lastNum = cardsNum.charAt(cardsNum.length() - 1);
			String lastNum=cardsNum.substring(cardsNum.length()-2, cardsNum.length()-1);
			
			
			if (lastNum ==luckyNum) {
				int creditLimit = c.getCreditLimit();
				c.setCreditLimit(creditLimit + 5000);
				userCards[i] = c;
			}
		}
		return userCards;

	}

}
