/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmentuseringreetcalc;
//Import Scanner
import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Assignment: User Input Greet & Calc
 * @version: 1.0 
 * @since May 21, 2020
 */
public class AssignmentUserInGreetCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
// Call Scanner to Mem Buffer
    Scanner kb = new Scanner(System.in); 
    
/// TASK 2A: GREET USER
     //Ask the user to enter their name
     System.out.println("What is your name?");
     //Pull the user input into the memory buffer
     String name;
     name = kb.nextLine();
     //PRINT Greeting to User
     System.out.printf("Hello User: %s Thank You For Logging in", name);
     
////////////////////////////////////////////////////////////////////////////////     
     
/// TASK 2B: Calc Next Birthday
         //Ask the user to enter their age
          System.out.println(" \n How old are you?");
          //Pull the user input into the memory buffer
          int age;
          age = kb.nextInt();
          int ageAdd = age + 1;
          //PRINT Next Birthday
          System.out.printf("On your next birthday you will be %d years old", ageAdd);

////////////////////////////////////////////////////////////////////////////////

/// TASK 2C: Calc Sum of Input
            //Ask the user to enter their numbers
            System.out.println(" \n Please Enter The First Number: ");
            //Pull the user input into the memory buffer
            double x ;
            x = kb.nextDouble();
            //Ask the user to enter their numbers
            System.out.println(" \n Please Enter The Second Number: ");
            //Pull the user input into the memory buffer
            double y ;
            y = kb.nextDouble();
            //Ask the user to enter their numbers
            System.out.println(" \n Please Enter The Third Number: ");
            //Pull the user input into the memory buffer
            double z ;
            z = kb.nextDouble();
          
            //Calculate the sum of X,Y,X VARs
            double sum = x + y + z;
          
            //PRINT Sum of X,Y,Z
            System.out.printf("The total is %f", sum);
    }

}
