/*

Program: DigitsSum.java          Last Date of this Revision: October 14,2022

Purpose: Create a DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class DigitsSum 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		int sum = 0;
		
		System.out.print("Enter a positive integer: "); // prompts user for input
		int num = input.nextInt(); // initializes variable for user input
		
		while (num != -1) // checks if user wishes to quit
		{
			
			while(num > 0) // repeats for all digits of a number
			{
				sum = sum + num % 10; // isolates last digit
				num = num / 10; // gets ready to isolate next digit
			}
			
			System.out.println("The sum of the digits is: " + sum); // prints sum
			
			System.out.print("\nEnter another positive integer (-1 to quit): "); // asks user if they wish to continue
			num = input .nextInt(); // records user input in variable
			sum = 0; // "resets" sum
		}
	}

}
/* Screen Dump

Enter a positive integer: 892
The sum of the digits is: 19

Enter another positive integer (-1 to quit): 123
The sum of the digits is: 6

Enter another positive integer (-1 to quit): -1


*/