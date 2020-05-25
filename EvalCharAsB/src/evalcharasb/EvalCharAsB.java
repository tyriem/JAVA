/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evalcharasb;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Evaluate If Typed Char is letter B
 * @version: 1.0 
 * @since May 25, 2020
 */
public class EvalCharAsB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
        Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF NUMBER
        System.out.println("Enter The Letter 'B'?");
          //Pull the user input into the memory buffer
          String word = kb.nextLine();
          char letter = word.charAt(0);
           //Evaluate the input value as positive or negative   
           if (letter == 'B')
              {
              System.out.println("YOU HAVE CORRECTLY TYPED THE LETTER B");
              }
           else
                     System.out.println("YOU HAVE INCORRECTLY TYPED THE LETTER B");  
    }

}
