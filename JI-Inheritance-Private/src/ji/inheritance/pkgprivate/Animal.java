/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.inheritance.pkgprivate;

/**
 *
 * @author T
 * @project: Intermediate Java - Inheritance (PRIVATE)
 */

// Define the SUPER CLASS
/// SUPER CLASS: Animal //
public class Animal {

// Define the variable states in the SUPER CLASS with the private attribute
// NB: We set these as private or protected to establish class security
    /// STATES ///
    private boolean vegetarian;

    private String eats;

    private int noOfLegs;

// Set the method for the class
    public Animal(){}

// Set the contructor for the class
// NB: We set the args to be the VARs we want to define for the objects of the super class
    public Animal(boolean veg, String food, int legs){
// Set the this.X to the args
// NB: We do this to establish exactly which version of the VARs that we will reference
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    /// GETTERS & SETTERS ///
    
    // G&S: VEGETARIAN //
    // GETTER for vegetarian variable
    // NB: We use GETTERS & SETTERS to maintain Class Security but to give other classes limited access to private/protected VARs
    // NB: The exact titling of the GETTERs and SETTERs is not necessarily done as below but its a good framework
    public boolean getVegetarian() {
        return vegetarian;
    }
    
    // SETTER for vegetarian variable
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    
    // G&S: EATS //
    // GETTER for eats var
    public String getEats() {
        return eats;
    }

    // SETTER for eats var
    public void setEats(String eats) {
        this.eats = eats;
    }

    // G&S: NOOFLEGS //
    // GETTER for noOfLegs var
    public int getNoOfLegs() {
        return noOfLegs;
    }
    
    // SETTER for noOfLegs var
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    /// BEHAVIORS ///
    // Build the behaviour eat
    // NB: Public Behaviors do not need the same G&S structure
    public void eat(){
        System.out.println("The animal is eating: " + getEats());
    }
}
