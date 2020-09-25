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
        Animal dog = new Animal(false, "chow", 4);

        System.out.println("Is the dog Vegetarian?" + dog.getVegetarian());
        System.out.println("Dog eats " + dog.getEats());
        System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");

        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Is the cat Vegetarian? " + cat.getVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        
        dog.eat();
        cat.eat();
    }

}
