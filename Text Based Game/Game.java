import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	
	static String[] COMMANDS_LIST = {"description", "move", "help"};

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		GameBoard game = new GameBoard(4, 4);
		ArrayList<NamedThing> things = new ArrayList<NamedThing>();
		Player player = new Player("Player", "You", 0, 0);
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
		System.out.println(game.contentsOfPos(p.getX(), p.getY()));
		System.out.print("Type command: ");
		String inputStr = scan.next();
		inputStr = inputStr.toLowerCase();
		String[] input = inputStr.split(" ");
		if(input[0].equals("help") && input.length == 1) {
			System.out.println(helpString());
		} else if(input[0].equals("contents") && input.length == 3) {
			System.out.println(game.contentsOfPos(Integer.getInteger(input[1]), Integer.getInteger(input[2])));
		} else if(input[0].equals("move") && input.length == 2) {
			switch(input[1]) {
				case "north": player.moveNorth();
							  break;
				case "south": player.moveSouth();
							  break;
				case "west":  player.moveWest();
							  break;
				case "east":  player.moveEast();
							  break;
				default:	  System.out.println("Invalid Direction");
			}
		} else if(input[0].equals("quit") && input.length == 1) {
			System.out.println("Thank you for playing!  Come again soon.");
			System.exit(0);
		} else {
			System.out.println("Invalid command entered.");
		}
		scan.close();
	}
	
	public static String output(String inputStr, GameBoard game) {
		
		return inputStr;
	}
	
	public static String helpString() {
		String help = "List of Commands:\n"
				+ "help - Prints a list of commands.\n"
				+ "contents <x> <y> - Prints names and descriptions of objects at position (x, y) of the map.\n"
				+ "move - Moves the player [you] in a specified direction:\n"
				+ "       - north - moves player towards top of screen\n"
				+ "       - south - moves player towards bottom of screen\n"
				+ "       - west - moves player towards left side of screen\n"
				+ "       - east - moves player towards right side of screen\n"
				+ "quit - Exits out of the game.  Progress is not saved.";
		return help;
	}
	
	
}
