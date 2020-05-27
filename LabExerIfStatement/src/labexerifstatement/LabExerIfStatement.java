/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package labexerifstatement;

//Import Scanner
import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: If Statements
 * @version: 1.0 
 * @since May 22, 2020
 */
public class LabExerIfStatement {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
        Scanner kb = new Scanner(System.in);
        //Ask the user to enter their speed
        System.out.println("What speed was the vehicle traveling?");
          //Pull the user input into the memory buffer
          int speed = kb.nextInt();
          //Assign the SpeedLimit as Int
           int speedLimit = 60;
           
           //If user exceeds speedLimit     
           if (speed > speedLimit)
               
           //WE TAB IN ONCE IF THE CODE RUNS DUE TO SOMETHING IN THE PROGRAM, IN THIS CASE THE IF STATEMENT
           //UNLIKE SIMPLIER LANGUAGES SUCH AS PYTHON,JUST BECAUSE A STATEMENT HAPPENS AFTER AN IF DOES NOT MAKE IT CONDITIONAL, TO MAKE SURE IT IS PUT IT IN {}
           //Print Too Fast if condition met
           {
               System.out.println("You are driving ");
               System.out.println("TOO FAST");
           }
           //Print generic statement outside of if-loop 
            System.out.println("Nice Car!");
    }

}
