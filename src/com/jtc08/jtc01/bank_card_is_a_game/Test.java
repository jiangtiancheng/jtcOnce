package com.jtc08.jtc01.bank_card_is_a_game;

public class Test {

	public static void main(String[] args) {
		// 1111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		CardFactory tr = new CardFactory();

		String[] last4Num = tr.getLast4Numbers(30);

		for (int i = 0; i < last4Num.length; i++) {

			String s = last4Num[i];

			System.out.println(s);

		}

		// 22222222222222222222222222222222222222222222222222222222222222222222222222222222222222
		CardFactory tr1 = new CardFactory();
		String[] fullNum = tr1.produceFullCardNum("1234-5678-9012-", last4Num);
		for (int k = 0; k < fullNum.length; k++) {
			String s1 = fullNum[k];
			System.out.println(s1);
		}
		// 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
		Card[] cards = tr1.produceCardObject(fullNum, "猪猪");
		for (int i = 0; i < cards.length; i++) {
			Card c = cards[i];
			String cardsNum = c.getCardNumber();
			String cardsUName = c.getCardName();
			System.out.println("No:" + (i + 1) + "名卡主:" + cardsUName + "的卡号是:" + cardsNum);
		}
		// 4444444444444444444444444444444444444444444444444444444444444444444444444
		

		for (int i = 0; i < cards.length; i++) {
			Card c = cards[i];
			String cardsNum = c.getCardNumber();
			char lastNum = cardsNum.charAt(cardsNum.length()-1);
			if (lastNum == '4') {
				int creditLimit=c.getCreditLimit();
				c.setCreditLimit(creditLimit+5000);
				cards[i]=c;
			}
			String cardsUName = c.getCardName();
			int cardsCre=c.getCreditLimit();
			System.out.println("No:" + (i + 1) + "名卡主:" + cardsUName + "的卡号是:" + cardsNum+"   "+cardsCre);
		}
		
		

	}

}
