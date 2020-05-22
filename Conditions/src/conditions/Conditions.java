/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conditions;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Conditions & Conditional Statements
 * @version: 1.0 
 * @since May 21, 2020
 */
public class Conditions {

    Scanner kb = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONDITIONAL STATEMENTS ARE STATEMENTS WHERE A RELATIONSHIP IS EVALUATED AND AN INTRINSIC OUTPUT IS GIVEN
        //CONDITIONAL STATEMENTS ALMOST ALWAYS EVALUATE TO TRUE OR FALSE, YOU CAN HAVE OTHER OUTPUTS BUT THAT IS BEYOND THE SCOPE OF Intro To Java
        ///CONDITIONAL EVALUATION THAT IS FALSE
       int age = 21;
       if (age < 18)
          System.out.println("TOO YOUNG TO BE");
        
        
////////////////////////////////////////////////////////////////////////////////
        ///CONDITIONAL EVALUATION THAT IS TRUE
           int speed = 100;
           int speedLimit = 60;
           
           //If user exceeds speedLimit
           //Tell user they have gone too fast
           if (speed > speedLimit)
           //WE TAB IN ONCE IF THE CODE RUNS DUE TO SOMETHING IN THE PROGRAM, IN THIS CASE THE IF STATEMENT
           //UNLIKE SIMPLIER LANGUAGES SUCH AS PYTHON,JUST BECAUSE A STATEMENT HAPPENS AFTER AN IF DOES NOT MAKE IT CONDITIONAL, TO MAKE SURE IT IS PUT IT IN {}
           {
               System.out.println("You are driving ");
               System.out.println("TOO FAST");
           }
            System.out.println("Driver.");
            
            
////////////////////////////////////////////////////////////////////////////////
       ///CONDITIONAL EVALUATION OF DRINKING AGE
       //BE SURE TO CHECK THE VALUE ITSELF IN THE IF STATEMENT (18 IN THIS CASE) AS THAT IS WHEN A STATEMENT IS EVALUATED
       //BE SURE NOT TO PUT A ; AT THE END OF THE IF, AS IT WILL EVALUATE AND JUST RUN THE NEXT LINE OF CODE
       int ageDrink = 16;
       if (ageDrink >= 18)
       {
          System.out.println("HAVE A BEER");
       }
       //WHERE THERE IS AN ELSE IT EXECUTES ITS CONTENTS WHEN THE IF IS NOT SATISFIED
       else
       {
          System.out.println("YOU ARE TOO YOUNG TO BE SERVED");
       }
////////////////////////////////////////////////////////////////////////////////
///CONDITIONAL EVALUATION OF USER INPUT OF AGE DRINKING AND GENDER
       Scanner kb = new Scanner(System.in);
       System.out.println("Please Enter Your Gender: (M OR F)");
       String gender = kb.nextLine();
       System.out.println("Please Enter Your Age:");
       int ageDrinkIn = kb.nextInt();
       if (ageDrinkIn >= 18)
               {
       //WE USE THE .EQUALS TO EVLAUATE THE CONTENTS OF THE GENDER BUFFER CORRECTLY AS A STRING INSTEAD OF AS A BOOL (WHICH IS THE CASE IF WE USE ==)            
       if (gender.equals("M"))
       {          
                     System.out.println("HAVE A BEER");
       }
         else
                     System.out.println("HAVE A GLASS OF WINE");  

               }
       else 
               System.out.println("YOU ARE TOO YOUNG TO BE SERVED HERE");
               }
    }

