package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"), 
	SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"), JACK(10, "Jack"), 
	QUEEN(10, "Queen"), KING(10, "King"), ACE(11, "Ace");

	private int value;
	private String notShouting;
		
	Rank(int cardValue, String rankNotShouting){
		this.value = cardValue;
		this.notShouting = rankNotShouting;
		
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return notShouting;
	}

}
