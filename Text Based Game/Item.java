/**
 * This class is the parent class of BirdFood and GoldFish
 * @author Jonathon Webster and Cade Richard
 * @version 2/23/18
 */
public abstract class Item extends NamedThing {
	
	public Item(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
	}

}
