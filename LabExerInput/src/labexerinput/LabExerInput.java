/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package labexerinput;

//YOU MUST IMPORT java.util.Scanner here to tell the Java Compiler where to find the scanner class
import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Animals & Colors You Like
 * @version: 1.0 
 * @since: 05-18-2020
 */
public class LabExerInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
   Scanner kb = new Scanner(System.in);
   
                  ///EXPECTING A STRING AS INPUT
       //Ask the user to enter a type of animal
   System.out.println("Please Enter the name of a type of animal:");
   //Pull the user input into the memory buffer
   String anim = kb.nextLine();
          //Ask the user for a color
   System.out.println("Please Enter the name of a color:");
   //Pull the user input into the memory buffer
   String col = kb.nextLine();
   //Print the buffer contents
    System.out.println("You like " + col + " " + anim + "s"); 
    }

}
