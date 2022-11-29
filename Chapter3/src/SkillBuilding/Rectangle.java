/*

Program: Rectangle.java          Last Date of this Revision: September 21,2022

Purpose: Create a RectanglePerimeter application that calculates and displays the perimeter of a rectangle with width 4 and length 13

Author: Azan Kamran, 
School: CHHS
Course: Computer Science 20
 

*/
package SkillBuilding;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		int l = 13; // initialize length
		int w = 4; // initialize width
		int p = (2*l)+(2*w); // calculates perimeter
		System.out.print("Rectangle length = " + l + ", width = " + w
				+ "\nTotal perimeter = " + p); // display message
	}

}
/* Screen Dump

Rectangle length = 13, width = 4
Total perimeter = 34

*/