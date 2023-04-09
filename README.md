# BlackjackProject

## Overview

- **What is the End Goal?**
<p>The goal of the Blackjack Project is to present the user with an application in which they can play Blackjack. The user can make inputs as to whether they wish to 'Stay' or 'Hit' and may play so long as there are enough cards remaining in the deck.

- **General Starter Setup :**
<p>Create parent/child classes (abstract if appropriate), class fields, imports, methods, constructors, getters, setters, and toString methods according to the UML or where appropriate.

- **User Story #1 :** 
<p>In order to play Blackjack or any other card game that requires a classic 52-card deck, you have to create one. Using `enumerated type` classes, the suits and ranks were specified. A Deck class can then iterate through those suits and ranks via nested `foreach` loops in its `constructor` to build the deck.

- **User Story #2 :** 
<p>Creating the deck isn't the only task needed. Other methods are included so that a dealer may do their job. They can check the size of the deck (52 cards, no more, no less) using the `.size method`. The dealer can shuffle the deck via the `Collections.shuffle method`, and show that it was indeed shuffled by iterating through the deck using another `foreeach` loop. Lastly, they need to be able to deal a card to a player, this option uses `.remove(0)` to take the top card off and remove it from the deck, adding it to a players hand.

- **User Story #3 :** 
<p>When the application begins, the dealer calls on the `checkDeckSize method` which should return 52 cards in the deck. The complete deck is then shuffled (a shuffled deck may be displayed if it's uncommented in the code). `While` the deck size is 10 cards or more, the dealer deals the initial 4 cards to themselves and the player and displayed in accordance with the game rules (up to the player, down to the dealer, up to the player, up to the dealer). A unique onlyShowSecondCard method in the Dealer class facilitates that rule. The application can determine if the player's initial hand is "Blackjack" or "Bust" using methods called from the BlackjackHand class. If neither of those apply, the user is prompted to choose to 'Stay' or 'Hit'. Everytime the user chooses to hit, another card is dealt and the application evaluates the player's hand again. The user may continue to hit until their hand is "Blackjack", "Bust", or they stay.

- **User Story #4 :** 
<p>Once the player chooses to stay, the dealer's first card is revealed and the value is calculated. According to the rules of the game, the dealer must stay if their hand value is greater than or equal to 17, and must hit (and continue to hit) if less than 17. Once the dealer is able to stay, thier hand is evaluated in the same "Blackjack" or "Bust" methods that the player's hand is. 

- **User Story #5 :** 
<p>If neither the player nor the dealer "Blackjack" or "Bust", `Comparable` is implemented in the Hand class and a `compareTo method` in the BlackjackHand class is used to determine who's hand value is highest and who wins the round or if there is a "Push". After multiple rounds, there will be insufficient cards remaining to continue play. The `while` loop will end and the game results will be shown: player wins, dealer wins, and pushes.

## Technologies Used
- Java~OOP
- Eclipse
- Git
- Google - Stack Overflow, Oracle
- Saturday TA Help (Thank you!)

## Lessons Learned
- Abstraction, Polymorphism, Inheritance, Encapsulation
- ArrayLists
- Parent/Child classes, Abstract classes and methods
- Comparable/compareTo method
- Enumerated types
- Loops : if, else if, else, foreach, while
- Most Prominent BrainBlocks
<br>- My biggest hangup was the dealInitialCards method. I originally placed it into the Dealer class but with help from the TA team and Denise, realized that the best place for it was in the BlackjackApp itself.
