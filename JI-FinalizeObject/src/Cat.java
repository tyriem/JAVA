/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Finalize Object
 */
public class Cat {
    String name;
    
    Cat(String Name)
    {
    this.name = name;
    }
    /// FINALIZE THE OBJECT ///
    //NB: Finalizing of an object is an old garbage collection technique where you manually free the memory of the values of an object
    //Modern programming by and large does not require such manual garbage collection but it is good to know how to perform it.
    protected void finalize() throws Throwable
    {
        System.out.println(name + " has been destroyed.");
    }
}
