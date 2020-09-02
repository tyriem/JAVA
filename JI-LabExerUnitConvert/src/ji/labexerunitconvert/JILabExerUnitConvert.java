/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


package ji.labexerunitconvert;
//Import Java Utils
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Unit Convertor
 * @version: 1.0 
 * @since Sep 1, 2020
 */
public class JILabExerUnitConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TASK: [CALCULATOR TO CONVERT ONE UNIT TYPE TO ANOTHER]

    // Call Scanner to Mem Buffer
    Scanner kb = new Scanner(System.in); 


     //Ask the user to enter the type of unit to be converted

     System.out.println();
     
     //Accept User Input: Operation
        System.out.println("Good Day, please enter the type of unit to be converted (C)entimeters to inches, (K)ilometers to Miles");
///CONVERT THE USER INPUT INTO PREDICTED TEXT 'C,K'
       //Accept The Raw User Input
       String rawOperation = kb.nextLine();
       //Pull the first character of the raw input and place it in a new string
       String operationProc = rawOperation.substring(0, 1);
       //Convert the String To UpperCase
       String operation = operationProc.toUpperCase();
     
          //Ask the user to enter the scalar to be converted

     System.out.println("Please enter the value to be converted");

     
     //Pull the user input into the memory buffer
     double valInput = kb.nextDouble();
     
     //Initialize valOutput
     double valOutput;
     
     System.out.println("----------------------------------------------------");
     // Logic for Centimeter to Inch Conversion
        if (operation.equals("C"))
          {
          valOutput = (valInput * 2.54);
          System.out.println("You Selected the conversion: CM TO IN.");
          System.out.println("The equivalent of: " + valInput + " in inches is: " + valOutput + " in." );    
          }
     // Logic for Kilometer to Mile Conversion
        else if (operation.equals("K"))
             {
            valOutput = (valInput / 1.609344);
            System.out.println("You Selected the conversion: KM to Mi");
            System.out.println("The equivalent of: " + valInput + " in miles is: " + valOutput + " Mi." ); 
             }
     // Logic for Invalid Input Error
        else 
            {  
            System.out.println("You have selected an invalid conversion. Please Try Again.");
            }
    }

}
