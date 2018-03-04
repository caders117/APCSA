import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	
	static String[] COMMANDS_LIST = {"description", "move", "help"};

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		GameBoard game = new GameBoard(4, 4);
		ArrayList<NamedThing> things = new ArrayList<NamedThing>();
		Player p = new Player("Player", "You", 0, 0);
		things.add(p);
		BigBird b1 = new BigBird("Big Bird", "A big, yellow, dangerous bird", 3, 3);
		things.add(b1);
		//Elmo elmo = new Elmo("Elmo", "ELMO!!", )
		game.updateBoard(things);
		System.out.println("Welcome to [Game name]!");
		System.out.println("Your goal is to kill enough Big Birds so that you can fight Elmo.");
		System.out.println("Type 'help' for a list of commands.");
		System.out.println("Type '<command> help' for further details on how to use the command.");
		System.out.println("Good luck!");
		System.out.println(Arrays.toString(things.toArray()));

		System.out.println(Arrays.toString(game.getBoard().toArray()));
		System.out.println(game.printBoard());
		System.out.println(game.contentsOfPos(game, p.getX(), p.getY()));
		System.out.print("Type command: ");
		//String input = scan.nextLine();
	}
	
	public static String output(String inputStr) {
		inputStr = inputStr.toLowerCase();
		String[] input = inputStr.split(" ");
		if(input[0].equals("help") && input.length == 1) {
			System.out.println(helpString());
		}
		return inputStr;
	}
	
	public static String helpString() {
		String help = "List of Commands:\n"
				+ "help - Prints either a list of commands or details for a specified command.\n"
				+ "description - Prints description of specified object.\n"
				+ "move - Moves the player [you] in a specified direction.\n"
				+ "quit - Exits out of the game.  Progress is not saved.";
		return help;
	}
	
	
}
