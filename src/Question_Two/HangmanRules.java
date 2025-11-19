//ST10281011 Akhilesh Parshotam
package Question_Two;

import java.util.Random;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class HangmanRules extends HangmanGame
{
    // Array of colours that will be used in the game.
    private static final String[] Colours =
    {
        "red", "orange", "yellow", "green", "blue", "indigo", "violet", "purple", "black",
        "white", "Aquamarine", "crimson", "magenta", "gold", "salmon", "pink"
    };

    public HangmanRules()
    {
        super(selectRandomWord(), 0); 
    }
//**********************************************************************************************************************************
    
    // This method selects a random word from the Colours Array.
    private static String selectRandomWord()
    {
        Random randWord = new Random();
        int randomIndex = randWord.nextInt(Colours.length);
        return Colours[randomIndex];
    }

    //**********************************************************************************************************************************
    
    //Attribution for StringBuilder https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/.
    
    //This method allows the user to make a letter guess to what the word is.
    public boolean makeGuess(char letter)
    {
        boolean found = false;

        // Stringbuilder which will update the guessed word.
        StringBuilder newGuessedWord = new StringBuilder(getGuessedWord());

        // Iterates through the letters in the word to guess.
        for (int i = 0; i < getWordToGuess().length(); i++)
        {
            if (getWordToGuess().charAt(i) == letter) // Checks if the current character in the word to guess matches the guessed letter.
            {
                newGuessedWord.setCharAt(i, letter); // / Updates the guessed word with the correct letter.
                
                found = true;
            }
        }

        if (!found)
        {
            setRemainingAttempts(getRemainingAttempts() - 1); // Decreases the remaining attempts if letter was not found in the word.

            setIncorrectGuesses(getIncorrectGuesses() + 1); // Increases the count of incorrect guesses.
            HangmanDrawing.printHangman(getIncorrectGuesses());
        }

        setGuessedWord(newGuessedWord.toString());

        return found; // Return true if the guess is correct
    }
    
//**********************************************************************************************************************************
    
    //This method allows the user to make a word guess to what the word is.
    public boolean makeGuessWord(String guess)
    {
        boolean found = false;

        if (guess.equalsIgnoreCase(getWordToGuess())) //  Checks if the guessed word (case-insensitive) matches the word to guess.
        {
            setGuessedWord(guess); // Sets the guessed word to the correct word.

            found = true;
        }

        if (!found)
        {
            setRemainingAttempts(getRemainingAttempts() - 1); // Decreases the remaining attempts if word was incorrect.

            setIncorrectGuesses(getIncorrectGuesses() + 1); // // Increases the count of incorrect guesses.
            HangmanDrawing.printHangman(getIncorrectGuesses());
        }
        

        return found; // Return true if the guess is correct.
    }
//**********************************************************************************************************************************

    // Checks if the game has been won.
    public boolean isGameWon()
    {
        return getGuessedWord().equals(getWordToGuess());
    }
//**********************************************************************************************************************************
    
    // Checks if the game has been lost.
    public boolean isGameLost()
    {
        return getRemainingAttempts() <= 0;
    }
}
//ST10281011 Akhilesh Parshotam
