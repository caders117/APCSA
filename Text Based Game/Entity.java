import java.util.ArrayList;

public class Entity extends NamedThing {
	
	ArrayList<Item> items;
	
	public Entity(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		items = new ArrayList<Item>();
	}
	
	public void pickUpItem(Item i) {
		items.add(i);
	}
	
	public void dropItem(Item i) {
		items.remove(i);
	}
	
	public void moveTo(int newX, int newY) {
		super.moveTo(newX, newY);
		for(int i = 0; i < items.size(); i++) {
			items.get(i).moveTo(newX, newY);
		}
	}
}
