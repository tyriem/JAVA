/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Your task is to create a simple Maths Tutor program. User picks an operation, program chooses two random numbers (between 1 and 10 inclusive) and displays a problem for the user to solve.
 * The user can then enter the answer to the problem. If correct: program must display a nice msg. If incorrect: Program must tell them and display the correct answer. For subtraction the smaller number must always be subtracted from the larger.
 * Use a WHILE Loop AND SWITCH to have the user answer until they get ten guesses correct.
 *[OBJECTIVE]
 */


package assignmentmathtutorswitch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM & SUIKA
 * @project: Intro To Java - Assignment: Random / Switch - Math Tutor
 * @version: 3.0 
 * @since Jun 15, 2020
 */
public class AssignmentMathTutorSWITCH {

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
///                     SWITCH                      ///
///                  OPTIMIZATION                   ///
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
        String selectOperation;
        String selectOperator;
        String selectConnect;
        double numEquals;
        
        //Init the Correct Answer Counter       
        int counterCorrect = 0;
        

//Open the correct answer while loop
        while (counterCorrect < 10)
             {  
   

//Accept User Input: Operation
        System.out.println("Please Select The Operation Type: (A)ddition, (S)ubtraction), (M)ultiplication, (D)ivision, (E)xponents");
                       
///CONVERT THE USER INPUT INTO PREDICTED TEXT 'S'
       //Accept The Raw User Input
       String rawOperation = kb.nextLine();
       //Convert the String To UpperCase
       String operation = rawOperation.toUpperCase();
/*
 *[DEPRECATED 06-16-20 | SUPERFLUOUS] 
       //Pull the first character of the raw input and place it in a new string
       String operationProc = rawOperation.substring(0, 1);     
 *[DEPRECATED 06-16-20 | SUPERFLUOUS] 
 */

        //Generate the random variables and constrain them to the given limits (1 - 10 inc.)
        numX = rndNum.nextInt(10)+1;
        numY = rndNum.nextInt(10)+1;
        
///NESTED IF STATEMENT TO EVALUATE ADDITION OR SUBTRACTION
       //SPACER
       System.out.println("--------------------------------------------------------");

       
          switch (operation)
          {
              case "A":
              case "(A)":    
              case "ADDITION":
              selectOperation = "addition";
              selectOperator = "sum";
              selectConnect = " plus "; 
              numEquals = (numX + numY);
              //THE BREAK IS NECESSARY AS IT GETS OUT / EXITS THE SWITCH STATEMENT, WITHOUT IT THE SWITCH WILL CONTINUE TO COUNT UP BEYOND THE TARGET
              break;
                  
              case "S":
              case "(S)":    
              case "SUBTRACTION":
              selectOperation = "subtraction";
              selectOperator = "difference";
              selectConnect = " minus "; 
                  if (numX < numY)
                  {
                     numEquals = (numY - numX);
                  }   
                  else
                  {  
                     numEquals = (numX - numY);
                  }    
                  break;
                  
                                    
              case "M":
              case "(M)":    
              case "MULTIPLICATION":
               selectOperation = "multiplication";
               selectOperator = "product";
               selectConnect = " times "; 
               numEquals = (numX * numY);
                  break;

                  
              case "D":
              case "(D)":    
              case "DIVISION":
               selectOperation = "division";
               selectOperator = "quotient";
               selectConnect = " divided by "; 
                  if (numX < numY)
                  {
                     numEquals = (((double)numY/(double)numX));
                  }   
                  else
                  {
                     numEquals = (((double)numX/(double)numY));
                  }    
                  break;
                  
              case "E":
              case "(E)":    
              case "EXPONENTIAL":
                selectOperation = "exponent";
                selectOperator = "exponential";
                selectConnect = " to the power of "; 
                  numEquals = (Math.pow(numX,numY));
                  break;
                  
              default:
              System.out.println("Please try again.");  
              numEquals = 0;
              //Return to the start of the loop
              continue;
           }            

/*
 *[DEPRECATED 06-15-20 | REDUNDANT LOGIC]

          switch (operation)
          {
              case "A":
              System.out.println("You Selected Addition for Today's Challenge.");
              System.out.println("Today's Challenge Question is: What is the sum of: " + numX + " and " + numY + " ?");    
              numEquals = (numX + numY);
              //THE BREAK IS NECESSARY AS IT GETS OUT / EXITS THE SWITCH STATEMENT, WITHOUT IT THE SWITCH WILL CONTINUE TO COUNT UP BEYOND THE TARGET
              break;
                  
              case "S":
                  if (numX < numY)
                  {
                    System.out.println("You Selected Subtraction for Today's Challenge.");
                    System.out.println("Today's Challenge Question is: What is the difference between: " + numY + " and " + numX + " ?");
                     numEquals = (numY - numX);
                  }   
                  else
                  {
                     System.out.println("You Selected Subtraction for Today's Challenge.");    
                     System.out.println("Today's Challenge Question is: What is the difference between: " + numX + " and " + numY + " ?");    
                     numEquals = (numX - numY);
                  }    
                  break;
                  
                                    
               case "M":
               System.out.println("You Selected Multiplication for Today's Challenge.");
               System.out.println("Today's Challenge Question is: What is the product of: " + numX + " and " + numY + " ?");    
               numEquals = (numX * numY);
                  break;

                  
               case "D":
                  if (numX < numY)
                  {
                    System.out.println("You Selected Division for Today's Challenge.");
                    System.out.println("Today's Challenge Question is: What is the quotient of: " + numY + " over " + numX + " ?");
                     numEquals = (((double)numY/(double)numX));
                  }   
                  else
                  {
                     System.out.println("You Selected Division for Today's Challenge.");    
                     System.out.println("Today's Challenge Question is: What is the quotient of: " + numX + " over " + numY + " ?");    
                     numEquals = (((double)numX/(double)numY));
                  }    
                  break;
                  
                  case "E":
                  System.out.println("You Selected Exponents for Today's Challenge.");
                  System.out.println("Today's Challenge Question is: What is the exponent of: " + numX + " to the power of " + numY + " ?");    
                  numEquals = (Math.pow(numX,numY));
                  break;
                  
              default:
              System.out.println("Please try again.");  
              numEquals = 0;
              //Return to the start of the loop
              continue;
           }            
*[DEPRECATED 06-15-20 | REDUNDANT LOGIC]
*/ 
 
//IF STATEMENT TO PROMPT USER WITH CHALLENGE QUESTION
              System.out.println("You Selected " + selectOperation + " for Today's Challenge.");
              if (numX >= numY)
              {
                 System.out.println("Today's Challenge Question is: What is the " + selectOperator + " of: " + numX + selectConnect + numY + " ?");  
              }   
              else
              {
                 System.out.println("Today's Challenge Question is: What is the " + selectOperator + " of: " + numY + selectConnect + numX + " ?");
              }    
                         
          
//Accept User Input: Outcome Guess  
//THIS WHILE LOOP VALIDATES THE USER INPUT TO ENSURE THAT THEY ENTERED A SUITABLE ANSWER     
while(!kb.hasNextDouble()) {
    System.out.println("Invalid Input. Try Again.");
    kb.nextLine();
}
double numGuess = kb.nextDouble();      
        
//!!! THIS IS ONLY HERE TO CLEAR OUT THE SCANNER FOR THE NEXT RUN OF THE LOOP !!! 
// WE DO THIS AS THE CARRIAGE RETURN IS LEFT IN THE BUFFER WHICH GENERATES AN ERROR ON READING IT
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
        //END
        System.out.println("Great job " + name + " on getting ten questions right. Congratulations, and have a good day!");   


    }

}
