public class BirdFood extends Item {
	
	private int amt;
	
	public BirdFood(int xPos, int yPos, int amount) {
		super("Food", "Use to scare away Big Birds", xPos, yPos);
		amt = amount;
	}
	
	public void addFood(int amtNew) {
		amt += amtNew;
	}
	
	public void removeFood(int amtRem) {
		amt -= amtRem;
	}
	
	public int getAmount() {
		return amt;
	}
	
	public String toString() {
		return super.toString() + "  Amount: " + amt;
	}
}
