import java.util.*;
/**
 * This class represents the Elmo object, and has a method that ends the game with
 * a win or lose
 * @author Jonathon Webster and Cade Richard
 * @version 2/29/18
 */
public class Elmo extends Entity{

	Scanner scan = new Scanner(System.in);
	public Elmo(int xPos, int yPos) {
		super("ELMO!", "Elmo is the boss.  Good luck!", xPos, yPos);
	}

	public void trivia() {
		Scanner scan = Game.scan;
		System.out.println("When was the first epidsode of Sesame Street aired?" +
				"\nA.1969" + "\nB.1970" + "\nC.1968" + "\nD.2014");
		String answer = scan.nextLine();
		while(true) {
			if(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
				if (answer.equalsIgnoreCase("A")) {
					correct();
					break;
				}
				else {
					wrong();
					break;
				}
			} else {
				System.out.println("Invalid answer choice.  Please try again.");
			}
		}
		System.out.println("What state is Sesame Street filmed in?" +
				"\nA.New York" + "\nB.California" + "\nC.Florida" + "\nD.Sesame Street is a myth");
		answer = scan.nextLine();
		while(true) {
			if(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
				if (answer.equalsIgnoreCase("A")) {
					correct();
					break;
				}
				else {
					wrong();
					break;
				}
			} else {
				System.out.println("Invalid answer choice.  Please try again.");
			}
		}
		System.out.println("When was Jerome the Walrus introduced into the show?" +
				"\nA.1969" + "\nB.1982" + "\nC.2017" + "\nD.Jerome is not a character");
		answer = scan.nextLine();
		while(true) {
			if(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
				if (answer.equalsIgnoreCase("D")) {
					correct();
					break;
				}
				else {
					wrong();
					break;
				}
			} else {
				System.out.println("Invalid answer choice.  Please try again.");
			}
		}
		System.out.println("How tall is Big Bird?" +
				"\nA.3'9''" + "\nB.8'2''" + "\nC.8'3''" + "\nD.Big Bird is not a character");
		answer = scan.nextLine();
		while(true) {
			if(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
				if (answer.equalsIgnoreCase("A")) {
					correct();
					break;
				}
				else {
					wrong();
					break;
				}
			} else {
				System.out.println("Invalid answer choice.  Please try again.");
			}
		}
		System.out.println("Congratulations, you have won Sesame Adventure!");
		System.out.println(""
				+ "    _____________\n"
				+ "   /             \\\n"
				+ "  /               \\\n"
				+ " /     |     |     \\\n"
				+ " |     |     |     |\n"
				+ " |                 |\n"
				+ " |                 |\n"
				+ " \\   \\________/    /\n"
				+ "  \\               /\n"
				+ "   \\_____________/\n");
		System.exit(0);
	}

	public static void correct() {
		System.out.println("Correct!\n");
	}
	public static void wrong() {
		System.out.println("Wrong! Game over. Elmo wins :(");
		System.exit(0);
	}
}
