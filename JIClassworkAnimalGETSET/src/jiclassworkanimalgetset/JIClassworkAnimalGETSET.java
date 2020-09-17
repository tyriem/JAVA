/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package jiclassworkanimalgetset;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Classwork: G&S + If
 * @version: 1.0 
 * @since Sep 17, 2020
 */
public class JIClassworkAnimalGETSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Start a new mem location: human1
        Dog dog1 = new Dog();
        //Set variable name for human1
        dog1.name = "Brian";
        dog1.height = 5;
        dog1.age = 3;
        
        //IF-ELSE Statement tying cat1.nose bool to String catNose
        if (dog1.height < 5){
           System.out.println("Brians says 'yip yip'");
        }
        else
           System.out.println("Brians says 'bark bark'");
        
        
    }

    public static class Dog {
    //NB: Here we set the states/behaviours as private to restrict access to it    
    private String name;
    private int height;
    private int age;

    ///G&S: NAME
    // Getter
    public String getName() {
    return name;
  }

    // Setter
    public void setName(String newName) {
    this.name = newName;
  }
    
    ///G&S: HEIGHT
    // Getter
    public int getHeight() {
    return height;
  }

    // Setter
    public void setHeight(int newHeight) {
    this.height = newHeight;
  }
    
    ///G&S: AGE
    // Getter
    public int getAge() {
    return age;
  }

    // Setter
    public void setAge(int newAge) {
    this.age = newAge;
  }
}
    
}