/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * Your task is to implement a “Random Insult Generator” program in Java. 
 *The computer must randomly choose a description and an animal (which are stored in arrays). 
 *There must be at least six descriptions and at least ten animals. 
 *Your program should randomly display an insult made up of a description and an animal. 
 *You should ensure that your code works correctly even if the programmer decides to add 
 *more descriptions or animals to the arrays before running your program.
 *[OBJECTIVE]
 */


package assignmentarrayrandominsult;
import java.util.Random;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Assignment: Arrays - Random Insult Generator
 * @version: 1.0 
 * @since Jun 22, 2020
 */
public class AssignmentArrayRandomInsult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call random and attach it to rndNum
        Random rndNum = new Random();
        
        //Define the String Array for insults
        String[] insult = {"contemptible", "intolerable", "phantasmagorical", "egregiously incompetent", "pathologically narcissistic", "indescribably degenerate"};
        //Define the String Array for animals
        String[] animal = {"Hippopotamus amphibius (hippopotamus)", "Saimiri oerstedii oerstedii (Black-crowned Central American Squirrel Monkey)", "Parastratiosphecomyia stratiosphecomyioides (Soldier Fly)", "Wunderpus photogenicus (Wonderpus Octopus)", "Eumicrotremus orbis (Pacific Spiny Lumpsucker)", "Chlamyphorus truncatus (Pink Fairy Armadillo)", "Nylanderia fulva (Raspberry Crazy Ant)", "Eucrossorhinus dasypogon (Tasseled Wobbegong)", "Deirochelys reticularia (Chicken Turtle)", "Mitsukurina owstoni (Goblin Shark)"};
        //Generate random number limited by the length of entries in Array insult
        int indexInsult = rndNum.nextInt(insult.length);
        //Generate random number limited by the length of entries in Array insult
        int indexAnimal = rndNum.nextInt(animal.length);
        
        //Print subject
        System.out.println("GENERATED INSULT: ");
        //Print random selection of insult with text preamble then random animal name with exclaim ending
        System.out.println("You are a " + insult[indexInsult] + " " + animal[indexAnimal]+ "!");
    }

}
