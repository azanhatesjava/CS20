package Mastery;

import java.util.Scanner;

public class GroupAssignment 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter your first name: "); // asks user for first name
		String fn = input.next(); // initializes variable for input
		System.out.print("Please enter your last name: "); // asks user for last name
		String ln = input.next(); // initializes variable for input
		
		String group1 = "I"; // initializes variable to compare
		String group3 = "T"; // initializes variable to compare
		String cln = Character.toString(ln.charAt(0)); // converts first letter of last name to char
		
		if(cln.compareToIgnoreCase(group1) <= 0) // if last name is A - I
			System.out.print(fn + " " + ln + " is assigned to Group 1.");
		else if(cln.compareToIgnoreCase(group3) >= 0) // if last name is T - Z
			System.out.print(fn + " " + ln + " is assigned to Group 3.");
		else // if last name is J - S
			System.out.print(fn + " " + ln + " is assigned to Group 2.");
	}

}
/* Screen Dump

Case 1:
Please enter your first name: Azan
Please enter your last name: Kamran
Azan Kamran is assigned to Group 2.



Case 2:
Please enter your first name: John
Please enter your last name: Cleave
John Cleave is assigned to Group 1.


*/