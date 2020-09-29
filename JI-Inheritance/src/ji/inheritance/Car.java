/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.inheritance;

/**
 *
 * @author T
 */
//SUBCLASS - Child Class
class Car extends Vehicle {
//NB: Private & Public are access modifiers
// Java assumes Public if you don't specify
// Car attribute
  public String modelName = "Mustang";    
 
//OVERRIDE
// NB: @Override tells the JVM to replace the original state or behavior in the super class with another one in the sub class
    @Override
    public void honk(){
        System.out.println("Ah-oooooooooooooooooooooogah");
    }
}

