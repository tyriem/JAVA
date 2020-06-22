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


package methodswithinmethods;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Methods Within Methods
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class MethodsWithinMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        methodOne();
        methodTwo();
        methodThree();
    }
 public static void methodOne()
    {
         System.out.println("Start of Method One");
         methodTwo();
         System.out.println("End of Method One");
    }
 public static void methodTwo()
    {
         System.out.println("Start of Method Two");
         methodThree();
         System.out.println("End of Method Two");
    }
 public static void methodThree()
    {
         System.out.println("Start of Method Three");
         methodOne();
         System.out.println("End of Method Three");
    }
}
