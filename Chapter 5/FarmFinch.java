import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Scanner;

/**
 * Makes a Finch imitate different animals at the farm.
 * 
 * @author Cade
 * @version 1/30/2018
 */
public class FarmFinch {

    public static Finch myFinch = new Finch();

    public static void main(String[] args) {
        System.out.println("\fConnected");
        Scanner scan = new Scanner(System.in);
        String ans = "";
        while(!ans.equals("quit")) {
            System.out.println("\nWhich animal would you like the Finch to mimic?");
            System.out.println("Cow, Horse, Duck, Sheep");
            System.out.println("Type \"quit\" to quit");
            ans = scan.next();
            if(!playAnimal(ans))
                if(!ans.equals("quit"))
                    System.out.println("Invalid entry.  Try again.");
        }        
        System.out.println("Thank you! Bye.");
        
        myFinch.quit();
        System.exit(0);
    }

    /**
     * Plays whatever animal is passed.  Returns false if no valid animal has been passed.
     * 
     * @returns false if no valid animal was passed and true if a valid animal was passed.
     */
    public static boolean playAnimal(String animal) {
        animal = animal.toLowerCase();
        if(animal.equals("cow")) {
            cow();
            return true;
        } else if(animal.equals("horse")) {
            horse();
            return true;
        } else if(animal.equals("duck")) {
            duck();
            return true;
        } else if(animal.equals("sheep")) {
            sheep();
            return true;
        }
        return false;

    }

    /**
     * Method to imitate a cow.
     */
    public static void cow() {
        myFinch.playClip("C:/Users/rich8125/Downloads/cowmoo.wav");
        myFinch.setWheelVelocities(100, 100, 3000);
    }

    /**
     * Method to imitate a horse.
     */
    public static void horse() {
        myFinch.playClip("C:/Users/rich8125/Downloads/horseneigh.wav");
        myFinch.setWheelVelocities(255, 255, 2000);
    }

    /**
     * Method to imitate a duck.
     */
    public static void duck() {
        myFinch.playClip("C:/Users/rich8125/Downloads/duckquack.wav");
        myFinch.setWheelVelocities(100, 120, 1500);
        myFinch.setWheelVelocities(120, 100, 1500);
    }

    /**
     * Method to imitate a sheep.
     */
    public static void sheep() {
        myFinch.playClip("C:/Users/rich8125/Downloads/sheepbleat.wav");
        myFinch.setWheelVelocities(0, 100, 3000);
    }
}
