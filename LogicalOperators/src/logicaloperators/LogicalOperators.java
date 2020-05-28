/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package logicaloperators;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Logical Operators: AND (&&), || (OR), NOT (NOT)
 * @version: 1.0 
 * @since May 27, 2020
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // &&(AND) - Logical operator that connects two boolean expressions
        // && works to check if BOTH expressions are true, if both are false or one is false it will evaluate as false
        int temp = 2;
        int time = 3;
    if (temp < 5 && time < 6)
       {
    System.out.println("YOUR FRIDGE IS FINE! ");
       }
    else
    {
      System.out.println("SOMETHING IS WRONG WITH YOUR FRIDGE! "); 
    } 
      
    
        // ||(OR) - Logical operator that connects two boolean expressions
        // || works to check if ONE OR BOTH expressions are true, if both are false  it will evaluate as false  
        int speed = 2;
        int rev = 3;
    if (speed < 100 || rev < 100)
       {
    System.out.println("YOUR CAR IS FINE! ");
       }
    else
       {
      System.out.println("YOUR CAR IS STRESSED! "); 
       }
 
         // !(NOT) - Logical operator that evaluates a boolean value
        // ! works to check if a boolean value is not true
boolean isValid = true;
 
if (!isValid) 
{
    System.out.println("Invalid");
}
else 
{
     System.out.println("Valid!");
} 
    }
}
