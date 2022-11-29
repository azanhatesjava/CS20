package SkillBuilding;

import java.util.Scanner;

public class StudentRoster 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numStudents;
		String[] students;
		
		System.out.print("Please enter the number of students in the class: ");
		numStudents = input.nextInt(); // (interferes with cursor; need to flush)
		
		
		students = new String[numStudents];
		
		input.nextLine(); // flush cursor
		for(int i = 0; i < numStudents; i++)
		{
			System.out.print("Name #" + i + " is: ");
			students[i] = input.nextLine();
		}
		
		System.out.println("\n\nStudent Roster");
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.println(students[i]);
		}
		
	}

}
/* Screen Dump

Please enter the number of students in the class: 2
Name #0 is: a
Name #1 is: d


Student Roster
a
d

*/