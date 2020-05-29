/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

 /*
OBJECTIVE: Write some code that asks the user to enter a number from 1 through 5 and displays its equivalent in words. You must use a switch statement.
  */
package labexernumswitch;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Converting Numbers To Words Via Switch
 * @version: 1.0 
 * @since May 29, 2020
 */
public class LabExerNumSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF MONTH & DAY
          System.out.println("Enter a number between one and five (inclusive): ");
          //Pull the first user input into the memory buffer
           int number = kb.nextInt();
           //Set the value of number as a switch
           switch (number)
        {
           //Define the switch number's behaviour
                  case 1:
                  System.out.println("one");
                  break;
              case 2:
                  System.out.println("two");
                  break;
              case 3:
                  System.out.println("three");
                  break;
              case 4:
                  System.out.println("four");
                  break;
              case 5:
                  System.out.println("five");
                  break;
              default:
                System.out.println("You have not entered a valid number");
        }
           
    }

}
