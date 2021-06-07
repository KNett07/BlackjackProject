package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Hand;

public class BlackjackApp {

	private BlackjackDealer dealer = new BlackjackDealer();
	private BlackjackPlayer player = new BlackjackPlayer();
//	private BlackjackHand hand = new BlackjackHand();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		BlackjackApp blackjack = new BlackjackApp();
		blackjack.startTheGameMenu();
		blackjack.isBlackjack();
		blackjack.hitOrStay();
		blackjack.dealerPlay();
		blackjack.finalResults();

	}
	public void startTheGameMenu() {
		System.out.println("Are you ready to play a new game of Blackjack? Y/N: ");
		String answer = input.next();
		if (answer.equalsIgnoreCase("Y")) {
			player.drawNewCard(dealer.dealACard());

			dealer.addCard(dealer.dealACard());
			player.drawNewCard(dealer.dealACard());
			dealer.addCard(dealer.dealACard());
			
			System.out.println(" Player: ");
			System.out.println("**********");
			
			displayHand(player.getHand(), true);
//			System.out.println(player.showHand());
			System.out.println(" Dealer:  ");
			System.out.println("************ ");
			displayHand(dealer.getHand(), false);
//			System.out.println(dealer.getHand());
		} else if (answer.equalsIgnoreCase("N")) {
			System.out.println(" Thanks for playing, goodbye!");
			System.exit(1);
		} else {
			System.out.println(" Invalid entry, try again");
		}

	}
	
		

	public void isBlackjack() {
		if (dealer.calculateTotal() == 21) {
			System.out.println(" Dealer has Blackjack!");
			System.exit(1);
		}
		if (player.calculateTotal() == 21) {
			System.out.println(" Player has Blackjack!");
			System.exit(1);
		}
		if (player.calculateTotal() == dealer.calculateTotal()) {
			System.out.println(" It's a draw!");
			System.exit(1);
		}
	}

	public void hitOrStay() {

		String command;
		String c = "";
//		System.out.print(" Current Player value:  " + player.handvalue() + "\n");
		System.out.println("\n Hit or Stay? H/S: ");
		while (!c.equals("S")) {

			c = input.nextLine();
			if (c.equals("H")) {
				player.drawNewCard(dealer.dealACard());
//				System.out.println(player.showHand());
				displayHand(player.getHand(), true);
			} if(player.handvalue() == 21) {
				System.out.println("Player got 21! You win!");
				System.exit(1);
			}
			if (player.handvalue() > 22) {
				System.out.println(" Bust! Dealer wins ");
				System.exit(1);
			}
			System.out.print("\t Current Player value:  " + player.handvalue() + "\n");
			System.out.println(" Dealer current value:  " + dealer.calculateTotal());
		}
	}
	
	public void displayHand(Hand hand, boolean isYourHand) {
		
		for(int i = 0; i < hand.numCards(); i++) {
			if(!isYourHand && i == 0) {
				System.out.println(" HIDDEN ");
				
			} else {
			System.out.println(hand.returnCard(i).toString());
			}
			
			} 
			
	}

	public void dealerPlay() {
		while (dealer.calculateTotal() < 17) {
			dealer.addCard(dealer.dealACard());
		}
//		System.out.println("Dealer hand: " + dealer.showHand() + "\n Dealer value: " + dealer.calculateTotal());
		System.out.println(" Dealer hand: ");
		displayHand(dealer.getHand(), false);
		if (dealer.calculateTotal() > 22) {
			System.out.println(" Bust! Player wins ");
			System.exit(1);
		}
	}
	
	public void finalResults() {
		int playerFinal = player.handvalue();
		int dealerFinal = dealer.calculateTotal();
		int winner = (Math.max(playerFinal, dealerFinal));
		while(winner < 22) {
			if(winner == playerFinal) {
			System.out.println(" The winner is: Player!");
			System.exit(1);
		}if(winner == dealerFinal) {
				
		System.out.println(" The winner is: Dealer!");
		System.exit(1);
		}
		}
	}
		
	}
		
		
		


