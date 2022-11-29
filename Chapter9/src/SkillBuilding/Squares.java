package SkillBuilding;

public class Squares
{

	public static void main(String[] args) 
	{
		int[] squares;
		squares = new int[5];
		
		for(int i = 0; i < 5; i ++)
		{
			squares[i] = i*i;
		}
		
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("squares[" + i + "] = " + squares[i]);
		}
	}

}
/* Screen Dump

squares[0] = 0
squares[1] = 1
squares[2] = 4
squares[3] = 9
squares[4] = 16


*/