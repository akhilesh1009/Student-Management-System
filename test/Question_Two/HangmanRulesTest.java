//ST10281011 Akhilesh Parshotam
package Question_Two;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class HangmanRulesTest
{
//**********************************************************************************************************************************
    
    /**
     * Test of makeGuess method, of class HangmanRules.
     */
    @Test
    public void testCorrectGuess()
    {
        System.out.println("testCorrectGuess");
        HangmanRules hangman = new HangmanRules();
        String wordToGuess = hangman.getWordToGuess();
        char correctLetter = wordToGuess.charAt(0);
        
        assertTrue(hangman.makeGuess(correctLetter));
        System.out.println("Good Guess");
        System.out.println("Test Successfully Completed \n");
    }
    
//**********************************************************************************************************************************

    /**
     * Test of makeGuess method, of class HangmanRules.
     */
    @Test
    public void testIncorrectGuess()
    {
        System.out.println("testIncorrectGuess");
        HangmanRules hangman = new HangmanRules();
        String wordToGuess = hangman.getWordToGuess();
        char incorrectLetter = 'q';

        while (wordToGuess.indexOf(incorrectLetter) != -1)
        {
            incorrectLetter++;
        }

        assertFalse(hangman.makeGuess(incorrectLetter));
        System.out.println("Wrong Guess");
        System.out.println("Test Successfully Completed \n");
    }
    
//**********************************************************************************************************************************
    
    /**
     * Test of makeGuessWord method, of class HangmanRules.
     */
    @Test
    public void testCorrectWordGuess()
    {
        System.out.println("testCorrectWordGuess");
        HangmanRules hangman = new HangmanRules();
        String correctWord = hangman.getWordToGuess();

        assertTrue(hangman.makeGuessWord(correctWord));
        System.out.println("Good Guess");
        System.out.println("Test Successfully Completed \n");
    }
    
//**********************************************************************************************************************************
    
    /**
     * Test of makeGuessWord method, of class HangmanRules.
     */
    @Test
    public void testIncorrectWordGuess()
    {
        System.out.println("testIncorrectWordGuess");
        HangmanRules hangman = new HangmanRules();
        String incorrectWord = "incorrect";

        assertFalse(hangman.makeGuessWord(incorrectWord));
        System.out.println("Wrong Guess");
        System.out.println("Test Successfully Completed \n");
    }
}
//ST10281011 Akhilesh Parshotam
