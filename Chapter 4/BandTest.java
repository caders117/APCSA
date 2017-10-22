import java.util.Scanner;

/**
 * This program creates 2 band boosters and reads in the
 * number of boxes sold for each one.
 * @author Cade
 * @version 10/22/17
 */
public class BandTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the name of the band booster: ");
		BandBooster b1 = new BandBooster(scan.next());
		System.out.print("Please enter the name of the band booster: ");
		BandBooster b2 = new BandBooster(scan.next());
		
		System.out.println();
		
		System.out.print("Enter the number of boxes sold by " + b1.getName() + " for week 1: ");
		b1.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + b1.getName() + " for week 2: ");
		b1.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + b1.getName() + " for week 3: ");
		b1.updateSales(scan.nextInt());
		
		System.out.println();
		
		System.out.print("Enter the number of boxes sold by " + b2.getName() + " for week 1: ");
		b2.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + b2.getName() + " for week 2: ");
		b2.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + b2.getName() + " for week 3: ");
		b2.updateSales(scan.nextInt());
		
		System.out.println();
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
