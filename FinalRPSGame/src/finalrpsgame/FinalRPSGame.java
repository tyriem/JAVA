/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * First you must display the game title (in a unique and appealing way).
 * Then ask the user to enter their name, and allow them to make their choice.
 * You must tell the user to enter the value 0, 1 or 2 (0 = Rock; 1 = Paper; 2 = Scissors).
 * The computer must randomly choose 0, 1 or 2 (0 = Rock; 1 = Paper; 2 = Scissors).
 * Your program must display each choice in words (user and computer) as well as the winner.
 * For full marks, your program must ask the user if they wish to play again (and allow the user
 * to play the game as many times as they wish). The user should not have to enter their name
 * each time they choose to play again.
 *[OBJECTIVE]
 */


package finalrpsgame;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - FINAL: Rock, Paper, Scissors Game
 * @version: 1.0 
 * @since Jun 26, 2020
 */
public class FinalRPSGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRINT Game Logo ASCII Art
        //TODO method for print logo
        System.out.println(".$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$.\n" +
                           "$$$$$$$ $$$'  '$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$'  '$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$s__s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s__s$$$ $$$$$$$\n" +
                           "$$$  _   _   _       _       _   _  _     __  _ ___  __  __  _   _   __   $$$\n" +
                           "$$$ |_) / \\ /  |/   |_) /\\  |_) |_ |_)   (_  /   |  (_  (_  / \\ |_) (_    $$$\n" +
                           "$$$ | \\ \\_/ \\_ |\\   |  /--\\ |   |_ | \\   __) \\_ _|_ __) __) \\_/ | \\ __)   $$$\n" +
                           "$$$                                                                       $$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$'     `$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$$$$$$p'  'q$'       $'      `$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$p' `q$p      $      .ssSSSSS$$$$$$$$$$$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$     $       $      $'               `$$$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$     $       $      $                  `$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$     $       $      $.                  $$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$     $       $      `$.                 $$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$     $       !       `$$$$SSSss.        $$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$b._.d$b._ _.d$b._  _.d$b._  _.d'        $$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$        \"       \"\"       \"\"            $$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ $$$$$$$$$$$$$                                     .$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$ '$$$$$$$$$$$$                                    .$$$$$$$$$$' $$$$$$$\n" +
                           "$$$$$$$s._____________                                  ____________.s$$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$$$$$$.                                .$$$$$$$$$$$$$$$$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$$$$$$$.                              $$$$$$$$$$$$$$$$$$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$'  _____                            __   ________   `$$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ .s$$$$$.                          $$$s. $$$$$$$$$s. $$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$$$$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$ $$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$ $$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $.   .$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$. .$$\n" +
                           "$$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$.$$$\n" +
                           "`$$$$$$$$$$$$$$$$ $$$$$$$$                         $$$$$$ $$$$$$$$$$$ $$$$$$$\n" +
                           "  `$$$$$$$$$$$'   $$$$$$$$                      dp $$$$$$ $$$$$$$$$$$ $$$$$$'");
       

        //Init Scanner
        Scanner kb = new Scanner (System.in);
        
        //Prompt user for name
        //TODO method for name entry to reuse in other programs
        System.out.println("");
        System.out.println("Please Enter Your Name: ");
        String name = kb.nextLine();
       
        //PRINT USER WELCOME
        System.out.println("[Welcome " + name + " to Rock, Paper, Scissors]");
        
        
        //Generate random
        Random rndPlay = new Random();

        //Declare VARs
        //NB: WE |MUST| set playAgain as a Y or it would skip the loop below
        char playAgain = 'Y';
        
        int numOfWins = 0;
        int numOfLosses = 0;
        
        while(playAgain == 'Y')
        {
            //Make the random output a random number and store it in a variable, here we set the bracket as 3 where it limits the value to 0-2
            int compHand = rndPlay.nextInt(3);
            
            //PROMPT PLAYER TO CHOOSE HAND
            System.out.println("Enter the value 0, 1 or 2 (0 = Rock; 1 = Paper; 2 = Scissors): ");
            int playerHand = kb.nextInt();
            
            //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
            //int[] handArray = {playerHand, compHand};
            
            //Display Player Choice
            System.out.println("You played a: " + handNameMETHOD(playerHand) + "\n" + handImageMETHOD(playerHand));
            
            //Display COMP choice
            System.out.println("Your opponent played a: " + handNameMETHOD(compHand) + "\n" + handImageMETHOD(compHand));
            
//OUTCOME OF PLAY

            //SAME HAND EVAL
            if(playerHand == compHand)
            {
                System.out.println("A DRAW!");   
            }
            //PLAYER: ROCK | COMP: SCISSORS EVAL
            else if(playerHand == 0 && compHand == 2)
            {
                System.out.println("You Win!");   
                numOfWins++;
            }
            //PLAYER: ROCK | COMP: PAPER EVAL
            else if(playerHand == 0 && compHand == 1)
            {
                System.out.println("You Lose!");   
                numOfLosses++;
            }
            //PLAYER: PAPER | COMP: ROCK EVAL
            else if(playerHand == 1 && compHand == 0)
            {
                System.out.println("You Win!");   
                numOfWins++;
            }
            //PLAYER: PAPER | COMP: SCISSORS EVAL
            else if(playerHand == 1 && compHand == 2)
            {
                System.out.println("You Lose!");   
                numOfLosses++;
            }
            //PLAYER: SCISSORS | COMP: PAPER EVAL
            else if(playerHand == 2 && compHand == 1)
            {
                System.out.println("You Win!");   
                numOfWins++;
            }
            //PLAYER: SCISSORS | COMP: ROCK EVAL
            else if(playerHand == 2 && compHand == 0)
            {
                System.out.println("You Lose!");   
                numOfLosses++;
            }
            else
            {
                System.out.println("INVALID PLAY");   
            }  
            
            //Ask the user if they want to play again
            System.out.println("Do you want to play again " + name + " ? (Y/N)");
            //NB: We take next here instead of nextLine as there is still data left in the buffer, another option is to clear it out before issuing nextLine
            playAgain = kb.next().toUpperCase().charAt(0);
        }
        
        //ENDGAME LOGIC
        System.out.println("Thanks For Playing.");
        System.out.println("You won " + numOfWins + " time(s) and lost " + numOfLosses + " time(s).");
        
    }
    
    /** METHOD TO CONVERT INT INTO NAME OF HAND PLAYED
     * 
     * @param x
     * @return handName
     */
    public static String handNameMETHOD(int x)
    {
        String handName = "";
        switch (x)
        {
            case 0: 
                handName = "ROCK";
                break;
            case 1: 
                handName = "PAPER";
                break;
            case 2: 
                handName = "SCISSORS";
                break;
        }
    return handName;
    }

    
    /** METHOD TO CONVERT INT INTO IMAGE OF HAND PLAYED
     * 
     * @param x
     * @return handImage
     */
    public static String handImageMETHOD(int x)
    {
        String handImg = "";
        switch (x)
        {
            //ROCK IMG
            case 0:                
                handImg = "    _______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)\n";
                break;
            case 1: 
                //PAPER IMG
                handImg = "     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)\n";
                break;
            case 2 : 
            handImg = "    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)\n";
                break;
        }
        return handImg;
    }

    
    /**
     * METHOD TO EVALUATE GAME OUTCOME
     * @param 
     * @return 
     
    //Study: Global VARs, passing ref instead of value in a method
    //TODO LATER passing the array and don't return the array
    //IF WE WANT TO PASS A VALUE BACK WE SPECIFY THE VALUE TO RETURN INSTEAD OF VOID
    public static int playEvalMETHOD(int x[])
    {
        int outcome = 0;
        int numOfWins = 0;
        int numOfLosses = 0;
        
        if( x[0] == x[1])
            {
                System.out.println("You DRAW!");   
                numOfWins++;
            }
            else if( x[0] >= x[1])
            {
                System.out.println("You DRAW!");   
                numOfWins++;
            }
            else
            {
                System.out.println("INVALID PLAY");
                numOfLosses++;
            }  
    int[] outcomeArray ={outcome, numOfWins, numOfLosses};    
    return outcomeArray;
    }   
    */
    
}
