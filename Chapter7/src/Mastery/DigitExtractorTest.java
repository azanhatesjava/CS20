/*

Program: DigitExtractorTest.java          Last Date of this Revision: November 17, 2022

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, tens, and hundreds digits of the number.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class DigitExtractorTest 
{

	public static void main(String[] args)
	{
		DigitExtractor dE = new DigitExtractor(); // creates object

		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		String cfl = "Z"; // initializes String and gives it a default value
		String quit = "Q"; // initializes String to quit
		
		
		System.out.print("Enter a three digit integer: "); // asks user for input
		int num = input.nextInt(); // initializes variable for user input
		dE.setInt(num); // calls setInt to change integer
		
		
		while (! (cfl.compareToIgnoreCase(quit) == 0)) // loops until user chooses to quit
		{
			dE.choices(); // calls choices to display choices
			System.out.print("Enter your choice: "); // asks user for input
			String c = input.next(); // initializes String for user input
			cfl = Character.toString(c.charAt(0)); // isolates first letter
			dE.userChoice(cfl); // calls userChoice and sends first letter of user input up
		}

	}
}
/* Screen Dump

Enter an integer: 342
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: W
The whole number is 342.

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is 2.

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: T
The tens place digit is 4.

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is 3.

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: Q
Thank you for using this program.

*/