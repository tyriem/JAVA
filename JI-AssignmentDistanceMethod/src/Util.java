/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Implement the static double getDistance(x1, y1, x2, y2) method. It should calculate the distance between two points.
 * Use the double Math.sqrt(double a) method, which calculates the square root of the passed argument.
 * Requirements:
 * The getDistance method must return a double.
 * The getDistance method must be static.
 * The getDistance method must be public.
 * The getDistance method must return the distance between the points.
 * The getDistance method must use the double Math.sqrt(double a) method.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Assignment: Static Method - Distance
 */

//IMPORT Math
import java.lang.Math;

//Class: Util
public class Util {
    
//Distance GETTER    
    public static double getDistance(int x1, int y1, int x2, int y2) {
// Set VARs
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
// Declare distance VAR
        double distance;
// Set distance var to √((x2-x1)²+(y2-y1)²)
        distance = (Math.sqrt(Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)));
//return distance
        return distance;
        
    }

    public static void main(String[] args) {
//Make line from Util Class
        Util line = new Util();
    }
}
