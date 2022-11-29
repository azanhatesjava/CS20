/*

Program: PrimeNumber.java          Last Date of this Revision: November 2, 2022

Purpose: Modify the PrimeNumber application created in Chapter 5 Exercise 1 to include a method named isPrime();
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class PrimeNumber 
{
	public static boolean isPrime(int n) // method to determine if num is prime
	{
		for(int i = 2; i <= (n/2); i++) // repeats for every number to half of input
		{
			if(n % i == 0) // checks if input is divisible by num
			{
				return true; // returns value of true
			}
		}
		return false; // returns value of false
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter a number: "); // asks user for number
		int num = input.nextInt(); // records input in variable
		
		do
		{	
		if (num == -1) // breaks loop early if user wants to quit
			break;
		
		
		if (!isPrime(num)) // checks if num is prime
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
		
		System.out.print("\nPlease enter a number(-1 to quit): "); // asks user for another number
		num = input.nextInt(); // records input in variable
		}
		while (num != -1);
		System.out.print("Thank you for using our program.");
	}

}
/* Screen Dump

Please enter a number: 49
49 is not a prime number.

Please enter a number(-1 to quit): 36
36 is not a prime number.

Please enter a number(-1 to quit): 43
43 is a prime number.

Please enter a number(-1 to quit): -1
Thank you for using our program.

*/