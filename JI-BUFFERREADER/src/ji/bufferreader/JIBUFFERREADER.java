/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  OBJECTIVE
 * [OBJECTIVE]
 */

package ji.bufferreader;

import java.io.*;

import java.util.Scanner;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Input by Stream
 * @version: 1.0 
 * @since Nov 3, 2020
 */
public class JIBUFFERREADER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /// INPUT STREAM READER takes input from the keyboard and reads it into memory as JAVA works on the text 
        //  instead of taking it directly into the JVM which is slower but can take in much more data
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
        String x = input.readLine();
        
        // INPUT SCANNER takes input directly into the JVM which is faster but has limits on the amount of data that can be taken in
        Scanner in = new Scanner (System.in);
        String y = in.nextLine();
    }

}
