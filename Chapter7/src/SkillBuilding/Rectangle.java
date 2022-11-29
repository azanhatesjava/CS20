package SkillBuilding;

public class Rectangle 
{

	private int length;
	
	private int width;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(int l, int w)
	{
		length = l;
		width = w;
	}
	
	public void setLength(int l)
	{
		length = l;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		double a = length*width;
		return a;
	}
	
	public double perimeter()
	{
		double p = ((2*length) + (2*width));
		return p;
	}
	
	public void displayAreaFormula()
	{
		System.out.println("The formula for the area of a square is length*width");
	}

}
