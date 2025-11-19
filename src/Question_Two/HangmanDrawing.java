//ST10281011 Akhilesh Parshotam
package Question_Two;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class HangmanDrawing
{

    // this methid prints the Hangman drawing based on the number of incorrect guesses.
    public static void printHangman(int incorrectGuesses)
    {
        switch (incorrectGuesses)
        {
            case 0: //Initial structure
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 1: //will display after the 1st wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 2: //will display after the 2nd wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 3: //will display after the 3rd wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 4: //will display after the 4th wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 5: //will display after the 5th wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=======");
                break;
                
            case 6: //will display after the 6th wrong guess.
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=======");
                break;
        }
    }
}
//ST10281011 Akhilesh Parshotam