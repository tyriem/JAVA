/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

package jiclasssecurity;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Class Security: GETTERS & SETTERS
 * @version: 1.0 
 * @since Sep 17, 2020
 */
public class JIClassSecurity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    //[HUMAN: Tyrie]
        Person human1 = new Person();
        //Set VARs for car1
        human1.name = "Tyrie";
    }

    public static class Person {
    //NB: Here we set the states/behaviours as private to restrict access to it    
    private String name;

    
    //To allow accesss again we have to use a constructor as such:
    
    // Getter
    public String getName() {
    return name;
  }

    // Setter
    public void setName(String newName) {
    this.name = newName;
  }
}
    
}