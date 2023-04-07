package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealerTest {
	Scanner kb = new Scanner(System.in);
	int userInput;

	public static void main(String[] args) {
		DealerTest dt = new DealerTest();
		dt.start();
	}

	public void start() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		int deckSize = deck.checkDeckSize();
		System.out.println("Current # of cards in the deck : " + deckSize);
		System.out.print("How many cards do you want? ");
		userInput = kb.nextInt();
//		kb.nextInt();

		if (userInput > deckSize) {
			System.out.println("You tryin to disrespect me and my game?\nGet outta here ya Bozo!");
		} else {
			int sumOfCards = 0;
			if (userInput < 0 || userInput > 52) {
				System.out.println("Invalid entry : please choose a number between 0 & 52 ");
			} else {
				for (int cards = 0; cards < userInput; cards++) {
					Card cardDealt = deck.dealCard();
					sumOfCards += cardDealt.getValue();
					System.out.println(cardDealt + "    \tCurrent hand total: " + sumOfCards); //spaces and tab for printout prettiness
				}
				System.out.println("Remaining # of cards in the deck: " + deck.checkDeckSize());
			}
		}
		kb.close();
	}

}
