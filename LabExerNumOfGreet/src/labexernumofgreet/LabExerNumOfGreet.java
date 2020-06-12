/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write some Java code that asks the user for a greeting and a number.
 * Your code must use a For Loop to output the greeting the required number of times.
 *[OBJECTIVE]
 */


package labexernumofgreet;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - LOOPs: Number Of Greetings
 * @version: 1.0 
 * @since Jun 10, 2020
 */
public class LabExerNumOfGreet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///////////////////////////////////////////////////////
///                     FOR LOOP                    ///
///              EVALUATION OF USER INPUT           ///
//////////////////////////////////////////////////////
        
//Initialize Scanner
       Scanner kb = new Scanner(System.in);

//Accept User Input: Greeting
       System.out.println("Good Day, Please Enter A Greeting: ");
       String greet = kb.nextLine();
//Accept User Input: Number Of Greetings
       System.out.println("Please Enter The Number Of Times You Want To Greet: ");
       int limitGreet = kb.nextInt();
//Declare variables
       int counterGreet;
        
       //SPACER
       System.out.println("--------------------------------------------------------");        
       //THIS IS THE HEADER FOR OUR FOR LOOP
       //NB: Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
//For Loop Logic to print user greeting until user limit is reached 
       for(counterGreet = 1; counterGreet <= limitGreet; counterGreet++)
       {
           System.out.println(greet);
       } 
         //NB: When you exit a loop the command after runs
         System.out.println("--------------------------------------------------------");
    }

}
