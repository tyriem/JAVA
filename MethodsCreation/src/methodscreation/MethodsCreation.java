/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Creating Methods
 *[OBJECTIVE]
 */


package methodscreation;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Method Creation
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class MethodsCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("My Program");
        
        //IF WE PUT A CONDITION ABOVE THE METHOD THEN THE METHOD MUST BE SATISFIED BEFORE CALLING THE METHOD
        int time = 9;
        if (time > 8)
        //HERE WE CALL THE METHOD WE CREATE BELOW
        brushTeeth();
    }
    /// NEW METHODS MUST BE CREATED OUTSIDE OF THE MAIN METHOD
    //NB: Methods have a heriarchy, The order is in the order that it is called: (Method One -> End of Code -> Method Two -> End of Code -> Method Three
    //NB: If you call a method lower in the heirarchy in the middle of another method then it calls that lower one in the middle of the other
    //NB: If an method is expecting something we "pass an argument" to it. To do this we put what we expect in the parenthesis
    //NB: Any variable you create within a method is only alive in the scope of that method, even if it has the name of a var in anotherm method (even main)
    //public - any part of our code can call this | static - lives on its own | void - not return anything back
    //even if you do not put any arg inside you still need the soft brackets
    public static void brushTeeth()
    {
        System.out.println("Get toothbrush");
        System.out.println("Put toothpaste on toothbrush");
        System.out.println("Put toothbrush in mouth");
        System.out.println("Move toothbrush around mouth for two minutes");
        addOneToIt(1);
    }
    /**
     * THIS IS WHERE WE GIVE METHODS A PROPER DESCRIPTION
     * @param HERE WE SET THE PARAMETERS FOR WHAT THE METHOD DOES
     * @return HERE WE SET WHAT THE METHOD RETURNS IN TERMS OF VALUE
     */
    public static void addOneToIt( int number)
    {
         int numberPlusOne = number + 1;
         System.out.println(numberPlusOne);
    }
    
}
