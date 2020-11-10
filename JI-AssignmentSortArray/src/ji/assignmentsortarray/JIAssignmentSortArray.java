/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Create an array of 15 integers.
 * Populate it with values ​​from the keyboard.
 * Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
 * Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
 * Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."
 * Note:
 * The house at index 0 is considered even.
 * Requirements:
 * The program must create an array of 15 integers.
 * The program should read numbers for the array from the keyboard.
 * The program should display "Odd-numbered houses have more residents." if the sum of odd array elements is greater than the sum of even ones.
 * The program should display "Even-numbered houses have more residents." if the sum of even array elements is greater than the sum of odd ones.
 * [OBJECTIVE]
 */

package ji.assignmentsortarray;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Array List: Sorting Arrays (Evens & Odds)
 * @version: 1.0 
 * @since Nov 10, 2020
 */
public class JIAssignmentSortArray {

    /**
     * @param args the command line arguments
     */
    
    //psvm
    public static void main(String[] args) {
        
           //Declare VARs
           int totalSum = 0;
           int evenSum = 0;
           int oddSum = 0;
           
           //Initialize Scanner
           Scanner kb = new Scanner(System.in);  
           //Declare VARs
           final int ARRAY_SIZE = 15;
           
           //Create an array of integers
           int[] numHouses = new int[ARRAY_SIZE];
           
           //For Loop to Define the Array
           for (int indexHouse = 0; indexHouse < ARRAY_SIZE; indexHouse++)
           {
               //Ask the user for the value to put into the array element 
               System.out.println("Enter Numbers of Residents in each House in the Array: ");
               numHouses[indexHouse] = kb.nextInt();
               //Add each element in the Array to the total
               totalSum += numHouses[indexHouse];
           }
           
           //For Loop to count the Even Number House Residents
           for(int indexHouse = 0; indexHouse < ARRAY_SIZE; indexHouse++)
		{
			if(numHouses[indexHouse] % 2 == 0)
			{
				evenSum = evenSum + numHouses[indexHouse]; 
			}
		}
           
           //For Loop to count the Odd Number House Residents
           for(int indexHouse = 0; indexHouse < ARRAY_SIZE; indexHouse++)
		{
			if(numHouses[indexHouse] % 2 != 0)
			{
				oddSum = oddSum + numHouses[indexHouse]; 
			}
		}		
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
           
           //Print the values in the array using enhanced FOR-LOOP
           for (int num : numHouses)
           {
               System.out.println(num);
           }
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
           
           //Print the totals of the arrays
           System.out.println("Total Number of Residents in neighborhood: " + totalSum);
           System.out.println("Total Number of Residents in Even Numbered Homes: " + evenSum);
           System.out.println("Total Number of Residents in Odd Numbered Homes: " + oddSum);
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
           
           //Compare the Two Totals and Print the Evaluation
           
           if (evenSum == oddSum)
            {
                System.out.println("The number of residents is equal among even and odd numbered houses.");
                
            }   
           
           else if (evenSum > oddSum)
            {
                System.out.println("Even-numbered houses have more residents.");
            }
           
           else if (oddSum > evenSum)
            {
                System.out.println("Odd-numbered houses have more residents.");
            }
           else
           {
               System.out.println("Invalid Input.");
           }
           
           System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    
}