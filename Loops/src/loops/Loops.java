/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * INTRODUCE THE LOGIC OF LOOPS (FOR, WHILE, DO-WHILE)
 *[OBJECTIVE]
 */


package loops;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Loops (Iteration & Deiteration)
 * @version: 1.0 
 * @since Jun 8, 2020
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Loops or Iteration is used when we need to reuse the same code again and again. It is a code structure that causes a statement or group of statements to repeat.
        
///FOR LOOP - A count controlled loop, where the loop continues until a variable counter hits a set value

        
        //////////////////////
        /// FOR LOOP LOGIC ///
        /////////////////////
        
        //[OBJECTIVE]: Say Hello 6 Times [OBJECTIVE]

        int counterHello;
        
        
        //THIS IS THE HEADER FOR OUR FOR LOOP
        //Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
        for(counterHello = 1; counterHello < 6; counterHello++)
           {
           System.out.println("Hello");
           } 
         //When you exit a loop the command after runs
         System.out.println("END");
        
         
        //[OBJECTIVE]: Print The numbers from 1 to 10 [OBJECTIVE] 
        
        //THIS IS THE HEADER FOR OUR FOR LOOP
        //Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
        //NB: We can declare and initialize the control variable inside the loop
        for(int counterNumber = 1; counterNumber <= 10; counterNumber++)
           {
          //NB: We can use the control variable inside the body of the loop
               System.out.println(counterNumber);
           } 
         //When you exit a loop the command after runs
         System.out.println("END");       
         
        //[OBJECTIVE]: Print The numbers from 2 to 10 Counting in Twos [OBJECTIVE] 
        
        //THIS IS THE HEADER FOR OUR FOR LOOP
        //Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
        //NB: We can declare and initialize the control variable inside the loop
        //IF WE WANT TO ADD IN INCREMENTS MORE THAN ONE WE USE += and THE AMOUNT WE WANT TO ADD EACH INCREMENT
        for(int counterDouble = 2; counterDouble <= 10; counterDouble+=2)
        {
          //NB: We can use the control variable inside the body of the loop
               System.out.println(counterDouble);
        } 
         //When you exit a loop the command after runs
         System.out.println("END");  

        //[OBJECTIVE]: Print The numbers from 10 to 0 Counting in Twos [OBJECTIVE] 
        
        //THIS IS THE HEADER FOR OUR FOR LOOP
        //Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
        //NB: We can declare and initialize the control variable inside the loop
        for(int counterReduce = 10; counterReduce >= 0; counterReduce-=2)
        {
          //NB: We can use the control variable inside the body of the loop
               System.out.println(counterReduce);
        } 
        //When you exit a loop the command after runs
        System.out.println("END"); 

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

        //////////////////////
        ///WHILE LOOP LOGIC///
        /////////////////////    
        
///WHILE LOOP - A condition controlled loop, a loop that continues until a condition is met / until it is false     

        //while (x<y), will loop and perform the contents until something in the code makes the statement false
        //A WHILE Loop is useful for INPUT VALIDATION cases such as when we want the user to try again, if don't know the number of times you want something to be done a WHILE Loop is handy
        
        int alpha = 1;
//NB. DO NOT PUT A SEMICOLON IN THE WHILE LOOP DECLARATION
        while (alpha <= 10)
        {
                 System.out.println(alpha);
//NB. YOU |NEED| TO UPDATE A WHILE LOOP IN THE LOOP OR IT WILL LOOP FOREVER
                 alpha++;
        }
        System.out.println("END"); 
        
////////////////////////////////////////////////////////////////////////////////
 
// OBJECTIVE: ASK THE USER FOR A NUMBER BETWEEN 13-19 (INCLUSIVE), if they do not let them try again with a WHILE Loop
//Initialize Scanner
       Scanner kb = new Scanner(System.in);

//Accept User Input: Age
       System.out.println("Please Enter a number between 13 - 19(INCLUSIVE): ");
       int age = kb.nextInt();
//Initialize the WHILE Loop To REJECT input outside of 13-19
        while ((age < 13) || (age > 19))
        {
                   System.out.println("Try Again...");  
                   System.out.println("Please Enter a number between 13 - 19(INCLUSIVE): ");
//NB. We |HAVE| To give the user a way out of the Loop so here we accept their input again 
                   age = kb.nextInt();
        }
        System.out.println("You Have Entered The Age: " + age);

////////////////////////////////////////////////////////////////////////////////
//Accept User Input: Gender
       System.out.println("Please Enter Your Gender: ");
       String gender = kb.nextLine();
//Initialize the WHILE Loop To REJECT input outside of M or F
        while ((gender != "M") || (gender != "F") || (gender != "Attack Helicopter"))
        {
                   System.out.println("Try Again...");  
                   System.out.println("Please Enter Your Gender: ");
//NB. We |HAVE| To give the user a way out of the Loop so here we accept their input again 
                   gender = kb.nextLine();
        }
        System.out.println("You Have Entered The Gender: " + gender);
        
 
        //////////////////////
        ///WHILE LOOP LOGIC///
        ///    SENTINEL    ///
        /////////////////////   
        
        
        //Program to add up a series of positive numbers entered by the user
        //but we don't know how many
        
        int numberValue, total=0;
        
        System.out.println("Please enter the first number (or -1 to end): ");
        numberValue = kb.nextInt();
        total += numberValue;
        
        //BE SURE TO: Tell the user what to enter when they finish with their numbers
        //The sentinel value can be any value as long as its outside of the range
                
        while (numberValue != -1)
        {
            System.out.println("Please enter another number (or -1 to end): ");
            numberValue = kb.nextInt();
            total += numberValue;
                    
        }
        //Fix the -1 that shouldn't be in the total
        total ++;
        
        System.out.println("The total is: " + total);
        

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

        //////////////////////////
        ///DO WHILE LOOP LOGIC///
        ////////////////////////     

///DO-WHILE LOOP - A post-test loop, a loop that continues until a condition is met / until it is false that is guaranteed to run at least once.    
        
///THERE IS ONLY ONE DIFFERENCE BETWEEN A WHILE AND A DO-WHILE LOOP
//A WHILE LOOP is good if you want the option for the code in the loop to never run
//A DO-WHILE LOOP always runs the inside of the loop |at least once|


/* WHILE LOOP VERSION
   int xray = 1;
   while (xray < 0)
    {
    System.out.println(xray);
    }
 */

//DO-WHILE LOOP VERSION

   int yankee = 1;
   do
     {
     System.out.println(yankee);
     } while (yankee < 0);

////////////////////////////////////////////////////////////////////////////////

//Accept User Input: Number Age
       System.out.println("Please Enter a number between 13 - 19(INCLUSIVE): ");
       int doAge = kb.nextInt();
//Initialize the DO-WHILE Loop To REJECT input outside of 13-19
       do
         {
         System.out.println("Please Enter a number between 13 - 19(INCLUSIVE): ");
         doAge = kb.nextInt();
         } while ((doAge < 13) || (doAge > 19));

        System.out.println("You Have Entered The Age: " + doAge);

////////////////////////////////////////////////////////////////////////////////
        
        /////////////////////////
        ///DO-WHILE LOOP LOGIC///
        ///     SENTINEL      ///
        ////////////////////////   
        
        
        //Program to add up a series of positive numbers entered by the user
        //but we don't know how many
        
        int numberValueDo, totalDo=0;
        
        System.out.println("Please enter the first number (or -1 to end): ");
        numberValueDo = kb.nextInt();
        totalDo += numberValueDo;
        
        //BE SURE TO: Tell the user what to enter when they finish with their numbers
        //The sentinel value can be any value as long as its outside of the range
                
        while (numberValueDo != -1)
        {
            System.out.println("Please enter another number (or -1 to end): ");
            numberValueDo = kb.nextInt();
            total += numberValueDo;
                    
        }
        //Fix the -1 that shouldn't be in the total
        totalDo ++;
        
        System.out.println("The total is: " + totalDo);
        
        
    }

}
