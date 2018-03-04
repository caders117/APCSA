public class BirdFood extends Item {
	private int amt;
	
	public BirdFood(String name, String desc, int xPos, int yPos, int amount) {
		super(name, desc, xPos, yPos);
		amt = amount;
	}
}
