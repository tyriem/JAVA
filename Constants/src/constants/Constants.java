/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package constants;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Constants
 * @version: 1.0
 * @since: 05-14-2020
 */
public class Constants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /// Constant is a variable that cannot be changed
    
    //Variable:
    int number = 4;
    number = 6;
    number = 10;
    System.out.println(number);
    
    //Constant:
    final int NUMBER = 4;
    System.out.println(NUMBER);
    //IT_IS_STANDARD_FOR_CONSTANTS_TO_BE_UPPERCASE: NUMBER
    //It Is Standard For Variables To Be Camelcase: varNumber
    
    int a = 9;
    int b = 4;
    int c = 5;
    int d = a + b;
    System.out.println(d);
    int e = a + b + c;
    System.out.println(e);
    //If you are going to use the product of arithmetic on numbers more than once then make that a new value
    //If not you can just use BOMDAS during the arithmetic
    
    ///Averaging numbers in Java
    //Even if we start with integers, if we have to average them then still declare them as double to make sure that it keeps the decimal
    //Correct way to execute
    double f = 2;
    double g = 3;
    double h = 8;
    double average = (f + g + h) / 3;
    System.out.println(average);
    //Incorrect way to execute
    int badAverage = (a + b + c) / 3;
     System.out.println(badAverage);
     
     ///Quick arithmetic
     //These two calculations are exactly the same to JAVA
     int i = 0;
     i = i + 1;
     //Compound Operator
     i += 1;
     
     ///Incrementing
     //Every + you add after the first you add 1
     int j = 1;
     j = j + 1;
     j++;
     
     //These two calculations are exactly the same to JAVA 
     int k = 2;
     k = k - 8;
     k-=8;
             
    }

}
