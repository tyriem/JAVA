/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package assignmentdisplayoutvarariops;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Assignment: DisplayingOutputVariablesAndArithmeticOperators
 * @version: 1.0.1
 * @since: 05-15-2020
 */
public class AssignmentDisplayOutVarAriOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//PRINT TASK #1A PREAMBLE TEXT 
       System.out.println("[ASSIGNMENT - TASK 1A: PRINT ASCII ART OF YOUR CHOICE TO SCREEN]");
       System.out.println("");
//PRINT CMDs TO OUTPUT ASCII ART FOUND IN \ASSETS\
       System.out.println("                       (");
       System.out.println("                        )     (");
       System.out.println("                 ___...(-------)-....___");  
       System.out.println("             .-\"\"       )    (          \"\"-.");
       System.out.println("       .-'``'|-._             )         _.-|");
       System.out.println("      /  .--.|   `\"\"---...........---\"\"`   |");
       System.out.println("     /  /    |                             |");
       System.out.println("     |  |    |      __      __  __      __ |");
       System.out.println("     |  |    | |  ||__ |   /  `/  \\|\\/||__ |");
       System.out.println("     \\  \\    | |/\\||___|___\\__,\\__/|  ||___|");
       System.out.println("      `\\ `\\  | _____                       |");
       System.out.println("        `\\ `\\|   |/  \\      | /\\\\  //\\     |");
       System.out.println("          /  |   |\\__/   \\__//~~\\\\//~~\\    |");
       System.out.println("         _/ /\\                             /");
       System.out.println("        (__/  \\                           /");
       System.out.println("     _..---\"\"` \\                         /`\"\"---..");
       System.out.println("  .-'           \\                       /          '-.");
       System.out.println(" :               `-.__             __.-'              :");
       System.out.println(" :                  ) \"\"---...---\"\" (                 :");
       System.out.println("  '._               `\"--...___...--\"`              _.'");
       System.out.println("    \\\"\"--..__                              __..--\"\"/");
       System.out.println("     '._     \"\"\"----.....______.....----\"\"\"     _.'");
       System.out.println("        `\"\"--..,,_____            _____,,..--\"\"`");
       System.out.println("                      `\"\"\"----\"\"\"`");
       System.out.println("");

       
//PRINT TASK #1B PREAMBLE TEXT
          System.out.println("[ASSIGNMENT - TASK 1B: PRINT DIMENSIONS OF A GIVEN RECTANGLE]");
          System.out.println("");
//GIVEN DIMENSONS OF POLYGON
          int recLen = 8;
          int recWid = 5;
//AREA AND PERIMETER CALCs
          int recArea =  (recLen * recWid);
          int recPerim = ((recLen*2)+(recWid*2));
//OUTPUT OF CALCULATED DIMENSIONS
          System.out.println("A rectangle with length " + recLen + " and width " + recWid);
          System.out.println("has an area of " + recArea);
          System.out.println("and a perimeter of " + recPerim);
          System.out.println("");
          
//PRINT TASK #1C PREAMBLE TEXT
             System.out.println("[ASSIGNMENT - TASK 1C: STORE FLOATs AND CALCULATE MEANs]");
             System.out.println("");
//GIVEN VARs
             double NUMBER1 = 3.6;
             double NUMBER2 = 4.5;
             double NUMBER3 = 6.8;
//MEAN CALC
             double NUMBERMean =  ((NUMBER1+NUMBER2+NUMBER3)/3);

//OUTPUT OF CALCULATED MEAN
             System.out.println("The average of the numbers " + NUMBER1 + ", " + NUMBER2 + " and " + NUMBER3 + " is " + NUMBERMean + "R");
             System.out.println("");
//END
    }

}
