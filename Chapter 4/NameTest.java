import java.util.Scanner;

/**
 * This program creates two Name objects and prints out a bunch of
 * the different ways the name can be represented and their lengths.
 * Finally, it compares if the two names are equal.
 * @author Cade
 * @version 10/22/17
 */
public class NameTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the name of person #1 (first middle last): ");
		Name n1 = new Name(scan.next(), scan.next(), scan.next());
		System.out.print("Please enter the name of person #2 (first middle last): ");
		Name n2 = new Name(scan.next(), scan.next(), scan.next());
		
		System.out.println();
		
		System.out.println(n1.firstMiddleLast());
		System.out.println(n1.lastFirstMiddle());
		System.out.println(n1.initials());
		System.out.println("The name length is " + n1.length());
		
		System.out.println();
		
		System.out.println(n2.firstMiddleLast());
		System.out.println(n2.lastFirstMiddle());
		System.out.println(n2.initials());
		System.out.println("The name length is " + n2.length());
		
		System.out.println();
		
		if(n1.equals(n2))
			System.out.println("Both names are the same.");
		else
			System.out.println("Both names are different.");
	}
}
