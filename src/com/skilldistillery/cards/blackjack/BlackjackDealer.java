package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Player;

public class BlackjackDealer extends Player {

	private Deck dealerDeck = new Deck();

	public BlackjackDealer() {
		shuffleDeck();
	}

	public void shuffleDeck() {
		dealerDeck.shuffle();
	}

	public Card dealACard() {

		return dealerDeck.dealCard();
	}

	public void lookAtHand() {
		System.out.println(" Dealer: " + hand.toString());
	}

	public void handAtDeal() {
		if (hand.getHandValue() == 1) {
			System.out.println("Dealer: Hidden");
		} else {
			System.out.println("Dealer: Hidden " + " " + hand.getHandValue());
		}
	}

	public int calculateTotal() {
		return hand.getHandValue();
	}

	public Hand getHand() {
		return this.hand;
	}

}
