package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deckOCards = new ArrayList<>();

	public Deck() {
		Rank [] ranks = Rank.values();
		Suit [] suits = Suit.values();
		
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deckOCards.add(card);
			}
		}
	}
	
//		IF THE PLAYER WANTS TO KEEP PLAYING, DEALER ADDS ANOTHER DECK
//	public List<Card> getDeckOCards() {
//		return deckOCards;
//	}

	public int checkDeckSize() {
		return deckOCards.size();
	}

	public void shuffleDeck() {
		Collections.shuffle(deckOCards);
		System.out.println("Dealer has shuffled the deck");
	}
	
	public void showShuffledDeck() {
		for (Card card : deckOCards) {
			System.out.println(card);
		}
	}
	
	public Card dealCard() {
		return deckOCards.remove(0);
	}

}
