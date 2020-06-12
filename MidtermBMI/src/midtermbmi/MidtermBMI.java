/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Accept user input, perform a calculation, and output appropriate response.
 *[OBJECTIVE]
 */


package midtermbmi;
//Before we invoke user input class we must import the JAVA Utility Scanner
import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Midterm Evaluation: BMI Calculator
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class MidtermBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //init Scanner
       Scanner kb = new Scanner(System.in); 
       
       //Prompt the user to input their name
       System.out.println("Please Enter Your Name: ");
       //Declare the Variable name & Pull the user's input into the mem buffer
       String name = kb.nextLine();
       
       System.out.println("Please Enter Your Weight (In Pounds): ");
       //Declare the Variable weight & Pull the user's input into the mem buffer
       double weight = kb.nextDouble();
       
       System.out.println("Please Enter Your Height (In Inches): ");
       //Declare the Variable weight & Pull the user's input into the mem buffer
       double height = kb.nextDouble();
       
       //Calculate the user's bmi using the formula: BMI = Weight X 703 / Height^2
       double bmi = ((weight * 703) / (height * height));
       
       //PRINT the User's BMI
       System.out.println("Your BMI is calculated at: " + bmi);
       
       ///////////////////////////
       //  BMI Classification   //
       //////////////////////////
       
       
       //IF, ELSE IF, ELSE STATEMENT FOR USER'S WEIGHT CLASSIFICATION

       //If statement for BMI underweight
       if (bmi < 18.5)
       {
          System.out.println("Your current BMI as calculated indicates that you are underweight, " + name + "."); 
       }
       //Else If statement for BMI optimal weight
       else if (bmi >= 18.5 && bmi <= 25)
       {
          System.out.println("Your current BMI as calculated indicates that you are at optimal weight, " + name + "."); 
       }
       //Else If statement for BMI overweight       
       else if (bmi > 25)
       {
          System.out.println("Your current BMI as calculated indicates that you are overweight, " + name + "."); 
       }
       //Else statement for invalid input
       else
       {
          System.out.println("One or more of your inputs was invalid, please try again, " + name + "."); 
       }           
       
      
    }

}
