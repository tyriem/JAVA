/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  Create the Dog class. The dog should have a String name, int age and a String breed, and String coat.
 *  Create getters and setters for all the variables of the Dog class.
 *  Requirements:
 *  The program must not read data from the keyboard.
 *  The Dog class must have a String variable name.
 *  The Dog class must have an int variable age.
 *  The Dog class must have a String variable breed.
 *  The Dog class must have a String variable coat.
 *  The class must have a setter for the variable name.
 *  The class must have a getter for the variable name.
 *  The class must have a setter for the variable age.
 *  The class must have a getter for the variable age.
 *  The class must have a setter for the variable breed.
 *  The class must have a getter for the variable breed.
 *  The class must have a setter for the variable coat.
 *  The class must have a getter for the variable coat.
 * [OBJECTIVE]
 */


/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Practice: Creating Classes
 * @version: 2.0 
 * @since Oct 20, 2020
 */


// Define the CLASS
/// CLASS: Dog //
public class Dog {
    

    /// STATES ///
    private String name;

    private int age;
    
    private String breed;
    
    private String coat;
    
    
/// GETTERS & SETTERS ///
    
    // G&S: NAME //
    // GETTER for name variable
    public String getName() {
        return name;
    }
    
    // SETTER for name variable
    public void setName(String Name) {
        this.name = name;
    }
    
    // G&S: AGE //
    // GETTER for age var
    public int getAge() {
        return age;
    }

    // SETTER for age var
    public void setAge(int age) {
        this.age = age;
    }
    
    
    // G&S: BREED //
    // GETTER for breed variable
    public String getBreed() {
        return breed;
    }
    
    // SETTER for breed variable
    public void setBreed(String Breed) {
        this.breed = breed;
    }
    
    // G&S: COAT //
    // GETTER for coat variable
    public String getCoat() {
        return coat;
    }
    
    // SETTER for coat variable
    public void setCoat(String Coat) {
        this.coat = coat;
    }
}
