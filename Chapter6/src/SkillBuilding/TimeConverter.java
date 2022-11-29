package SkillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConverter
{
	static Scanner input = new Scanner(System.in);

	public static void hToM()
	{
		System.out.print("\nPlease enter a time in hours: ");
		int h = input.nextInt();
		
		System.out.print("\n" + h + " hours is equal to " + h*60 + " minutes.");
	}
	public static void dToH()
	{
		System.out.print("\nPlease enter an amount of days: ");
		int d = input.nextInt();
		
		System.out.print("\n" + d + " days is equal to " + d*24 + " hours.");
	}
	public static void mToH()
	{
		DecimalFormat dF = new DecimalFormat("#0.00");
		
		System.out.print("\nPlease enter a time in minutes: ");
		int m = input.nextInt();
		
		System.out.print("\n" + m + " minutes is equal to " + dF.format((double)m/60) + " hours.");
	}
	public static void hToD()
	{
		DecimalFormat dF = new DecimalFormat("#0.00");
		
		System.out.print("\nPlease enter a time in hours: ");
		int h = input.nextInt();
		
		System.out.print("\n" + h + " hours is equal to " + dF.format((double)h/24) + " days.");
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 
		 int choice;
		 
		 System.out.println("1. Convert from hours to minutes"
		 		+ "\n2. Convert from days to hours"
		 		+ "\n3. Convert from minutes to hours"
		 		+ "\n4. Convert from hours to days");
		 
		 System.out.print("\nPlease select a type of conversion: ");
		 choice = input.nextInt();
		 
		 switch(choice)
		 {
		 case 1: hToM(); break;
		 case 2: dToH(); break;
		 case 3: mToH(); break;
		 case 4: hToD();
		 }
		 
		 
	}

}
/* Screen Dump

Case 1:
1. Convert from hours to minutes
2. Convert from days to hours
3. Convert from minutes to hours
4. Convert from hours to days

Please select a type of conversion: 3

Please enter a time in minutes: 1149

1149 minutes is equal to 19.15 hours.



Case 2:
1. Convert from hours to minutes
2. Convert from days to hours
3. Convert from minutes to hours
4. Convert from hours to days

Please select a type of conversion: 4

Please enter a time in hours: 892

892 hours is equal to 37.17 days.

*/