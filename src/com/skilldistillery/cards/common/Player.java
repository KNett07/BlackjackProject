package com.skilldistillery.cards.common;

public abstract class Player {

	protected Hand hand = new Hand();

	public void addCard(Card card) {
		hand.addCard(card);
	}

	public int calculateTotal() {
		return hand.getHandValue();
	}

	public void clearHand() {
		hand.clearHand();
	}

}
