/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write some code that simulates the tossing of a coin.
 * You should use 0 to represent "Heads" and 1 to represent "Tails".
 *[OBJECTIVE]
 */


package labexercointoss;
//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Random Numbers - Simulate A Coin Toss
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class LabExerCoinToss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generate the random number
        Random rndCoin = new Random();
        
        //Generate a random number and store it in a variable, here we set the bracket as 1 where it limits the value to 0-1 
        int numberCoin = rndCoin.nextInt(1);
        
        //Take the Random Generated Value and Print the output with an IF-ELSE Statement around the outcome
        if (numberCoin == 0)
           {
           System.out.println("The Coin Landed on Heads");    
           }
        else
           {
           System.out.println("The Coin Landed on Tails");    
           }        

 
    }

}
