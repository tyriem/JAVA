/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */

/*
 * [OBJECTIVE]
 * Make 5 sub classes that inherit from the super class
 * [OBJECTIVE]
 */

package ji.classworkdpolymorph;

/**
 *
 * @author T
 * @contributor: TMRM
 * @project: Intermediate Java - Polymorphism
 * @version: 1.0 
 * @since Sep 29, 2020
 */


// SUPER-CLASS: MOVIE
class Movie{
    private String name;
    
    public Movie(String name){
        this.name = name;
    }
    
    public String plot(){
        return "No plot here";
    }
}

// SUB-CLASS: Bad Boys
class BadBoys extends Movie{

        public BadBoys(){
              super("Bad Boys");
        }
        
        @Override
        public String plot() {
            return "Two cops break the law to arrest/kill law breakers";
        }
}

// SUB-CLASS: Jaws
class Jaws extends Movie{

        public Jaws(){
              super("Jaws");
        }
        
        @Override
        public String plot() {
            return "Shark wants to make friends with humans that keep falling in its mouth";
        }
}

// SUB-CLASS: Transformers
class Transformers extends Movie{

        public Transformers(){
              super("Transformers");
        }
        
        @Override
        public String plot() {
            return "Standard military chase McGuffin...oh and some ugly robots punch eachother";
        }
}

// SUB-CLASS: Pacific Rim
class PacificRim extends Movie{

        public PacificRim(){
              super("Pacific Rim");
        }
        
        @Override
        public String plot() {
            return "Neon Genesis but with GladOS";
        }
}


// SUB-CLASS: Fight Club
class FightClub extends Movie{

        public FightClub(){
              super("Fight Club");
        }
        
        @Override
        public String plot() {
            return "Edward Norton plays with himself and others";
        }
}

public class JIClassworkdPolymorph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
