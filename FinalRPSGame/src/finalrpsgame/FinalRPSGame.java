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
 * ADDITIONAL: Add a performance evaluation against the opponent
 * ADDITIONAL: Force User Name Input to ProperCase
 *[OBJECTIVE]
 */


package finalrpsgame;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - FINAL: Rock, Paper, Scissors Game
 * @version: 1.1.1 
 * @since Jun 26, 2020
 */
public class FinalRPSGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRINT Game Logo ASCII Art
        showLogoMETHOD();
       

        //Init Scanner
        Scanner kb = new Scanner (System.in);
        
        //Prompt user for name  
        //Aaccept user name
        //WHEN PASSING THE VALUE WE STORE IT IN A VAR HERE
        String rawName = nameEntryMETHOD();
        String name = toProperCaseMETHOD(rawName);
       
        //PRINT USER WELCOME
        System.out.println("[Welcome " + name + " to Rock, Paper, Scissors]");
        
        
        //Generate random
        Random rndPlay = new Random();

        //Declare VARs
        //NB: WE |MUST| set playAgain as a Y or it would skip the loop below
        char playAgain = 'Y';
        
        int numOfWins = 0;
        int numOfLosses = 0;
        
        //[OPEN WHILE LOOP]
        while(playAgain == 'Y')
        {
            //Make the random output a random number and store it in a variable, here we set the bracket as 3 where it limits the value to 0-2
            int compHand = rndPlay.nextInt(3);
            
            //PROMPT PLAYER TO CHOOSE HAND
            System.out.println("Enter the value 0, 1 or 2 (0 = Rock; 1 = Paper; 2 = Scissors): ");
            int playerHand = kb.nextInt();
            
            
            //Display Player Choice
            System.out.println("You played a: " + handNameMETHOD(playerHand) + "\n" + handImageMETHOD(playerHand));
            
            //Display COMP choice
            System.out.println("Your opponent played a: " + handNameMETHOD(compHand) + "\n" + handImageMETHOD(compHand));
            
            //[OUTCOME OF PLAY LOGIC]

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
        
        //[ENDGAME LOGIC]
        //Print Statement to thank player
        System.out.println("Thanks For Playing.");
        //Print Statement to tally performance
        System.out.println("You won " + numOfWins + " time(s) and lost " + numOfLosses + " time(s).");
        
        //Performance Evaluation
        //IF STATEMENT FOR PERFORMANCE EVAL
        //Player Win Logic
        if(numOfWins > numOfLosses)
            {
                System.out.println("Great Job, " + name + " you beat the computer!");   
            }
            //Player Lose Logic
            else if(numOfWins < numOfLosses)
            {
                System.out.println("Sorry, " + name + " the computer beat you!");   
            }
            //Player-Computer Draw Logic
            else if(numOfWins == numOfLosses)
            {
                System.out.println("You tied with the computer!");   
            }
        
    }
    /** 
     * METHOD TO PRINT GAME LOGO
     * 
     */
    public static void showLogoMETHOD()
    {
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

    }
    
    /** 
     * METHOD TO TAKE IN USER NAME ENTRY AND STORE AS rawName
     * 
     * @return rawName
     */
    public static String nameEntryMETHOD()
    {
        Scanner nameKB = new Scanner (System.in);
        System.out.println("");
        System.out.println("Please Enter Your Name: ");
        String rawName = nameKB.nextLine();
        return rawName;
    }
   
    /**
     * METHOD TO Convert String to Proper Case
     * @param x
     * @return firstLetter + restOfTheName (name)
     */
    public static String toProperCaseMETHOD(String x)
    {
        if (x.length() == 0)
            return "";
        else
        {
            char firstLetter = x.toUpperCase().charAt(0);
            String restOfTheName = x.substring(1).toLowerCase();
            return (firstLetter + restOfTheName);
        }
    }
    
    /** 
     * METHOD TO CONVERT INT INTO NAME OF HAND PLAYED
     * @param x (playerHand, compHand)
     * @return handName String
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

    
    /** 
     * METHOD TO CONVERT INT INTO IMAGE OF HAND PLAYED
     * @param x (playerHand, compHand)
     * @return handImage String
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

    
}
