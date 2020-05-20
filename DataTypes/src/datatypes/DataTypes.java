package datatypes;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intro To Java - Data Types
 * @version: 1.0
 * @since: 05-13-2020
 */
public class DataTypes 
{

    public static void main(String[] args) 
    {
    //Declared Variables
    //Different Data Types
        
    //Numbers
    //Declaring integer variable called varAge
    int varAge;    
    //Assign value to varAge
    varAge = 29;
    //Print value in varAge
    System.out.println(varAge);
    //byte: 1 byte  -128 to 127 | short: 2 bytes  -32,768 to 32,767 | int: 4 bytes -2,147,483,648 to 2,147,483,647 | long: 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    
    //Declaring float variable called varAge_Float
    double varAgeFloat;
    //Assign value to varAge_Float
    varAgeFloat = 29.7f;
    //Print value in varAge_Float
    System.out.println(varAgeFloat);
        //Declaring float variable called varAge_Dub
    double varAgeDub;
    //Assign value to varAge_Float
    varAgeDub = 29.7;
    //Print value in varAgeFloat
    System.out.println(varAgeDub);
    // float:4 bytes, 7 decimal digits [You have to declare f after a float variable in JAVA] | double: 8 bytes, 16 decimal digits [You do not have to declare f for a double float value]
    //If you declare a float and the decimal goes beyond 7 decimals digits then the program will round up the number at the 7th decimal point

    
   //Declaring char variable called varLetter
    char varLetter;
    //Assign value to varAge_Float
    varLetter = 'T';
    //Print value in varAge_Float
    System.out.println(varLetter); 
    //If we print a char we use single quotes
    
       //Declaring string variable called varName
    String varName;
    //Assign value to varAge_Float
    varName = "Tyrie";
    //Print value in varAge_Float
    System.out.println(varName); 
    //If we print a char we use single quotes
    //Strings are declared differently from other variables, it is done: String varStrin;
    
    //A string cannot be converted to a char
    
       //Declaring string variable called varName
    boolean varMale;
    //Assign value to varAge_Float
    varMale = true;
    //Print value in varAge_Float
    System.out.println(varMale); 
    //booleans need to be lowercase 'true' or 'false'
    
     //You can declare and initialize (put a value into) our values in the same line or separately, if you never initialize a variable the jvm will give an error   
    int x;
    x = 1;
    System.out.println(x);
    int y = 2;
    System.out.println(y);
    
    
    //Initializing multiple variables, if you initialize multiple variables in one statement be sure to initialize each of them
    int width = 3, height = 6, depth = 5;
    System.out.println(width);
    System.out.println(height);
    System.out.println (depth) ;
    
    //Variables can be based on previously declared variables
    int length = width;
    System.out.println(length);

    int perimeter = width + height + depth;
  System.out.println(perimeter);
  
    int area = width * height * depth;
  System.out.println(area);
    }
   // Variables names need to start with AlphaSymbolic characters but not numbers (ex. A,a,!,@,#,$,%, etc.)
   

}
