/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * TODO INSERT OBJECTIVE HERE
 *[OBJECTIVE]
 */


package arraysloops;
import java.util.*;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Working With Arrays
 * @version: 1.0 
 * @since Jun 17, 2020
 */
public class ArraysLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Initialize Scanner
       Scanner kb = new Scanner(System.in);        
////////////////////////////////////////////////////////////////////////////////
//Task: Create an array and populate it with random numbers. Print the array.
        final int ARRAY_SIZE = 6;
        int[] numRand = new int[ARRAY_SIZE];
        Random rndNum = new Random();
        
        for (int index = 0 ; index < numRand.length ; index++)
        {
        //Assign a random value into the array element    
           numRand[index] = rndNum.nextInt(100)+1;  
        //Print out the value in the array element   
           System.out.println(numRand[index]);
        }
/* 
 * [DEPRECATED 06-17-20 | REDUNDANT]       
        numRand[0] = rndNum.nextInt(100)+1;
        numRand[1] = rndNum.nextInt(100)+1;
        numRand[2] = rndNum.nextInt(100)+1;
        numRand[3] = rndNum.nextInt(100)+1;
        numRand[4] = rndNum.nextInt(100)+1;
        numRand[5] = rndNum.nextInt(100)+1;
 * [DEPRECATED 06-17-20 | REDUNDANT] 
*/


////////////////////////////////////////////////////////////////////////////////
//Task: Create an array and populate it with user input. Print the array.
           //Declare VARs
           final int ARRAY_SIZE_USR = 6;
           
           //Create an array of integers
           int[] numUser = new int[ARRAY_SIZE_USR];
           
           for (int indexUser = 0; indexUser < ARRAY_SIZE_USR; indexUser++)
           {
               //Ask the user for the value into the array element 
               System.out.println("Enter Numbers For The Array: ");
               numUser[indexUser] = kb.nextInt();
           }
           
           //Print the values in the array using enhanced FOR-LOOP
           for (int num : numUser)
           {
               System.out.println(num);
           }
           
           
////////////////////////////////////////////////////////////////////////////////
//Task: Create an array and populate it with user input. Print the array backwards.


////////////////////////////////////////////////////////////////////////////////
//Task: Create an array and populate it with user input. Add the numbers in the array and print the sum.
           //Declare VARs
           final int ARRAY_SIZE_USR_SUM = 6;
           
           int totalSum = 0;
           //Create an array of integers
           int[] numUserSum = new int[ARRAY_SIZE_USR_SUM];
           
           for (int indexUserSum = 0; indexUserSum < ARRAY_SIZE_USR_SUM; indexUserSum++)
           {
               //Ask the user for the value into the array element 
               System.out.println("Enter The Numbers For The Array: ");
               numUser[indexUserSum] = kb.nextInt();
               //Add each element in the Array to the total
               totalSum += numUserSum[indexUserSum];
           }
           
           //Print the values in the array using enhanced FOR-LOOP
           for (int numSum : numUserSum)
           {
               System.out.println(numSum);
           }
           //Print the sum of the Array
           System.out.println("The sum of the elements in the array is: " + totalSum);
////////////////////////////////////////////////////////////////////////////////
//Task: Create arrays for people's names, ages and their favorite color. Print the arrays as one.
          final int ARRAY_SIZE_CLR = 3;
          
          
////////////////////////////////////////////////////////////////////////////////
//Task: Create arrays . Write code that looks through the array and prints the running total.
          int[] sumArray = {1, 2, 3, 4,5,6,7,8,9,10};
          int total = 0;
          //Getting the total of the numbers in an array
          for (int indexSum=0; indexSum < sumArray.length; indexSum++)
          {
            total += sumArray[indexSum];  
          }     
          //Print Total
          System.out.println("The total is " + total);
          
          
////////////////////////////////////////////////////////////////////////////////
//Task: Create array and find the largest value in the array. Print the largest.
          int[] largestArray = {1, 2, 3, 4,5,6,7,8,9,10};
          

          //When finding the smallest or largest we make an assumption to start where we set it at the first position of the index (0 in this case)
          int largestSoFar = largestArray[0];
          //Getting the total of the numbers in an array
          for (int indexLargest=0; indexLargest < largestArray.length; indexLargest++)
          {
            if (largestArray[indexLargest] > largestSoFar)
            {
                largestSoFar = largestArray[indexLargest];
            }    
          }     
          //Print Largest Numner
          System.out.println("The largest number is " + largestSoFar);   
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//Task: Create array and find the smallest value in the array. Print the largest.
          int[] smallestArray = {1, 2, 3, 4,5,6,7,8,9,10};
          

          //When finding the smallest or largest we make an assumption to start where we set it at the first position of the index (0 in this case)
          int smallestSoFar = smallestArray[0];
          //Getting the total of the numbers in an array
          for (int indexSmall=0; indexSmall > smallestArray.length; indexSmall++)
          {
            if (smallestArray[indexSmall] > smallestSoFar)
            {
                smallestSoFar = smallestArray[indexSmall];
            }    
          }     
          //Print Largest Numner
          System.out.println("The smallest number is " + smallestSoFar);   
////////////////////////////////////////////////////////////////////////////////
//Task: Create array and bubble sort it. Print the sorted array.
    }

}
