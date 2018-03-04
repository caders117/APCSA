public class GoldFish extends Item {
	private int amt;
	
	public GoldFish (String name, String desc, int xPos, int yPos, int amount) {
		super(name, desc, xPos, yPos);
		amt = amount;
	}
}
