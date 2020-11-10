/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Add two static methods to the Cat class: int getCatCount() and setCatCount(int), which you can use to get/change the number of cats (variable catCount).
 * Requirements:
 * Add the getCatCount method to the class.
 * The getCatCount method must return an int.
 * The getCatCount method must return the value of the variable catCount.
 * Add a setCatCount method that takes an int to the class.
 * The setCatCount method should not return anything.
 * The setCatCount method must set the variable catCount to the passed value.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 */
public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }
// GETTER for catCount variable
    public static int getCatCount() {
        return catCount;

    }
// SETTER for catCount variable
    public static void setCatCount(int catCount) {
        
//  CLASS REFERENCE
//NB: In a static method SETTER we must use a Class reference (Class.variable) rather than a this.x reference
        Cat.catCount = catCount;
    

    }
/// PSVM ///
    public static void main(String[] args) {

    }
}
