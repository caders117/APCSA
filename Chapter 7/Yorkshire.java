/****************************************************************
 * Yorkshire.java
 *
 * A class derived from Dog that holds information about
 * a Yorkshire terrier. Overrides Dog speak method.
 * 
 * @author Cade
 * @version 2/8/2018
 ****************************************************************/
public class Yorkshire extends Dog
{
    int breedWeight = 13;
    
    /**
     * Constructor -- stores name
     * 
     * @param name name of dog
     */
    public Yorkshire(String name)
    {
        super(name);
    }
    
    /**
     * Small bark -- overrides speak method in Dog
     */
    public String speak()
    {
        return "yap yap";
    }
    
    /**
     * Returns weight
     */
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
