package SkillBuilding;

import java.util.Scanner;

public class Exponentiation
{
	public static void powerOf(int n1, int n2)
	{
		int sol = (int) (Math.pow(n1, n2));
		System.out.print("\n" + n1 + " to the power of " + n2 + " (" + n1 + "^" + n2 + ") = " + sol);
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Please enter a second number: ");
		int num2 = input.nextInt();
		
		powerOf(num1, num2);
	}

}
/* Screen Dump

Please enter a number: 8
Please enter a second number: 3

8 to the power of 3 (8^3) = 512

*/