/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Write a method that accepts three decimal values (double or float), calculates the average of the three and pass the result to MAIN
 * Write code that tests your method. Include documentation comments.
 * NB: PAY ATTENTION TO WHAT IS ASKED OF YOUR METHOD CREATION, IN THIS CASE IT SAYS THE METHOD SHOULD PRINT THE OUTPUT SO IT DOESN'T NEED TO RETURN VALUE
 *[OBJECTIVE]
 */


package labexermethodaveragepass;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Methods - Average Them & Pass result to MAIN
 * @version: 1.0 
 * @since Jun 24, 2020
 */
public class LabExerMethodAveragePASS {

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
        System.out.println("The average of the numbers is: " + aveValue(numArray) + " ,");

    }
    /**
     * METHOD TO AVERAGE THE VALUES IN double numArray[]
     * @param (numberOne + numberTwo + numberThree)
     * @return total/x.length
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static double aveValue(double x[])
    {
        double total = 0;
        for(int i=0;i<x.length;i++) 
        {
        total += x[i];
        }
        return total/x.length;
    }     

}
