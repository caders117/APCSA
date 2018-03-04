
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
		x = newX;
		y = newY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String nameAndDesc() {
		return name + ": " + description;
	}
}
