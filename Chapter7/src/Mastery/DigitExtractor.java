/*

Program: DigitExtractor.java          Last Date of this Revision: November 17, 2022

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, tens, and hundreds digits of the number.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

public class DigitExtractor 
{
	private int integer; // Initializing private variable
	
	public DigitExtractor() // Constructor method
	{
		integer = 0;
	}
	
	private int wholeNum() // Accessor method
	{
		return integer;
	}
	
	public void setInt(int x) // Mutator method sets value of int
	{
		integer = x;
	}
	
	private int onesPlace() // determines value of third digit
	{
		int ones = integer % 10;
		return ones;
	}
	
	private int tensPlace() // determines value of second digit
	{
		int tens = integer % 100 / 10;
		return tens;
	}
	
	private int hundsPlace() // determines value of first digit
	{
		int hunds = integer / 100;
		return hunds;
	}
	
	
	public void userChoice(String cfl) // calls method based on user's choice
	{
		String choice1 = "W"; // whole number
		String choice2 = "O"; // ones place
		String choice3 = "T"; // tens place
		String choice4 = "H"; // hundreds place
		String choice5 = "Q"; // quit
		
		if(cfl.compareToIgnoreCase(choice1) == 0) // if user chose whole number (w)
		{
			System.out.print("The whole number is " + wholeNum() + ".\n\n"); // calls wholeNum method
		}
		else if (cfl.compareToIgnoreCase(choice2) == 0) // if user chose ones place (o)
		{
			System.out.print("The ones place digit is " + onesPlace() + ".\n\n"); // calls onesPlace method
		}
		else if (cfl.compareToIgnoreCase(choice3) == 0) // if user chose tens place (t)
		{
			System.out.print("The tens place digit is " + tensPlace() + ".\n\n"); // calls tensPlace method
		}
		else if (cfl.compareToIgnoreCase(choice4) == 0) // if user chose hundreds place (h)
		{
			System.out.print("The hundreds place digit is " + hundsPlace() + ".\n\n");
		}
		else if (cfl.compareToIgnoreCase(choice5) == 0) // if user chose to quit (q)
		{
			System.out.print("Thank you for using this program."); // prints output
		}
	}
	
	public void choices() // displays choices
	{
		System.out.println("show (W)hole number."
				+ "\nshow (O)nes place number."
				+ "\nshow (T)ens place number."
				+ "\nshow (H)undreds place number."
				+ "\n(Q)uit");
	}
}