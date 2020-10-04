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
 *
 * REQUIRES JDK VERSION <= 1.6
 * NOTE: All ​methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 2 classes.
 * NOTE: Make sure to put each class in its own file. See tabs to the left.
 * NOTE: Do not add a main method to the solution code.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Inheritance Pool Calculation (JDK <= 1.6)
 * @version: 1.0 
 * @since Sep 30, 2020
 */

public class Rectangle {
    private double width;
    private double length;

    public Rectangle (double width, double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        }  else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        }  else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return (width * length);
    }


    {
        /// INSTANCE INIT OUTPUT ///
        //NB: THIS ONLY WORKS IN JAVA JDK <=1.6
        //NB: IF THE VALUES INSIDE OR INIT CAN BE STATIC INSTEAD OF INSTANCE
        System.out.println("-------------------------------------------------");
        System.out.println("[RECTANGLE INFORMATION]");
        System.out.println("Rectangle Width: " + getWidth() + "cm");
        System.out.println("Rectangle Length: " + getLength() + "cm");
        System.out.println("Rectangle Area: " + getArea() + "cm^2");
        System.out.println("----------");
    }
}


