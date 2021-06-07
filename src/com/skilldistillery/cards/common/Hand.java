package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	protected List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		cards.add(card);

	}

	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}

		return value;
	}

	public void fold() {
		cards.clear();

	}

	public void clearHand() {
		 int handValue = 0;
	}

	@Override
	public String toString() {
		return "Hand = " + cards + "]";
	}

}
