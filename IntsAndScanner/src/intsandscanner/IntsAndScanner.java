/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intsandscanner;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Scanners & Integers Interact
 * @version: 1.0 
 * @since May 20, 2020
 */
public class IntsAndScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner kb = new Scanner(System.in);
        
///WHEN USING A SCANNER AND AN INTEGER BE SURE TO: 1) PLACE THE SCANNER BEFORE THE INT 2) CALL THE nextLine twice 3) Just use the kb.next(); command (this is more vague and isn't string specific but would work) 4)WRAP THE SCANNER IN A Integer.parseInt:
//WHEN THE USER ENTERS THE INTEGER BEFORE THE STRING IT STORES THE NUMBER IN THE BUFFER, THE NEXTINT TAKES THE NUMERIC INPUT, THE NEXT LINE COMMAND WOULDN'T WORK AS IT ALREADY SEES THE CARRIAGE RETURN LEFT IN THE BUFFER (THIS IS BECAUSE nextLine reads any characters while nextInt only reads the numbers)
    
//EX. 1 PLACE THE SCANNER BEFORE THE INT
//Ask the user to enter a number
   System.out.println("Please Enter a word:");
   //Pull the user input into the memory buffer
   String word;
   word = kb.nextLine();
   //Print the buffer contents
    System.out.println("You have entered the word: " + word);
   
   ///EXPECTING AN INTERGER AS INPUT
   //Ask the user to enter a number
   System.out.println("Please Enter a number:");
   //Pull the user input into the memory buffer
   int num = kb.nextInt();
   //Print the buffer contents
    System.out.println("You have entered the number: " + num);     
    
    ///EXPECTING A DOUBLE AS INPUT
       //Ask the user to enter a number
   System.out.println("Please Enter a decimal:");
   //Pull the user input into the memory buffer
   double dub = kb.nextDouble();
   //Print the buffer contents
    System.out.println("You have entered the decimal: " + dub);   
 
 ///////////////////////////////////////////////////////////////////////////////
    
 //EX. 2 Call the nextLine twice   
   ///EXPECTING AN INTERGER AS INPUT
   //Ask the user to enter a number
   System.out.println("Please Enter a number:");
   //Pull the user input into the memory buffer
   int num1 = kb.nextInt();
   //Print the buffer contents
    System.out.println("You have entered the number: " + num1);     
    
    ///EXPECTING A DOUBLE AS INPUT
       //Ask the user to enter a number
   System.out.println("Please Enter a decimal:");
   //Pull the user input into the memory buffer
   double dub1 = kb.nextDouble();
   //Print the buffer contents
    System.out.println("You have entered the decimal: " + dub1);  
    
 //Ask the user to enter a word
   System.out.println("Please Enter a word:");
   //Pull the user input into the memory buffer
   String word1;
   kb.nextLine();
   word1 = kb.nextLine();
   //Print the buffer contents
    System.out.println("You have entered the word: " + word1);
    
////////////////////////////////////////////////////////////////////////////////
    
 //EX. 3 Replace the kb.nextLine command with kb.next 
   ///EXPECTING AN INTERGER AS INPUT
   //Ask the user to enter a number
   System.out.println("Please Enter a number:");
   //Pull the user input into the memory buffer
   int num2 = kb.nextInt();
   //Print the buffer contents
    System.out.println("You have entered the number: " + num2);     
    
    ///EXPECTING A DOUBLE AS INPUT
       //Ask the user to enter a number
   System.out.println("Please Enter a decimal:");
   //Pull the user input into the memory buffer
   double dub2 = kb.nextDouble();
   //Print the buffer contents
    System.out.println("You have entered the decimal: " + dub2);  
    
 //Ask the user to enter a word
   System.out.println("Please Enter a word:");
   //Pull the user input into the memory buffer
   String word2;
   word2 = kb.next();
   //Print the buffer contents
    System.out.println("You have entered the word: " + word2);
    
////////////////////////////////////////////////////////////////////////////////

    }

}
