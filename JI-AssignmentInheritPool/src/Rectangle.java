/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
 *  The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
 *  In case the width parameter is less than 0 it needs to set the width field value to 0.
 *  In case the length parameter is less than 0 it needs to set the length field value to 0.
 *  Write the following methods (instance methods):
 *  Method named getWidth without any parameters, it needs to return the value of width field.
 *  Method named getLength without any parameters, it needs to return the value of length field.
 *  Method named getArea without any parameters, it needs to return the calculated area (width * length).
 *
 *  Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
 *  The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
 *  In case the height parameter is less than 0 it needs to set the height field value to 0.
 *  Write the following methods (instance methods):
 *  Method named getHeight without any parameters, it needs to return the value of height field.
 *  Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
 * [OBJECTIVE]
 */


//IMPORT: UTILs
import java.util.*;
//IMPORT: MATHs
import java.lang.Math.*;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Inheritance Pool Calculation
 * @version: 1.0 
 * @since Sep 30, 2020
 */
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
