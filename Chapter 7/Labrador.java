/****************************************************************
 * Labrador.java
 *
 * A class derived from Dog that holds information about
 * a labrador retriever. Overrides Dog speak method and includes
 * information about avg weight for this breed.
 *
 * @author Cade
 * @version 2/8/2018
 ****************************************************************/
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;
    
    /**
     * Constructor -- sets name and color of lab
     * 
     * @param name name of dog
     * @param color lab's color
     */
    public Labrador(String name, String color)
    {
        super(name);
        this.color = color;
    }
    
    /**
     * Big bark -- overrides speak method in Dog
     */
    public String speak()
    {
        return "BOW WOW";
    }
    
    /**
     * Returns weight
     */
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
