/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package modulus;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Remainder Operations [Modulus Operator]
 * @version: 1.0 
 * @since: 05-18-2020
 */
public class Modulus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///MODULUS / MODULO % - Arithmetic Operator that finds the remainder of a calculation
//Cases to use Modulo - When you have a program run for 305 seconds and need to find the amount of minutes and seconds
    int min = 305 / 60;
    int sec = 305 ;
    System.out.println ("minutes:" + min + "|" + "seconds:" + sec);
    
    
///Have a number of hours
//Calculate number of days and lefover hours
//Ex. 50 hours
  //DECLARE VARs
int numHours = 50;
  //CALCULATE VALUEs
int numCalcDays = numHours / 24;
int numCalcHours = numHours % 24;
  //PRINT OUTPUT
System.out.println ("Number of hours to convert to Days & Hours: " + numHours);
System.out.println ("Number of Days: " + numCalcDays);
System.out.println ("Number of Hours: " + numCalcHours);
    }

}
