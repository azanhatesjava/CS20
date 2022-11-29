/*

Program: GradeAvgP1.java          Last Date of this Revision: September 27,2022

Purpose: Create a GradeAvg application that prompts the user for five grades and then displays the average of the grades.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.text.NumberFormat;
import java.util.Scanner;

public class GradeAvgP1 
{

	public static void main(String[] args) 
	{
		NumberFormat pF = NumberFormat.getPercentInstance(); // formats numbers for percent
		@SuppressWarnings("resource") // suppress warning for leaking variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter your 1st average:"); // outputs prompt for user
		int avg1 = input.nextInt(); // initialize variable for average 1
		System.out.print("Please enter your 2nd average:"); // outputs prompt for user
		int avg2 = input.nextInt(); // initialize variable for average  2
		System.out.print("Please enter your 3rd average:"); // outputs prompt for user
		int avg3 = input.nextInt(); // initialize variable for average 3
		System.out.print("Please enter your 4th average:"); // outputs prompt for user
		int avg4 = input.nextInt(); // initialize variable for average 4
		System.out.print("Please enter your 5th average:"); // outputs prompt for user
		int avg5 = input.nextInt(); // initialize variable for average 5
		
		System.out.print("Your average is " + (pF.format((((double)avg1+(double)avg2+(double)avg3+(double)avg4+(double)avg5)/5)/100))); // outputs total average
	}

}
/* Screen Dump

Please enter your 1st average:99
Please enter your 2nd average:98
Please enter your 3rd average:97
Please enter your 4th average:96
Please enter your 5th average:95
Your average is 97%

*/