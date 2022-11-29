/*

Program: QuadraticEquations.java          Last Date of this Revision: October 11,2022

Purpose: Create a QuadraticEquation application that gives the solution to any quadratic equation.

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking variable
		Scanner input = new Scanner(System.in); // calls in scanner
		DecimalFormat dF = new DecimalFormat("#0.0"); // formats decimals to one decimal place
		
		
		System.out.print("Enter value for a: "); // prompts user for value
		double a = input.nextDouble(); // initializes variable for user input
		System.out.print("Enter value for b: "); // prompts user for value
		double b = input.nextDouble(); // initializes variable for user input
		System.out.print("Enter value for b: "); // prompts user for value
		double c = input.nextDouble(); // initializes variable for user input
		
		double r1 = ((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a)); // calculates first root
		double r2 = ((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a)); // calculates second root
		
		if(r1 >=0 || r1 <= 0) // checks if roots are real
			System.out.print("The roots are " + dF.format(r1) + " and " + dF.format(r2)); // outputs roots
		else
			System.out.print("There are no real roots."); // tells user there are no roots
	}

}
/* Screen Dump

Case 1:

Enter value for a: 2
Enter value for b: 4
Enter value for b: -30
The roots are 3.0 and -5.0



Case 2:

Enter value for a: 2
Enter value for b: 4
Enter value for b: 5
There are no real roots.

*/