/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an array of 10 strings.
 * Enter 8 strings from the keyboard and save them in the array.
 * Display the contents of the entire array (10 elements) on the screen in reverse order. Each element on a new line.
 * Requirements:
 * The program must create an array of 10 strings.
 * The program should read 8 strings for the array from the keyboard.
 * The program should display 10 strings, each on a new line.
 * The array of strings (10 elements) must be displayed in the reverse order.
 * [OBJECTIVE]
 */

package ji.assignmentstringarrayflip;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Array List: String Array Flip
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIAssignmentStringArrayFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Create an array and populate it with user input. Print the array.

           //Initialize Scanner
           Scanner kb = new Scanner(System.in);  
           //Declare VARs
           final int ARRAY_SIZE_BCKWRDS = 10;
           
           //Create an array of Strings
           String[] strBack = new String[ARRAY_SIZE_BCKWRDS];
           
           //For Loop to Define the Array
           for (int indexBck = 0; indexBck < 8; indexBck++)
           {
               //Ask the user for the value to put into the array element 
               System.out.println("Enter Strings For The Array: ");
               strBack[indexBck] = kb.nextLine();
           }
           
           
           
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
           
           //Print the values in the array using enhanced FOR-LOOP
           //NB: THE ENHANCED LOOP IS NOT USEFUL IN THIS CASE AS IT GOES INHERENTLY FORWARD
           for (int indexBck = ARRAY_SIZE_BCKWRDS - 1; indexBck >= 0; indexBck--)
           {
               //Print the numbers

           System.out.println("\n" + strBack[indexBck]);
           
           }
    }
}
