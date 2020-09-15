/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package jiclasskwork.animalclass;

/**
 *
 * @author T
 * @contributor: TMRM & Breakout Room #3 (Florazel Russell, Shoneldo McKenzie, Kevin Sawyer, Joseph W. Mckinney, Wadneka Blanc)
 * @project: Intermediate Java - Classwork: Making & Calling Classes
 * @version: 1.0 
 * @since Sep 15, 2020
 */
public class JIClasskworkAnimalClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize var catNose OUTSIDE OF LOOP
        String catNose = ""; 
        
        //Initialize var catFur OUTSIDE OF LOOP
        String catFur = ""; 
        
        //[ANIMAL: DOG]
        //Call the Class
        //Start are new mem location: dog1
        Animal dog1 = new Animal();
        //Set var legs to 4 for dog1
        dog1.legs = 4;
        //Set var paws to 4 for dog1
        dog1.paws = 4;
        //Set var nose to true for dog1
        dog1.nose = true;
        //Set var nose to 1 for dog1
        dog1.tail = 1;
        //Set var fur to true for dog1
        dog1.fur = true;

        //[ANIMAL: CAT]
        //Call the Class
        //Start are new mem location: cat1
        Animal cat1 = new Animal();
        //Set var legs to 4 for cat1
        cat1.legs = 4;
        //Set var paws to 4 for cat1
        cat1.paws = 4;
        //Set var nose to true for cat1
        cat1.nose = true;
        //Set var nose to 1 for cat1
        cat1.tail = 1;
        //Set var fur to true for cat1
        cat1.fur = true;
        
        //IF Statement tying cat1.nose bool to String catNose
        if (cat1.nose = true){
           catNose = "has a nose";
        }
        
        //IF Statement tying cat1.fur bool to String catFur
        if (cat1.fur = true){
           catFur = "has fur";
        }
        
        //Print sentence referencing variables for dog1 & cat1
        System.out.println("My dog has " + dog1.legs + " legs and " + dog1.paws + " paws; and my cat " + catNose + " and " + catFur + ".");
    }
    
    //Create the class Animal
    public static class Animal{
    //Init variable legs as an integer
    int legs;
    //Init variable paws as an integer
    int paws;
    //Init variable nose as an bool
    boolean nose;
    //Init variable tail as an integer
    int tail;
    //init variable fur as an bool
    boolean fur;

    }
}
