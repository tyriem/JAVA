/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evalposnegvar;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Evaluate Variable as Positive Or Negative
 * @version: 1.0 
 * @since May 25, 2020
 */
public class EvalPosNegVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
        Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF NUMBER
        System.out.println("What is the number that you are evaluating?");
          //Pull the user input into the memory buffer
          double value = kb.nextInt();
          
           //Evaluate the input value as positive or negative   
           if (value < 0)
              {
              System.out.println("THE VALUE IS NEGATIVE");
              }
           else if (value == 0)
                   {
                   System.out.println("THE VALUE IS ORIGIN");    
                   }
                           else
                     System.out.println("THE VALUE IS POSITIVE");  
    }

}
