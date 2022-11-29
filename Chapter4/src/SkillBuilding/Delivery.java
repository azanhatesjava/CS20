package SkillBuilding;

import java.util.Scanner;

public class Delivery 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the length of the package?");
		int l = input.nextInt();
		System.out.print("What is the width of the package?");
		int w = input.nextInt();
		System.out.print("What is the height of the package?");
		int h = input.nextInt();
		
		if (l <= 10 && w <= 10 && h <= 10)
			System.out.print("Accept");
		else
			System.out.print("Reject");
	}

}