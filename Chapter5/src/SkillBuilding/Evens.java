package SkillBuilding;

public class Evens 
{

	public static void main(String[] args) 
	{
		int max = 20;
		
		System.out.print("The even numbers from 1-20 are: ");
		
		for(int min = 1; min <= max; min++)
		{
			if(min%2 == 0)
			{
				System.out.print(min + ". ");
			}
		}
	}

}
/* Screen Dump 

The even numbers from 1-20 are: 2. 4. 6. 8. 10. 12. 14. 16. 18. 20. 

*/