
import java.util.*;
public class Elmo extends Entity{

	Scanner scan = new Scanner(System.in);
	public Elmo(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
	}
	
	public boolean isAdjacent(int x, int y) {
		if(this.getX() - 1 == x) {
			if(this.getY() - 1 == y || this.getY() == y || this.getY() + 1 == y)
				return true;
		} else if(this.getX() == x) {
			if(this.getY() - 1 == y || this.getY() == y || this.getY() + 1 == y)
				return true;
		} else if(this.getX() == x) {
			if(this.getY() - 1 == y || this.getY() == y || this.getY() + 1 == y)
				return true;
		}
		return false;
	}

	public void trivia() {
		Scanner scan = Game.scan;
		while(true) {
			System.out.println("When was the first epidsode of Sesame Street aired?" +
					"\nA.1969" + "\nB.1970" + "\nC.1968" + "\nD.2014");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("A")) {
				correct();
			}
			else {
				wrong();
				break;
			}
			System.out.println("What state is Sesame Street filmed in?" +
					"\nA.New York" + "\nB.California" + "\nC.Florida" + "\nD.Sesame Street is a myth");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("A")) {
				correct();
			}
			else {
				wrong();
				break;
			}
			System.out.println("When was Jerome the Walrus introduced into the show?" +
					"\nA.1969" + "\nB.1982" + "\nC.2017" + "\nD.Jerome is not a character");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("D")) {
				correct();
			}
			else {
				wrong();
				break;
			}
			System.out.println("How tall is Big Bird?" +
					"\nA.3'9''" + "\nB.8'2''" + "\nC.8'3''" + "\nD.Big Bird is not a character");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("A")) {
				correct();
			}
			else {
				wrong();
				break;
			}
			System.out.println("Congratulations, you have won Sesame Adventure!");
		}
	}

	public static void correct() {
		System.out.println("Correct");
	}
	public static void wrong() {
		System.out.println("Wrong! Elmo wins :(");
	}
}