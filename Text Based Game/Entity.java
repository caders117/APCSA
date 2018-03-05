import java.util.ArrayList;

public class Entity extends NamedThing {
	
	ArrayList<Item> items;
	
	public Entity(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		items = new ArrayList<Item>();
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void dropItem(Item i) {
		items.remove(i);
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
