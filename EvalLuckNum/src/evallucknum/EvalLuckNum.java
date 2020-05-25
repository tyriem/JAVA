/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evallucknum;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Evaluate Two Numbers' Sum Against Lucky 7
 * @version: 1.0 
 * @since May 25, 2020
 */
public class EvalLuckNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF NUMBERS
        System.out.println("Enter A NUMBER: ");
          //Pull the user input into the memory buffer
          double number1 = kb.nextInt();
        System.out.println("Enter Another NUMBER: ");
          //Pull the user input into the memory buffer
          double number2 = kb.nextInt();
           //WE USE TOTAL INSTEAD OF SUM AS SUM HAS A SPECIFIC MEANING IN SOME PROGRAMMING LANGUAGE  
           double total = (number1 + number2);
           if (total == 7)
              {
              System.out.println("YOU HIT THE LUCKY NUMBER!");
              }
           else if (total < 7)
              {
              System.out.println("YOU WERE ALMOST THERE...");  
              }
           else
              System.out.println("YOU COMPLETELY LOST!");  
    }

}
