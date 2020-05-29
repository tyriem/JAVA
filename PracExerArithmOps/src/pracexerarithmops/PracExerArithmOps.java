/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


  /*
OBJECTIVE: Write some code that	stores	a temperature value in Celsius and converts it	to Fahrenheit.
Modify your code so that the user can enter the	value they want	to convert.
What other conversion programs can you write? (e.g.	cups	to	ml,	etc.)
  */
package pracexerarithmops;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Arithmetic Operators: Temperature Converter
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerArithmOps {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
////////////////////////////////////////////////////////////////////////
///                          HARD CODED VERSION                      ///
///////////////////////////////////////////////////////////////////////
*/
//SET CEL TEMPERATURE VALUE
    double tempCel = 0;
//CONVERT CEL TEMP TO FAR TEMP
    double tempFar = (tempCel * 1.8 + 32);
//PRINT RESULTING TEMPS
    System.out.println(Math.round(tempCel) + " Degrees Celsius is equal to " + Math.round(tempFar) + " Degrees Farenheit");
    
  
 /*
////////////////////////////////////////////////////////////////////////
///                         USER INPUT VERSION                       ///
///////////////////////////////////////////////////////////////////////
*/
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF TEMP
          System.out.println("Enter the temperature in Celsius: ");
          //Pull the first user input into the memory buffer
          double tempCelUser = kb.nextDouble();
          //CONVERT CEL TEMP TO FAR TEMP
          double tempFarUser = (tempCelUser * 1.8 + 32);
          //PRINT RESULTING TEMPS
          System.out.println(tempCelUser + " Degrees Celsius is equal to " + Math.round(tempFarUser) + " Degrees Farenheit");
    
 /*
////////////////////////////////////////////////////////////////////////
///                       Cups to ml converter                       ///
///////////////////////////////////////////////////////////////////////
*/
/*
//ACCEPT USER INPUT OF GRADES
            System.out.println("Enter the volume of substance in Cups (US): ");
            //Pull the first user input into the memory buffer
            double cup = kb.nextDouble();
            double ml = (cup * 236.5882365);
            System.out.println(cup + " Cups (US) is equal to " + Math.round(ml) + " mililiters volume");
*/
    }

}
