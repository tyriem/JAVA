/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create an array to print a random food choice.
 *[OBJECTIVE]
 */


package arraysrandom;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Arrays Generating Random
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class ArraysRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Init the random
        Random rnd = new Random();
           
        //Create an array of Strings
        String[] foodChoice = {"Spaghetti", "Curry", "Sushi", "Burgers", "Steak"};
        //Generate random number
        int index = rnd.nextInt(foodChoice.length);
        //Print random meal
        System.out.println(foodChoice[index]);
    }

}
