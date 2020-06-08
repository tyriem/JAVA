/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * TODO INSERT OBJECTIVE HERE
 *[OBJECTIVE]
 */


package loops;

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
        //Condition Controlled Loop / WHILE Loop - Loop that continues until a condition is met
        //FOR Loop - A count controlled loop, where the loop continues until a variable counter hits a set value
        //DO WHILE Loop -
        
        //////////////////////
        /// FOR LOOP LOGIC ///
        /////////////////////
        
        //[OBJECTIVE]: Say Hello 6 Times [OBJECTIVE]

        int counterHello;
        
        
        //THIS IS THE HEADER FOR OUR FOR LOOP
        //Steps in a FOR Loop: Initialize; Test; Update and after the initialization it loops through TEST & UPDATE
        for(counterHello = 0; counterHello < 6; counterHello++)
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
         
        //////////////////////
        ///WHILE LOOP LOGIC///
        /////////////////////     
        
        
    }

}
