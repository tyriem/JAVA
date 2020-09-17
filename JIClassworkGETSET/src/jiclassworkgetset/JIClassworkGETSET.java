/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package jiclassworkgetset;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Classwork: GETTERS & SETTERS
 * @version: 1.0 
 * @since Sep 17, 2020
 */
public class JIClassworkGETSET {

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
        car1.year = 1986;

        
        //[Car: Bunta's Subaru]
        //Call the Class and Construct the appropriate Object
        //Start a new mem location: car2
        Car car2 = new Car();
        //Set VARs for car2
        car2.make = "Subaru";       
        car2.classType = "Coupe";
        car2.model = "Impreza";
        car2.year = 1998;
      
        //Print Objects
        System.out.println(car1.make + car1.classType + car1.model + car1.year);
        System.out.println(car2.make + car2.classType + car2.model + car2.year);
    }
public static class Car {
    //NB: Here we set the states/behaviours as private to restrict access to it    
    private String make;
    private String classType;
    private String model;
    private int year;

    
    ///GETTER & SETTER: MAKE
    // Getter
    public String getMake() {
    return make;
  }

    // Setter
    public void setName(String newMake) {
    this.make = newMake;
  }
    
    ///GETTER & SETTER: CLASSTYPE
    // Getter
    public String getClassType() {
    return classType;
  }

    // Setter
    public void setClassType(String newClassType) {
    this.classType = newClassType;
  }
    
    ///GETTER & SETTER: MODEL
    // Getter
    public String getModel() {
    return model;
  }

    // Setter
    public void setModel(String newModel) {
    this.model = newModel;
  }
    
     ///GETTER & SETTER: YEAR
    // Getter
    public int getYear() {
    return year;
  }

    // Setter
    public void setYear(int newYear) {
    this.year = newYear;
  }
}
    
}