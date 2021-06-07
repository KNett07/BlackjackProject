package com.skilldistillery.cards.blackjack;

//import com.skilldistillery.cards.common.Card;
//import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public boolean isBlackjack() {
		return getHandValue() == 21;
	}

	public boolean isBust() {
		return getHandValue() > 21;

	}

}
