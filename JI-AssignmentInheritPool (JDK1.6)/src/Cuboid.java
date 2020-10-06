/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/**
 *
 * @author T
 */

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return (getArea() * height);
    }

    {
        /// INSTANCE INIT BLOCK OUTPUT ///
        //NB: THIS ONLY WORKS IN JAVA JDK <=1.6
        //NB: IF THE VALUES INSIDE OR INIT CAN BE STATIC INSTEAD OF INSTANCE
        System.out.println("[Cuboid INFORMATION]");
        System.out.println("Cuboid Height: " + getHeight() + "m");
        System.out.println("Cuboid Area: " + getArea() + "m");
        System.out.println("Cuboid Volume: " + getVolume() + "m^3");
        System.out.println("-------------------------------------------------");
    }
}

