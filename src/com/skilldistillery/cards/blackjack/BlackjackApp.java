package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
BlackjackApp blackjack = new BlackjackApp();
		blackjack.startTheGame();
		
		
	}
	
	
	public void startTheGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you ready to play a new game of Blackjack? Y/N: ");
		 String answer = input.nextLine();
		if(answer == "Y" || answer == "y") {
//		TODO	dealCard(); with a new deck
		} else if(answer == "N" || answer == "n") {
			System.out.println("Thanks for playing, goodbye!");
			System.exit(1);
		} else {
			System.out.println("Invalid entry, try again");
		}
	
		input.close();
	}

}
