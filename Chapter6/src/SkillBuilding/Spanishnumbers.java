package SkillBuilding;

public class Spanishnumbers 
{

	public static void spanishNumber(int enNum)
	{
		switch(enNum)
		{
		case 1: System.out.println(enNum + " = uno"); break;
		case 2: System.out.println(enNum + " = dos"); break;
		case 3: System.out.println(enNum + " = tres"); break;
		case 4: System.out.println(enNum + " = cuatro"); break;
		case 5: System.out.println(enNum + " = cinco"); break;
		case 6: System.out.println(enNum + " = seis"); break;
		case 7: System.out.println(enNum + " = seite"); break;
		case 8: System.out.println(enNum + " = ocho"); break;
		case 9: System.out.println(enNum + " = nueve"); break;
		case 10:System.out.print(enNum + " = diez"); break;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The numbers from 1-10 in Spanish are: ");
		
		for (int i = 1; i <= 10; i++)
		{
			spanishNumber(i);
		}
	}

}
/* Screen Dump

The numbers from 1-10 in Spanish are: 
1 = uno
2 = dos
3 = tres
4 = cuatro
5 = cinco
6 = seis
7 = seite
8 = ocho
9 = nueve
10 = diez

*/