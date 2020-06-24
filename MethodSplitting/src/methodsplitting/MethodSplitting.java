/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * TODO INSERT OBJECTIVE HERE
 *[OBJECTIVE]
 */


package methodsplitting;
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Method: Split code into method modules
 * @version: 1.0 
 * @since Jun 23, 2020
 */
public class MethodSplitting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Simulate the roll of a dice
        int dice1 = diceRoll(6);
        int dice2 = diceRoll(6);
        int dice3 = diceRoll(6);
        int dice4 = diceRoll(6);
        int dice5 = diceRoll(6);
        int dice6 = diceRoll(6);
        
        // Print value of dice, word and image
        System.out.println(dice1);
        diceName(dice1);
        diceNombre(dice1);
        diceImage(dice1);
        
        System.out.println(dice2);
        diceName(dice2);
        diceNombre(dice2);
        diceImage(dice2);
        
        System.out.println(dice3);
        diceName(dice3);
        diceNombre(dice3);
        diceImage(dice3);
        
        System.out.println(dice4);
        diceName(dice4);
        diceNombre(dice4);
        diceImage(dice4);
        
        System.out.println(dice5);
        diceName(dice5);
        diceNombre(dice5);
        diceImage(dice5);
        
        System.out.println(dice6);
        diceName(dice6);
        diceNombre(dice6);
        diceImage(dice6);
   
    }  
    
    /**
     * This method returns the number rolled (works for any type of dice)
     * @param numberOfSides Number of sides that the dice has
     * @return The number rolled
     */
    public static int diceRoll(int numberOfSides)
    {
        Random rnd = new Random();
        int dice = rnd.nextInt(numberOfSides) + 1;
        return dice;
    }
    
    /**
     * Prints the word equivalent of the number provided
     * @param number 
     */
    public static void diceName(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.println("ONE");
                break;
            case 2: 
                System.out.println("TWO");
                break;
            case 3: 
                System.out.println("THREE");
                break;
            case 4: 
                System.out.println("FOUR");
                break;
            case 5: 
                System.out.println("FIVE");
                break;
            case 6: 
                System.out.println("SIX");
                break;
        }
    }
    
        /**
     * Prints the word equivalent of the number provided
     * @param number 
     */
    public static void diceNombre(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.println("UNO");
                break;
            case 2: 
                System.out.println("DOS");
                break;
            case 3: 
                System.out.println("TRES");
                break;
            case 4: 
                System.out.println("CUATRO");
                break;
            case 5: 
                System.out.println("CINCO");
                break;
            case 6: 
                System.out.println("SEIS");
                break;
        }
    }
    
    /**
     * Prints the dice image of the number provided
     * @param number 
     */
    public static void diceImage(int number)
    {
        switch (number)
        {
            case 1: 
                System.out.print("+-----+ \n|     | \n|  o  | \n");
                System.out.println("|     | \n+-----+ \n");
                break;
            case 2: 
                System.out.print("+-----+ \n|o    | \n|     | \n");
                System.out.println("|    o| \n+-----+ \n");
                break;
            case 3: 
                System.out.print("+-----+ \n|o    | \n|  o  | \n");
                System.out.println("|    o| \n+-----+ \n");
                break;
            case 4: 
                System.out.print("+-----+ \n|o   o| \n|     | \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
            case 5: 
                System.out.print("+-----+ \n|o   o| \n|  o  | \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
            case 6: 
                System.out.print("+-----+ \n|o   o| \n|o   o| \n");
                System.out.println("|o   o| \n+-----+ \n");
                break;
        }
    
    }
    
}