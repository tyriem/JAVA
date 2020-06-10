/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Roll 10 Dice and sum their rolls. Flip a Coin 10 Times and show the total of HEADS & TAILS
 *[OBJECTIVE]
 */


package forlooptotal;

import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - For Loop: Running total
 * @version: 1.0 
 * @since Jun 10, 2020
 */
public class ForLoopTotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random ();
        double total = 0;

        
//ROLL A DICE 10 TIMES        
        for (int counter = 1; counter <=10; counter++)
            {
            int dice = rnd.nextInt(6)+1;
            System.out.println("Dice Roll: " + dice);
            total += dice;
            }
        //Print the total
        System.out.println("Total: " + Math.round(total));
        //Calc & Print the average
        System.out.println("Mean: " + (total / 10));
        
////////////////////////////////////////////////////////////////////////////////

        int heads = 0;
        int tails = 0;
        
//Flip a Coin 10 Times and Show How Many
        for (int counterCoin = 1; counterCoin <=10; counterCoin++)
            {
            int coin = rnd.nextInt(2);
            if (coin==0)
               {
                heads++;
                System.out.println("The Coin Landed on Heads");
               }
            else
               {
                tails++;
                System.out.println("The Coin Landed on Tails");
               }
            total += coin;
            }
        //Print the total of each flip type
        System.out.println("Amount of Heads: " + heads);
        System.out.println("Amount of Tails: " + tails);
    }

}
