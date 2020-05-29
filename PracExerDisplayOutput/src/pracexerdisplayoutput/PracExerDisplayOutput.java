/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */


  /*
OBJECTIVE: Write some code that	prints a diamond shape made of asterisks.
To make	this more exciting, choose your	own shape and display it on the	screen.
  */
package pracexerdisplayoutput;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Displaying Output: ASCII ANIM
 * @version: 1.0 
 * @since May 28, 2020
 */
public class PracExerDisplayOutput {
        /**
     * meth and class to invoke pause
     */
    public static void pause(int ms) {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
}
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {        

  while(true)
       {
//ASCII ANIMATION - FRAME 1
       System.out.println("                         *                        ");
       System.out.println("                        ***                       ");
       System.out.println("                       *****                      ");
       System.out.println("                      *******                     ");
       System.out.println("                       *****                      ");
       System.out.println("                        ***                       ");
       System.out.println("                         *                        ");

//ASCII ANIMATION - FRAME 2       
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
pause(100);
//ASCII ANIMATION - FRAME 3      
       System.out.println("                         *                        ");
       System.out.println("                         **                       ");
       System.out.println("                         ***                      ");
       System.out.println("                         ****                     ");
       System.out.println("                         ***                      ");
       System.out.println("                         **                       ");
       System.out.println("                         *                        "); 

 //ASCII ANIMATION - FRAME 4    
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
pause(100);      
//ASCII ANIMATION - FRAME 5      
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
       System.out.println("                         *                        ");
      
//ASCII ANIMATION - FRAME 6
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
pause(100);       
//ASCII ANIMATION - FRAME 7       
       System.out.println("                         *                        ");
       System.out.println("                        **                        ");
       System.out.println("                       ***                        ");
       System.out.println("                      ****                        ");
       System.out.println("                       ***                        ");
       System.out.println("                        **                        ");
       System.out.println("                         *                        ");

//ASCII ANIMATION - FRAME 8
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
       System.out.println("                                                  ");
pause(100);       
//ASCII ANIMATION - FRAME 9    
       System.out.println("                         *                        ");
       System.out.println("                        ***                       ");
       System.out.println("                       *****                      ");
       System.out.println("                      *******                     ");
       System.out.println("                       *****                      ");
       System.out.println("                        ***                       ");
       System.out.println("                         *                        ");
       }

    }

}
