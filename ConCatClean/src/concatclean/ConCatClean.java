/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concatclean;

/**
 *
 * @author T
 * @coder: TMRM
 * @project: Intro To Java - Concatenation Formatting
 * @version: 1.0 
 * @since May 19, 2020
 */
public class ConCatClean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numCats = 4;
        int numDogs = 6;
//WITH MATHEMATIC CONSTANTS CONSIDER SETTING IT AS FINAL AND UPPERCASE
        final double PI = 3.14159257;
        final double THOUSAND = 1000;
        
        String varName = "Tyrie";
        
        
//THE BASIC WAY OF CONCATENATING THE ABOVE VARIABLES        
        System.out.println("I have " + numCats + " Cats");
        System.out.println("I have " + numDogs + " Dogs");

///DISPLAYING FORMATTED OUTPUT
//THIS IS THE CLEANER WAY OF DISPLAYING THE VARs
//% is the placeholder and d is the integer (not a double)
       System.out.printf("I have %d cats and %d dogs", numCats, numDogs);
       
       
//THE BASIC WAY OF CONCATENATING THE ABOVE CONSTANT
          System.out.println("\n The value of pi is " + PI); 
//% is the placeholder and f is the float
          System.out.printf("\n The value of pi is %f", PI);
          
//THE CLEANER OF CONCATENATING THE ABOVE CONSTANT WITH PADDING AND ROUNDING
//the 10 is how many spaces of padding and the 2 are the decimal point digits
System.out.printf("\n The value of pi is %10.2f", PI);
//the , adds a comma after every 3 digits of a number
System.out.printf("\n The value of thousand is %,8.2f", THOUSAND);

//THE BASIC WAY OF CONCATENATING THE ABOVE STRING
System.out.printf("\n My name is %s", varName);

    }

}
