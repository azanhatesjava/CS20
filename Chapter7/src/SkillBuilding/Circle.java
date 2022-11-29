package SkillBuilding;
public class Circle //OOP
{
	// If private, need accessor and mutator method
	
	private double radius;
	
	public Circle() //Create the constructor method
	{
		radius = 1.2;
	}
	
	public Circle(double r) // Overloading the constructor method
	{
		radius = r;
	}
	
	public double getRadius() //Accessor method returns radius
	{
		return radius;
	}
	
	public void setRadius(double r) // Mutator method sets the new radius
	{
		radius = r;
	}
	
	public double area() // Calculates the area of a circle
	{
		double circleArea = Math.PI * radius * radius;
		return circleArea; // returns the area value
	}
	
	public void displayAreaFormula() // display the area formula
	{
		System.out.println("The formula for the area of a cirlce is ");
	}
	
	public double circumference() // Calculates the circumference of a circe
	{
		double c;
		c = 2 * Math.PI * radius;
		return c; // returns the circumference value
	}
	
	public boolean equals(Object c)
	{
		Circle testObjt = (Circle)c;
		
		if(testObjt.getRadius() == radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String cString;
		
		cString = "Circle has radius " + radius;
		
		return cString;
	}
}
 