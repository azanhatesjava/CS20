/*

Program: MathTutor.java          Last Date of this Revision: October 4,2022

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator(*,+,-,/), and then prompts the user for an answer

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.util.Scanner;

public class MathTutor 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		int num1 = (int)(Math.random()*10+1); // generates a random number from 1 - 10
		int num2 = (int)(Math.random()*10+1); // generates a random number from 1 - 10
		int op0 = (int)(Math.random()*4+1); // generates a random number to determine operator (*,+,-,/)
		
		
		if(op0 == 1) // multiplication
		{
			System.out.print("What is " + num1 + "*" + num2 + "? "); // multiplies generated numbers
			int ans = input.nextInt(); // stores input
			
			if(ans == (num1*num2)) // checks if answer is right
			{
				System.out.print("You got it right! Congratulations!"); // tells user they're right
			}
			else
			{
				int ans2 = (num1*num2); // calculates answer
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // tells user they weren't right
			}
		}
		else if(op0 == 2) // addition
		{
			System.out.print("What is " + num1 + "+" + num2 + "? "); //asks user to answer question
			int ans = input.nextInt(); // stores input
			
			if(ans == (num1+num2)) // checks if answer is right
			{
				System.out.print("You got it right! Congratulations!"); // tells user they're right
			}
			else
			{
				int ans2 = (num1+num2); // calculates answer
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // tells user they weren't right
			}
		}
		else if(op0 == 3) // subtraction
		{
			System.out.print("What is " + num1 + "-" + num2 + "? "); //asks user to answer question
			int ans = input.nextInt(); // stores input
			
			if(ans == (num1-num2)) // checks if answer is right
			{
				System.out.print("You got it right! Congratulations!"); // tells user they're right
			}
			else
			{
				int ans2 = (num1-num2); // calculates answer
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // tells user they weren't right
			}
		}
		else // division
		{
			System.out.print("What is " + num1 + "/" + num2 + "? (round down to whole number) "); //asks user to answer question
			int ans = input.nextInt(); // stores input
			
			if(ans == (num1/num2)) // checks if answer is right
			{
				System.out.print("You got it right! Congratulations!"); // tells user they're right
			}
			else
			{
				int ans2 = (num1/num2); // calculates answer
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2); // tells user they weren't right
			}
		}
		
	}

}
/* Screen Dump

Case 1:

What is 7*4? 28
You got it right! Congratulations!



Case 2:

What is 8+8? 9
Sorry, that wasn't the right answer. The right answer is 16

*/