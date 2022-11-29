package SkillBuilding;

import java.util.Scanner;

public class RandomNum 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the minimum value: ");
		int min = input.nextInt();
		System.out.print("Please enter the maximum value: ");
		int max = input.nextInt();
		
		int rndm = (int)(Math.random()*(max + 1 - min) + min);
		System.out.print(rndm);
	}

}