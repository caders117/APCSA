
public class NamedThing {
	private int x, y;
	private String name, description;
	
	public NamedThing(String name, String description, int xPos, int yPos) {
		x = xPos;
		y = yPos;
		this.name = name;
		this.description = description;
	}
	
	public void moveTo(int newX, int newY) {
		if(newX < 0 || newY < 0 || newX > 3 || newY > 3) {
			System.out.println("Can't move out of map.");
			return;
		}
		x = newX;
		y = newY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return name + ": " + description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
