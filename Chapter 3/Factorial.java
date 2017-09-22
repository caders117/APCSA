import java.util.Scanner;
/**
 * This program prints the factorial of 
 * a positive integer entered by the user.
 * 
 * @author Cade
 * @version 9/21/2017
 */

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        int total = 0;

        System.out.print("\fEnter a positive integer for me to factorialize: ");
        num = scan.nextInt();

        while(num <= 0){
            System.out.print("Enter a POSITIVE integer: ");
            num = scan.nextInt();
        }

        if(num != 0){
            total = 1;

            for(int i = 1; i <= num; i++)
                total *= i;
        }

        System.out.println(num + "! = " + total);
    }
}
