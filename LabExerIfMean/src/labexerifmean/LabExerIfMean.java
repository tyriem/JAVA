/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package labexerifmean;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: If Loops as Output of Mean Calculation
 * @version: 1.0 
 * @since May 27, 2020
 */
public class LabExerIfMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF GRADES
        System.out.println("Enter the first test score: ");
          //Pull the user input into the memory buffer
          double testScore1 = kb.nextInt();
        System.out.println("Enter the second test score: ");
          //Pull the user input into the memory buffer
          double testScore2 = kb.nextInt();
          System.out.println("Enter the third test score: ");
          //Pull the user input into the memory buffer
          double testScore3 = kb.nextInt();
           //WE USE TOTAL INSTEAD OF SUM AS SUM HAS A SPECIFIC MEANING IN SOME PROGRAMMING LANGUAGE  
           double total = ((testScore1 + testScore2 + testScore3)/3);
           
           //PRINT THE GRADE AVERAGE
           System.out.println("The average of the test scores is " + Math.round(total) + "%");
           //EVALUATE THE INPUT GRADE 

           if (total < 60)
              {
              System.out.println("You Failed...");
              }
           else if (total <= 80 && total >= 60 )
              {
              System.out.println("Well Done!");
              }
           else if (total <= 100 && total > 80 )
              {
              System.out.println("Great Job!");
              }
           else
              System.out.println("INVALID SCORE");  
    }

}
