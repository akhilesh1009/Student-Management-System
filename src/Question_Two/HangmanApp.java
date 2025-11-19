//ST10281011 Akhilesh Parshotam
package Question_Two;

import java.util.Scanner;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class HangmanApp
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman! Colours Edition!!");
        System.out.println("-------------------------------------\n");

        // While loop thos continues until the game is won or the user has rin out of guesses.
        while (true)
        {
            // New object called application created.
            HangmanRules game = new HangmanRules();

            while (!game.isGameWon() && game.getRemainingAttempts() > 0)
            {
                System.out.println("Word: " + game.getGuessedWord());
                System.out.println("Attempts remaining: " + game.getRemainingAttempts());
                System.out.print("Guess a letter or type the full word: ");

                String input = scanner.nextLine();

                if (input.length() == 1)
                {
                    char guess = input.charAt(0);

                    if (!Character.isLetter(guess)) // Checks if the letter entered is valid.
                    {
                        System.out.println("Please enter a valid letter.");
                        continue;
                    }

                    guess = Character.toLowerCase(guess);

                    if (game.makeGuess(guess)) // Checks if the guessed letter is correct.
                    {
                        System.out.println("Good guess! \n");
                    } else
                        
                    {
                        System.out.println("Wrong guess. \n");
                    }
                    
                } else if (input.length() > 1)
                    
                {
                    boolean enteredGuess = true;

                    for (int i = 0; i < input.length(); ++i)
                    {
                        if (!Character.isLetter(input.charAt(i))) // Checks if the word entered is valid.
                        {
                            enteredGuess = false;
                        }
                    }

                    if (!enteredGuess)
                    {
                        System.out.println("Please enter a valid letter.");
                        continue;
                    }

                    if (game.makeGuessWord(input)) // Checks if the guessed word is correct.
                    {
                        System.out.println("Good guess! \n");
                    } else
                    {
                        System.out.println("Wrong guess. \n");
                    }
                } else

                {
                    System.out.println("Please enter a single letter or the full word.");
                }
            }
            if (game.isGameWon())
            {
                // Display message when the game is won.
                System.out.println("Congratulations! You've won. The word was: " + game.getWordToGuess() + "\n");
            } else

            {
                // Display message when user has run out of attempts.
                System.out.println("Sorry, you've run out of attempts. The word was: " + game.getWordToGuess() + "\n");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("Y"))
            {
                break;
            }
        }
    }
}
//ST10281011 Akhilesh Parshotam