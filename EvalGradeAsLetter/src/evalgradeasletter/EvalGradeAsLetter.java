/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evalgradeasletter;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Evaluating Numerical Grade as Letter Grade
 * @version: 1.0 
 * @since May 25, 2020
 */
public class EvalGradeAsLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF NUMBERS
        System.out.println("Enter Your Test Score: ");
          //Pull the user input into the memory buffer
          int grade = kb.nextInt();

           //EVALUATE THE INPUT GRADE 

           if (grade < 60)
              {
              System.out.println("YOUR GRADE IS AN F");
              }
           else if (grade < 70 && grade >= 60 )
              {
              System.out.println("YOUR GRADE IS AN D");
              }
           else if (grade < 80 && grade >= 70 )
              {
              System.out.println("YOUR GRADE IS AN C");
              }
           else if (grade < 90 && grade >= 80 )
              {
              System.out.println("YOUR GRADE IS AN B");
              }
           else if (grade < 100 && grade >= 90 )
              {
              System.out.println("YOUR GRADE IS AN A");
              }
           else
              System.out.println("");  
    }

}
