/*

Program: Investment.java          Last Date of this Revision: October 14,2022

Purpose: Create an Investment application that calculates how many years it will take for a $2,500 investment to be worth at least $5,000 if compounded annually at 7.5%

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

public class Investment 
{

	public static void main(String[] args) 
	{
		final double intrst = 0.075; // creates final variable for interest
		double invest = 2500; // initial value for investment
		int max = 5000; // investment goal
		int years = 0; // variable for num of years
		
		do // repeats until investment reaches goal
		{
			invest = invest + invest*intrst; // adds 7.5% to investment (compound interest)
			years += 1; // increases num of years by 1
		}
		while(invest <= max);
		
		System.out.print("It will take " + years + " years for your investment of $2500 to be worth $5000.");
	}

}
/* Screen Dump

It will take 10 years for your investment of $2500 to be worth $5000.

*/