/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Make Main, Person Super Class, CovidForm Sub Class, BankAccount Sub Class 
 * & allow user to input appropriate values. Submit as single .JAVA file.
 * [OBJECTIVE]
 */

package ji.classworkinheritance;
import java.util.*;
/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Classwork: Inheritance + G&S
 * @version: 1.0 
 * @since Sep 24, 2020
 */

//SUPER CLASS: Person
class Person {

    /// STATES ///
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private double height;
    private int age;
    private char gender;

    
    /// Method: Person ///
    public Person(){}
    /// Constructor: Person ///
    public Person(String newFirstName, String newMiddleName, String newLastName, String newEmail, double newHeight, int newAge, char newGender){
        // NB: We use the this.X to specify to the JVM which instance of the variable we are working from
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.lastName = newLastName;
        this.email = newEmail;
        this.height = newHeight;
        this.age = newAge;
        this.gender = newGender;
    }

    /// GETTERS & SETTERS ///
    
    /// G&S: FIRSTNAME
    // GETTER
    public String getFirstName() {
        return firstName;
    }
    
    // SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /// G&S: MIDDLENAME
    // GETTER
    public String getMiddleName() {
        return middleName;
    }
    
    // SETTER
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    /// G&S: LASTNAME
    // GETTER
    public String getLastName() {
        return lastName;
    }
    
    // SETTER
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /// G&S: EMAIL
    // GETTER
    public String getEmail() {
        return email;
    }
    
    // SETTER
    public void setEmail(String email) {
        this.email = email;
    }
    
    /// G&S: HEIGHT
    // GETTER
    public double getHeight() {
        return height;
    }
    
    // SETTER
    public void setHeight(double height) {
        this.height = height;
    }

    /// G&S: AGE
    // GETTER
    public int getAge() {
        return age;
    }
    
    // SETTER
    public void setAge(int age) {
        this.age = age;
    }
    
    /// G&S: GENDER
    // GETTER
    public char getGender() {
        return gender;
    }
    
    // SETTER
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    /// BEHAVIORS ///
    public void contact(){
        System.out.println("To contact this individual, e-mail: " + getEmail());
    }
}

//SUB CLASS: CovidForm 
class CovidForm extends Person {
    
    /// STATES ///
    private String island;
    private String emergencyContact;
    private String placesVisited;
    private String symptoms;

    /// Constructor + Inheritance: CovidForm from Person ///
    public CovidForm(String newFirstName,String newMiddleName, String newLastName, String newEmail, double newHeight, int newAge, char newGender, String island, String emergencyContact, String placesVisited, String symptoms ) {
	super(newFirstName, newMiddleName, newLastName, newEmail, newHeight, newAge, newGender);
	this.island = island;
        this.emergencyContact = emergencyContact;
        this.placesVisited = placesVisited;
        this.symptoms = symptoms;
    }
    


    /// GETTERS & SETTERS ///

    /// G&S: ISLAND
    // GETTER
    public String getIsland() {
        return island;
    }

    // SETTER
    public void setIsland(String island) {
        this.island = island;
    }
            
    /// G&S: EMERGENCYCONTACT
    // GETTER
    public String getEmergencyContact() {
        return emergencyContact;
    }

    // SETTER
    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
            
    /// G&S: PLACESVISITED
    // GETTER
    public String getPlacesVisited() {
        return placesVisited;
    }

    // SETTER
    public void setPlacesVisited(String placesVisited) {
        this.placesVisited = placesVisited;
    }

    /// G&S: SYMPTOMS
    // GETTER
    public String getSymptoms() {
        return symptoms;
    }

    // SETTER
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

}

//SUB CLASS: BankAccount 
class BankAccount extends Person {
    
    /// STATES ///
    private char accountType;
    private int accountNumber;
    private double balance;

    /// Constructor + Inheritance: BankAccount from Person ///
    public BankAccount(String newFirstName,String newMiddleName, String newLastName, String newEmail, double newHeight, int newAge, char newGender, char accountType, int accountNumber, double balance) {
            super(newFirstName, newMiddleName, newLastName, newEmail, newHeight, newAge, newGender );
            this.accountType = accountType;
            this.accountNumber = accountNumber;
            this.balance = balance;
    }
    


    /// GETTERS & SETTERS ///

    /// G&S: ACCOUNTTYPE
    // GETTER
    public char getAccountType() {
        return accountType;
    }

    // SETTER
    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }

    /// G&S: ACCOUNTNUMBER
    // GETTER
    public int getAccountNumber() {
        return accountNumber;
    }

    // SETTER
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /// G&S: BALANCE
    // GETTER
    public double getBalance() {
        return balance;
    }

    // SETTER
    public void setBalance(double balance) {
        this.balance = balance;
    }
            

}

//MAIN
public class JIClassworkInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Initialize Scanner
       Scanner kb = new Scanner(System.in);
       
/// PERSON INPUT ///
    //Accept User Input: First Name
       System.out.println("Please Enter Your First Name: ");
       String fN = kb.nextLine();
    //Accept User Input: Middle Name
       System.out.println("Please Enter Your Middle Name: ");
       String mN = kb.nextLine();      
    //Accept User Input: Last Name
       System.out.println("Please Enter Your Last Name: ");
       String lN = kb.nextLine();  
    //Accept User Input: EMAIL
       System.out.println("Please Enter Your Email Address: ");
       String em = kb.nextLine(); 
    //Accept User Input: Height
       System.out.println("Please Enter Your Height (in centimeters): ");
       double he = kb.nextDouble();
    //Accept User Input: Age
       System.out.println("Please Enter Your Age: ");
       int ag = kb.nextInt();        
    //Accept User Input: Gender
        System.out.println("Please Enter Your Gender: (F)emale, (M)ale, (O)ther");   
        //CLEAR OUT THE SCANNER
        kb.nextLine();
       //CONVERT THE USER INPUT INTO PREDICTED TEXT CHAR
    //Accept The Raw User Input
       String rawGender = kb.nextLine();
       //Force the Case of the input to UpperCase. Strip the first character of their input and put it in a char
       char ge = rawGender.toUpperCase().charAt(0);
    
/// CovidForm INPUT ///
    //Accept User Input: Island
       System.out.println("Please Enter The Name Of The Island You Reside On: ");
       String is = kb.nextLine();       
    //Accept User Input: Emergency Contact
       System.out.println("Please Enter The Name And Number Of Your Emergency Contact: ");
       String eC = kb.nextLine();
    //Accept User Input: Emergency Contact
       System.out.println("Please Enter The Name Of All Places You Have Visited In The Last 30 Days (separate by a comma): ");
       String pV = kb.nextLine();
    //Accept User Input: Emergency Contact
       System.out.println("Please Enter Any Symptoms You Have Experienced Over The Last 30 Days (separate by a comma): ");
       String sy = kb.nextLine();
       
/// BankAccount INPUT ///
    //Accept User Input: Account Type
       System.out.println("Please Enter The Type Of Account To Access: (S)avings, (C)hequing, (F)ixed Deposit, (B)usiness: ");
       //CONVERT THE USER INPUT INTO PREDICTED TEXT CHAR
    //Accept The Raw User Input
       String rawAcct = kb.nextLine();
       //Force the Case of the input to UpperCase. Strip the first character of their input and put it in a char
       char aT = rawAcct.toUpperCase().charAt(0);       
    //Accept User Input: Account #
       System.out.println("Please Enter The Number of Your Account: ");
       int aN = kb.nextInt();
       
         //GENERATE THE VARIABLES AND RANDOM NUMBERS
        //Call random and attach it to rndNum
        //WE ONLY NEED TO CREATE THE HOLDER FOR RANDOM ONCE as we are using the cointainer again and again
        Random rndNum = new Random();
        //Generate the random variables and constrain them to the given limits (1 - 10,000 inc.)
        int ba = rndNum.nextInt(10000)+1;

        
        //PERSON OBJ: user1_0
        Person user1_0 = new Person(fN, mN, lN, em, he, ag, ge);
        
        //COVIDFORM OBJ: user1_1
        CovidForm user1_1 = new CovidForm(fN, mN, lN, em, he, ag, ge, is, eC, pV, sy);
        
        //COVIDFORM OBJ: user1_2
        BankAccount user1_2 = new BankAccount(fN, mN, lN, em, he, ag, ge, aT, aN, ba);
        
        /// OUTPUT /// 
        System.out.println("-------------------------------------------------");
        System.out.println("[FORM INFORMATION]");
        System.out.println("----------");
        System.out.println("[PERSONAL]");
        System.out.println("First Name: " + user1_0.getFirstName());
        System.out.println("Middle Name: " + user1_0.getMiddleName());
        System.out.println("Last Name: " + user1_0.getLastName());
        System.out.println("E-mail: " + user1_0.getEmail());
        System.out.println("Height: " + user1_0.getHeight() + " cm");
        System.out.println("Age: " + user1_0.getAge());
        System.out.println("Gender: " + user1_0.getGender());
        System.out.println("----------");
        System.out.println("[EPIDEMIOLOGY]");
        System.out.println("Island: " + user1_1.getIsland());
        System.out.println("Emergency Contact: " + user1_1.getEmergencyContact());
        System.out.println("Places Visited: " + user1_1.getPlacesVisited());
        System.out.println("Symptoms Presented: " + user1_1.getSymptoms());
        System.out.println("----------");
        System.out.println("[BANKING]");
        System.out.println("Account Type: " + user1_2.getAccountType());
        System.out.println("Account #: " + user1_2.getAccountNumber());
        System.out.println("Account Balance: $" + user1_2.getBalance() + " BSD");
        System.out.println("-------------------------------------------------");
        user1_0.contact();
        System.out.println("-------------------------------------------------");
    }

}