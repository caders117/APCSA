/**
 * This class is the parent class of BirdFood and GoldFish
 * @author Jonathon Webster and Cade Richard
 * @version 2/23/18
 */
public abstract class Item extends NamedThing {
	
	private int amt;
	
	public Item(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
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
