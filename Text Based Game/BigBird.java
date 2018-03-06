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
