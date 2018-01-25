import java.util.Scanner;

/**
 * Tests an even more flexible account class
 */
public class TransferTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acct = new Account(1000, "John");
        Account acct2 = new Account(1000, "Sally");
        int choice = 0;
        double amt;
        
        System.out.println("\f*****Testing regular transfer method*****");
        while(choice != 3) {

            System.out.println("1 - Transfer from John to Sally's account.");
            System.out.println("2 - Transfer from Sally to John's account.");
            System.out.println("3 - Quit");
            System.out.print("Enter the number to choose an option from above: ");

            if(choice == 1) {
                System.out.print("How much? ");
                amt = scan.nextInt();
                acct.transfer(acct2, amt);
            } else if (choice == 2) {
                System.out.print("How much? ");
                amt = scan.nextInt();
                acct2.transfer(acct, amt);
            }
        }
        
        choice = 0;
        System.out.println("*****Testing static transfer method******");
        while(choice != 3) {

            System.out.println("1 - Transfer from John to Sally's account.");
            System.out.println("2 - Transfer from Sally to John's account.");
            System.out.println("3 - Quit");
            System.out.print("Enter the number to choose an option from above: ");
            choice = scan.nextInt();
            if(choice == 1) {
                System.out.print("How much? ");
                amt = scan.nextInt();
                Account.transfer(acct, acct2, amt);
            } else if (choice == 2) {
                System.out.print("How much? ");
                amt = scan.nextInt();
                Account.transfer(acct2, acct, amt);
            }
        }
    }
}
