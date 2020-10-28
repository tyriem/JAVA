/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * In each class (Cat and Dog), write a finalize method that displays text about a particular object being destroyed.
 * Requirements:
 * The Cat class must have a void finalize method.
 * The Dog class must have a void finalize method.
 * The Cat and Dog classes must not have constructors or must have constructors without parameters.
 * The Cat class's finalize method should display "A Cat was destroyed".
 * The Dog class's finalize method should display "A Dog was destroyed".
 * [OBJECTIVE]
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
        System.out.println("A Cat was destroyed.");
    }
}

/// Public Class: Dog ///
class Dog{

    /// FINALIZE THE OBJECT ///
    public void finalize() throws Throwable
    {
        // Print Finalization Message
        System.out.println("A Dog was destroyed.");
    }
}
