/*******************************************************************
 * DigitPlay.java
 *
 * Finds the number of digits in a positive integer.
 * 
 * @author Cade
 * @version 4/2/2018
 *******************************************************************/
import java.util.Scanner;
public class DigitPlay
{
    public static void main (String[] args)
    {
        int num; //a number
        Scanner scan = new Scanner(System.in);
        System.out.println("\f");
        while(true){
            System.out.println ();
            System.out.print ("Please enter a positive integer: ");
            num = scan.nextInt ();
            if(num == -1) {
                break;
            }
            if (num <= 0)
                System.out.println ( num + " isn't positive -- start over!!");
            else
            {
                // Call numDigits to find the number of digits in the number
                // Print the number returned from num   Digits
                System.out.println ("\nThe number " + num + " contains " +
                    + numDigits(num) + " digits.");
                System.out.println ();
                if(sumDigits(num) % 7 == 0)
                    System.out.println("ok");
                else
                    System.out.println("error");
            }
        }
    }
    
    /**
     * Recursively counts the digits in a positive integer
     * 
     * @param num number to find number of digits
     */
    public static int numDigits(int num)
    {
        if (num < 10)
            return (1);
        else
            return (1 + numDigits(num/10));
    }

    /**
     * Recursively finds the sum of the digits in a positive integer
     * 
     * @param num number to find sum of digits
     */
    public static int sumDigits(int num) {
        return num < 10 ? num : num % 10 + sumDigits(num / 10);
    }
}	
