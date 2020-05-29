/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

 /*
OBJECTIVE: Write some code that	asks the user	to enter three integer	values	and outputs “EQUAL” if	
all three numbers entered are the same.
  */
package pracexerlogiop;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - 
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerLogiOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF INTEGERS
          System.out.println("Enter the first number: ");
          //Pull the first user input into the memory buffer
           int numberOne = kb.nextInt();
          System.out.println("Enter the second number: ");
          //Pull the first user input into the memory buffer
           int numberTwo = kb.nextInt();
          System.out.println("Enter the third number: ");
          //Pull the first user input into the memory buffer
           int numberThree = kb.nextInt();
           
if (numberOne == numberTwo && numberTwo == numberThree && numberThree == numberOne)
{
 System.out.println("EQUAL");   
}
    }

}
