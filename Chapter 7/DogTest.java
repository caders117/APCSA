/****************************************************************
 * DogTest.java
 *
 * A simple test class that creates a Dog and makes it speak.
 *
 * @author Cade
 * @version 2/8/2018
 ****************************************************************/
public class DogTest
{
    public static void main(String[] args)
    {

        Yorkshire york = new Yorkshire("Spot");
        Labrador lab = new Labrador("Fido", "Black");

        System.out.println(york.getName() + " says " + york.speak());
        System.out.println("Yorkshire average weight: " + york.avgBreedWeight());
        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println("Labrador average weight: " + lab.avgBreedWeight());
    }
}
