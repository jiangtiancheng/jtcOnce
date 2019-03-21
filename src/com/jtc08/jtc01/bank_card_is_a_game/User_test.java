package com.jtc08.jtc01.bank_card_is_a_game;

public class User_test {

	public static void main(String[] args) {
		//1111111111111111111111111111111111111111111111111111111111111111111111111111111111111
				CardFactory tr = new CardFactory();

				String[] last4Num = tr.getLast4Numbers(30);

				for (int i = 0; i < last4Num.length; i++) {

					String s = last4Num[i];

					System.out.println(s);

				}
			
		//22222222222222222222222222222222222222222222222222222222222222222222222222222222222222
				CardFactory tr1 = new CardFactory();
				String[] fullNum = tr1.produceFullCardNum("1234-5678-9012-", last4Num);
				for (int k = 0; k < fullNum.length; k++) {
					String s1 = fullNum[k];
					System.out.println(s1);
				}
		//3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
				Card[] cards =tr1.produceCardObject(fullNum, "猪猪");
				for(int i=0;i<cards.length;i++){
					Card  c=cards[i];
					String cardsNum =c.getCardNumber();
					String cardsUName =c.getCardName();
					System.out.println("No:"+(i+1)+"名卡主:"+cardsUName+"的卡号是:"+cardsNum);
				}
		//44444444444444444444444444444444444444444444444444444444444444444444444444444444444444
				Card[] cards1 =tr1.getLuckycard(cards, "4");
				for(int i=0;i<cards1.length;i++){
					Card  c=cards[i];
					String cardsNum =c.getCardNumber();
					String cardsUName =c.getCardName();
					int cardsCre=c.getCreditLimit();
					System.out.println("No:" + (i + 1) + "名卡主:" + cardsUName + "的卡号是:" + cardsNum+"   "+cardsCre);
				}
				

	}

}
