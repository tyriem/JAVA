/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Roll one six-sided dice and the user has to guess what was rolled. If the user guessed correctly they win. If not they lose.
 * Can you tell the user if their guess was too high or too low?
 *[OBJECTIVE]
 */


package dicegameluckyguess;

//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;
//import Scanner
import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM & Group 5
 * @project: Intro To Java - Random: Dice Game | Lucky Guess
 * @version: 1.0 
 * @since Jun 4, 2020
 */
public class DiceGameLuckyGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        //Generate a random 
        Random rndDice = new Random();
        
        //Make the random output a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 
        int numberDice = rndDice.nextInt(6)+1;
        
       //Declare VARs
       //Start the Scanner and attach it to keyboard input
       Scanner kb = new Scanner(System.in);

        
        // Ask user for their guess
        System.out.println("What do you think the dice rolled?");
        int diceGuess = kb.nextInt();
        
        //Check the user's guess against the roll
        //Evaluate too low a guess
        if (diceGuess < numberDice)
           {
           System.out.println("Sorry, Your Guess Was Too Low.");  
           }   
        //Evaluate a correct guess
        else if (diceGuess == numberDice)
           {
           System.out.println("You Win.");  
           }    
        //Evaluate too high a guess
        else if (diceGuess > numberDice)
           {
           System.out.println("Sorry, Your Guess Was Too High.");  
           }   
        //Evaluate an invalid guess
        else
        {
           System.out.println("Your input was invalid, please try again.");   
        }
    }

}
