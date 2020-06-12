/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Roll five six-sided dice. If you roll at least three even numbers you win.
 *[OBJECTIVE]
 */


package dicegamethreeevens;
//Before we invoke random numbers with the random class we must import the JAVA Utility Random
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Random: Dice Game | Three Evens
 * @version: 1.0 
 * @since Jun 4, 2020
 */
public class DiceGameThreeEvens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The generation of a dice roll seems easy at first but because of the mismatch of the index (which starts at 0) and the base of a dice (which starts at 1) it actually takes some thought
        
        //Generate five randoms 
        Random rndDiceOne = new Random();
        Random rndDiceTwo = new Random();
        Random rndDiceThree = new Random();
        Random rndDiceFour = new Random();
        Random rndDiceFive = new Random();

        
        //Make the random output a random number and store it in a variable, here we set the bracket as 6 where it limits the value to 0-5 and then add the missing 1 for five dice
        int numberDiceOne = rndDiceOne.nextInt(6)+1;
        int numberDiceTwo = rndDiceTwo.nextInt(6)+1;
        int numberDiceThree = rndDiceThree.nextInt(6)+1;
        int numberDiceFour = rndDiceFour.nextInt(6)+1;
        int numberDiceFive = rndDiceFive.nextInt(6)+1;
        
        //Start a Counter to evaluate the amount of evens rolled
        int counter = 0;
        
        
        //Print The Dice Rolls
        System.out.println("Dice One was a: " + numberDiceOne);
        System.out.println("Dice Two was a: " + numberDiceTwo);
        System.out.println("Dice Three was a: " + numberDiceThree);
        System.out.println("Dice Four was a: " + numberDiceFour);
        System.out.println("Dice Five was a: " + numberDiceFive);
        
        //Logic To Track If Each Roll is an Even
        //Modulo the first roll by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
        if (numberDiceOne % 2 == 0)
        {
            counter = counter + 1;
            System.out.println("Your first roll was an even!");    
        }
        else
           {
            System.out.println("Your first roll was an odd!");             
           }
        //Modulo the second roll by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
        if (numberDiceTwo % 2 == 0)
        {
            counter = counter + 1;
            System.out.println("Your second roll was an even!");    
        }
        else
        {
            System.out.println("Your second roll was an odd!");             
        }
        //Modulo the third roll by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
        if (numberDiceThree % 2 == 0)
        {
            counter = counter + 1;
            System.out.println("Your third roll was an even!");    
        }
        else
        {
            System.out.println("Your third roll was an odd!");             
        }
        //Modulo the fourth roll by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
        if (numberDiceFour % 2 == 0)
        {
            counter = counter + 1;
            System.out.println("Your fourth roll was an even!");    
        }
        else
        {
            System.out.println("Your fourth roll was an odd!");             
        }
        //Modulo the fifth roll by 2 and evaluate it against zero to check if the roll is even or odd then iterate the counter if it is even. Then Print if the roll is even or odd.
        if (numberDiceFive % 2 == 0)
        {
            counter = counter + 1;
            System.out.println("Your fifth roll was an even!");    
        }
        else
        {
            System.out.println("Your fifth roll was an odd!");             
        }
        
        //Logic To Evaluate If The User Rolled Enough Evens based on the value of the counter variable
        System.out.println("-------------------------------------");         
        if (counter >= 3)
        {
            System.out.println("Congratulations! You Rolled Mostly Evens!");    
        }
        else
        {
            System.out.println("Sorry, You Didn't Roll Enough Evens...");             
        }
        
    }

}
