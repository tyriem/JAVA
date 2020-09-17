/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.classes;

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

        //Call the NON-STATIC Class 
        //NB: IF WE CALL A NON-STATIC Class we have to do it outside of the STATIC Main
        Vegetable onion = new Vegetable();


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Call the Class from outside the main JAVA file
        //Start a new mem location: truck
        Vehicle truck = new Vehicle();
        //Give the new memory location assigned value
        truck.wheels = 4;
        truck.fuel = "diesel";
        truck.doors = 2;

        Vehicle motorbike = new Vehicle();
        motorbike.wheels = 2;
        motorbike.fuel = "gas";
        motorbike.doors = 0;
        
        //Call the Class from within the main JAVA file
        //Start a new mem location: dog
        Animal dog = new Animal();
        //Set var name for dog
        dog.name = "Spot";
        
    }

        //Start a new CLASS Animal
        public static class Animal {
        //Declare the State variable name
        public String name;

        }
        
        //Start a new NON-STATIC CLASS Vegetable
        public class Vegetable {
        //Declare the State variable name
        public String name;

        }
}
