/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Classwork: Object Lifetime Counter
 */
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
