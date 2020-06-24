/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create a method that doubles the value given and prints the result. 
 * Use this method from your Java program.
 * NB: PAY ATTENTION TO WHAT IS ASKED OF YOUR METHOD CREATION, IN THIS CASE IT SAYS THE METHOD SHOULD PRINT THE OUTPUT SO IT DOESN'T NEED TO RETURN VALUE
 *[OBJECTIVE]
 */


package labexermethoddoubleit;


/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Methods - Double It & Print Method
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class LabExerMethodDoubleIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TASK: METHOD TO DOUBLE A NUMBER
        //Number var declaration
        int number = 3;
        //Print statement to print numbers to be averaged
        System.out.println("Number is " + number);
        //Calling of method for averaging
        DubValue(number);


    }
    //COMMENTS FOR METHOD DECLARATION
    /** 
     * METHOD TO DOUBLE THE VALUE IN NUMBER AND PRINT THE NEW VALUE
     * @param x * 2
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID, AS THERE IS NO RETURN HERE WE STILL USE VOID
    //Set the method to the param of x as a Double
    public static void DubValue( double x)
    {
        //Execute the doubling operation on x as y
        double y = x * 2; 
        //Print y
        System.out.println("The double of the number is: " + y);
    }

}
