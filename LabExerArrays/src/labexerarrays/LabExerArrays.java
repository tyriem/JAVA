/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create an array to store ten integer values and populate the array with any numbers you want.
 * Create an array. Write code that looks through the array and prints the running total.
 *[OBJECTIVE]
 */


package labexerarrays;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Creating Arrays
 * @version: 1.0 
 * @since Jun 18, 2020
 */
public class LabExerArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
//Task 1A: Create an array to store ten integer values and populate the array with any numbers you want.
        int[] intArray = {74, 55, 16, 1, 82, 23, 45, 94, 5, 93};

        //Print Array Elements Individually
        System.out.println("Element #1 of The Array is " + intArray[0]);
        System.out.println("Element #2 of The Array is " + intArray[1]);
        System.out.println("Element #3 of The Array is " + intArray[2]);
        System.out.println("Element #4 of The Array is " + intArray[3]);
        System.out.println("Element #5 of The Array is " + intArray[4]);
        System.out.println("Element #6 of The Array is " + intArray[5]);
        System.out.println("Element #7 of The Array is " + intArray[6]);
        System.out.println("Element #8 of The Array is " + intArray[7]);
        System.out.println("Element #9 of The Array is " + intArray[8]);
        System.out.println("Element #10 of The Array is " + intArray[9]);
        System.out.println("END");  
        //Special FOR-LOOP to address Array Elements used to Print its Elements Collectively
        for(int x: intArray)
        {
        System.out.println(x);
        } 
        System.out.println("END");
////////////////////////////////////////////////////////////////////////////////
//Task 1B: Create an array and populate it with 10 random integers. Print the array.
        final int ARRAY_SIZE = 10;
        int[] numRand = new int[ARRAY_SIZE];
        Random rndNum = new Random();
        
        for (int index=0;index<numRand.length;index++)
        {
        //Assign a random value into the array element    
           numRand[index] = rndNum.nextInt(100)+1;  
        //Print out the value in the array element   
           System.out.println(numRand[index]);
        }
        System.out.println("END");
////////////////////////////////////////////////////////////////////////////////
//Task 2: Create an array. Write code that looks through the array and prints the running total.
        int[] sumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        //Getting the total of the numbers in an array
        for (int index=0; index < sumArray.length; index++)
        {
          total += sumArray[index];  
        }     
        //Print Total
        System.out.println("The total of The Array is " + total);
        System.out.println("END");
////////////////////////////////////////////////////////////////////////////////

    }

}
