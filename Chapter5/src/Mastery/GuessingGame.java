/*

Program: GuessingGame.java          Last Date of this Revision: October 11,2022

Purpose: Create the GuessingGame application

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class GuessingGame 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a number between 1 and 20: "); // asks user for guess
		int inp = input.nextInt(); // stores input in variable
		int rndm = (int)(Math.random()*20+1); // generates random number from 1 - 20
		
		
		// checks if guess is correct or not
		do
		{
			System.out.print("Try again."
					+ "\nEnter a number between 1 and 20: "); // repeats guess prompt
			inp = input.nextInt(); // records input in variable
		}
		while(inp != rndm);
		
		System.out.println("\nComputer's number is " + rndm); // prints random number
		System.out.println("Player's number is " + inp); // prints player's number
		
		if (inp == rndm) // checks if player's number = random number
		{
			System.out.print("You won!"); // tells user they won
		}
		else
		{
			System.out.print("\nBetter luck next time!"); // tells user they lost
		}
	}

}
/* Screen Dump

Enter a number between 1 and 20: 1
Try again.
Enter a number between 1 and 20: 2
Try again.
Enter a number between 1 and 20: 3

Computer's number is 3
Player's number is 3
You won!

*/