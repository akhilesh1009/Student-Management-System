//ST10281011 Akhilesh Parshotam
package Question_Two;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */

public class HangmanGame
{
    // variable Declaration
    private final String wordToGuess;
    private String guessedWord;
    private int remainingAttempts = 6;
    private int incorrectGuesses;

//**********************************************************************************************************************************
    
    public HangmanGame(String wordToGuess, int maxAttempts)
    {

        this.wordToGuess = wordToGuess;
        this.guessedWord = "-".repeat(wordToGuess.length());
        this.incorrectGuesses = maxAttempts;
    }

//**********************************************************************************************************************************
    
    // Gets the number of incorrect guesses.
    public int getIncorrectGuesses()
    {
        return incorrectGuesses;
    }

//**********************************************************************************************************************************

    // Sets the number of incorrect guesses.
    public void setIncorrectGuesses(int incorrectValue)
    {
        incorrectGuesses = incorrectValue;
    }

//**********************************************************************************************************************************
    
    // Gets the current state of the word being guessed.
    public String getGuessedWord()
    {
        return guessedWord;
    }
 
//**********************************************************************************************************************************
    
    // Set the current state of the word being guessed.
    public void setGuessedWord(String fullWord)
    {
        guessedWord = fullWord;
    }

//**********************************************************************************************************************************
    
    // Gets the word to be guessed.
    public String getWordToGuess()
    {
        return wordToGuess;
    }

//**********************************************************************************************************************************
    
    // Gets the number of remaining attempts.
    public int getRemainingAttempts()
    {
        return remainingAttempts;
    }

//**********************************************************************************************************************************
    
    // Sets the number of remaining attempts.
    public void setRemainingAttempts(int remainValue)
    {
        remainingAttempts = remainValue;
    }
}
//ST10281011 Akhilesh Parshotam