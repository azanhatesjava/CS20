/*

Program: Grade.java          Last Date of this Revision: October 3,2022

Purpose: Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class Grade
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a grade percentage: "); // asks user for grade
		int grade = input.nextInt(); // stores grade in variable
		
		if (grade <= 100 && grade >=90) // checks if grade is from 90-100
		{
			System.out.print("The corresponding letter grade is: A"); // tells user they have an A
		}
		else if (grade <= 89 && grade >= 80) // checks if grade is from 80-89
		{
			System.out.print("The corresponding letter grade is: B"); // tells user they have an B
		}
		else if (grade <=79 && grade >= 70) // checks if grade is from 70-79
		{
			System.out.print("The corresponding letter grade is: C"); // tells user they have a C
		}
		else if (grade <= 69 && grade >= 60) // checks if grade is from 60-69
		{
			System.out.print("The corresponding letter grade is: D"); // tells user they have a D
		}
		else // if none of the above apply
		{
			System.out.print("The corresponding letter grade is: F"); // tells user they have an F
		}
	}
}
/* Screen Dump

Enter a grade percentage: 75
The corresponding letter grade is: C

*/