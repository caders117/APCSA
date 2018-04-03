/******************************************************************
 * Fib.java
 *
 * A utility class that provide methods to compute elements of the
 * Fibonacci sequence.
 ******************************************************************/
public class Fib
{
    /**
     * Recursively computes fib(n)
     * 
     * @param n number to get fibonacci of
     */
    public static int fib1(int n)
    {       
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else  return fib1(n - 1) + fib1(n - 2);
    }
    
    /**
     * Iteratively computes fib(n)
     * 
     * @param n number to get fibonacci of
     */
    public static int fib2(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[fib.length - 1];
    }
}
