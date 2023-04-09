package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();

	public Dealer() {
		super();
	}

	public int checkDeckSize() {
		return deck.checkDeckSize();
	}

	public void shuffleDeck() {
		deck.shuffleDeck();
	}

	public void showShuffledDeck() {
		deck.showShuffledDeck();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void onlyShowSecondCard() {
		System.out.print("Dealer's top card: ");
		hand.onlyShowSecondCard();
	}

	@Override
	public void displayHandAndValue() {
		System.out.println("Dealer's Blackjack Hand: " + getHandValue());
		hand.showCardsInHand();
	}

}
