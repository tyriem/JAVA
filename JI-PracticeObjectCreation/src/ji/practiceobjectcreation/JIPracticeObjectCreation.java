/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * In the main method, create three Cat objects and fill them with data.
 * Requirements:
 * The program must not read data from the keyboard.
 * You need to create three Cat objects.
 * Don't change the Cat class.
 * The program should not display data on the screen.
 * [OBJECTIVE]
 */

package ji.practiceobjectcreation;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Practice - Creating Objects
 * @version: 1.0 
 * @since Oct 20, 2020
 */


// Define the CLASS
/// CLASS: CAT //
class Cat {

    /// STATES ///
    private String name;

    private int age;

    private int weight;
    
    private int strength;



// Set the contructor for the class
    public Cat(String name, int age, int weight, int strength){
// Set the this.X to the args
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    /// GETTERS & SETTERS ///
    
    // G&S: NAME //
    // GETTER for name variable
    public String getName() {
        return name;
    }
    
    // SETTER for name variable
    public void setName(String name) {
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

    // G&S: WEIGHT //
    // GETTER for weight var
    public int getWeight() {
        return weight;
    }
    
    // SETTER for weight var
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
        // G&S: STRENGTH //
    // GETTER for strength var
    public int getStrength() {
        return strength;
    }
    
    // SETTER for strength var
    public void setStrength(int strength) {
        this.strength = strength;
    }
}

public class JIPracticeObjectCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat c1 = new Cat("Lion-O", 3, 200, 9001);
        Cat c2 = new Cat("Panthro", 4, 250, 8000);
        Cat c3 = new Cat("Cheetarah", 2, 150, 69);
    }

}
