import java.util.Scanner;

/**
 * Tests a slightly more flexible account class
 * 
 * @author cade
 * @version 1/25/2018
 */
public class AccountTest2 {
    public static void main(String[] args){
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("\fHow many accounts would you like to be created? ");
        int numAccts = scan.nextInt();
        Account[] accts = new Account[numAccts];
        for(int i = 0; i < numAccts; i++) {
            System.out.print("\n\nEnter the name of Account #" + (i + 1) + ": ");
            name = scan.next();
            accts[i] = new Account(100, name);
            System.out.println(accts[i]);
            System.out.println("Next ID number is: " + Account.getNextNum());
        }
        
        System.out.println("\nThank you bye.");
    }
}
            
