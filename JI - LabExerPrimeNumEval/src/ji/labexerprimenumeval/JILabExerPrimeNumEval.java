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

     System.out.println("Please enter the value to be evaluated: ");
     
     //Pull the user input into the memory buffer
     int valInput = kb.nextInt();
     boolean valTest = isPrime(valInput);
     System.out.println( "---------------------------------------------------");
     // Logic for Prime
        if (valTest = false)
          {
          System.out.println( valInput + " (is) a Prime Number");  
          }
     // Logic for Non-Prime
        else if (valTest = true)
             {
            System.out.println( valInput + " is (not) a Prime Number");  
             }
     // Logic for Invalid Input Error
        else 
            {  
            System.out.println("You have input an invalid value. Please Try Again.");
            }
    }

    //Method to test valInput as Prime
    public static boolean isPrime(int valInput) {

    for (int i = 2; i * i <= valInput; i++) {
        if (valInput % i == 0) {
            return false;
        }
    }

    return true;
}
    
}
