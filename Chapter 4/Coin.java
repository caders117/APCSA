/*******************************************************************
 *  This class represents a coin that can be flipped.
 *  
 *  @author Lewis and Loftus
 *  @version 9/28/2017
 *
// *******************************************************************/

public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;

    private int face;

    // ---------------------------------------------
    //   Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public Coin ()
    {
        flip();
    }

    // -----------------------------------------------
    //   Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }

    // ---------------------------------------------------------
    //   Returns true if the current face of the coin is heads.
    // ---------------------------------------------------------
    public boolean isHeads()
    {
        return (face == HEADS);
    }

    // ----------------------------------------------------
    //   Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
        String faceName;

        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
    }
}
