/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


 /*
OBJECTIVE: Write code that follows the	flowchart in fig.3 (using nested statements) to	ask the	user for	
their speed and	output the required message as appropriate
  */
package pracexerprogflownest;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Controlling Program Flow (Nested If STATEMENTS): Speed Gate
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerProgFlowNest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF SPEED
          System.out.println("Enter the speed of the vehicle (in mph): ");
          //Pull the first user input into the memory buffer
           int speed = kb.nextInt();
//Tier 1 Open
//Tier 1 Eval - Speed VS 55           
if (speed > 55)
   {
//Tier 1 Output - TOO FAST
   System.out.println("TOO FAST!");   
   }
//Tier 2 Open
else
   {
//Tier 2 Eval - Speed VS 40
   if (speed < 40)
      {
//Tier 2 Output - Speed VS 40
      System.out.println("TOO SLOW!");      
      }
//Tier 2 Output - You're OK
   else
      {
       System.out.println("YOU'RE OKAY!"); 
//Tier 2 Close
      }
//Tier 1 Close
   }
    }

}
