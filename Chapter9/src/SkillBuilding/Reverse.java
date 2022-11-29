package SkillBuilding;

public class Reverse 
{

	public static void main(String[] args) 
	{
		int[] reverse;
		reverse = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			reverse[i] = i;
		}
		
		System.out.println("Countdown");
		
		for(int i = 9; i >= 0; i--)
		{
			System.out.println(reverse[i]);
		}
	}

}
