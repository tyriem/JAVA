/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package labexercisearithmeticoperators;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Arithmetic Operators
 * @version: 1.1
 * @since: 05-14-2020 - 05-19-2020
 */
public class LabExerciseArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 ///Arithmetic Operators
 //DECLARE AMOUNT OF STUDENTS OF EACH GENDER
    double varFemale = 8;
    double varMale = 13;
 //ADD FOR CLASS AMOUNT
       double varClass = varFemale + varMale;
 //PRINT AMOUNT OF STUDENTS IN CLASS
       System.out.println("Students: " + varClass);
 //CALC PERCENTAGE OF EACH GENDER
        double varPercFemale = ((varFemale / varClass)*100);
        double varPercMale = ((varMale / varClass)*100);
 //PRINT OUTPUT OF PERCENTAGES
         System.out.print("Pecentage Female: " + Math.round(varPercFemale));
         System.out.println("%");
         System.out.print("Pecentage Male: " + Math.round(varPercMale));
         System.out.println("%");
    }

}
