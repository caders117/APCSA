public class BirdFood extends Item {
	
	private int amt;
	
	public BirdFood(String name, String desc, int xPos, int yPos, int amount) {
		super(name, desc, xPos, yPos);
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
