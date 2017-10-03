/********************************************************************
 * This program simulates flipping a coin 100 times and records
 * the longest run of landing on "Heads" in a row.
 * 
 * @author Cade
 * @version 9/28/2017
 *
// ********************************************************************/

public class CoinTest
{
    public static void main (String[] args)
    {
        final int FLIPS = 10; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        // Create a     coin object
        Coin coin = new Coin();
        System.out.println("\f");
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            // Flip the coin & print the result
            coin.flip();
            System.out.println(coin);
            // Update the run information
            if(coin.isHeads()) {
                currentRun++;
                if(currentRun > maxRun)
                    maxRun++;
            } else
                currentRun = 0;
        }

        // Print the results
        System.out.println("The maximum run of HEADS was " + maxRun);
    }
}
