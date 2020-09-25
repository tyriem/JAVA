/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.inheritance;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Inheritance (PUBLIC)
 * @version: 1.0 
 * @since Sep 22, 2020
 */
public class JIInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //CONSTRUCTOR
    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
        
//Class Variable


    }

}

