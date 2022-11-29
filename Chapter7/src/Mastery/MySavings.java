/*

Program: MySavings.java          Last Date of this Revision: November 14, 2022

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

public class MySavings
{

	private double bal; // Initializing private variable
	
	public MySavings() // Constructor method
	{
		bal = 0;
	}
	
	public double getBal() // Accessor method returns balance
	{
		return bal;
	}
	
	public double addCoins(double a) // Mutator method adds to bal
	{
		bal = bal + a;
		return bal;
	}
	
	public double withCoins(double a) // Mutator method removes from bal
	{
		bal = bal - a;
		return bal;
	}
}
