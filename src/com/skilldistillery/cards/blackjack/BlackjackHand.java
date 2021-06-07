package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	private Scanner scan = new Scanner(System.in);
	private int addedCards = 0;
	
	
	public boolean isBlackjack() {
		return getHandValue() == 21;
	}
	
	
	public boolean isBust() {
		return getHandValue() > 21;
			
	}
	
	
			
	
	
}

