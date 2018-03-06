/**
 * This class has constructors to create a Big Bird, which usually holds goldfish.
 * @author Jonathon Webster and Cade Richard
 * @version 2/23/18
 */
public class BigBird extends Entity {

	public BigBird(int xPos, int yPos) {
		super("Big Bird", "A big, yellow, dangerous bird", xPos, yPos);
	}
	
	public BigBird(int xPos, int yPos, int birdfoodAmt, int goldAmt) {
		super("Big Bird", "A big, yellow, dangerous bird", xPos, yPos);
		getBirdfood().addFood(birdfoodAmt);
		getGoldfish().addFood(goldAmt);
	}
}
