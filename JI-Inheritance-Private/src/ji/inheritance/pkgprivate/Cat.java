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

// Define the SUB CLASS
/// SUB CLASS: Cat //
// NB: We set the flag 'extends' while establishing the sub-class to tie it to the super-class
public class Cat extends Animal {
    
        // STATES//
        // Set the var color as private
	private String color;

        //A // Set the contructor for the class
// NB: We set the args to be the VARs we want to define for the objects of the sub class 
// from the super class
	public Cat(boolean veg, String food, int legs) {
		super(veg, food, legs);
// Set the this.X to the args
// NB: We can set the variable's value here
		this.color="White";
	}

        //B // Set the contructor for the class
// NB: We set the args to be the VARs we want to define for the objects of the sub class 
// from both the super class and the sub class
	public Cat(boolean veg, String food, int legs, String color){
		super(veg, food, legs);
// Set the this.X to the args
// NB: We can set the variable's value from another class (ex. Main)
		this.color=color;
	}

        /// GETTERS & SETTERS ///
    
    // G&S: Color //
    // GETTER for color variable
	public String getColor() {
		return color;
	}

    // SETTER for color variable
	public void setColor(String color) {
		this.color = color;
	}

}
