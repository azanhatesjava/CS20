package SkillBuilding;

import java.util.Scanner;

public class Prompter
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a minimum value: ");
		int min = input.nextInt();
		
		System.out.print("Please enter a maximum value: ");
		int max = input.nextInt();
		
		System.out.print("Please enter a number within the values: ");
		int num = input.nextInt();
		
		while (!(num >= min) || !(num <= max))
		{
			System.out.println("\nThat number is not within bounds");
			System.out.print("Please enter a number from " + min + "-" + max + ":");
			num = input.nextInt();
		}
		
		System.out.print("\nThat number is valid.");
	}

}
/* Screen Dump

Please enter a minimum value: 2
Please enter a maximum value: 5
Please enter a number within the values: 7

That number is not within bounds
Please enter a number from 2-5:1

That number is not within bounds
Please enter a number from 2-5:3

That number is valid.

*/