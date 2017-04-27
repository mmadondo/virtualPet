import java.util.*;
/**
 * Write a description of class VirtualDog here. Java 1
 * 
 * @author (MALVERN MADONDO) 
 * @version (12/4/2015)
 */
public class VirtualPet
{
    // Class level instance variables 
    static Scanner console = new Scanner(System.in);    // declare console for input
    // Constants for each pet state
    static final int HAPPY = 1;                         // constant for Happy state
    static final int ASLEEP = 2;                        // constant for Asleep state
    static final int PLAYFUL = 3;                       // constant for PLAYFUL state
    static final int ANGRY = 4;                       // constant for ANGRY state
    static final int HUNGRY = 5;
    static final int DONE = 6;                          // end the program in this state

    private int  state;                   // current pet state, i.e. on of the constants above such as HAPPY , ASLEEP
    /**
     * The main loop runs the virtul pet. The loop checks the pet's state and calls the correct method to display
     *     that state's menu. The loop continues until the DONE state is reached.
     *
     */
    public void mainLoop()
    {
        state = ASLEEP;         // start dog in asleep state
        while (state!=DONE) {          // keep looping, running code below again and again  

            switch (state) {
                // ================ Case for when dog is Asleep =======================
                case ASLEEP:
                sleepMenu();
                break;
                // ================ Case for when dog is Happy =======================
                case HAPPY:
                happyMenu();
                break;

                // ================ Case for when dog is Playful =======================
                case PLAYFUL:
                playfulMenu();
                break;

                // ================ Case for when dog is angry =======================
                case ANGRY:
                angryMenu();
                break;


                // ================ Case for when dog is hungry =======================
                case HUNGRY:
                hungryMenu();
                break;

                // ================ Case for illegal action    =======================
                default:
                System.out.println("Illegal state! This should never occur.  State is: "+state );            
                break;

            }  // end of switch

        }  // end of while

        System.out.println("Deactivating the virtual dog" );
    }

    /**
     *   Display the menu of options for when the dog is asleep
     */
    private void sleepMenu()
    {
        int action;
        System.out.println("The dog is sleeping.  Zzzzzzz" );
        System.out.println("What do you want to do?" );
        System.out.println("   1) Pet the dog." );
        System.out.println("   2) Leave the dog alone." );
       System.out.println("   3) Quit program." );
        
        action = console.nextInt();      // read the user's action        

        if (action == 1) {

            state = HAPPY;                 //the dog is happy and satisfied
        } else if(action == 2){
            state = ANGRY;                 // the dog wakes up and gets angry at you
        }else {                 // quit the program
        }
    }

    /**
     *   Display the menu of options for when the dog is happy
     */
    private void happyMenu()
    {
        int action;                   // action the user enters    
        System.out.println("The dog is happy and looking at you." );  

        System.out.println("What do you want to do?" );
        System.out.println("   1) Walk the dog." );
        System.out.println("   2) Play ball with the dog." );
        System.out.println("   3) Leave the dog alone." );
        System.out.println("   4) Quit program." );
        action = console.nextInt();      // read the user's action

        if (action == 1) {                  // if you pet the sleeping dog
            state = HAPPY;                  //     then it will be happy
        } else if (action == 2) {           // if you leave the dog alone 
            System.out.println("You played ball with the dog and it still wants to play" );
            state = PLAYFUL;                 //    then the dog stays asleep
        } else if (action == 3) {           // if you leave the dog alone 
            state = ANGRY;                   //    then the dog gets angry
        } else if (action == 4) {           // if you leave the dog alone 
            state = DONE;                   //    then the dog stays asleep
        }

    }

    /**
     *   Display the menu of options for when the dog is playful
     */
    private void playfulMenu()
    {
        int action;                   // action the user enters    
        System.out.println("The dog wants to play and is skipping around you." );  

        System.out.println("What do you want to do?" );
        System.out.println("   1) Throw a bone for the dog to fetch." );
        System.out.println("   2) Pet the dog." );
        System.out.println("   3) Leave the dog alone." );
        System.out.println("   4) Quit program." );
        action = console.nextInt();      // read the user's action

        if (action == 1) {                  // if you throw a bone for the dog to fetch
            System.out.println("The dog fetches the bone but eats it and starts whining at your feet.");
            state = HUNGRY;                  //     the dog might be hungry
            
        } else if (action == 2) {           // if you pet the dog 
            state = HAPPY;               //     then it will be happy
        } else if (action == 3) {           // if you leave the dog alone 
            System.out.println(" You leave the dog alone. It's now angry and is growling at you");

            state = ANGRY;                   //    then the dog gets angry
        }
        else if (action == 4) {           // if you leave the dog alone 
            state = DONE;                   //    then the dog stays asleep
        }

    }

    /**
     *   Display the menu of options for when the dog is angry
     */
    private void angryMenu()
    {
        int action;                   // action the user enters    
        System.out.println("The dog is angry and growling at you." );  

        System.out.println("What do you want to do?" );
        System.out.println("   1) Walk the dog." );
        System.out.println("   2) Feed the dog." );
        System.out.println("   3) Quit program." );
        action = console.nextInt();      // read the user's action

        if (action == 1) {                  // if you pet the sleeping dog
            state = HAPPY;                  //     then it will be happy
        } else if (action == 2) {           // if you leave the dog alone 
            System.out.println("You fed the dog and it looks for a shed and goes to sleep.  zzzzZZZZZZ" );
            state = ASLEEP;                 //    then the dog stays asleep
        } else if (action == 3) {           // if you leave the dog alone 
            state = DONE;                   //    then the dog stays asleep
        }

    }

    /**
     *   Display the menu of options for when the dog is hungry
     */
    private void hungryMenu()
    {
        int action;                   // action the user enters    
        System.out.println("The dog is hungry and whining gently at your feet." );  

        System.out.println("What do you want to do?" );
        System.out.println("   1) Feed the dog." );
        System.out.println("   2) Play ball with the dog." );
        System.out.println("   3) Quit program." );
        action = console.nextInt();      // read the user's action

        if (action == 1) {                  // if you feed the sleeping dog
            state = HAPPY;                  //     then it will be happy
        } else if (action == 2) {           // if you leave the dog alone 
            System.out.println("You played ball with the dog and the dog is now tired and more hungry and starts barking loudly." );
            state = ANGRY;                 //    then the dog gets more hungrier and angrier
        } else if (action == 3) {           // if you leave the dog alone 
            state = DONE;                   //    then the dog stays asleep
        }

    }

}
