/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create the Lucky Number Dice Game using Methods for Efficiency 
 * Ask the user for their name. Roll two dice.
 * Check if the total of the dice is X
 * Ask the user if they want to play again 
 *[OBJECTIVE]
 */


package dicegameluckymethodx;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Method: Lucky Xs
 * @version: 1.0 
 * @since Jun 24, 2020
 */
public class DiceGameLuckyMethodX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Init Scanner
        Scanner kb = new Scanner (System.in);
        
        //Prompt user for name
        System.out.print("Please Enter Your Name: ");
        String name = kb.nextLine();
       
        //TO DO: Can We Display Name in Proper Case
        //PRINT USER WELCOME
        System.out.println("[THE LUCKY NUMBER DICE GAME]");
        System.out.println("[Welcome " + name + " to the Lucky Number Dice Game]");
        
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        //Generate random
        Random rndDice = new Random();

        //Declare VARs
        //NB: WE |MUST| playAgain as a Y or it would skip the loop below
        char playAgain = 'Y';
        
        int numOfWins = 0;
        int numOfLosses = 0;
        
        while(playAgain == 'Y')
        {
            //Make the random output a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 for two dice
            int diceOne = rndDice.nextInt(6)+1;
            int diceTwo = rndDice.nextInt(6)+1;
            int total = diceOne + diceTwo;


            //Display Dice Rolls
            System.out.println("Dice One Rolled a: " + diceOne);
            System.out.println("Dice One Rolled a: " + diceTwo);

            if( total == 7)
            {
                System.out.println("You Win!");   
                numOfWins++;
            } 
            else
            {
                System.out.println("You Lose!");
                numOfLosses++;
            }  

            //Ask the user if they want to play again
            System.out.println("Do you want to play again " + name + " ? (Y/N)");
            playAgain = kb.nextLine().toUpperCase().charAt(0);
        }
        System.out.println("Thanks For Playing.");
        System.out.println("You won " + numOfWins + " time(s) and lost " + numOfLosses + " time(s).");
        
    }
    /**
     * This method returns the number rolled (works for any type of dice)
     * @param numberOfSides Number of sides that the dice has
     * @return The number rolled
     */
    public static int diceRoll(int numberOfSides)
    {
        Random rnd = new Random();
        int dice = rnd.nextInt(numberOfSides) + 1;
        return dice;
    }
    
    /**
     * Prints the word equivalent of the number provided
     * @param number 
     */
    public static void diceName(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.println("ONE");
                break;
            case 2: 
                System.out.println("TWO");
                break;
            case 3: 
                System.out.println("THREE");
                break;
            case 4: 
                System.out.println("FOUR");
                break;
            case 5: 
                System.out.println("FIVE");
                break;
            case 6: 
                System.out.println("SIX");
                break;
        }
    }
    
    /**
     * Prints the word equivalent of the number provided
     * @param number 
     */
    public static void diceNombre(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.println("UNO");
                break;
            case 2: 
                System.out.println("DOS");
                break;
            case 3: 
                System.out.println("TRES");
                break;
            case 4: 
                System.out.println("CUATRO");
                break;
            case 5: 
                System.out.println("CINCO");
                break;
            case 6: 
                System.out.println("SEIS");
                break;
        }
    }
    
    /**
     * Prints the dice image of the number provided
     * @param number 
     */
    public static void diceImage(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.print("+-----+ \n|     | \n|  o  | \n");
                System.out.println("|     | \n+-----+ \n");
                break;
            case 2: 
                System.out.print("+-----+ \n|o    | \n|     | \n");
                System.out.println("|    o| \n+-----+ \n");
                break;
            case 3: 
                System.out.print("+-----+ \n|o    | \n|  o  | \n");
                System.out.println("|    o| \n+-----+ \n");
                break;
            case 4: 
                System.out.print("+-----+ \n|o   o| \n|     | \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
            case 5: 
                System.out.print("+-----+ \n|o   o| \n|  o  | \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
            case 6: 
                System.out.print("+-----+ \n|o   o| \n|o   o| \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
        }
    
    }    
    
}
