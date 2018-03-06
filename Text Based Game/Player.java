/**
 * This class represents the player who moves around the grid and tries
 * to win the game. It extends entity.
 * @author Jonathon Webster and Cade Richard
 * @version 2/27/18
 */
public class Player extends Entity {

	public Player(int xPos, int yPos) {
		super("Player", "You", xPos, yPos);
	}
	
	public void moveNorth() {
		moveTo(getX(), getY() - 1);
		
	}
	
	public void moveSouth() {
		moveTo(getX(), getY() + 1);
	}
	
	public void moveWest() {
		moveTo(getX() - 1, getY());
	}
	
	public void moveEast() {
		moveTo(getX() + 1, getY());
	}
	
	public void throwFood() {
		getBirdfood().removeFood(5);
	}
	
	public void pickUpItem(Item i) {
		if(i instanceof BirdFood) {
			getBirdfood().addFood(((BirdFood) i).getAmount());
			i.setEnabled(false);
		} else if(i instanceof GoldFish) {
			getGoldfish().addFood(((GoldFish) i).getAmount());
			i.setEnabled(false);
		} else {
			items.add(i);
		}
	}
}
