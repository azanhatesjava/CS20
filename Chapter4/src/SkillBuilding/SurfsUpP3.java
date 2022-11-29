/*

Program: SurfsUpP3.java          Last Date of this Revision: October 5,2022

Purpose: Modify the SurfsUp application to display "Great day for surfing!" when the waves are 6 feet or over, "Go body boarding!" when the waves are between 3 and 6 feet,
		 "Go for a swim." when the waves are from 0 to 3 feet, and "Whoa! What kind of surf is that?" otherwise.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.util.Scanner;

public class SurfsUpP3 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("What is the height of the wave? "); // asks user for height
		int waveh = input.nextInt(); // initializes variable for wave height
		
		if (waveh >= 6) // checks if wave height is 6 or more
		{
			System.out.print("Great day for surfing!");
		}
		else if (waveh <= 6 && waveh >= 3)
		{
			System.out.print("Go body boarding!");
		}
		else if (waveh <=3 && waveh >= 0)
		{
			System.out.print("Go for a swim.");
		}
		else
		{
			System.out.print("Whoa! What kind of surf is that?");
		}
	}

}