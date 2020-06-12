/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Your task is to create a simple Maths Tutor program. User picks Addition or Subtraction. program chooses two random numbers (between 1 and 10 inclusive) and displays a problem for the user to solve.
 * The user can then enter the answer to the problem. If correct: program must display a nice msg. If incorrect: Program must tell them and display the correct answer. For subtraction the smaller number must always be subtracted from the larger.
 * Use a WHILE Loop to have the user answer until they get ten guesses correct.
 *[OBJECTIVE]
 */


package assignmentmathtutorloop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM & SUIKA
 * @project: Intro To Java - Assignment: Random /Loops - Math Tutor
 * @version: 2.1 
 * @since Jun 12, 2020
 */
public class AssignmentMathTutorLOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


///////////////////////////////////////////////////////
///               [MATH TUTOR PROGRAM]              ///
///CONDITIONAL EVALUATION OF USER INPUT OF OPERATION///
///                  RANDOM NUMBERS                 ///
///              NESTED IF STATEMENTS               ///
///                      LOOPS                      ///
//////////////////////////////////////////////////////

//Initialize Scanner
       Scanner kb = new Scanner(System.in);
//Accept User Input: Name
       System.out.println("Please Enter Your Name: ");
       String name = kb.nextLine();
       
//Accept User Input: Operation
       //SPACER
       System.out.println("--------------------------------------------------------");
       System.out.println("Good Day, " + name + ". Welcome To Your Math Tutor Program.");
       System.out.println("Answer Ten Questions Correctly.");

       //GENERATE THE VARIABLES AND RANDOM NUMBERS
        //Call random and attach it to rndNum
        //WE ONLY NEED TO CREATE THE HOLDER FOR RANDOM ONCE as we are using the cointainer again and again
        Random rndNum = new Random();
        //Initialize the primary variables
        int numX;
        int numY;
        int numEquals;
        
        //Init the Correct Answer Counter       
        int counterCorrect = 0;
        

//Open the correct answer while loop
        while (counterCorrect < 10)
             {  
                
                 
/* 
[DEPRECATED 06-11-2020]
       System.out.println("Please Select The Operation Type: (A)ddition OR (S)ubtraction)");
///CONVERT THE USER INPUT INTO PREDICTED TEXT 'S'
       //Accept The Raw User Input
       rawOperation = kb.nextLine();
       //Strip the first character of their input
       operationChar = rawOperation.charAt(0);
       //Convert the character to a String (This is optional as you could process the char but that would alter the later code)
       operationProc = Character.toString(operationChar);  
       //Convert the String To UpperCase
       operation = operationProc.toUpperCase();
[DEPRECATED 06-11-2020]
*/       

//Accept User Input: Operation
        System.out.println("Please Select The Operation Type: (A)ddition OR (S)ubtraction)");
///CONVERT THE USER INPUT INTO PREDICTED TEXT 'S'
       //Accept The Raw User Input
       String rawOperation = kb.nextLine();
       //Pull the first character of the raw input and place it in a new string
       String operationProc = rawOperation.substring(0, 1);
       //Convert the String To UpperCase
       String operation = operationProc.toUpperCase();

        //Generate the random variables and constrain them to the given limits (1 - 10 inc.)
        numX = rndNum.nextInt(10)+1;
        numY = rndNum.nextInt(10)+1;
        
///NESTED IF STATEMENT TO EVALUATE ADDITION OR SUBTRACTION
       //SPACER
       System.out.println("--------------------------------------------------------");
       //NB: WHEN COMPARING STRINGS USE THE .EQUALS INSTEAD OF == AS == CHECKS TO SEE IF OBJs ARE |EXACTLY| THE SAME NOT IF THEY HAVE THE SAME STRING CONTENTS
       if (operation.equals("S"))
          {

       // Logic for Difference where X >= Y
                if (numX >= numY)
                     {
                     System.out.println("You Selected Subtraction for Today's Challenge.");    
                     System.out.println("Today's Challenge Question is: What is the difference between: " + numX + " and " + numY + " ?");    
                     numEquals = (numX - numY);
                     }
        // Logic for Difference where Y > X
                else
                    {
                    System.out.println("You Selected Subtraction for Today's Challenge.");
                    System.out.println("Today's Challenge Question is: What is the difference between: " + numY + " and " + numX + " ?");
                     numEquals = (numY - numX);
                    }          
           }
        // Logic for Sum of X & Y
        else 
            {  
            System.out.println("You Selected Addition for Today's Challenge.");
            System.out.println("Today's Challenge Question is: What is the sum of: " + numX + " and " + numY + " ?");    
            numEquals = (numX + numY);
            }
//Accept User Input: Outcome Guess  
        int numGuess = kb.nextInt();
      
//!!! THIS IS ONLY HERE TO CLEAR OUT THE SCANNER FOR THE NEXT RUN OF THE LOOP !!!     
        kb.nextLine();
      
      
//Logic For Evaluating User's Guess
         //Correct Guess Logic
                 if (numGuess == numEquals)
                     {
                     System.out.println("Correct " + name + ", well done!");
         //Iterate correct answer counter
                     counterCorrect++;
                     }
        //Incorrect Guess Logic
                 else
                    { 
                    System.out.println("Sorry " + name + ", your guess was incorrect. The answer was: " + numEquals);
                    }
//Close the correct answer while loop                 
System.out.println("You have answered " + counterCorrect + " challenge question correctly.");  
             }
        System.out.println("Great job " + name + " on getting ten questions right. Congratulations, and have a good day!"); 
        
        
    }

}
