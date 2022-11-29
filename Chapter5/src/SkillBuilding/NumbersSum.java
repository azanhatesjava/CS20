package SkillBuilding;

import java.util.Scanner;

public class NumbersSum 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
		int tot = 0;
		
		System.out.print("The numbers from 1-" + num + " are:\n");
		
		for (int i = 1; i <= num;  i++)
		{
			System.out.println(i);
			tot += i;
		}
		
		System.out.print("\n\nThe total is: " + tot);
	}

}
/* Screen Dump 

Please enter a number: 10
The numbers from 1-10 are:
1
2
3
4
5
6
7
8
9
10


The total is: 55

*/