/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evalevensorodds;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM & Group #2
 * @project: Intro To Java - Evaluate If The User Rolls an Even or an Odd Number
 * @version: 1.0 
 * @since May 26, 2020
 */
public class EvalEvensOrOdds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARE THE SCANNER
         Scanner kb = new Scanner(System.in);
        //
        System.out.println("Enter Your Number Roll: ");
        //PUT THE USER INPUT INTO THE MEM BUFFER
        int num = kb.nextInt();    
        //EVALUATE THE MODULUS FOR IF THE USER INPUT AN ODD OR AN EVEN
        if (num == 0)
           {
            System.out.println("YOU ROLLED A ZERO (ORIGIN)!");
           }
        else if (num % 2 == 0)  
           {
              System.out.println("YOU ROLLED AN EVEN NUMBER!");
           }
        else
           {
              System.out.println("YOU ROLLED AN ODD NUMBER!");
           } 
                
    }

}
