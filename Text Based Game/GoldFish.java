public class GoldFish extends Item {
	private int amt;
	
	public GoldFish (int xPos, int yPos, int amount) {
		super("Goldfish", "Food to access Elmo", xPos, yPos);
		amt = amount;
	}
	
	public void setAmount(int amt) {
		this.amt = amt;
	}
	
	public int getAmount() {
		return amt;
	}
	
	public void addFood(int amt) {
		this.amt += amt;
	}
	
	public String toString() {
		return super.toString() + "  Amount: " + amt;
	}
}
