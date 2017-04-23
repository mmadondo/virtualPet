import java.util.*;
/**
 *  The Main Interface simply creates a virtual pet and calls the mainLoop() method on the pet.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainInterface {

    //----------- main method -- needed in all programs 
    public static void main(String[] args)
    {
        VirtualPet snoopy = new VirtualPet();
        snoopy.mainLoop();
    }
}
