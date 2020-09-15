/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.labexerprimenumeval;
//Import Java Utils
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Prime Number Evaluator
 * @version: 1.0 
 * @since Sep 1, 2020
 */
public class JILabExerPrimeNumEval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TASK: [Prime Number Evaluator]

    // Call Scanner to Mem Buffer
    Scanner kb = new Scanner(System.in); 

     
    //Ask the user to enter the number to be evaluated

     System.out.println("Please enter the value to be evaluated for primality: ");
     
     //Pull the user input into the memory buffer
     int num = kb.nextInt();
     boolean flag = false;
     System.out.println( "---------------------------------------------------");

        for(int i = 2; i <= num/2; ++i)
        {
            //LOGIC for non-prime
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
