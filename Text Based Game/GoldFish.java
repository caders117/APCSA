/**
 * This class represent the goldfish item, and extends the Item class
 * @author Jonathon Webster and Cade Richard
 * @version 2/23/18
 */
public class GoldFish extends Item {
	
	public GoldFish (int xPos, int yPos, int amount) {
		super("Goldfish", "Food to access Elmo", xPos, yPos);
		amt = amount;
	}
}
