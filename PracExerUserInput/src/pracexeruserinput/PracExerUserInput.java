/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

  /*
OBJECTIVE: Write some code that	asks the user to enter two numbers.
Your code must	calculate and display the sum (+) and product (*) of these numbers
  */
package pracexeruserinput;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Accepting User Input: Sum and Product of Input
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF TEMP
          System.out.println("Enter the first number: ");
          //Pull the first user input into the memory buffer
          double numberOne = kb.nextDouble();
          System.out.println("Enter the second number: ");
          //Pull the second user input into the memory buffer
          double numberTwo = kb.nextDouble();
          double total = (numberOne + numberTwo);
          double product = (numberOne * numberTwo);       
          System.out.println("The sum of the numbers " + numberOne + " & " + numberTwo + " is: " + total + ". Their product is: " + product);
          
    }

}
