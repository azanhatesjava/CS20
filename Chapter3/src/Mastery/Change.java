/*

Program: Change.java          Last Date of this Revision: September 28,2022

Purpose: Create a Change application that prompts the user for an amount and then displays the minimum number of coins necessary to make the change.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class Change 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // Suppresses leaking variable warning
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter the change in cents: "); // asks user for change
		int change = input.nextInt(); // stores change in a variable
		
		int quarters = change / 25; // calculates number of quarters
		int dimes = (change%25)/10; // calculates number of dimes
		int nickels = ((change%25)%10)/5; // calculates number of nickels
		int pennies = ((change%25)%10)%5; // calculates number of pennies
		
		System.out.print("The minimum number of coins is: "
				+ "\nQuarters: " + quarters + "\nDimes: " 
				+ dimes + "\nNickels: " + nickels + "\nPennies: "
				+ pennies); // prints final output
	}

}
/* Screen Dump

Please enter the change in cents: 212
The minimum number of coins is: 
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2

*/