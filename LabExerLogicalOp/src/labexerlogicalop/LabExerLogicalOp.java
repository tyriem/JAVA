/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package labexerlogicalop;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Evaluating User Input With Logical Operators
 * @version: 1.0 
 * @since May 28, 2020
 */
public class LabExerLogicalOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*
OBJECTIVE: Write some code that asks the user for an integer value and checks if it is between 13 and 19 (inclusive). 
Print an error message if the value entered does not meet the required criteria.
  */
         
 //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF INTEGER NUMBER
        System.out.println("Enter A WHOLE NUMBER BETWEEN 13 and 19: ");
          //Pull the user input into the memory buffer
          int number = kb.nextInt();
          //Evaluate the User Input Across the Given Range
           if (number >= 13 && number <= 19)
              {
           //PRINT THE SUCCESS STATE MSG
              System.out.println("YOU HAVE SUCCESFULLY ENTERED A VALUE BETWEEN 13 AND 19 (Inclusive)");
              }
           //FAILURE STATE
           else
           //PRINT THE FAILURE STATE MSG
              System.out.println("!!!ERROR 1: VALUE DOES NOT MEET CRITERIA!!!");  
    }

}
