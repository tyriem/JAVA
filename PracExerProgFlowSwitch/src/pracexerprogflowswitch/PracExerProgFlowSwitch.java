/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


 /*
OBJECTIVE: Write some code that	accepts	a month	(e.g. 3)	and a day	
number (e.g. 24)	from a user, and outputs the name of the
season that the month and day correspond to.
  */
package pracexerprogflowswitch;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Controlling Program Flow (Switch Statements): Day/Month to Season
 * @version: 1.0 
 * @since May 29, 2020
 */
public class PracExerProgFlowSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
//ACCEPT USER INPUT OF MONTH & DAY
          System.out.println("Enter the month (in number form): ");
          //Pull the first user input into the memory buffer
           int month = kb.nextInt();
          System.out.println("Enter the day (in number form): ");
          //Pull the second user input into the memory buffer
           int day = kb.nextInt();
 /*   
////////////////////////////////////////////////////////////////////////
///                         DEPRECATED VERSION                       ///
///////////////////////////////////////////////////////////////////////
        switch (month)
        {
            case 1:
                System.out.println("January  \n");
                System.out.println("WINTER");  
                break;
            case 2:
                System.out.println("February  \n");
                System.out.println("WINTER"); 
                break;
            case 3:
                System.out.println("March \n");
                if (day >= 21)
                {
                   System.out.println("SPRING");   
                }
                else
                   System.out.println("WINTER");
                break;
            case 4:
                System.out.println("April  \n");
                System.out.println("SPRING");   
                break;
            case 5:
                System.out.println("May  \n");
                System.out.println("SPRING");   
                break; 
            case 6:
                System.out.println("June  \n");
                if (day >= 21)
                {
                   System.out.println("SUMMER");   
                }
                else
                   System.out.println("SPRING");
                break; 
            case 7:
                System.out.println("July  \n");
                System.out.println("SUMMER");  
                break; 
            case 8:
                System.out.println("August  \n");
                System.out.println("SUMMER");  
                break;
            case 9:
                System.out.println("September  \n");
                if (day >= 23)
                {
                   System.out.println("FALL");   
                }
                else
                   System.out.println("SUMMER");
                break; 
            case 10:
                System.out.println("October  \n");
                System.out.println("FALL");  
                break; 
            case 11:
                System.out.println("November  \n");
                System.out.println("FALL");  
                break; 
            case 12:
                System.out.println("December  \n");
                if (day >= 21)
                {
                   System.out.println("WINTER");   
                }
                else
                   System.out.println("FALL");
                break; 
            default:
                System.out.println("You have not entered a valid date");
        }
*/
 
/*   
////////////////////////////////////////////////////////////////////////
///                          CURRENT VERSION                         ///
/////////////////////////////////////////////////////////////////////// 
*/ 
//Set the value of month as a switch
 switch (month)
        {
//Define the logic for the season of WINTER with the December Exception
            case 12:
            case 1:
            case 2:
                if (month == 12 && day < 22)
                {
                System.out.println("AUTUMN");    
                }
                else
                System.out.println("WINTER");  
            break;
//Define the logic for the season of SPRING with the March Exception
            case 3:
            case 4:
            case 5:
                if (month == 3 && day < 21)
                {
                System.out.println("WINTER");    
                }
                else
                System.out.println("SPRING");  
            break;
//Define the logic for the season of SUMMER with the June Exception
            case 6:
            case 7:
            case 8:
                if (month == 6 && day < 21)
                {
                System.out.println("SPRING");    
                }
                else
                System.out.println("SUMMER");  
            break; 
//Define the logic for the season of AUTUMN with the September Exception
            case 9:
            case 10:
            case 11:
                if (month == 9 && day < 23)
                {
                System.out.println("SPRING");    
                }
                else
                System.out.println("AUTUMN");  
            break; 
            default:
//Define the logic for the default case if input is not valid
                System.out.println("You have not entered a valid date");
        }
 
    }

}
