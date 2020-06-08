/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Roll five six-sided dice. If you roll at least three even numbers you win. Using A FOR Loop.
 *[OBJECTIVE]
 */


package dicegamethreeevensloop;


import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - RANDOM & LOOPs: Dice Game Three Evens LOOP VERSION
 * @version: 2.0 
 * @since Jun 8, 2020
 */
public class DiceGameThreeEvensLOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rndDice = new Random();
        //WE ONLY NEED TO CREATE THE CONTAINER of numberDice ONCE as we are using the cointainer again and again
        int numberDice;
        int counterEvens = 0;
                
         
        //FOR-LOOP TRACKING THE NUMBER OF ROLLS
        for(int counter = 0; counter < 5; counter++)
            {
            //Generate a random number and store it in a variable, here we set the bracket as 2 where it limits the value to 0-1 
            numberDice = rndDice.nextInt(6)+1;
                    
                    
            //Logic To Track If Each Roll is an Even
            //Modulo the rolls by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
            if (numberDice % 2 == 0)
               {
               counterEvens++;
               System.out.println("You rolled a: " + numberDice + ". An even roll!");    
               }
            else
               {
               System.out.println("You rolled a: " + numberDice + ". An odd roll!");             
               }
            }

        //Logic To Evaluate If The User Rolled Enough Evens based on the value of the counter variable
        System.out.println("-------------------------------------");         
        if (counterEvens >= 3)
            {
            System.out.println("Congratulations! You Rolled Mostly Evens!");    
            }
        else
           {
            System.out.println("Sorry, You Didn't Roll Enough Evens...");             
           }
                
    }

}
