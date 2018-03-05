public class Player extends Entity {

	private GoldFish goldfish;
	private BirdFood birdfood;
	
	public Player(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		goldfish = new GoldFish("Goldfish", "Food to access Elmo", xPos, yPos, 0);
		birdfood = new BirdFood("Birdfood", "Food to scare away birds", xPos, yPos, 0);
		items.add(goldfish);
		items.add(birdfood);
	}
	
	public GoldFish getGoldfish() {
		return goldfish;
	}
	
	public BirdFood getBirdfood() {
		return birdfood;
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
		birdfood.removeFood(5);
	}
	
	public void pickUpItem(Item i) {
		if(i instanceof BirdFood) {
			birdfood.addFood(((BirdFood) i).getAmount());
			i.setEnabled(false);
		} else if(i instanceof GoldFish) {
			goldfish.addFood(((GoldFish) i).getAmount());
			i.setEnabled(false);
		} else {
			items.add(i);
		}
	}
}
