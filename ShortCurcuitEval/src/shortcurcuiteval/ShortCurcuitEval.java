/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package shortcurcuiteval;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Short Circuit Evaluation
 * @version: 1.0 
 * @since May 27, 2020
 */
public class ShortCurcuitEval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Short Circuit EVALUATION - In an operation where multiple conditions have to be met if an early part of the operation means that the rest can be skipped then it can
        // 
        int a = 2;
        int b = 3;
        //AS THE FIRST OPERATION IS ALREADY FALSE THE REST OF THE OPERATION CAN BE SKIPPED AS IT DOESN'T MATTER WHAT THE SECOND ONE YIELDS
    if (a > 8 && b < 7)
    {
    System.out.println("YOUR EXPRESSION IS FALSE! ");
    }
    else
    {
      System.out.println("YOUR EXPRESSION IS TRUE! "); 
    } 
        //OR CAN ALSO Undergo Short Circuit Eval but on the truth rather than the false side
        int c = 10;
        int d = 3;
        //AS THE FIRST OPERATION IS ALREADY TRUE THE REST OF THE OPERATION CAN BE SKIPPED AS IT DOESN'T MATTER WHAT THE SECOND ONE YIELDS
    if (c > 8 || d < 7)
    {
    System.out.println("YOUR EXPRESSION IS FALSE! ");
    }
    else
    {
      System.out.println("YOUR EXPRESSION IS TRUE! "); 
    } 
    
    
         // [Operator Priority]
        // RELATIONAL OPERATORS > LOGICAL OPERATORS
        
       int e = 5;
       int f = 6;
       int g = 10;
       //The relational operators (>) will be evaluated before the logical one (&&)
       //THIS IS WHY WE PUT WHAT WE WANT EVALUATED FIRST IN BRACKETS JUST LIKE IN BOMDAS
       if ((e > 5)&&(f < 5))
       {
           System.out.println("Hi");
       }
       //(? X : Y) Conditional Operator
       // IF h < 5, we want to make i have a value of 10, otherwise i have a value of 3
       //THE LONG WAY:
       int h = 7;
       int i = 8;
       
       if (h < 5)
       {
         i = 10;  
       }
      else
       {
         i = 3;    
       }
       //THE QUICK WAY WITH CONDITIONAL OPERATOR
       int j = 2;
       int k = 8;
       k = j < 5 ? 10 : 3;
       //The question mark (?) acts as the if and the colon (:) is the otherwise/else
       
       System.out.println("j -->" + j);
       System.out.println("k -->" + k);
    }

}
