/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package userinputrelops;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - User Input & Evaluation of Relational Operators
 * @version: 1.0 
 * @since May 20, 2020
 */
public class UserInputRelOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);    
  
//Accept the Input of two values from the user

//Ask the user to enter a number
       System.out.println("Please Enter The First Number:");
//Pull the user input into the memory buffer
       double num1 = kb.nextInt();
//Ask the user to enter a second number
       System.out.println("Please Enter The Second Number:");
//Pull the user input of the second number into the memory buffer
       double num2 = kb.nextInt(); 
  
//Evaluate the numbers relationship with (num1 == num2)
   
//Print the buffer contents
             System.out.print("The relationship " + num1 + " is equal to " + num2 + " is " + (num1 == num2));  
     
    }

}
