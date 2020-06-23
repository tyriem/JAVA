/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Create an array to store the vowels (a, e, i o and u).
 *Write some code to traverse through the array and print out its contents (using a for loop).
 *You can choose if you want to use the basic for loop (with the three parts), or the enhanced for loop.
 *[OBJECTIVE]
 */


package labexerarrayvowelloop;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Lab Exercise: Vowel, FOR-LOOP
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class LabExerArrayVowelLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array of vowel Chars
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        
               //Special ARRAY FOR-LOOP to print the contents of the Vowel Array  
               //NB: WE CAN'T ALWAYS USE THIS
               for(char x: vowelArray)
               {
               System.out.println(x);
               } 
    }

}
