package SkillBuilding;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num = input.nextInt();
		
		double ans = Math.sqrt(num);

		int ansI = (int)ans;

		if (ansI*ansI == num)
			System.out.print("This number is a perfect square!");
		else
			System.out.print("This number is not a perfect square.");
	}

}
