/*

Program: Digits.java          Last Date of this Revision: September 26,2022

Purpose: Create a Digits application that prompts the user for a two-digit number and then displays the ones-place and tens-place digits.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses leaking variable warning
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.println("Please enter a two-digit number:"); // prompts user for number
		int num = input.nextInt(); // initializes  variable for user input
		
		System.out.print("The digit in the tens place is " + (num/10) // isolates first digit
				+ "\nThe digit in the ones place is " + (num%10)); // isolates second digit
	}

}
/* Screen Dump

Please enter a two-digit number:
34
The digit in the tens place is 3
The digit in the ones place is 4

*/