import java.util.Scanner;

public class NimGame 
{
	private int stonesRemaining;
	
	public NimGame() // Constructor method
	{
		// A random number of stones between 15-30
		stonesRemaining = (int)(16*Math.random() + 15);
	}
	
	private int drawStones()
	{
		int stoneSelected = (int)(3*Math.random() + 1);
		
		return stoneSelected;
	}
	
	private int computerMove(int stones)
	{
		int stonesToTake, stonesLeft;
		stonesToTake = drawStones();
		
		while(!isValidEntry(stonesToTake, 1 , 3, stones))
		{
			stonesToTake = drawStones();
		}
		System.out.println(" The computer takes " + stonesToTake + " stones.");
		stonesLeft = stones - stonesToTake;
		return stonesLeft;
	}
	
	private boolean isValidEntry(int num, int min, int max, int total)
	{
		if(num >= min && num <= max && num <= total)
		{
			return true;
		}
		else
			return false;
	}
	
	private int userMove(int stones)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int stonesToTake, stonesLeft;
		
		System.out.println(" How many would you like?");
		stonesToTake = input.nextInt();
		
		while(!isValidEntry(stonesToTake, 1 , 3, stones))
		{
			System.out.println("How many would you like?");
			stonesToTake = input.nextInt();
		}
		stonesLeft = stones - stonesToTake;
		return stonesLeft;
	}
	
	public void play()
	{
		boolean over = false;
		
		while (!over)
		{
			if(stonesRemaining > 0) // user goes first
			{
				System.out.print("There are " + stonesRemaining + " stones.");
				stonesRemaining = userMove(stonesRemaining);
			}
			else
			{
				System.out.print("The player beats the computer!");
				over = true;
			}
			if(!over)
			{
				if(stonesRemaining > 0) // computer goes second
				{
					System.out.print("There are " + stonesRemaining + " stones.");
					stonesRemaining = computerMove(stonesRemaining);
				}
				else
				{
					System.out.print("The computer beats the player!");
					over = true;
				}
			}
		}
	}
	

}
