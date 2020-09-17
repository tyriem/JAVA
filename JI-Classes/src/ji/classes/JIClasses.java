/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.classes;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Classes
 * @version: 1.0 
 * @since Sep 15, 2020
 */
//


public class JIClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        //Call the Class
        Vehicle truck = new Vehicle();
        truck.wheels = 4;
        truck.fuel = "diesel";
        truck.doors = 2;

        Vehicle motorbike = new Vehicle();
        motorbike.wheels = 2;
        motorbike.fuel = "gas";
        motorbike.doors = 0;
        
        
    }

}
