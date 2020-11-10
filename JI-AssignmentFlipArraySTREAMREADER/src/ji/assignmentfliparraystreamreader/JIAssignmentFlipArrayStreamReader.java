/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an array of 10 numbers.
 * Enter 10 numbers from the keyboard and write them to the array.
 * Display the elements of the array in reverse order. Display each value on a new line.
 * Requirements:
 * The program must create an array of 10 integers.
 * The program should read numbers for the array from the keyboard.
 * The program should display 10 values, each on a new line.
 * The array must be displayed in reverse order.
 * [OBJECTIVE]
 */



package ji.assignmentfliparraystreamreader;


//Import the Scanner
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


        
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Array List: Flip Array STREAM READER VERSION
 * @version: 2.0 
 * @since Nov 5, 2020
 */
public class JIAssignmentFlipArrayStreamReader {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /// INPUT STREAM READER 
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));



           //Declare VARs
           final int ARRAY_SIZE_BCKWRDS = 10;
           
           //Create an array of integers
           int[] numBack = new int[ARRAY_SIZE_BCKWRDS];
           
           //For Loop to Define the Array
           for (int indexBck = 0; indexBck < ARRAY_SIZE_BCKWRDS; indexBck++)
           {
               //Ask the user for the value to put into the array element 
               System.out.println("Enter Numbers For The Array: ");
               numBack[indexBck] = input.read();
           }
           
           //Print the values in the array using enhanced FOR-LOOP
           //NB: THE ENHANCED LOOP IS NOT USEFUL IN THIS CASE AS IT GOES INHERENTLY FORWARD
           for (int indexBck = ARRAY_SIZE_BCKWRDS - 1; indexBck >= 0; indexBck--)
           {
               //Print the numbers

           System.out.println("\n" + numBack[indexBck]);
           
           }
    }
}
