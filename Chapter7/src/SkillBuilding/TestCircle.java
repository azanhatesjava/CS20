package SkillBuilding;
public class TestCircle 
{

	public static void main(String[] args) 
	{
		Circle circ = new Circle();
		
		System.out.println(circ.getRadius());
		circ.setRadius(3.7);
		System.out.println(circ.getRadius());
		System.out.println(circ.area());
		
		Circle circ2 = new Circle(9.2);
		
		System.out.println(circ2.circumference());
		System.out.println(circ2.equals(circ));
		
		System.out.println(circ.toString());
		System.out.println(circ2.toString()); 	
	}

}
