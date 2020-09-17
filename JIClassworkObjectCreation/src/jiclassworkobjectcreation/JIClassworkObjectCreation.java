/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package jiclassworkobjectcreation;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Classwork: Creating Objects For a Class
 * @version: 1.0 
 * @since Sep 17, 2020
 */
public class JIClassworkObjectCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///[CARS]
        
        //[CAR: Takumi's AE86]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car1
        Car car1 = new Car();
        //Set VARs for car1
        car1.make = "Toyota";
        car1.classType = "Hatchback";
        car1.model = "Trueno";
        car1.year = "1986";

        
        //[Car: Bunta's Subaru]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car2
        Car car2 = new Car();
        //Set VARs for car2
        car2.make = "Subaru";       
        car2.classType = "Coupe";
        car2.model = "Impreza";
        car2.year = "1998";
        
        //[Car: Aikawa's Lancer EVO]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car3
        Car car3 = new Car();
        //Set VARs for car3
        car3.make = "Mitsubishi";       
        car3.classType = "Sedan";
        car3.model = "Lancer EVO V";
        car3.year = "1998";
        
        //[Car: Keisuke's RX-7]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car4
        Car car4 = new Car();
        //Set VARs for car4
        car4.make = "Mazda";       
        car4.classType = "Coupe";
        car4.model = "RX-7";
        car4.year = "1991";
        
        //[Car: Atsuro's Skyline]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car5
        Car car5 = new Car();
        //Set VARs for car5
        car5.make = "Nissan";       
        car5.classType = "Coupe";
        car5.model = "Skyline 25GT Turbo";
        car5.year = "1997";
        
        
    }
       public static class Car {

        public String make;
        public String classType;
        public String model;
        public String year;

    }
}
