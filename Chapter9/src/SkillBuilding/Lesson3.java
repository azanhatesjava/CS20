package SkillBuilding;

import java.util.Scanner;

public class Lesson3
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] digits = new int[10];
		
		int num, newDigit;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		
		while(num > 0)
		{
			newDigit = num % 10;
			digits[newDigit] = digits[newDigit] + 1;
			num = num / 10;
		}
		
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i + ": " + digits[i]);
		}
		
	}
}