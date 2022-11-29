package SkillBuilding;

import java.util.Scanner;

public class PercentPassing 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		final int SENTINEL = -1;
		int newValue;
		int numValues = 0;
		int sumOfValues = 0;
		double avg;
		
		System.out.print("Please enter an average(" + SENTINEL + " to quit): ");
		newValue = input.nextInt();
		
		while (newValue != SENTINEL)
		{			
			if (newValue >= 70)
				{
					numValues += 1;
					sumOfValues += newValue;
				}
			System.out.print("Please enter an average(" + SENTINEL + " to quit): ");
			newValue = input.nextInt();
		}
		
		avg = (double)sumOfValues/(double)numValues;
		System.out.print("Average of grades above 70 is: " + avg);
	}

}
/* Screen Dump

Please enter an average(-1 to quit): 99
Please enter an average(-1 to quit): 99
Please enter an average(-1 to quit): 99
Please enter an average(-1 to quit): 99
Please enter an average(-1 to quit): 99
Please enter an average(-1 to quit): 0
Please enter an average(-1 to quit): 0
Please enter an average(-1 to quit): 0
Please enter an average(-1 to quit): 0
Please enter an average(-1 to quit): -1
Average is: 99.0

*/