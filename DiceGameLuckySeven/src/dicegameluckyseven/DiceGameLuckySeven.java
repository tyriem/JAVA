/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Roll Two Six-Sided Dice. If they add up to 7, you win. Otherwise you lose.
 *[OBJECTIVE]
 */


package dicegameluckyseven;

//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;

/**
 *
 * @author T
 * @contributor: TMRM & Group 5
 * @project: Intro To Java - Random: Dice Game | Lucky Seven
 * @version: 1.0 
 * @since Jun 4, 2020
 */
public class DiceGameLuckySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        //Generate two randoms
        Random rndDiceOne = new Random();
        Random rndDiceTwo = new Random();
        
        //Make the random output a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 for two dice
        int numberDiceOne = rndDiceOne.nextInt(6)+1;
        int numberDiceTwo = rndDiceTwo.nextInt(6)+1;
        
        //Print the dice rolls
        System.out.println("Dice One Rolled a: " + numberDiceOne);
        System.out.println("Dice One Rolled a: " + numberDiceTwo);
        
        //declare an integer variable for the sum of the dice
        int sumDice = (numberDiceOne + numberDiceTwo);
        
        
        //Logic to evaluate if the user rolled the number 7
        //IF Statement for a roll of 7
        if (sumDice == 7)
        {
            System.out.println("You Win.");
        }
        //ELSE Statement for any other roll
        else
        {
            System.out.println("You Lose.");
        }
        
    }

}
