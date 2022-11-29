/*

Program: Printing.java          Last Date of this Revision: October 3,2022

Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Printing
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		NumberFormat dc = NumberFormat.getCurrencyInstance(); // creates a variable to format numbers to currency
		
		System.out.print("Enter the number of copies to be printed: "); // asks user for copies
		int copies = input.nextInt(); // stores amount of copies in a variable
		
		if(copies >=0 && copies <= 99) // checks if amount of copies is from 0 - 99
		{
			double cost = (copies*0.30); // calculates price of copies
			
			System.out.println("\nPrice per copy is: $0.30"); // prints price per copy
			System.out.print("Total cost is: " + dc.format(cost)); // prints total cost formatted as price
		}
		else if(copies >=100 && copies <= 499) // checks if amount of copies is from 100 - 499
		{
			double cost = (copies*0.28); // calculates price of copies
			
			System.out.println("\nPrice per copy is: $0.28"); // prints price per copy
			System.out.print("Total cost is: " + dc.format(cost)); // prints total cost formatted as price
		}
		else if(copies >=500 && copies <= 749) // checks if amount of copies is from 500 - 749
		{
			double cost = (copies*0.27); // calculates price of copies
			
			System.out.println("\nPrice per copy is: $0.27"); // prints price per copy
			System.out.print("Total cost is: " +dc.format(cost)); // prints total cost formatted as price
		}
		else if(copies >=750 && copies <= 1000) // checks if amount of copies is from 750 - 1000
		{
			double cost = (copies*0.26); // calculates price of copies
			
			System.out.println("\nPrice per copy is: $0.26"); // prints price per copy
			System.out.print("Total cost is: " + dc.format(cost)); // prints total cost formatted as price 
		}
		else // if none of the above apply
		{
			double cost = (copies*0.25); // calculates price of copies
			
			System.out.println("\nPrice per copy is: $0.25"); // prints price per copy
			System.out.print("Total cost is: " + dc.format(cost)); // prints total cost formatted as price
		}
	}

}
/* Screen Dump

Enter the number of copies to be printed: 1001

Price per copy is: $0.25
Total cost is: $250.25

*/