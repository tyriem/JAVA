/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Make a Calculator class, which will have 5 static methods:
 * int plus(int a, int b) - returns the sum of a and b
 * int minus(int a, int b) - returns the difference between a and b
 * int multiply(int a, int b) - returns the product of a and b
 * double divide(int a, int b) - returns the result of dividing a by b
 * double percent(int a, int b) - returns b percent of the number a
 * Requirements:
 * The plus method must return the sum of a and b.
 * The minus method must return the difference between a and b.
 * The multiply method must return the product of a and b.
 * The divide method must return the result of dividing a by b.
 * The percent method must return b percent of the number a.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Assignment: Static Method - Calculator
 */

public class Calculator {
    public static int plus(int a, int b) {
// Logic for Adding A + B
        int plus = a + b;
        return plus;
    }

    public static int minus(int a, int b) {
    int minus;
// Logic for Difference where A > B
     if (a >= b)
     {   
     minus = (a - b);
     }
// Logic for Difference where B > A
    else
    {
     minus = (b - a);
    }       
        

        return minus;
    }

    public static int multiply(int a, int b) {
// Logic for Multiplying A x B
        int multiply = a * b;
        return multiply;
    }

    public static double divide(int a, int b) {
// Logic for Dividing A / B
        double divide = a / b;
        return divide;
    }

    public static double percent(int a, int b) {
// Logic for finding the percent (B/A)x100
        double percent = (b / a)*100;
        return percent;
    }

    public static void main(String[] args) {

    }
}
