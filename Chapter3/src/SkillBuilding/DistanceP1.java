/*

Program: DistanceP1.java          Last Date of this Revision: September 21,2022

Purpose: Create a Distance application that calculates and displays the total distance of a race with three segments.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.text.DecimalFormat;

public class DistanceP1
{

	public static void main(String[] args) 
	{
		DecimalFormat dF = new DecimalFormat("#0.0"); // initializes decimal format to round to the tenth place
		
		double s1 = 12.2; // initialize segment 1
		double s2 = 10.6; // initialize segment 2
		double s3 = 5.8; // initialize segment 3
		
		System.out.print("The race has three segments. \n"
				+ "The first segment is " + s1 + "km, the second is " + s2 + "km, and the third is " + s3 + "km. \n"
						+ "The total distance of the race is " + dF.format(s1+s2+s3) + "km"); // display distance
	}

}

/*

The race has three segments.
The first segment is 12.2km, the second is 10.6km, and the third is 5.8km. 
The total distance is 28.6km

*/