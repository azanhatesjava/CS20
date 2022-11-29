/*

Program: DistanceP2.java          Last Date of this Revision: September 21,2022

Purpose: Modify the Distance application to first prompt the user for the 
distance of each race segment and then displays the total distance to run.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceP2
{

	public static void main(String[] args) 
	{
		DecimalFormat dF = new DecimalFormat("#0.0"); // initializes decimal format to round to the tenth place
		@SuppressWarnings("resource") // suppresses warning for leaking variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.println("What is the length of your first segment in km?"); // outputs prompt for user
		double s1 = input.nextDouble(); // initialize variable for segment 1
		
		System.out.println("What is the length of your second segment in km?"); // outputs prompt for user
		double s2 = input.nextDouble(); // initialize variable for segment 2
		
		System.out.println("What is the length of your third segment in km?"); // outputs prompt for user
		double s3 = input.nextDouble(); // initialize variable for segment 3
		
		System.out.print("The total distance of the race is " + dF.format(s1+s2+s3) + "km"); // displays distance
	}

}

/*

What is the length of your first segment in km?
12.3
What is the length of your second segment in km?
4.7
What is the length of your third segment in km?
8.9
The total distance of the race is 25.9km

*/