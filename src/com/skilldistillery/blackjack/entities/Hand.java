package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand implements Comparable<Hand>{
	protected List<Card> cardsInHand;
	
	public Hand() {
		cardsInHand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cardsInHand.add(card);
	}
	
	public void clearHand() {
		cardsInHand.removeAll(cardsInHand);
	}
	
	public void onlyShowSecondCard() {
		System.out.println(cardsInHand.get(1));
	}

	public void showCardsInHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}
	
	public abstract int getHandValue();
	
}
