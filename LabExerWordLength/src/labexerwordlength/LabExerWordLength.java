/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * You must write some Java code that asks the user to enter a word, and displays its length.
 * e.g. if the user types in the word "cat", your code must output the number 3 (because the word cat contains three letters).
 *[OBJECTIVE]
 */


package labexerwordlength;

import java.util.Scanner;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: How Long Is That Word?
 * @version: 1.0 
 * @since Jun 3, 2020
 */
public class LabExerWordLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //init Scanner
       Scanner kb = new Scanner(System.in);
       //Declare a variable string named word
       String word;
       
       //Prompt the user to input a word
       System.out.println("Please enter a word: ");
       //Pull the user's input into the mem buffer
       word = kb.nextLine();
       //Set a new integer variable to be the length of the user's input
       int wordLen = word.length();
       //Print the user input and format it
       System.out.println("That word is " + wordLen + " characters long");
       
    }

}
