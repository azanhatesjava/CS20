/*

Program: PrimeNumber.java          Last Date of this Revision: October 14,2022

Purpose: Create a PrimeNumber application that prompts the user for a number and then displays a message indicating whether number is prime or not

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		boolean prime = false; // flag to check if number is prime
		System.out.print("Please enter a number: "); // asks user for number
		int num = input.nextInt(); // records input in variable
		
		
		do
		{
		for(int i = 2; i <= (num/2); i++) // repeats for every number to half of input
		{
			if(num % i == 0) // checks if input is divisible by num
			{
				prime = true; // changes flag to true
				break; // breaks loop
			}
		}
		
		
		
		if (num == -1) // breaks loop early if user wants to quit
			break;
		
		
		if (!prime) // checks if num is prime
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
		
		System.out.print("\nPlease enter a number(-1 to quit): "); // asks user for number
		num = input.nextInt(); // records input in variable
		}
		while (num != -1);
		System.out.print("Thank you for using our program.");
	}

}
/* Screen Dump

Please enter a number: 79
79 is a prime number.

Please enter a number(-1 to quit): 4
4 is not a prime number.

Please enter a number(-1 to quit): -1
Thank you for using our program.

*/