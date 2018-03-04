public class Player extends Entity {

	public Player(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
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
}
