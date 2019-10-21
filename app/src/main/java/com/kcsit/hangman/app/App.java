package com.kcsit.hangman.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Set String we want to discover
    	Scanner inputReader = new Scanner(System.in);
    	UserInput userInput = new UserInput();
    	boolean playing = true;
    	String input="";
    	String mystery = "Saudade";
    	mystery = mystery.toUpperCase();
    	
    	//Say string length
    	System.out.println("The hangman word is " + mystery.length() + " letters");
    		do {
    	//Ask if user wants to guess a letter, guess the word or quit
	    	
	    	//input= Character.toString(inputReader.nextLine().toUpperCase().charAt(0));
	    	input = userInput.selectMenuItem(); 
					switch (input) {
				    	case "L":
					    		//System.out.print("Please type the letter: \n");
					    		input = userInput.getUserLetterGuess();
						        	// check guessed letter 
						    		if(mystery.contains(input)) {
						    			int numberOfLetters = 0;
							    			for(int i =0; i<mystery.length(); i++) {
							    				if(mystery.substring(i, i+1).equals(input)) {
							    					numberOfLetters++;
							    				}
							    			}
						    			System.out.println("There are " + numberOfLetters + " " + input + "(s)");
						    		} else {
						    			System.out.println("There are no " + input + "(s)");
						    		}
					    		break;
				    	case "W":
				    			input=userInput.getUserFinalGuess();
				    			// check guessed word    	
					    			if(input.equals(mystery)) {
					    				//Print success of failure message
					    				System.out.println("Congratulations! You won \n");
					    			} else {
					    				System.out.println("Wrong word! The word is: "+ mystery + "\n");
					    			}
				    			System.out.println("Would you like to play again? [y/n] \n");
				    			input= Character.toString(inputReader.nextLine().toUpperCase().charAt(0));
				    			playing = input.equals("Y");
				    			break;
				    	case "Q":
				    			playing = false;
				    			break;
				   		}
		    	} while (playing);
	    System.out.println("Goodbye! \n");
    }
}

