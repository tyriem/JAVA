/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 *  OBJECTIVE
 * [OBJECTIVE]
 */

package ji.pkgabstract;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Abstraction
 * @version: 1.0 
 * @since Oct 8, 2020
 */

//ABSTRACT Class
//NB: ABSTRACT Classes cannot be final
//NB: You cannot create an object (instantiate) directly from an abstract class
public abstract class Animal {
            //PROTECTED is a higher layer of security than private
            protected int age;
            public void eat() {
                System.out.println("Animal is eating");
            }
//ABSTRACT Method 
// ABSTRACT Methods must be declared in Abstract classes
//NB: ABSTRACT Methods cannot have bodies
//NB: ABSTRACT Methods cannot return anything
            public abstract String getName();
            
            public abstract String getBrain();
        }
        public class Swan extends Animal {
            public String getName() {
                return "Swan";
            }
        }            

public class JIAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
