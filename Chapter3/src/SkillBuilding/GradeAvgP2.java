/*

Program: GradeAvgP2.java          Last Date of this Revision: September 27,2022

Purpose: Modify the GradeAvg application to use the +- operator to sum the grades as they are entered by the user.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvgP2
{

	public static void main(String[] args) 
	{
		NumberFormat pF = NumberFormat.getPercentInstance(); // formats numbers for percent
		@SuppressWarnings("resource") // suppress warning for leaking variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		int avg = 501; // initializes variable for average
		while (avg > 500)
		{
			avg = 0;
			System.out.print("Please enter your 1st average:"); // outputs prompt for user
			avg += input.nextInt(); // adds to total average
			System.out.print("Please enter your 2nd average:"); // outputs prompt for user
			avg += input.nextInt(); // adds to total average
			System.out.print("Please enter your 3rd average:"); // outputs prompt for user
			avg += input.nextInt(); // adds to total average
			System.out.print("Please enter your 4th average:"); // outputs prompt for user
			avg += input.nextInt(); // adds to total average
			System.out.print("Please enter your 5th average:"); // outputs prompt for user
			avg += input.nextInt(); // adds to total average
			if (avg > 500) 
			{
				System.out.println("Your average cannot be this high. Please try again.\n");
			}
			else
			{
				System.out.print("Your average is " + (pF.format(((double)avg/5)/100))); // outputs total average		
			}
		}
	}

}
/* Screen Dump

Please enter your 1st average:12312
Please enter your 2nd average:12414
Please enter your 3rd average:124124
Please enter your 4th average:124124
Please enter your 5th average:124124
Your average cannot be this high. Please try again.

Please enter your 1st average:99
Please enter your 2nd average:98
Please enter your 3rd average:97
Please enter your 4th average:96
Please enter your 5th average:95
Your average is 97%

*/