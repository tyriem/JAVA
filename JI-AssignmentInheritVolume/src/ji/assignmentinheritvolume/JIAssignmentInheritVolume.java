/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
 *  The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
 *  In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 *  Write the following methods (instance methods):
 *  Method named getRadius without any parameters, it needs to return the value of radius field.
 *  Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
 *
 *  Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
 *  The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
 *  In case the height parameter is less than 0 it needs to set the height field value to 0.
 *  Write the following methods (instance methods):
 *  Method named getHeight without any parameters, it needs to return the value of height field.
 *  Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
 * [OBJECTIVE]
 */



package ji.assignmentinheritvolume;
//IMPORT: UTILs
import java.util.*;
//IMPORT: MATHs
import java.lang.Math.*;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Inheritance Volume Calculation
 * @version: 1.0 
 * @since Sep 30, 2020
 */

/// SUPER CLASS: Circle //
class Circle {

// Define the variable states in the SUPER CLASS with the private attribute

    /// STATES ///
    private double radius;


// Set the method for the class
    public Circle(){}

// Set the contructor for the class
    public Circle(double radius){
// Set the this.X to the args
//Force any var radius < 0 to 0
        this.radius = Math.max(0, radius);
    }

    /// GETTERS & SETTERS ///
    
    // G&S: RADIUS//
    // GETTER for radius
    public double getRadius() {
        return radius;
    }
    
    // SETTER for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // G&S: AREA //
    // GETTER for area var
    public double getArea() {
        return (radius * radius * Math.PI);
    }

    // SETTER for area var
    public void setArea(double radius) {
        this.radius = radius;
    }

    /// BEHAVIORS ///
    // Build the behaviour printRad
    // NB: Public Behaviors do not need the same G&S structure
    public void printRad(){
        System.out.println("The radius of the circle is: " + getRadius());
    }
}

// Define the SUB CLASS
/// SUB CLASS: Cylinder //
class Cylinder extends Circle {
    
        // STATES//
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
// Set the this.X to the args
// NB: We can set the variable's value here
		this.height=Math.max(0, height);
	}


        /// GETTERS & SETTERS ///
    
    // G&S: HEIGHT //
    // GETTER for height variable
	public double getHeight() {
		return height;
	}

    // SETTER for height variable
	public void setHeight(double height) {
		this.height = height;
	}

    // G&S: VOLUME //
    // GETTER for volume var
    public double getVolume() {
        return (getArea() * height);
    }

    // SETTER for volume var
    public void setVolume(double area, double height) {
        this.height = height;
    }

}

public class JIAssignmentInheritVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    //Initialize Scanner
    Scanner kb = new Scanner(System.in);
       
    /// SHAPE INPUT ///
    //Accept User Input: Circle Radius
       System.out.println("Please enter the radius of the circle: (in cm)");
       double circRad = kb.nextDouble();
    //Accept User Input: Cylinder Height
       System.out.println("Please enter the height of the cylinder: (in cm)");
       double cylHei = kb.nextDouble();
       
       //CIRCLE OBJ: shape0_1
       Circle shape0_1 = new Circle(circRad);
        
       //CIRCLE OBJ: shape0_1
       Cylinder shape0_2 = new Cylinder(circRad, cylHei);
       
       /// OUTPUT /// 
        System.out.println("-------------------------------------------------");
        System.out.println("[CIRCLE INFORMATION]");
        System.out.println("Circle Radius: " + shape0_1.getRadius() + "cm");
        System.out.println("Circle Area: " + shape0_1.getArea() + "cm^2");
        System.out.println("----------");
        System.out.println("[CYLINDER INFORMATION]");
        System.out.println("Cylinder Height: " + shape0_2.getHeight() + "cm");
        System.out.println("Cylinder Height: " + shape0_2.getArea() + "cm");
        System.out.println("Cylinder Volume: " + shape0_2.getVolume() + "cm^3");
        System.out.println("-------------------------------------------------");
        //shape0_1.printRad();
        System.out.println("-------------------------------------------------");
    }

}
