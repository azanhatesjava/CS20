/*

Program: SurfsUpP1.java          Last Date of this Revision: October 4,2022

Purpose: Create a SurfsUp application that prompts the user for the wave height and then displays "Great day for surfing!" when the waves are 6 feet and over.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.util.Scanner;

public class SurfsUpP1
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
	}

}
/* Screen Dump

What is the height of the wave? 7
Great day for surfing!

*/