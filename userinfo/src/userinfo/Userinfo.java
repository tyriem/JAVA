/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinfo;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Accepting Input from User
 * @version: 1.0 
 * @since: 05-18-2020
 */
public class Userinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//YOU MUST DECLARE THE SCANNER AS new. This creates a scanner obj. in memory
   Scanner kb = new Scanner(System.in);
   
   ///ACCEPTING INFORMATION ABOUT A USER
   //Ask the user to enter a number
   System.out.println("Please Enter Your Age:");
   //Pull the user input into the memory buffer
   int age = kb.nextInt();
   //Serialize the memory buffer contents
   int nextAge = (age + 1);
   //Print the buffer contents
    System.out.println("You are " + age + " years old"); 
   //print the serialized buffer contents
    System.out.println("You will be " + nextAge + " years old this time next year");    
    }

}
