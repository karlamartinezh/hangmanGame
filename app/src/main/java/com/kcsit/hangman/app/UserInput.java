package com.kcsit.hangman.app;

import java.util.Scanner;

public class UserInput {
	
	private final Scanner inputReader;
	
	public UserInput() {
		inputReader = new Scanner(System.in);
	}

	
	public String selectMenuItem() {
		System.out.println("Press L to guess a letter\nPress W to guess the word\nPress Q to quit \n");
		return getUserSelection();
	}
	
	
	private String getUserSelection() {
		return inputReader.nextLine().toUpperCase().substring(0,1);
	}
	
	public String getUserLetterGuess() {
		System.out.print("Please type the letter: \n");
		String guess = getUserSelection();
		System.out.println();
	
	return guess;
	
	}
	
	
	public String getUserFinalGuess() {
		System.out.println("Please type your final guess \n");
		String guess = inputReader.next().toUpperCase();
		inputReader.nextLine();
		System.out.println();		
		return guess;
	}
	
	
	public String getUserPlayAgain() {
		System.out.println("Would you like to play again? [y/n] \n");
		return getUserSelection();
	}
	
	
		
	
}
