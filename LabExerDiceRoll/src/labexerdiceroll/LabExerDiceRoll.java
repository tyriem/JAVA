/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * You must write code to simulate the roll of two six-sided dice.
 * Your program must output the roll of each die separately, as well as the total (the sum of the values of the dice).
 *[OBJECTIVE]
 */


package labexerdiceroll;
//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Random Numbers - Simulate A Dice Roll
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class LabExerDiceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        //Generate a random 
        Random rndDiceOne = new Random();
        Random rndDiceTwo = new Random();
        
        //Make the random output a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 
        int numberDiceOne = rndDiceOne.nextInt(6)+1;
        int numberDiceTwo = rndDiceTwo.nextInt(6)+1;
        
        //Print, Format & Sum the Random Number Output
        System.out.println("The First Dice Roll Was: " + numberDiceOne + " & The Second Dice Roll Was: " + numberDiceTwo + ". \nThe Sum Of The Dice Is: " + (numberDiceOne + numberDiceTwo));    
        
    }

}
