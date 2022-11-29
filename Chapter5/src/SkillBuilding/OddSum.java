package SkillBuilding;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int tot = 0;
		
		System.out.print("PLease enter a number: ");
		int num = input.nextInt();
		
		
		for(int i = 1; i <= num;)
		{
			if(i%2 == 1)
			{
				if (!(i > num))
				{
					tot += i;
				}
				i += 2;
			}
		}
		
		System.out.print("The sum of all the odd numbers from 1 - " + num + " are: " + tot);
	}

}
/* Screen Dump

PLease enter a number: 12
The sum of all the odd numbers from 1 - 12 are: 36

*/