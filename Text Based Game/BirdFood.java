
/**
 * This class represent the bird food object and extends Item
 * @author Jonathon Webster and Cade Richard
 * @version 2/23/18
 */
public class BirdFood extends Item {
		
	public BirdFood(int xPos, int yPos, int amount) {
		super("Food", "Use to scare away Big Birds", xPos, yPos);
		amt = amount;
	}
}
