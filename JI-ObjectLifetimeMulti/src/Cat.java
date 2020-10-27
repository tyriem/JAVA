/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Classwork: Object Lifetime Multi
 */
/// Public Class: Cat ///
public class Cat {
    
    /// PSVM ///
    public static void main(String[] args) {
        
    }

    /// FINALIZE THE OBJECT ///
    public void finalize() throws Throwable
    {
        // Print Finalization Message
        System.out.println("Cat was destroyed.");
    }
}

/// Public Class: Dog ///
class Dog{

    /// FINALIZE THE OBJECT ///
    public void finalize() throws Throwable
    {
        // Print Finalization Message
        System.out.println("Dog was destroyed.");
    }
}
