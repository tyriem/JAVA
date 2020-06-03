/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package methods;
import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Methods
 * @version: 1.1
 * @since Jun 2, 2020
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Class.object.method() - System.out.print()
        //Each character in a string has a position going from 0 -> to the last letter, if you try to call a character beyond the letters in the string you will get an error (an index error as there is nothing in the index where you told java to look)
        //PRINT THE EXACT CHARACTERS cat
        System.out.print("cat");
        //SET A REFERENCE VARIABLE CALLED animal AS cat
        String animal = "cat";
        //PRINT THE REFERENCE VARIABLE animal
        System.out.println(animal);
        //PRINT THE CHARACTER IN THE 2 POSITION FOR REFERENCE VARIABLE animal
        System.out.println(animal.charAt(2));
        //PRINT THE LENGTH OF THE REFERENCE VARIABLE animal
        System.out.println(animal.length());
        //PRINT THE REFERENCE VARIABLE animal with all characters converted to UpperCase
        System.out.println(animal.toUpperCase());
        //PRINT THE REFERENCE VARIABLE animal with all characters converted to LowerCase
        System.out.println(animal.toLowerCase());
        //PRINT THE INDEX POSITION OF THE LETTER DEFININE IN REFERENCE VARIABLE animal (IF THE LETTER ISN'T THERE IT WILL RETURN AN INVALID INDEX NUMBER OF -1)
        System.out.println(animal.indexOf("e"));
        //PRINT IF THE REFERENCE VARIABLE animal starts with the character in the bracket or not
        System.out.println(animal.startsWith("e"));
         //PRINT IF THE REFERENCE VARIABLE animal contains with the character in the bracket or not
        System.out.println(animal.contains("e"));
        //PRINT THE REFERENCE VARIABLE animal with all of the a occurences replaced with e (YOU CAN REPLACE ANY LENGTH OF STRING WITH ANY LENGTH OF STRING)
        System.out.println(animal.replace("a","e"));
        
////////////////////////////////////////////////////////////////////////////////
    /*
        OBJECTIVE: HAVE THE USER TYPE THE NAME OF AN ANIMAL AND PRINT THE LAST LETTER IN THAT ANIMAL'S NAME
     */
       Scanner kb = new Scanner(System.in);
       String animalType;
       int animalLen;
       
       System.out.println("Please enter an animal: ");
       animalType = kb.nextLine();
       
       //Print the last character in the name of the animal typed by user
       animalLen = animalType.length();
       System.out.println("The last letter of that animal's name is: ");
       System.out.println(animalType.charAt(animalLen-1));
       //PRINT IT IN UPPERCASE
       System.out.println(animalType.toUpperCase().charAt(animalLen-1));
////////////////////////////////////////////////////////////////////////////////

       //Find out if the animal name contains the letter e
       System.out.println("Does that animal name contain the letter 'e'? ");
       System.out.println(animalType.contains("e"));
       
       //The contains method is case sensitive so if the user may input the typing in the wrong case then you need to make sure its in the same case
       System.out.println(animalType.contains(animalType.toLowerCase()));
       
       

    }

}
