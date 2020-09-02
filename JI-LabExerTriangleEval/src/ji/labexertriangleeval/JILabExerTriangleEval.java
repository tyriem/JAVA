/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.labexertriangleeval;
//Import Java Utils
import java.util.*;
//Import Java Math
import java.lang.Math; 

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Triangle Evaluator
 * @version: 1.0 
 * @since Sep 1, 2020
 */
public class JILabExerTriangleEval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TASK: [Prime Number Evaluator]

    // Call Scanner to Mem Buffer
    Scanner kb = new Scanner(System.in); 

     
    
    //Ask the user to input unit
     System.out.println("Please enter the unit of measurement for the triangle: (c)entimeter, (i)nch, (m)eter");
     

     
     ////Pull the user input into the memory buffer
       //Accept The Raw User Input
       String measure = kb.nextLine();

     
       
     //Ask the user to enter the length of the first side
     System.out.println("Please enter the length of the first side: ");
     
     //Pull the user input into the memory buffer
     double valSideA = kb.nextDouble();
     
     //Ask the user to enter the length of the second side
     System.out.println("Please enter the length of the second side: ");
     
     //Pull the user input into the memory buffer
     double valSideB = kb.nextDouble();
     
      //Ask the user to enter the length of the third side
     System.out.println("Please enter the length of the third side: ");
     
     //Pull the user input into the memory buffer
     double valSideC = kb.nextDouble();
     
     //Calc the perimeter
     double perim = ((valSideA + valSideB + valSideC)/2);
     
     //Calc the area
     //double area = (Math.sqrt());
     double area = (Math.sqrt(perim*(perim - valSideA)*(perim - valSideB)*(perim - valSideC)));
     System.out.println( "---------------------------------------------------");
     // Logic for Prime
        if (valSideA + valSideB > valSideC && valSideA + valSideC > valSideB  && valSideB + valSideC > valSideA)
          {
          System.out.println( "The figure measuring: " + valSideA + " , " + valSideB + " , "+ valSideC + " " + measure + " is a valid triangle ");
          System.out.println( "Its area would be: " + area + " " + measure + "^2");
          }
     // Logic for Invalid Input Error
        else 
            {  
            System.out.println("You have input an invalid Triangle. Please Try Again.");
            }
    }

}
