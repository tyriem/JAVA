
import java.util.Scanner;

public class JIAssignmentInheritPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    //Initialize Scanner
    Scanner kb = new Scanner(System.in);
       
    /// SHAPE INPUT ///
    //Accept User Input: Rectangle Width
       System.out.println("Please enter the width of the rectangle: (in meters)");
       double recWid = kb.nextDouble();
    //Accept User Input: Rectangle Length
       System.out.println("Please enter the length of the rectangle: (in meters)");
       double recLen = kb.nextDouble();
     
    //Accept User Input: Cuboid Height
       System.out.println("Please enter the height of the cuboid: (in meters)");
       double cubHei = kb.nextDouble();   
       
       //CIRCLE OBJ: shape0_1
       Rectangle shape0_1 = new Rectangle(recWid, recLen);
        
       //CYLINDER OBJ: shape0_1
       Cuboid shape0_2 = new Cuboid(recWid, recLen, cubHei);
       
       /// OUTPUT /// 
        System.out.println("-------------------------------------------------");
        System.out.println("[RECTANGLE INFORMATION]");
        System.out.println("Rectangle Width: " + shape0_1.getWidth() + "cm");
        System.out.println("Rectangle Length: " + shape0_1.getLength() + "cm");
        System.out.println("Rectangle Area: " + shape0_1.getArea() + "cm^2");
        System.out.println("----------");
        System.out.println("[Cuboid INFORMATION]");
        System.out.println("Cuboid Height: " + shape0_2.getHeight() + "cm");
        System.out.println("Cuboid Area: " + shape0_2.getArea() + "cm");
        System.out.println("Cuboid Volume: " + shape0_2.getVolume() + "cm^3");
        System.out.println("-------------------------------------------------");
        shape0_1.printDimRec();
        shape0_2.printDimCub();
        System.out.println("-------------------------------------------------");
    }

}
