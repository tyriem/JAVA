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

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Inheritance Pool Calculation
 * @version: 1.0 
 * @since Sep 30, 2020
 */

import java.util.Scanner;

public class JIAssignmentInheritPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    //Initialize Scanner
    Scanner kb = new Scanner(System.in);
       
    /// SHAPE INPUT ///
    //Accept User Input: Rectangle Width
       System.out.println("Please enter the width of the rectangle: (in meters)");
       double recWid = kb.nextDouble();
    //Accept User Input: Rectangle Length
       System.out.println("Please enter the length of the rectangle: (in meters)");
       double recLen = kb.nextDouble();
     
    //Accept User Input: Cuboid Height
       System.out.println("Please enter the height of the cuboid: (in meters)");
       double cubHei = kb.nextDouble();   
       
       //Rectangle OBJ: shape0_1
       Rectangle shape0_1 = new Rectangle(recWid, recLen);
        
       //Cuboid OBJ: shape0_1
       Cuboid shape0_2 = new Cuboid(recWid, recLen, cubHei);
       
       /// OUTPUT /// 
        System.out.println("-------------------------------------------------");
        System.out.println("[RECTANGLE INFORMATION]");
        System.out.println("Rectangle Width: " + shape0_1.getWidth() + "m");
        System.out.println("Rectangle Length: " + shape0_1.getLength() + "m");
        System.out.println("Rectangle Area: " + shape0_1.getArea() + "m^2");
        System.out.println("----------");
        System.out.println("[Cuboid INFORMATION]");
        System.out.println("Cuboid Height: " + shape0_2.getHeight() + "m");
        System.out.println("Cuboid Area: " + shape0_2.getArea() + "m");
        System.out.println("Cuboid Volume: " + shape0_2.getVolume() + "m^3");
        System.out.println("-------------------------------------------------");
        shape0_1.printDimRec();
        shape0_2.printDimCub();
        System.out.println("-------------------------------------------------");
    }

}
