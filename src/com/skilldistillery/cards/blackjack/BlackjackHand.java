package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	
	@Override
	public int getHandValue() {
		
		return super.getHandValue();
	}
	
	public boolean isBlackjack() {
		return true;
	}
	
	public boolean isBust() {
		return true;
	}
	
//	TODO logic for dealer?
	

}
