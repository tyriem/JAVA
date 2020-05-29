/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package switcheswithbreaks;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - 
 * @version: 1.0 
 * @since May 28, 2020
 */
public class SwitchesWithBreaks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*
OBJECTIVE: A Book club awards points based on the number of books read each month (as follows)
If a member reads 0 books, they earn 0 points.
If a member reads 1 books, they earn 5 points.
If a member reads 2 books, they earn 15 points.
If a member reads 3 books, they earn 30 points.
If a member reads 4 or more books, they earn 60 points.        
  */
  
  //YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
 Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF INTEGER NUMBER
/*
///YOU COULD DO IT WITH IF STATEMENTS
        System.out.println("Enter the amount of books you read this month: ");
          //Pull the user input into the memory buffer
          int book = kb.nextInt();
          int point;
          //Calculate how many points
          if (book == 0)
             {
              point = 0;
             }
          else if (book == 1)
             {
              point = 5;
             }
          else if (book == 2)
             {
              point = 15;
             }
          else if (book == 3)
             {
              point = 30;
             }
          else
              point = 60;
*/
//YOU COULD DO IT WITH A SWITCH, A SWITCH IS A SUPERIOR / MORE ELEGANT CHOICE WHEN YOU HAVE A DEFINED VALUE THAT GOES UP OR DOWN
//IF YOU SEE THAT YOU ARE WRITING AN IF ELSE IF ELSE STATEMENT WHERE THE ELSE IF is using == consistently
        System.out.println("Enter the amount of books you read this month: ");
          //Pull the user input into the memory buffer
          int book = kb.nextInt();
          int point;
          
          switch (book)
          {
              case 0:
                  point = 0;
                  //THE BREAK IS NECESSARY AS IT GETS OUT / EXITS THE SWITCH STATEMENT, WITHOUT IT THE SWITCH WILL CONTINUE TO COUNT UP BEYOND THE TARGET
                  break;
              case 1:
                  point = 5;
                  break;
              case 2:
                  point = 15;
                  break;
              case 3:
                  point = 30;
                  break;
              default:
                  point = 60;
         }             
//PRINT NUMBER OF POINTS
System.out.println("You got " + point + " points.");

//Another solid use is where you are using a word that converts to a number: Month as Word -> Month as Number
//
        System.out.println("Enter the month you were born in (as a number): ");
        int month = kb.nextInt();
        
        switch (month)
        {
            //The first case can be anything that you need to start with, it can be 0, 1, etc.
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break; 
            case 6:
                System.out.println("June");
                break; 
            case 7:
                System.out.println("July");
                break; 
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break; 
            case 10:
                System.out.println("October");
                break; 
            case 11:
                System.out.println("November");
                break; 
            case 12:
                System.out.println("December");
                break; 
            default:
                System.out.println("You have not entered a valid month number");
        }
//      Evaluate User input Switch for gender         
        System.out.println("Enter your gender: ");
        String rawGender = kb.nextLine();
        char gender = rawGender.charAt(0);
        
        switch (gender)
        {
            case 'M':
// You can add additional cases below a case that evaluate the same, in this case we want 'M' and 'm' to yield the same output
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;                          
        }

    }

}
