/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create a method that doubles the value given and prints the result. 
 * Use this method from your Java program.
 *[OBJECTIVE]
 */


package labexermethoddoubleit;


/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Methods - Pass a Double It Method's Value
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class LabExerMethodDoubleIt {

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
     * METHOD TO DOUBLE THE VALUE IN NUMBER
     * @param number * 2
     * @return newNumber
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static double DubValue( double x)
    {
         double y = x * 2;
         return y;
    }

}
