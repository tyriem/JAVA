/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.inheritance.pkgprivate;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Inheritance (PRIVATE)
 * @version: 1.0 
 * @since Sep 24, 2020
 */
public class JIInheritancePrivate {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new object (dog) from the super class (Animal)
        //NB: In the args we set the VARs that were established in the SUPER class
        Animal dog = new Animal(false, "chow", 4);

        //Call the states established in the super class
        System.out.println("Is the dog Vegetarian?" + dog.getVegetarian());
        System.out.println("Dog eats " + dog.getEats());
        System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");

        
        //Create a new object (cat) from the sub class (Cat) that extends the super class (Animal)
        //NB: In the args we set the VARs that were established in the SUPER class and the SUB class
        Cat cat = new Cat(false, "milk", 4, "black");

        //Call the states established in the super class and the sub class
        System.out.println("Is the cat Vegetarian? " + cat.getVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        
        //Call the behaviours established in the super class
        dog.eat();
        //Call the behaviours established in the sub class
        cat.eat();
    }

}
