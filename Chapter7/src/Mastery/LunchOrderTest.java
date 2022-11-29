/*

Program: LunchOrderTest.java          Last Date of this Revision: November 14, 2022

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class LunchOrderTest 
{

	public static void hamout() // displays hamburger nutritional facts
	{
		System.out.print("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.");
	}
	
	public static void salout() // displays salad nutritional facts
	{
		System.out.print("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.");
	}
	
	public static void friesout() // displays french fries nutritional facts
	{
		System.out.print("French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.");
	}
	
	public static void sodaout() // displays soda nutritional facts
	{
		System.out.print("Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.");
	}
	
	public static void main(String[] args) 
	{
		LunchOrder lunch = new LunchOrder(); // creates object
		
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		NumberFormat cF = NumberFormat.getCurrencyInstance(); // formats numbers to currency
		
		lunch.menu(); // calls menu to display menu
		
		System.out.print("\n\n\nEnter number of hamburgers: "); // asks user for input
		int h = input.nextInt(); // initializes variable to record user input
		lunch.ham(h); // calls ham and sends h to add to total cost
		hamout(); // calls hamout
		
		System.out.print("\n\nEnter number of salads: "); // asks user for input
		int sa = input.nextInt(); // initializes variable to record user input
		lunch.sal(sa); // calls sal and sends sa to add to total cost
		salout(); // calls salout
		
		System.out.print("\n\nEnter number of fries: "); // asks user for input
		int f = input.nextInt(); // initializes variable to record user input
		lunch.fries(f); // calls fries and sends f to add to total cost
		friesout(); // calls friesout
		
		System.out.print("\n\nEnter number of sodas: "); // asks user for input
		int so = input.nextInt(); // initializes variable to record user input
		lunch.soda(so); // calls soda and sends so to add to total cost
		sodaout(); // calls sodaout
		
		System.out.print("\n\nYour order comes to: " + cF.format(lunch.tot())); // displays total cost
	}

}
/* Screen Dump

Item			Price		Fat(g)		Carbohydrates(g)	Fiber(g)
Hamburger		$1.85		  9		    	  33		 	  1
Salad			$2.00		  1		    	  11		 	  5
French Fries	$1.30		  11			  36			  4
Soda			$0.95		  0		    	  38		 	  0


Enter number of hamburgers: 3
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.

Enter number of salads: 4
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.

Enter number of fries: 2
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.

Enter number of sodas: 5
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.

Your order comes to: $20.90

*/