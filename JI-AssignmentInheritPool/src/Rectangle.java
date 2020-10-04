/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

//IMPORT: UTILs
import java.util.*;
//IMPORT: MATHs
import java.lang.Math.*;


/// SUPER CLASS: Rectangle //
class Rectangle {

// Define the variable states in the SUPER CLASS with the private attribute

    /// STATES ///
    private double width;
    private double length;


// Set the method for the class
    public Rectangle(){}

// Set the contructor for the class
    public Rectangle(double width, double length){
// Set the this.X to the args
//Force any var radius < 0 to 0
        this.width = Math.max(0, width);
        this.length = Math.max(0, width);
    }

    /// GETTERS & SETTERS ///
    
    // G&S: WIDTH//
    // GETTER for width
    public double getWidth() {
        return width;
    }
    
    // SETTER for width
    public void setWidth(double width) {
        this.width = width;
    }
    
    // G&S: LENGTH//
    // GETTER for length
    public double getLength() {
        return length;
    }
    
    // SETTER for length
    public void setLength(double length) {
        this.length = length;
    }
    
    // G&S: AREA //
    // GETTER for area var
    public double getArea() {
        return (width * length);
    }

    // SETTER for area var
    public void setArea(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /// BEHAVIORS ///
    // Build the behaviour printDim
    // NB: Public Behaviors do not need the same G&S structure
    public void printDimRec(){
        System.out.println("The 2D measure of the pool is: " + getWidth() + " meters wide and " + getLength() + " meters long.");
    }

}
