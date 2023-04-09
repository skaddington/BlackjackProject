package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.app.BlackjackApp;

public class BlackjackHand extends Hand{
	
	public BlackjackHand() {
		super();
	}

	@Override
	public int getHandValue() {
		int sumOfCards = 0;
		for (Card card : cardsInHand) {
			sumOfCards += card.getValue();
		}
		return sumOfCards;
	}
	
	public boolean isBlackjack() {
		boolean blackjack;
		if ( getHandValue() == 21) {
			blackjack = true;
			System.out.println("Blackjack!");
		} else {
			blackjack = false;
		}
		return blackjack;
	}
	
	public boolean isBust() {
		boolean bust;
		if (getHandValue() > 21) {
			bust = true;
			System.out.println("Bust");
		} else {
			bust = false;
		}
		return bust;
	}

	@Override
	public int compareTo(Hand o) {
		if (this.getHandValue() < o.getHandValue()) {
		      System.out.println("Player wins this round!");
		      BlackjackApp.playerWins++;
		      return -1;
		    }
		    else if (this.getHandValue() > o.getHandValue()) {
		    	System.out.println("Dealer wins this round!");
		    	BlackjackApp.dealerWins++;
		    	return 1;
		    }
		    else {
		    	System.out.println("Push");
		    	BlackjackApp.push++;
		    	return 0;
		    }
	}
	
//	public boolean isHard() {		OPTIONAL
//		
//	}
//	
//	public boolean isSoft() {		OPTIONAL
//		
//	}

}
