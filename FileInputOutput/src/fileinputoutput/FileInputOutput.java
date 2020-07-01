/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * File Input & Output Commands
 *[OBJECTIVE]
 */


package fileinputoutput;
// Import the PrintWriter from the IO (Input|Output) Library
import java.io.*;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - File Input & Output
 * @version: 1.0 
 * @since Jun 24, 2020
 */
public class FileInputOutput {

    /**
     * @param args the command line arguments
     */
    //TO AVOID EXCEPTIONS IN IO WE TELL THE COMPILER TO DISREGARD THE IO EXCEPTION WITH "throws IOException"
    public static void main(String[] args) throws IOException{
// [Write Data To File] //
        
        //Open File
        
        // Create an instance of the PrintWriter object (give it a filename)
        PrintWriter myFile = new PrintWriter("mysibs.txt");
        
        //Write data to the file
        myFile.println("Peter");
        myFile.println("Andre");
        myFile.println("Chadee");
        //NB: IF THE FILE DOESN'T EXIST, THE WAY THIS IS WRITTEN WILL CREATE THE FILE FOR YOU
        //Close the file
        myFile.close();
//////////////////////////////////////////////////////////////////////////////// 
        //NB: IF YOU CALL ANOTHER WRITE TO THE FILE IT OVERWRITES THAT FILE WITH THE NEW INPUT BY DEFAULT
        Random rnd = new Random();
        int number = rnd.nextInt();
        myFile.println(number);
        myFile.close();
//////////////////////////////////////////////////////////////////////////////// 
/// APPEND THE FILE INSTEAD OF OVERWRITE
        //If we specify true at the end of the file writer it appends instead of overwrites
        FileWriter fwriter = new FileWriter("mysibs.txt", true);
        //NB: This line (the print writer gives us access to the print and the print line methods and so we have this line here to give FileWriter) puts something in the middle. 
        //    The File Writer is the middleman here to change that to append.
        PrintWriter appendFile = new PrintWriter(fwriter);
        
        //Write data to the file
        appendFile.println("Ann");
        appendFile.println("Edwin");
        appendFile.close();
////////////////////////////////////////////////////////////////////////////////
// [Read Data From File] //
        //Open the file
        File readFile = new File("mysibs.txt");
        //NB: HERE WE USE inputFile instead of kb as its reading from a file not keyboard
        Scanner inputFile = new Scanner(readFile);
        
        //Check if the file exists
        if (readFile.exists())
        {
        
        //Read first line of data from the file
        int numero = inputFile.nextInt();
        System.out.println(numero);
        
        //Read the file entirely
        while (inputFile.hasNext())
        {
            //Read the next name
            int num = inputFile.nextInt();
            //Display the name
            System.out.println(num);
        }
            
        }
        else
        {
            System.out.println("Invalid File Name");
        }
             
      //Close the file
      inputFile.close();
        
    }

}
