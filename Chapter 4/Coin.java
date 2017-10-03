/*******************************************************************
 *  This class represents a coin that can be flipped.
 *  
 *  @author Cade
 *  @version 10/3/2017
 *
// *******************************************************************/

public class Coin
{
    // instance variables, each coin object has its own copy.
    public static final int HEADS = 0;
    public static final int TAILS = 1;

    private int face;

    /**
     *   Constructor method.  This is invoked whin new Coin() is
     *   executed.  Only executed one time.
     *   Note:
     *      1) name is exactly the same as the class name 'Coin'
     *      2) does not have  a return 'type', not even 'void'
    */
    public Coin () //header (does not have a return type)
    {
        flip(); // flow of control goes to flip() method
    }

    /**
     * Method to simulate coin flipping.  Generates a 'heads' 
     * or tails.
     */
    public void flip() //header, note, NO ; at end of header
    {
        face = (int) (Math.random() * 2);
    }

    /**
     * Method to check if the coin is facing heads up.
     * @return true if 'heads' false if 'tails'
     */
    public boolean isHeads()
    {
        return (face == HEADS);
    }

    /**
     * Returns a string representation of a Coin object.
     * @return <font face="courier">heads</font> or <font face="courier">tails</font>
     */
    public String toString()
    {
        if (isHeads())
            return "Heads";
        else
            return "Tails";
            
    }
}
