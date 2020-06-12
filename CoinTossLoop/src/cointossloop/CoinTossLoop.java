/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * FLIP 10 COINS AND OUTPUT THEIR OUTCOME WITH A FOR LOOP
 *[OBJECTIVE]
 */


package cointossloop;

import java.util.Random;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Random Coin Toss: LOOP VERSION
 * @version: 1.0 
 * @since Jun 8, 2020
 */
public class CoinTossLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rndCoin = new Random();
        //WE ONLY NEED TO CREATE THE CONTAINER of numberCoin ONCE as we are using the cointainer again and again
        int numberCoin;

                
        //Take the Random Generated Value and Print the output with an IF-ELSE Statement around the outcome
        
                for(int counter = 0; counter <= 10; counter++)
                {
                    //Generate a random number and store it in a variable, here we set the bracket as 2 where it limits the value to 0-1 
                    numberCoin = rndCoin.nextInt(2);
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

}
