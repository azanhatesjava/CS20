package SkillBuilding;

public class RectangleTest 
{

	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		System.out.println(rect.perimeter());
		rect.setLength(45);
		System.out.println(rect.perimeter());
		System.out.println(rect.area());
		
		Rectangle rect2 = new Rectangle(5, 9);
		System.out.println(rect2.perimeter());
		System.out.println(rect2.getLength());
		
		rect.displayAreaFormula();
	}

}
