/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
 * The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
 * Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
 * In the main() method read the count from the console and call the method readIntegers() with the count parameter. 
 * Then call the findMin() method passing the array returned from the call to the readIntegers() method.
 * Finally, print the minimum element in the array.
 * Tips: 
 * Assume that the user will only enter numbers, never letters. 
 * For simplicity, create a Scanner as a static field to help with data input
 * Create a new console project with the name /eMinElementChallenge/f
 * [OBJECTIVE]
 */

package ji.assignmentminelement;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Minimum Element Challenge
 * @version: 1.0 
 * @since Nov 5, 2020
 */
public class JIAssignmentMinElement {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Set VAR count to amount of elements for the array
    final int count = 6;
    
    //Create array VAR: myArray
    int[] myArray;
    
    //Obtain the array in the method read Integers
    myArray = readIntegers(count);
    
    //Print pre-amble to array
    System.out.print(" The values in the array are: ");
    // Print the values in the array.
    for (int i = 0; i < myArray.length; i++)
        {
           System.out.print(myArray[i] + " ");
        }
    //Calling findMin() method 
    int min = findMin(myArray);
    //Print the minimum value found in findMin
    System.out.println("\n The Minimum Value of the Array is: " + min); 
    
    }
    
////////////////////////////////////////////////////////////////////////////////    
    
    //DECLARE METHOD: readIntegers
    public static int[] readIntegers(int count) {
        
           //Initialize Scanner
           Scanner kb = new Scanner(System.in);  
           
           //Create an array of integers
           int[] numUser = new int[count];
           
           // FOR-LOOP to define the Array
           for (int indexUser = 0; indexUser < count; indexUser++)
           {
               //Ask the user for the value to put into the array element 
               System.out.println("Enter Numbers For The Array: ");
               //Take the user's input into the Array
               numUser[indexUser] = kb.nextInt();
           }
           
           
    //RETURN the Array's elements
    return numUser;
    }   
    
////////////////////////////////////////////////////////////////////////////////
    
    //DECLARE METHOD: findMin
    public static int findMin(int[] myArray) {
    // Set VAR minVal to the start of the Array
            int minVal = myArray[0];
    // Loop through the Array and compare each value against the start
    // If it is less then replace the Var, if it is more or the same continue looping
            for (int i=1;i<myArray.length;i++){
                if(myArray[i] < minVal){
                    minVal = myArray[i];
                }

            }
    
    //RETURN the value found after the loop executes
    return minVal;
    }  


////////////////////////////////////////////////////////////////////////////////    
}
