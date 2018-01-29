import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FarmFinch {

    public static Finch myFinch = new Finch();

    public static void main(String[] args) {
        myFinch.quit();
        System.exit(0);
    }

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
            return false;
        }
    }

    public static void cow() {
        myFinch.say("Moo");
        myFinch.setWheelVelocities(100, 100, 2000);
    }

    public static void horse() {
        myFinch.say("Neigh");
        myFinch.setWheelVelocities(50, 100, 2000);
    }

    public static void duck() {
        myFinch.say("Quack");
        myFinch.setWheelVelocities(100, 110, 1000);
        myFinch.setWheelVelocities(110, 100, 1000);
    }

    public static void sheep() {
        myFinch.say("Baa");
        myFinch.setWheelVelocities();
    }
}
