/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 *[OBJECTIVE]
 * OPP EXER. 2
 * Create 5 Zerg units, 3 Protoss units, and 4 Terran units.
 * Give them all unique names.
 *[OBJECTIVE]
 */

package ji.exerobjects;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Creating Objects For a Class
 * @version: 1.0 
 * @since Sep 16, 2020
 */
public class JIExerObjects {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        ///[ZERG]
        
        //[Zerg: Zagara]
        //Call the Class
        //Start a new mem location: zerg1
        Zerg zerg1 = new Zerg();
        //Set var name for zerg1
        zerg1.name = "Zagara";

        
        //[Zerg: Daggoth]
        //Call the Class
        //Start a new mem location: zerg2
        Zerg zerg2 = new Zerg();
        //Set var name for zerg2
        zerg2.name = "Daggoth";       
        
         //[Zerg: Zasz]
        //Call the Class
        //Start a new mem location: zerg3
        Zerg zerg3 = new Zerg();
        //Set var name for zerg3
        zerg3.name = "Zasz";
        
        //[Zerg: Zeratul]
        //Call the Class
        //Start a new mem location: zerg4
        Zerg zerg4 = new Zerg();
        //Set var name for zerg4
        zerg4.name = "Rokarr";
        
        //[Zerg: Niadra]
        //Call the Class
        //Start a new mem location: zerg5
        Zerg zerg5 = new Zerg();
        //Set var name for zerg5
        zerg5.name = "Niadra";
        
        
        
        //[PROTOSS]
        
        //[Protoss: Karass]
        //Call the Class
        //Start a new mem location: proto1
        Protoss proto1 = new Protoss();
        //Set var name for proto1
        proto1.name = "Karass";

        
        //[Protoss: Raszagal]
        //Call the Class
        //Start a new mem location: proto2
        Protoss proto2 = new Protoss();
        //Set var name for proto2
        proto2.name = "Raszagal";    
        
        //[Protoss: Vorazun]
        //Call the Class
        //Start a new mem location: proto3
        Protoss proto3 = new Protoss();
        //Set var name for proto3
        proto3.name = "Vorazun";
        
        
        //[TERRAN]
        
        //[Terran: Raynor]
        //Call the Class
        //Start a new mem location: terra1
        Terran terra1 = new Terran();
        //Set var name for terra1
        terra1.name = "Raynor";
        
        //[Terran: Rory]
        //Call the Class
        //Start a new mem location: terra2
        Terran terra2 = new Terran();
        //Set var name for terra2
        terra2.name = "Rory";
        
        //[Terran: Egon]
        //Call the Class
        //Start a new mem location: terra3
        Terran terra3 = new Terran();
        //Set var name for terra3
        terra3.name = "Egon";
        
        //[Terran: Tychus]
        //Call the Class
        //Start a new mem location: terra4
        Terran terra4 = new Terran();
        //Set var name for terra2
        terra4.name = "Tychus";
    }



    public static class Zerg {

        public String name;

    }



    public static class Protoss {

        public String name;

    }



    public static class Terran {

        public String name;

    }

}