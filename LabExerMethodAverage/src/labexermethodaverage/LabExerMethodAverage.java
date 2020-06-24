/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write a method that accepts three decimal values (double or float), calculates the average of the three and prints this result.
 * Write code that tests your method. Include documentation comments.
 * NB: PAY ATTENTION TO WHAT IS ASKED OF YOUR METHOD CREATION, IN THIS CASE IT SAYS THE METHOD SHOULD PRINT THE OUTPUT SO IT DOESN'T NEED TO RETURN VALUE
 *[OBJECTIVE]
 */


package labexermethodaverage;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Methods - Average Them & Print
 * @version: 1.0 
 * @since Jun 23, 2020
 */
public class LabExerMethodAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //TASK: METHOD TO AVERAGE THREE NUMBERS
        //Number VAR declarations
        double numberOne = 3;
        double numberTwo = 4;
        double numberThree = 5;
        //Print statement to print numbers to be averaged
        System.out.println("Numbers are " + numberOne + " ," + numberTwo + " ," +numberThree + ".");
        //Array to store the numbers
        double[] numArray ={numberOne, numberTwo, numberThree};
        //Calling of method for averaging
        aveValue(numArray);
        

    }
    /**
     * METHOD TO AVERAGE THE VALUES IN double numArray[]
     * @param (numberOne + numberTwo + numberThree)/3
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID, AS THERE IS NO RETURN HERE WE STILL USE VOID
    //Set the method to the param of x as a Double
    public static void aveValue(double x[])
    {
        //Declare Total VAR
        double total = 0;
        //FOR LOOP To run through the array of numbers and adds them
        for(int i=0;i<x.length;i++) 
        {
        total += x[i];
        }
        //PRINT STATEMENT TO Divide the total by the number of elements and print result
        System.out.println("The Average of the numbers is: " + (total/x.length));
    }     

}
