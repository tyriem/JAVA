/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

  /*
OBJECTIVE: Write some code that	accepts	a value between	
0 and 100 cents. Your code must	output	the	
best way (the fewest number of	coins) to make	
the amount using quarters (25c),	dimes (10c),	
nickels	(5c) and pennies (1c).
  */
package pracexermoduloop;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Modulus Operators: Making Change
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerModuloOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF TEMP
//NOTES: Attempt to Ripple just one remainder variable through code statement
          System.out.println("Enter the number of cents (between 1 and 100): ");
          //Pull the first user input into the memory buffer
           int cents = kb.nextInt();
           //Divide the user input by 25 to get the amount of quarters
           int quarters = (cents / 25);
           //Modulo the user input by 25 to get the remainder to go towards dimes
           int remainder = (cents % 25);
           //Divide the quarter modulo by 10 to get the amount of dimes
           int dimes = (remainder / 10);
           //Modulo the quarter modulo by 10 to get the second remainder to go towards nickels
           int remainder2 = (remainder % 10);
           //Divide the second remainder by 5 to get the amount of nickels
           int nickels = (remainder2 / 5);
           //Modulo the second remainder by 5 to get the second remainder to go towards nickels
           int remainder3 = (remainder2 % 5);
           //Divide the third remainder by 1 to get the amount of pennies
           int pennies = (remainder3 / 1);
           //PRINT THE OUTPUT OF THE ABOVE CALCs
           System.out.println(quarters + " quarters \n" + dimes + " dimes \n" + nickels + " nickels \n" + pennies + " pennies \n");
    }

}
