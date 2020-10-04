/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Assignment: Inheritance Pool Calculation
 * @version: 1.0 
 * @since Sep 30, 2020
 */

// Define the SUB CLASS
/// SUB CLASS: Cuboid //
class Cuboid extends Rectangle {
    
        // STATES//
	private double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
// Set the this.X to the args
// NB: We can set the variable's value here
		this.height = Math.max(0, height);
	}


        /// GETTERS & SETTERS ///
    
    // G&S: HEIGHT //
    // GETTER for height variable
	public double getHeight() {
		return height;
	}

    // SETTER for height variable
	public void setHeight(double height) {
		this.height = height;
	}

    // G&S: VOLUME //
    // GETTER for volume var
    public double getVolume() {
        return (getArea() * height);
    }

    // SETTER for volume var
    public void setVolume(double area, double height) {
        this.height = height;
    }

     /// BEHAVIORS ///
    // Build the behaviour printDim
    // NB: Public Behaviors do not need the same G&S structure
    public void printDimCub(){
        System.out.println("The 3D measure of the pool is: " + getHeight() + " meters high , " + getArea() + " meters square area, and " + getVolume() + " meters cube volume.");
    }
}
