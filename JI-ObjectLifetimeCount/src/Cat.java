/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * In the Cat class constructor, i.e. public Cat(), increment the cat counter (the Cat class's static variable catCount) by 1. Decrement it by 1 in the finalize method.
 * Requirements:
 * Add a constructor without parameters to the Cat class, i.e. public Cat().
 * The constructor must increment the value of the variable catCount by 1.
 * Add the finalize method to the Cat class.
 * The finalize method should not return anything (the return type is void).
 * The finalize method should reduce the variable catCount by 1.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Classwork: Object Lifetime Counter
 */

/// Public Class: Cat ///
public class Cat {
    // Init catCount
    //NB: We have to init catCount as public static because we are outside of the main
    // we could also set the this.X instead
    public static int catCount = 0;
    
    /// PSVM ///
    public static void main(String[] args) {

    }
    
    // Construct Class: Cat 
    public Cat(){
    // Increment catCount 
        catCount++;
    }
    
    /// FINALIZE THE OBJECT ///
    public void finalize() throws Throwable
    {
    // Decrement catCount
        catCount--;
    }
}
