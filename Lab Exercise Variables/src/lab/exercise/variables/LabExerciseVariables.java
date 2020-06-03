/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package lab.exercise.variables;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Variables
 * @version: 1.0
 * @since: 05-14-2020
 */
public class LabExerciseVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ///VARIABLE DECLARATIONS
    //_Variables_
    
    /// PRIMITIVE DATA TYPES ///
    //Age Of Person
    int agePerson = 29;
        System.out.println (agePerson);
           
    //Single Letter
    char letter = 't';
       System.out.println (letter);
       
    //Price of an Apple
    float apple = 1.44f;
       System.out.print("$");
       System.out.println(apple);
    
    ///REFERENCE DATA TYPES///
        //Strings are REFERENCE DATA TYPES NOT PRIMITIVE DATA TYPES, IT IS SUCH BECAUSE ITS THE REFERENCE TO THE ADDRESS WHERE YOU STORED THE WORD IN MEMORY
    //Color
        String varName;
    //Assign value to varAge_Float
    varName = "Emerald";
    //Print value in varAge_Float
    System.out.println(varName); 
    }

}
