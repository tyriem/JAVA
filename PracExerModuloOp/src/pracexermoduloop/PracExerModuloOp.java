/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

  /*
OBJECTIVE: Write	some	code	that	accepts	a	value between	
0	and	100	cents. Your	code	must	output	the	
best	way	(the	fewest	number	of	coins)	to	make	
the	amount	using	quarters	(25c),	dimes	(10c),	
nickels	(5c)	and	pennies	(1c).
  */
package pracexermoduloop;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Modulus Operator: Making Change
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
          System.out.println("Enter the number of cents (between 1 and 100): ");
          //Pull the first user input into the memory buffer
           int cents = kb.nextInt();
           int quarters = (cents / 25);
           int remainder = (cents % 25);
           int dimes = (remainder / 10);
           int remainder2 = (remainder % 10);
           int nickels = (remainder2 / 5);
           int remainder3 = (remainder2 % 5);
           int pennies = (remainder3 / 1);
           System.out.println(quarters + " quarters \n" + dimes + " dimes \n" + nickels + " nickels \n" + pennies + " pennies \n");
    }

}
