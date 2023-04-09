package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	Scanner kb = new Scanner(System.in);
	public static int dealerWins = 0;
	public static int playerWins = 0;
	public static int push = 0;

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.playBlackjack();
	}

	public void playBlackjack() {
		System.out.println(dealer.checkDeckSize() + " cards in the deck.");
		dealer.shuffleDeck();
//		dealer.showShuffledDeck();
		while (dealer.checkDeckSize() >= 10) {
			dealInitialCards();
			System.out.println();
			displayCardsAndValue();
			clearHands();
			System.out.println("\n***************************************\n");
			System.out.println(dealer.checkDeckSize() + " cards remaining in the deck.");
		}
		System.out.println("Insufficient number of cards remaining : Thank you playing!");
		System.out.println("Player won " + playerWins + " times!");
		System.out.println("Dealer won " + dealerWins + " times.");
		System.out.println("Push " + push + " times.");
	}

	public void dealInitialCards() {
		Card firstCard = dealer.dealCard();
		player.addCardToHand(firstCard);
		Card secondCard = dealer.dealCard();
		dealer.addCardToHand(secondCard);
		Card thirdCard = dealer.dealCard();
		player.addCardToHand(thirdCard);
		Card fourthCard = dealer.dealCard();
		dealer.addCardToHand(fourthCard);
	}

	public void displayCardsAndValue() {
		dealer.onlyShowSecondCard();
		System.out.println("---------------------------------------");
		player.displayHandAndValue();
		System.out.println("---------------------------------------");
		playersNextStep();
	}

	public void playerStays() {
		dealer.displayHandAndValue();
		System.out.println("---------------------------------------");
		while (dealer.getHandValue() < 17) {
			dealer.addCardToHand(dealer.dealCard());
			dealer.displayHandAndValue();
			System.out.println("---------------------------------------");
		}
		if (dealer.gethand().isBlackjack()) {
			System.out.println("Dealer wins this round!");
			dealerWins++;
		} else if (dealer.gethand().isBust()) {
			System.out.println("Player wins this round!");
			playerWins++;
		} else {
			dealer.gethand().compareTo(player.gethand());

		}
	}

	public void playerHits() {
		player.addCardToHand(dealer.dealCard());
		player.displayHandAndValue();
		System.out.println("---------------------------------------");
		playersNextStep();
	}

	public void playersNextStep() {
		if (player.gethand().isBlackjack()) {
			System.out.println("Player wins this round!");
			playerWins++;
		} else if (player.gethand().isBust()) {
			System.out.println("Dealer wins this round!");
			dealerWins++;
		} else {
			System.out.println("Stay or Hit : Please enter 'S' or 'H' ");
			String playersChoice = kb.nextLine();
			if (playersChoice.equalsIgnoreCase("S")) {
				playerStays();
			} else if (playersChoice.equalsIgnoreCase("H")) {
				playerHits();
			} else {
				System.out.println("Invalid entry : Try again");
				playersNextStep();
			}
		}
	}

	public void clearHands() {
		dealer.clearHand();
		player.clearHand();
	}
}
