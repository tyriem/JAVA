/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Pass a value to a print statement in main with a method
 *[OBJECTIVE]
 */


package methodpassvalue;
import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Methods: Passing Value Back
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class MethodPassValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TASK: METHOD TO ADD 1 TO A NUMBER
        int number = 3;
        System.out.println("Number is " + number);
        //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
        //NB: By putting "number" below we copy the value of number into the method below
        int newNumber = addOneToValue(number);
        System.out.println("New number is " + newNumber);
    ////////////////////////////////////////////////////////////////////////////
        //TASK: METHOD TO ADD TWO USER INPUTTED NUMBERS AND PRINT SUM
    
        //DECLARE VARs
        Scanner kb = new Scanner(System.in);
        //Ask user for two numbers
        System.out.println("Please enter a number: ");
        int number1 = kb.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = kb.nextInt();
        
        //Call our method
        int sumOfTwoNumbers = sumOfTwoValues(number1, number2);
        System.out.println("The Sum of the numbers is: " + sumOfTwoNumbers);
    }
    /**
     * METHOD TO ADD ONE TO THE VALUE IN NUMBER
     * @param number + 1
     * @return newNumber
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static int addOneToValue( int x)
    {
         int y = x + 1;
         return y;
    }
    /**
     * METHOD TO ADD TWO VALUES AND RETURN THE RESULT
     * @param num1 + num 2
     * @return total of num1 & num2
     */
    public static int sumOfTwoValues( int num1, int num2)
    {
         int total = num1 + num2;
         return total;
         //alternatively we can just return num1 + num 2
    }
}
