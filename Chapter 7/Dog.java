/****************************************************************
 * Dog.java
 *
 * A class that holds a dog's name and can make it speak.
 *
 * @author Cade
 * @version 2/8/2018
 ****************************************************************/
public abstract class Dog
{
    private String name;
    /**
     * Constructor -- store name
     * 
     * @param name name of dog
     */
    public Dog(String name)
    {
        this.name = name;
    }
    
    /**
     * Returns the dog's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns a string with the dog's comments
     */
    public String speak()
    {
        return "woof";
    }
    
    public abstract int avgBreedWeight();
}
