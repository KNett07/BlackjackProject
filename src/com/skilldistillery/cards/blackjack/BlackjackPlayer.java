package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Player;

public class BlackjackPlayer extends Player{
	BlackjackHand hand = new BlackjackHand();
	
	public void drawNewCard(Card card) {
		hand.addCard(card);
	}
	
	public void foldHand() {
		hand.clearHand();
	}
	
	public int handvalue() {
		return hand.getHandValue();
	} 
	
	public boolean declareBlackjack() {
		return hand.isBlackjack();
	}
	
	public boolean playerBust() {
		return hand.isBust();
	}
	
	public boolean playerScoresTwentyOne() {
		if(hand.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}
	
	public String showHand() {
		return hand.toString();
		
	}
	
	

}
