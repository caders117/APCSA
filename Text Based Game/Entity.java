import java.util.ArrayList;
import java.util.Collection;

public class Entity extends NamedThing {
	
	ArrayList<Item> items;
	private GoldFish goldfish;
	private BirdFood birdfood;
	
	public Entity(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		items = new ArrayList<Item>();
		goldfish = new GoldFish("Goldfish", "Food to access Elmo", xPos, yPos, 0);
		birdfood = new BirdFood("Birdfood", "Food to scare away birds", xPos, yPos, 0);
		items.add(goldfish);
		items.add(birdfood);
	}
	
	public void setGoldFish(int amt) {
		goldfish.setAmount(amt);
	}
	
	public GoldFish getGoldfish() {
		return goldfish;
	}
	
	public BirdFood getBirdfood() {
		return birdfood;
	}
	
	public void setBirdFood(int amt) {
		birdfood.addFood(amt);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void dropItems(Class<Item> className) {
		for(Item i : items) {
			if(className.isInstance(i))
				items.remove(i);
		}
	}
	
	public void pickUpItemByName(String name) {
		
	}
	
	public void updateItems() {
		for(int i = 0; i < items.size(); i++) {
			items.get(i).moveTo(this.getX(), this.getY());
		}
	}
	
	public void moveTo(int newX, int newY) {
		super.moveTo(newX, newY);
		updateItems();
	}
}
