/*

Program: Digits.java          Last Date of this Revision: September 28,2022

Purpose: Modify the Digits application created in a review earlier in this chapter to show the hundreds-place digit of a three digit number.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a three-digit number: "); // prompts the user to enter input
		int inpt = input.nextInt(); // takes in the input
		
		int num1 = inpt/100; // isolates first digit
		int num2 = inpt%100/10; // isolates second digit
		int num3 = inpt%100%10%10; // isolates third digit
		
		System.out.println("\nThe hundreds-place digit is: " + num1); // prints first digit
		System.out.println("The tens-place digit is: " + num2); // prints second digit
		System.out.println("The ones-place digit is: " + num3); // prints third digit
	}

}
/* Screen Dump

Enter a three-digit number: 256

The hundreds-place digit is: 2
The tens-place digit is: 5
The ones-place digit is: 6

*/