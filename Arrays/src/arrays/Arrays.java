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


package arrays;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Arrays
 * @version: 1.0 
 * @since Jun 15, 2020
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //When we create a var we declare the type and we give them a unique name
        //Data-structure (place to put data) that stores multiples of the SAME DATA TYPE
        //In JAVA, when we init. an array it initializes all values in the array as 0 if empty in an array of integers or 0.0 in floats
        //If you try to call an element of an array outside of its index (0,1,2,3,...) you will get an out of bound error
        
        //Integer Declaration
        int number;
        number = 5;
        System.out.println(number);
        
//Integer ARRAY DECLARATION
        //An Array is not a class but as a data structure we need to declare new
        
        //TASK: Create an integer array to store 3 values
        int[] numbers = new  int[3];
        
        numbers[0] = 1;
        numbers[1] = 9;
        numbers[2] = -2;
        
        //Print the value of the first element in the array
        System.out.println(numbers[0]);
        //Print the value of the second element in the array
        System.out.println(numbers[1]);
        //Print the value of the third element in the array
        System.out.println(numbers[2]);
        //If we go further we will get an out of bounds error      
        //System.out.println(numbers[3]);
   
//Float ARRAY DECLARATION
        float[] floaters = new float[6];
        
        floaters[0] = 1f;
        floaters[1] = 2f;
        floaters[2] = 3f;
        floaters[3] = 4f;
        floaters[4] = 5f;
        

        System.out.println(floaters[0]);
        System.out.println(floaters[1]);
        System.out.println(floaters[2]);        
        
//Double ARRAY DECLARATION
        double[] decimals = new double[6];
        
        decimals[0] = 1;
        decimals[1] = 2;
        decimals[2] = 3;
        decimals[3] = 4;
        decimals[4] = 5;
        

        System.out.println(decimals[0]);
        System.out.println(decimals[1]);
        System.out.println(decimals[2]);

//Char ARRAY DECLARATION
        char[] alpha = new char[26];

        alpha[0] = 'a';
        alpha[1] = 'b';
        alpha[2] = 'c';
        alpha[3] = 'd';
        alpha[4] = 'e';
        

        System.out.println(alpha[0]);
        System.out.println(alpha[1]);
        System.out.println(alpha[2]);

//MAKING AN ARRAY WITH SIMPLE DEFINITION      
        //We can define an array without referencing the index but then we have to remember the index ourselves
        double height[] = {5.5,4.9,6.2};
        System.out.println(height[1]);
 
//MAKING A COMPLEX ARRAY
        //We can define an array with multiple dimensions (multidimension array/complex array)
        int[][] complexArray = {{3,6,9},{5,10,15},{9,18,27}};
        //NB: First [] sets the array you want to access and the second sets the element in that array you want
        System.out.println(complexArray[1][1]);

//MAKING A SIMPLE ARRAY FROM A COMPLEX ARRAY
        for (int[] mySimpleArray : complexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
        }

        
//MAKING AN ARRAY WITH LIMITS DEFINED BY USER       
       //Initialize Scanner
       Scanner kb = new Scanner(System.in);  
       
       //Ask the user to enter the size of the array
       //Ask the user to enter the size of the array
       System.out.println("Please Enter The Number Of Elements: ");
       int numOfElements = kb.nextInt();
       
       //Create an integer array (size to be determined by the user)
       
       int[] numbersUser = new int[numOfElements];

        //TO ITERATE THROUGH THE ARRAY WE USE A FOR LOOP IN THIS CASE AS WE DO NOT KNOW THE LIMITS OF THE ARRAY BEFORE THE USER SETS IT
        //When we set a counter in an array instead of counter we use index or i
               for(int index = 0; index < numOfElements; index++)
               {
               System.out.println(numbersUser[index]);
               } 
               
////////////////////////////////////////////////////////////////////////////////               
//Task: Create an array, specify the number of elements

        int[] numeros = new int[5];
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
               //Here we use the .length as it will always model to the amount of values in the index             
               for(int indexNumerous = 0; indexNumerous < numeros.length; indexNumerous++)
               {
               System.out.println(numeros[indexNumerous]);
               } 
////////////////////////////////////////////////////////////////////////////////
//Task: Use the special FOR-LOOP for arrays

        int[] digits = new int[5];
        
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;
        digits[3] = 4;
        digits[4] = 5;
        
               //Here we use the special ARRAY FOR-LOOP   
               //NB: WE CAN'T ALWAYS USE THIS
               for(int x: digits)
               {
               System.out.println(x);
               } 


    }

}
