/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Declare a static int variable catCount in the Cat class. Declare a constructor, i.e. public Cat(), that increases this variable by 1.
 * Requirements:
 * Add a constructor to the Cat class.
 * The constructor must be public.
 * Add the catCount field to the Cat class.
 * The catCount field must be an int.
 * The catCount field must be static.
 * The constructor must increment the value of the variable catCount by 1.
 * [OBJECTIVE]
 */

/**
 *
 * @author T
 * @project: Intermediate Java - Classwork: Class Counter
 */

/// Public Class: Cat ///
public class Cat {
        // Init catCount
    public static int catCount = 0;
    
        /// PSVM ///
    public static void main(String[] args) {

    }
    
    // Construct Class: Cat 
    public Cat(){
    // Increment catCount 
        catCount++;
    }
    
}
