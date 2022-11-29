import java.util.Scanner;

public class Exp3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final String SECRET_WORD = "BRAIN";
		final String FLAG = "!";
		int score = 100;
		String wordSoFar = "", updatedWord = "", wordGuess = "", letterGuess;
		int numGuesses = 0;
		
		//begin game
		System.out.println("WordGuess game.\n");
		for(int i = 0; i < SECRET_WORD.length(); i++);
		{
			wordSoFar += "-"; // word as dashes
			
			/* allow player to make guesses*/
			
			do
			{
				System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
				letterGuess = input.nextLine(); // record the full line from the user
				letterGuess = letterGuess.toUpperCase(); // convert user guess to upercase letters
				
				numGuesses += 1; // increment number of guesses
				
				if (SECRET_WORD.indexOf(letterGuess) >= 0)
				{
					updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
					updatedWord += letterGuess;
					updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1, wordSoFar.length());
					wordSoFar = updatedWord;
				}
				
				System.out.println(wordSoFar + "\n");
				score = score - 10;
				
			}while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && score > 0);
			
			if (letterGuess.equals(FLAG)) // finish game and display number of guesses
			{
				System.out.println("What is your guess?");
				wordGuess = input.nextLine();
				wordGuess = wordGuess.toUpperCase();
			}
			if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD))
			{
				System.out.println("You won!");
			}
			else
			{
				System.out.println("Sorry. You lose.");
			}
			if (score == 0)
			{
				System.out.println("Your score is 0. You lose");
			}
			System.out.println("The secret word is " + SECRET_WORD);
			System.out.println("You made " + numGuesses + "guesses");
			System.out.println("Your score is " + score);
		}
	}

}
