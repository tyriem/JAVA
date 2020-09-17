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
        dog1.size = 5;
        dog1.age = 3;
        
        //IF-ELSE Statement to print based on size variable
        if (dog1.size < 5){
           System.out.println("Brian says 'yip yip'");
        }
        else
           System.out.println("Brian says 'bark bark'");
        
        
    }

    public static class Dog {
    //NB: Here we set the states/behaviours as private to restrict access to it    
    private String name;
    private int size;
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
    
    ///G&S: SIZE
    // Getter
    public int getSize() {
    return size;
  }

    // Setter
    public void setSize(int newSize) {
    this.size = newSize;
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