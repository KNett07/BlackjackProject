package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

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
			System.out.println(player.showHand());
			System.out.println(dealer.showHand());
		} else if (answer.equalsIgnoreCase("N")) {
			System.out.println("Thanks for playing, goodbye!");
			System.exit(1);
		} else {
			System.out.println("Invalid entry, try again");
		}

	}

	public void isBlackjack() {
		if (dealer.calculateTotal() == 21) {
			System.out.println("Dealer has Blackjack!");
		}
		if (player.calculateTotal() == 21) {
			System.out.println("Player has Blackjack!");
		}
		if (player.calculateTotal() == dealer.calculateTotal()) {
			System.out.println("It's a draw!");
		}
	}

	public void hitOrStay() {

		String command;
		String c = "";
		System.out.println("Hit or Stay? H/S: ");
		while (!c.equals("S")) {

			c = input.nextLine();
			if (c.equals("H")) {
				player.drawNewCard(dealer.dealACard());
				System.out.println(player.showHand());
				System.out.print("Current Player value: " + player.handvalue() + "\n");
			}
			if (player.handvalue() > 21) {
				System.out.println("Bust!");
			}
		}
	}

	public void dealerPlay() {
		while (dealer.calculateTotal() < 17) {
			dealer.addCard(dealer.dealACard());
		}
		System.out.println("Dealer hand: " + dealer.showHand() + "Dealer value: " + dealer.calculateTotal());
		if (dealer.calculateTotal() > 21) {
			System.out.println("Bust!");
		}
	}
	
	public void finalResults() {
		int playerFinal = player.handvalue();
		int dealerFinal = dealer.calculateTotal();
		if(player.handvalue() < 22) {
			if(dealer.calculateTotal() < 22) {
				
		System.out.println("The winner is: " + (Math.max(playerFinal, dealerFinal)));
		
		}
		} else {
			System.out.println("Game over");
		}
		
	}
		
//		if(dealer.calculateTotal() > player.handvalue())) {
//			System.out.println("Dealer wins!");
//		} else if (player.handvalue() > dealer.calculateTotal()) {
//			System.out.println("Player wins!");
//		} else {
//			System.out.println("Its a draw!");
//		}
		
		

}
