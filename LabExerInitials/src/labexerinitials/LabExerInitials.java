/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

  /*
   *[OBJECTIVE]
   *Write some code that prints the user's initials from them typing their name.
   *[OBJECTIVE]
  */
package labexerinitials;
import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Methods: Lab Exercise - Initials From Name
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class LabExerInitials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declare VARs
Scanner kb = new Scanner(System.in);
String firstName, lastName;
        
// Ask user for their name
        System.out.println("What is your first name?");
        firstName = kb.nextLine();
        System.out.println("What is your last name?");
        lastName = kb.nextLine();
        
//Get their Initials
//NOTE: THAT WE CAN CALL MULTIPLE METHODS SEQUENTIALLY, HERE WE READ THE CHARACTER AT INDEX 0 AND THEN CONVERT IT TO UPPERCASE
//BE CAREFUL AS IF YOU CALL A STRING ONLY METHOD ON A CHAR VARIABLE IT WILL THROW AN ERROR
char firstInitial = firstName.toUpperCase().charAt(0);
char lastInitial = lastName.toUpperCase().charAt(0);


//Print their Initials
System.out.println(firstInitial + "." + lastInitial + ".");


    }

}
