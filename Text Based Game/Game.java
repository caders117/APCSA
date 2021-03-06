/**
 * This is the driver program that uses methods and objects from
 * various classes to make a text based adventure game
 * @author Jonathon Webster and Cade Richard
 * @version 2/29/18
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

	static Scanner scan = new Scanner(System.in);
	static int NUM_BIGBIRDS = 15;
	static int NUM_BIRDFOOD = 10;

	public static void main(String[] args) {		
		GameBoard game = new GameBoard(10, 10);
		ArrayList<NamedThing> things = new ArrayList<NamedThing>();

		//add stuff to gameboard
		Elmo elmo = new Elmo(game.getBoard().get(0).size()/2, game.getBoard().size()/2);
		elmo.setEnabled(false);
		things.add(elmo);
		Player player = new Player(0, 0);
		things.add(player);
		things.addAll(player.getFoods());
		
		BigBird[] bigBirds = new BigBird[NUM_BIGBIRDS];
		Random rand = new Random();
		int x, y, foodAmt, goldAmt;
		ArrayList<Integer[]> coords = new ArrayList<Integer[]>();
		// Elmo
		coords.add(new Integer[] {5, 5});
		for(int i = 0; i < NUM_BIGBIRDS; i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			Integer[] temp = {x, y};
			while (coords.contains(temp)) {
				x = rand.nextInt(10);
				y = rand.nextInt(10);
				temp[0] = x;
				temp[1] = y;
			}
			coords.add(new Integer[] {x, y});
			
			foodAmt = rand.nextInt(5) + 1;
			goldAmt = rand.nextInt(3) + 1;
			bigBirds[i] = new BigBird(x, y, foodAmt, goldAmt);
			things.add(bigBirds[i]);
			things.addAll(bigBirds[i].getFoods());
		}
		
		BirdFood[] birdFood = new BirdFood[NUM_BIRDFOOD];
		int amt;
		for(int i = 0; i < NUM_BIRDFOOD; i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			Integer[] temp = {x, y};
			while (coords.contains(temp)) {
				x = rand.nextInt(10);
				y = rand.nextInt(10);
				temp[0] = x;
				temp[1] = y;
			}
			amt = rand.nextInt(5) + 5;
			coords.add(new Integer[] {x, y});
			birdFood[i] = new BirdFood(x, y, amt);
			things.add(birdFood[i]);
		}
		
		game.updateBoard(things);
		updateBounds(things, game);

		System.out.println("Welcome to Sesame Adventure!");
		System.out.println("Your goal is to acquire enough goldfish so that you can fight Elmo.");
		System.out.println("You can get goldfish by scaring away Big Birds.");
		System.out.println("Type 'help' for a list of commands.");
		System.out.println("Type 'help' for further details on how to use the command.");
		System.out.println("Good luck!");
		System.out.println(game.printBoard());

		String inputStr;
		while(true) {
			System.out.print("Type command: ");
			inputStr = scan.nextLine();
			inputStr = inputStr.toLowerCase();
			String[] input = inputStr.split(" ");
			if(input[0].equals("help") && input.length == 1) {
				System.out.println(helpString());
				continue;
			} else if(input[0].equals("key") && input.length == 1) {
				System.out.println(keyString());
				continue;
			} else if(input[0].equals("map") && input.length == 1) {
				System.out.println(game.printBoard());
				continue;
			} else if(input[0].equals("inventory") && input.length == 1) {
				if(player.getItems().isEmpty()) {
					System.out.println("Nothing in your inventory.\n");
				} else {
					for(Item i : player.getItems()) {
						System.out.println(i.toString());
					}
				}
				continue;
			} else if(input[0].equals("contents") && input.length == 3) {
				System.out.println(game.contentsOfPos(Integer.valueOf(input[1]), Integer.valueOf(input[2])));
				continue;
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
				break;
				}
			} else if(input.length == 3 && input[0].equals("pick") && input[1].equals("up")) {
				ArrayList<Item> availableItems = checkAdjCellsForItems(game, player);
				ArrayList<Item> itemsPickedUp = new ArrayList<Item>();
				if(!availableItems.isEmpty()) {
					for(Item i : availableItems) {
						if(i.getName().equalsIgnoreCase(input[2])) {
							itemsPickedUp.add(i);
							player.pickUpItem(i);
							player.updateItems();
						}
					}

					if(!itemsPickedUp.isEmpty()) {
						for(Item i : itemsPickedUp) {
							if(i instanceof BirdFood)
								System.out.println("Picked up " + ((BirdFood) i).getAmount() + " " + i.getName());
							else if(i instanceof GoldFish)
								System.out.println("Picked up " + ((GoldFish) i).getAmount() + " " + i.getName());
							else
								System.out.println("Picked up " + i.getName());
						}
						System.out.println();
					} else {
						System.out.println("There are no " + input[2] + "s available to pick up.\n");
						continue;
					}
				} else {
					System.out.println("No items available to pick up.\n");
					continue;
				}
			} else if(input.length == 4 && input[0].equals("throw") && input[1].equals("food")) {
				if(Integer.valueOf(input[2]) >= player.getX() - 2 &&
						Integer.valueOf(input[2]) <= player.getX() + 2 &&
						Integer.valueOf(input[3]) >= player.getY() - 2 &&
						Integer.valueOf(input[3]) <= player.getY() + 2) {
					boolean scaredBird = false;
					player.throwFood();
					BirdFood newFood = new BirdFood(Integer.valueOf(input[2]), Integer.valueOf(input[3]), 5);
					newFood.setEnabled(false);
					for(NamedThing thing : game.getBoard().get(Integer.valueOf(input[3])).get(Integer.valueOf(input[2]))) {
						if(thing instanceof BigBird) {
							((BigBird) thing).dropItems(Item.class);
							((BigBird) thing).setEnabled(false);
							System.out.println("You threw 5 bird food.");
							System.out.println("You scared the bird away!\n");
							scaredBird = true;
							break;
						}
					}
					System.out.println("You threw 5 bird food.\n");
					if(!scaredBird)
						newFood.setEnabled(true);
					things.add(newFood);
				} else {
					System.out.println("The bird food is much too heavy to throw that far you silly goose.\n");
					continue;
				}
			} else if(input.length == 2 && input[0].equals("fight") && input[1].equals("elmo")) {
				if(elmo.isEnabled()) {
					elmo.trivia();
				}
			} else if(input[0].equals("quit") && input.length == 1) {
				System.out.println("Thank you for playing!  Come again soon.");
				break;
			} else {
				System.out.println("Invalid command entered.\n");
				continue;
			}
			if(player.getGoldfish().getAmount() > 14 && !elmo.isEnabled()) {
				elmo.setEnabled(true);
				System.out.println("ELMO has appeared.  Move next to him to fight him.");
			}
			game.updateBoard(things);
			System.out.println(game.printBoard());
			//System.out.println(game.contentsOfPos(p.getX(), p.getY()));
		}
		scan.close();
	}

	public static ArrayList<Item> checkAdjCellsForItems(GameBoard game, Player player) {
		ArrayList<Item> availableItems = new ArrayList<Item>();
		for(int y = -1; y < 2; y++)
			for(int x = -1; x < 2; x++) 
				if(player.getX() + x >= 0 && player.getX() + x < player.getBoundsX() && player.getY() + y >= 0 && player.getY() < player.getBoundsY()) {
					for(NamedThing thing : game.getBoard().get(player.getY() + y).get(player.getX() + x)) {
						if(thing instanceof Item && thing.isEnabled()) availableItems.add((Item) thing);
					}
				}
		return availableItems;
	}

	public static void updateBounds(ArrayList<NamedThing> things, GameBoard game) {
		for(NamedThing thing : things)
			thing.setBounds(game.getBoard().get(0).size(), game.getBoard().size());
	}

	public static String output(String inputStr, GameBoard game) {

		return inputStr;
	}

	public static String keyString() {
		String key = "Key:\n"
				+ "P - Player [You]\n"
				+ "B - Big Bird [Badguy]\n"
				+ "E - Elmo [Boss]\n"
				+ "F - Bird Food [Used to kill Big Birds]\n"
				+ "G - Goldfish [Used to fight Elmo]\n";
		return key;
	}

	public static String helpString() {
		String help = "List of Commands:\n"
				+ "help - Prints a list of commands.\n"
				+ "key - prints key to understand game board.\n"
				+ "map - prints map.\n"
				+ "contents <x> <y> - Prints names and descriptions of objects at position (x, y) of the map.\n"
				+ "inventory - Prints names and descriptions of everything you are holding.\n"
				+ "move - Moves the player [you] in a specified direction:\n"
				+ "       - north - moves player towards top of screen\n"
				+ "       - south - moves player towards bottom of screen\n"
				+ "       - west - moves player towards left side of screen\n"
				+ "       - east - moves player towards right side of screen\n"
				+ "pick up <item name> - picks up item in adjacent cell with specified name\n"
				+ "throw food <x> <y> - throws bird food at specified coordinate.  You cannot throw food more than two squares away.\n"
				+ "fight elmo - if elmo is adjacent to the player [you], initiates boss elmo fight.\n"
				+ "quit - Exits out of the game.  Progress is not saved.\n";
		return help;
	}


}
