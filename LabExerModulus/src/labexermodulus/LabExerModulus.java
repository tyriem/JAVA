/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labexermodulus;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - lab Exercise Modulus
 * @version: 1.0 
 * @since: XX-XX-2020
 */
public class LabExerModulus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ///Have a number of seconds
//Calculate number of minutes and  remainder seconds
//Ex. 325 second = 5 min. & 25 sec.
  //DECLARE VARs
int numSecs = 550;
  //CALCULATE VALUEs
int numCalcMins = numSecs / 24;
int numCalcSecs = numSecs % 24;
  //PRINT OUTPUT
System.out.println ("Number of seconds to convert to Minutes & Seconds: " + numSecs);
System.out.println ("Number of Minutes: " + numCalcMins);
System.out.println ("Number of Seconds: " + numCalcSecs);
    }

}
