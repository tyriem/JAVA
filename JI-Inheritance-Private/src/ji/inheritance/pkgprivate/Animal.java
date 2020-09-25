/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.inheritance.pkgprivate;

/**
 *
 * @author T
 */

//SUPER CLASS
public class Animal {

    /// STATES ///
    private boolean vegetarian;

    private String eats;

    private int noOfLegs;

    public Animal(){}

    public Animal(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    /// GETTERS & SETTERS ///
    public boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    /// BEHAVIORS ///
    public void eat(){
        System.out.println("The animal is eating: " + getEats());
    }
}
