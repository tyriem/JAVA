/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write code that uses a for loop to simulate the tossing of a coin five times. 
 * Your code must display HEADS or TAILS for each toss (use 0 to represent heads and 1 to represent tails) and also display at the end the total number of heads and the total number of tails tossed.
 *[OBJECTIVE]
 */


package labexercointosseval;
//Import Random
import java.util.Random;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: For Loops - Toss & Evaluate 5 Coins
 * @version: 1.0 
 * @since Jun 10, 2020
 */
public class LabExerCoinTossEval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /// Flip a Coin 5 Times and Show How Many Tails & Heads Output ///
  

        //Generate Random
        Random rnd = new Random ();
         // Declare VARs 
        int heads = 0;
        int tails = 0;
        int total = 0;
        
//Logic To Flip Coin 5X and Evaluate Outcomes
        //For Loop To Flip Coin
        for (int counterCoin = 1; counterCoin <=5; counterCoin++)
            {
            int coin = rnd.nextInt(2);
        //Logic To Eval Heads    
            if (coin==0)
               {
                heads++;
                System.out.println("The Coin Landed on Heads");
               }
        //Logic To Eval Tails 
            else
               {
                tails++;
                System.out.println("The Coin Landed on Tails");
               }
            total += coin;
            }
//SPACER
        System.out.println("--------------------------");
//Print the total of each flip type
        System.out.println("Amount of Heads: " + heads);
        System.out.println("Amount of Tails: " + tails);
    }

}
