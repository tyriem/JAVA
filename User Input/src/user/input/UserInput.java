/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user.input;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - User Input By Keyboard [SCANNER]
 * @version: 1.0 
 * @since: 05-18-2020
*/
//YOU MUST IMPORT java.util.Scanner here to tell the Java Compiler where to find the scanner class
   import java.util.Scanner;

public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///Accepting user input by keyboard
//AFTER we import the scanner class we can then use Scanner to accept user input via keyboard
//YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
//WE USE THE NEW KEYWORD TO ALLOCATE A PLACE IN MEM FOR THAT VALUE TO GO AS THE KB HAS THE ADDRESS BUT YOU NEED TO PUT IT SOMEWHERE
   Scanner kb = new Scanner(System.in);
   
                   ///EXPECTING A STRING AS INPUT
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
        
    }

}
