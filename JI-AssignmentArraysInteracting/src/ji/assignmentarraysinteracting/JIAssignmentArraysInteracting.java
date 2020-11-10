/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an array of 10 strings.
 * Create an array of 10 numbers.
 * Enter 10 strings from the keyboard, and put them in an array of strings.
 * In each element of the number array, record the length of the string whose string array index coincides with the current index of the number array.
 * Display the contents of the number array, each value on a new line.
 * Requirements:
 * The program must create an array of 10 strings.
 * The program must create an array of 10 integers.
 * The program should read strings for the array from the keyboard.
 * The program must record the lengths of the strings in the number array, and then display them on the screen.
 * [OBJECTIVE]
 */

package ji.assignmentarraysinteracting;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Array List: Interacting Arrays
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIAssignmentArraysInteracting {

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
           for (int indexBck = 0; indexBck < ARRAY_SIZE_BCKWRDS; indexBck++)
           {
               //Ask the user for the value to put into the array element 
               System.out.println("Enter Strings For The Array: ");
               strBack[indexBck] = kb.nextLine();
           }
           
           //Create an array of integers
           int[] numBack = new int[ARRAY_SIZE_BCKWRDS];
           
           //For Loop to Define the Array
           for (int indexBck = 0; indexBck < ARRAY_SIZE_BCKWRDS; indexBck++)
           {
               //Feed length of String Array values into Number Array
               numBack[indexBck] = strBack[indexBck].length();
           }
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
           
           //Print the values in the array using enhanced FOR-LOOP
           //NB: THE ENHANCED LOOP IS NOT USEFUL IN THIS CASE AS IT GOES INHERENTLY FORWARD
           for (int indexBck = ARRAY_SIZE_BCKWRDS - 1; indexBck >= 0; indexBck--)
           {
               //Print the numbers

           System.out.println("\n" + numBack[indexBck]);
           
           }
    }
}