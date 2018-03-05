public class GoldFish extends Item {
	private int amt;
	
	public GoldFish (String name, String desc, int xPos, int yPos, int amount) {
		super(name, desc, xPos, yPos);
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
