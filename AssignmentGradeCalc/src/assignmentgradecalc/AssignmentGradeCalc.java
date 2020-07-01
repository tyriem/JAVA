/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Your task is to implement a program that asks the user to enter a single test grade (as a number). 
 * Your program should display the letter grade for the value provided (using a method).
 *[OBJECTIVE]
 */


package assignmentgradecalc;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Assignment: Methods - Grade Calculator
 * @version: 1.0 
 * @since Jun 26, 2020
 */
public class AssignmentGradeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//TASK: [METHOD TO CONVERT Numerical Grade to Letter Grade]

    

    // Call Scanner to Mem Buffer
    Scanner kb = new Scanner(System.in); 


     //Ask the user to enter the grade to be evaluated

     System.out.println("Good Day, please enter the numeric grade to be converted: ");

     //Pull the user input into the memory buffer
     int gradeInput = kb.nextInt();

     //PRINT the confirmation of the user input
     System.out.println("You have entered " + gradeInput + "% for conversion.");
     
     //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
     char grade = letterGrade(gradeInput);
     
     //PRINT the letter grade
     System.out.println("YOUR GRADE IS A(N) " + grade);
    }
    /**
     * METHOD TO TAKE IN gradeInput int and convert it to letter char
     * @param gradeInput
     * @return letter
     */
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static char letterGrade(int gradeInput)
    {
        //Declare and Init letter VAR
        char letter = ' ';
        
        //EVALUATE THE INPUT GRADE BY IF-ELSE Statement 
        if (gradeInput < 60)
           {
           letter = 'F';
           }
        else if (gradeInput < 70 && gradeInput >= 60 )
           {
           letter = 'D';
           }
        else if (gradeInput < 80 && gradeInput >= 70 )
           {
           letter = 'C';
           }
        else if (gradeInput < 90 && gradeInput >= 80 )
           {
           letter = 'B';
           }
        else if (gradeInput <= 100 && gradeInput >= 90 )
           {
           letter = 'A';
           }
        
        //Return letter when method letterGrade called
        return (letter);
    }     

}
