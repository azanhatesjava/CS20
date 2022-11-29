/*

Program: LunchOrder.java          Last Date of this Revision: November 14, 2022

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

public class LunchOrder 
{
	private double cost; // Initalizing private variable
	
	public LunchOrder() // Constructor method
	{
		cost = 0;
	}
	
	public double tot() // Accessor method
	{
		return cost;
	}
	
	public void ham(int num) // Mutator method; adds hamburgers 
	{
		cost += (num*1.85);
	}
	
	public void sal(int num) // Mutator method; adds salads
	{
		cost += (num*2);
	}
	
	public void fries(int num) // Mutator method; adds fries
	{
		cost += (num*1.3);
	}
	
	public void soda(int num) // Mutator method; adds soda
	{
		cost += (num*0.95);
	}
	
	public void menu() // prints menu
	{
		System.out.print("Item\t\tPrice\t\tFat(g)\t\tCarbohydrates(g)\tFiber(g)"
				+ "\nHamburger\t$1.85\t\t  9\t\t      33\t\t   1"
				+ "\nSalad\t\t$2.00\t\t  1\t\t      11\t\t   5"
				+ "\nFrench Fries\t$1.30\t\t  11\t\t      36\t\t   4"
				+ "\nSoda\t\t$0.95\t\t  0\t\t      38\t\t   0");
	}
}