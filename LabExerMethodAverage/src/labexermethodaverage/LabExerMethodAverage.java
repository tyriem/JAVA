/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write a method that accepts three decimal values (double or float), calculates the average of the three and prints this result.
 * Write code that tests your method. Include documentation comments.
 *[OBJECTIVE]
 */


package labexermethodaverage;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Method - Averaging
 * @version: 1.0 
 * @since Jun 23, 2020
 */
public class LabExerMethodAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       //TASK: METHOD TO AVERAGE THREE NUMBERS
        double numberOne = 3;
        double numberTwo = 4;
        double numberThree = 5;
        System.out.println("Numbers are " + numberOne + " ," + numberTwo + " ," +numberThree + " ,");
        //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
        double[] numArray ={numberOne, numberTwo, numberThree};
        System.out.println("The average of the numbers is: " + AveValue(numArray) + " ,");

    }
    /**
     * METHOD TO AVERAGE THE VALUES IN double numArray[]
     * @param (numberOne + numberTwo + numberThree)
     * @return total/x.length
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static double AveValue(double x[])
    {
        double total = 0;
        for(int i=0;i<x.length;i++) 
        {
        total += x[i];
        }
        return total/x.length;
    }     

}
