/*

Program: AddCoins.java          Last Date of this Revision: November 2, 2022

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes, and quarters and then displays their total dollar amount.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;
import java.text.NumberFormat;

public class AddCoins 
{
	public static void getDollarAmount(int q, int d, int n, int p) // method for getting total dollars, 4 int parameters
	{
		
		NumberFormat nF = NumberFormat.getCurrencyInstance(); // formats number to currency
		double tot = 0; // initializes variable for total
		
		for (int i = 1; i <= q; i ++) // repeats for amount of quarters
		{
			tot += 0.25; // adds 25 cents to total
		}
		
		for (int i = 1; i <= d; i ++) // repeats for amount of dimes
		{
			tot += 0.1; // adds 10 cents to total
		}
		
		for (int i = 1; i <= n; i ++) // repeats for amount of nickels
		{
			tot += 0.05; // adds 5 cents to total
		}
		
		for (int i = 1; i <= p; i ++) // repeats for amount of pennies
		{
			tot += 0.01; // adds 1 cent to total 
		}
		
		System.out.print("\nThe total is " + nF.format(tot)); // prints total
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		int q,d,n,p; // initializes ints to store user input
		
		System.out.println("Enter your total coins:\n");
		
		System.out.print("Quarters: "); // asks for quarters
		q = input.nextInt(); // stores input
		System.out.print("Dimes: "); // asks for dimes
		d = input.nextInt(); // stores input
		System.out.print("Nickels: "); // asks for nickels
		n = input.nextInt(); // stores input
		System.out.print("Pennies: "); // asks for pennies
		p = input.nextInt(); // stores input
		
		getDollarAmount(q,d,n,p); // calls method to determine total amount of money
	}

}

/* Screen Dump

Enter your total coins:

Quarters: 4
Dimes: 2
Nickels: 7
Pennies: 9

The total is $1.64

*/