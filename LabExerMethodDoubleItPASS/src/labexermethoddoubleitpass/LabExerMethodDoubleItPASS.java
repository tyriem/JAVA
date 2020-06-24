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


package labexermethoddoubleitpass;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Methods - Double It & Pass result to MAIN
 * @version: 1.0 
 * @since Jun 24, 2020
 */
public class LabExerMethodDoubleItPASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TASK: METHOD TO DOUBLE A NUMBER
        int number = 3;
        System.out.println("Number is " + number);
        //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
        //NB: By putting "number" below we copy the value of number into the method below
        double newNumber = DubValue(number);
        System.out.println("The double of " + number + " is: " + newNumber);

    }
    /**
     * METHOD TO DOUBLE THE VALUE IN NUMBER AND RETURN THE NUMBER
     * @param number, the number to double
     * @return newNumber, double the number provided
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static double DubValue( double x)
    {
         double y = x * 2;
         return y;
    }

}
