/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * TODO INSERT OBJECTIVE HERE
 *[OBJECTIVE]
 */


package incrementing.and.decrementing;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Incrementing & Decrementing
 * @version: 1.0 
 * @since Jun 9, 2020
 */
public class IncrementingAndDecrementing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number = 0;
        
        // Increment
        number = number + 1;
        //Post-Fix Incrementing
        number ++;
        //Pre-Fix Incrementing
        ++number;
        
        //Decrement
        number = number - 1;
        //Post-Fix Decrementing
        number --;
        //Pre-Fix Decrementing
        --number;
      
      //The difference between pre-fix incrementing and post-fix incrementing only matters if you put the ++/-- in the print statement. 
      //If you try to use a post-fix in the System.out you may get a wrong value as it will only add or subtract after the print statement.
        System.out.println(number++);
        System.out.println(number);
        
        
       //Be careful of the following situation. Here the X is 2 at the print as it has been incremented to 2 but the y is 1 as it has not been incremented yet
       int x, y;
       
       x = 1;
       y = x++;
       
       System.out.println("x is " + x);
       System.out.println("y is " + y); 
       
       //Be careful of the following situation. Here the a is 2 at the print as it has been incremented to 2 and the b is 2 as it is the value of a after the increment
       int a, b;
       
       a = 1;
       b = ++a;
       
       System.out.println("x is " + a);
       System.out.println("y is " + b);  
    }

}
