/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package ji.polymorphism;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Polymorphism
 * @version: 1.0 
 * @since Sep 29, 2020
 */

// SUPER-CLASS: ANIMAL
class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

// SUB-CLASS: PIG
class Pig extends Animal{
    @Override
    public void animalSound(){
        System.out.println("The Pig cries wee wee");
    }
}

// SUB-CLASS: DOG
class Dog extends Animal{
    @Override
    public void animalSound(){
        System.out.println("The Dog barks woof");
    }
}

// SUB-CLASS: BIRD
class Bird extends Animal{
    @Override
    public void animalSound(){
        System.out.println("The Bird screams chirp");
    }
}



public class JIPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // NB: Through polymorphism the super class can take states and behaviours from its sub classes
        Animal animal = new Animal();
        animal.animalSound();
        
        Animal pig1 = new Pig();
        pig1.animalSound();

        Pig babe = new Pig();
        babe.animalSound();

        Animal myPet = new Dog();
        myPet.animalSound();
    }

}
