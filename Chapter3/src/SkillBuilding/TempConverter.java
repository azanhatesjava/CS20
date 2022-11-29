/*

Program: TempConverter.java          Last Date of this Revision: September 27,2022

Purpose: Create a TempConverter application that converts a Fahrenheit temperature to the corresponding Celsius temperature.
Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		DecimalFormat dF = new DecimalFormat("#0.0"); // initializes decimal format to round to the tenth place
		@SuppressWarnings("resource") // suppress warning for leaking variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.println("What is your temperature in Fahrenheit?"); // outputs prompt for user
		double f = input.nextDouble(); // initializes variable for temp in fahrenheit
		
		System.out.print("The temperature in Celsisus is " + dF.format(((f-32)*5/9))); // outputs temp in celsius
	}

}
/* Screen Dump

What is your temperature in Fahrenheit?
32.5
The temperature in Celsius is 0.3

*/