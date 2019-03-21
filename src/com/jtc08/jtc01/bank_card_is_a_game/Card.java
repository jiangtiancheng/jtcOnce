package com.jtc08.jtc01.bank_card_is_a_game;

public class Card {
	private String cardNumber;
	private String cardName;
	private int creditLimit;
	private int  remaining=10000;
	
	
	public Card() {
	}
	public Card(String cardNumber, String cardName) {
		this.cardNumber = cardNumber;
		this.cardName = cardName;
	}

	public Card(String cardNumber, String cardName, int remaining) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.creditLimit = remaining;
	}
	public String getCardNumber(){
		return this.cardNumber;
	}
	public void setCardNumber(String cardNum){
		this.cardNumber=cardNum;
	}
	
	
	public String getCardName(){
		return this.cardName;
	}
	public void setCardName(String cardNam){
		this.cardName=cardNam;
	}
	
	
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public String toString() {
       String card_tostr=this.cardName+"-"+this.cardNumber+"-"+this.creditLimit+"-"+this.remaining;
       return card_tostr;
    }

	

}
