package com.skilldistillery.blackjack.entities;

public class Player {
	protected BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	public BlackjackHand gethand() {
		return hand;
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public int getHandValue() {
		int value = hand.getHandValue();
		return value;
	}
	
	public void displayHandAndValue() {
		System.out.println("Player's Blackjack Hand: " + getHandValue());
		hand.showCardsInHand();
	}
	
	public void clearHand() {
		hand.clearHand();
	}
	
}
