/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Explore the use and calling of Random Numbers in JAVA
 *[OBJECTIVE]
 */


package randomnumbers;
//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Random Numbers
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Random Number of the name rnd
        Random rnd = new Random();
        
        //Generate a random number and store it in a variable, here we set an integer variable and then store the rnd as an Integer
        int number = rnd.nextInt();
        
        //Print the Random Number
        System.out.println(number);
        
////////////////////////////////////////////////////////////////////////////////
        //The above random number has limited use as its range is so wide, instead we can limit it
        Random rndLimit = new Random();
        
        //Generate a random number and store it in a variable, here we set the bracket as 4 where it limits the value to 0 and any integer less than the number you input (0 - 3)
        int numberLimit = rndLimit.nextInt(4);
        
        //Print the Random Number
        System.out.println(numberLimit);       
////////////////////////////////////////////////////////////////////////////////
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        Random rndDice = new Random();
        
        //Generate a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 
        int numberDice = rndDice.nextInt(6)+1;
        
        //Print the Random Number
        System.out.println("You Rolled The Number " + numberDice);    
    }
}
