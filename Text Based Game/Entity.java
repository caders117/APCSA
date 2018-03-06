import java.util.ArrayList;
import java.util.Collection;

public abstract class Entity extends NamedThing {
	
	ArrayList<Item> items;
	private GoldFish goldfish;
	private BirdFood birdfood;
	
	public Entity(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		items = new ArrayList<Item>();
		goldfish = new GoldFish(xPos, yPos, 0);
		birdfood = new BirdFood(xPos, yPos, 0);
		items.add(goldfish);
		items.add(birdfood);
		this.addItem(goldfish);
		this.addItem(birdfood);
	}
	
	public Collection<Item> getFoods() {
		ArrayList<Item> foods = new ArrayList<Item>();
		foods.add(goldfish);
		foods.add(birdfood);
		return foods;
	}

	public GoldFish getGoldfish() {
		return goldfish;
	}
	
	public BirdFood getBirdfood() {
		return birdfood;
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
	
	public void addItem(Item i) {
		if(i instanceof BirdFood)
			birdfood.addFood(((BirdFood) i).getAmount());
		else if(i instanceof GoldFish)
			goldfish.addFood(((GoldFish) i).getAmount());
	}
	
	public void updateItems() {
		for(int i = 0; i < items.size(); i++) {
			items.get(i).moveTo(this.getX(), this.getY());
			items.get(i).setEnabled(false);
		}
	}
	
	public void moveTo(int newX, int newY) {
		super.moveTo(newX, newY);
		updateItems();
	}
}
