package SkillBuilding;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int tot = 1;
		
		System.out.print("PLease enter a number: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			tot *= i;
		}
		System.out.print(num + "! is equal to: " + tot);
	}

}
/* Screen Dump

PLease enter a number: 5
5! is equal to: 120

*/