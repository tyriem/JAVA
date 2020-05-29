/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


 /*
OBJECTIVE: Write some code that	asks the user for two numbers and calculates the difference	
between	them. Your code	must always subtract the smaller from the larger number.
  */
package pracexerprogflowif;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Controlling Program Flow (IF,ELSE IF, ELSE STATEMENTS): Difference Calculator
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerProgFlowIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF INTEGERS
          System.out.println("Enter the first number: ");
          //Pull the first user input into the memory buffer
           int numberOne = kb.nextInt();
          System.out.println("Enter the second number: ");
          //Pull the second user input into the memory buffer
           int numberTwo = kb.nextInt();
  
//EVALUATE THE DIFFERENCE
//Set condition for if num1 > 2
if (numberOne > numberTwo)
{
System.out.println("The Difference Is: " + (numberOne - numberTwo));   
}
//Set condition for if num2 > 1
else if (numberTwo > numberOne)
{
System.out.println("The Difference Is: " + (numberTwo - numberOne));     
}
//Set condition for if num1 == 2
else if (numberOne == numberTwo)
System.out.println("The Difference Is: " + (numberOne - numberOne)); 
    }

}
