/*

Program: Order.java          Last Date of this Revision: September 28,2022

Purpose: Create an Order Application that prompts the employee for the number of burgers, fries, and sodas and then displays the total, the tax(6.5%0, and the final cost.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Order
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")  // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		NumberFormat dc = NumberFormat.getCurrencyInstance(); // creates a variable to format numbers to currency
		
		System.out.print("Enter the number of burgers: "); // asks employee for amount of item
		int burgers = input.nextInt(); // initializes variable for amount of item
		System.out.print("Enter the number of fries: "); // asks employee for amount of item
		int fries = input.nextInt(); // initializes variable for amount of item
		System.out.print("Enter the number of sodas: "); // asks employee for amount of item
		int sodas = input.nextInt(); // initializes variable for amount of item
		
		double tot = ((burgers*1.69)+(fries*1.09)+(sodas*0.99)); // calculates total price
		double tax = tot*0.065; // calculates tax
		
		System.out.println("\nTotal before tax: "+ dc.format(tot)); // outputs total price
		System.out.println("Tax: " + dc.format(tax)); // outputs total tax
		System.out.println("Final total: " + dc.format(tot+tax)); // outputs price with tax
		
		System.out.print("\nEnter amount tendered: $"); // asks employee for amount tendered
		double tend = input.nextDouble(); // initializes variable for amount tendered
		
		System.out.print("Change: " + dc.format(tend-(tot+tax))); // outputs change back
	}

}
/* Screen Dump

Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5

Total before tax: $13.78
Tax: $0.90
Final total: $14.68

Enter amount tendered: $20.00
Change: $5.32

*/