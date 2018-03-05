
public class NamedThing {
	private int boundsX, boundsY;
	private int x, y;
	private String name, description;
	boolean enabled;
	
	public NamedThing(String name, String description, int xPos, int yPos) {
		x = xPos;
		y = yPos;
		this.name = name;
		this.description = description;
		enabled = true;
	}
	
	public void setEnabled(boolean b) {
		enabled = b;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setBounds(int x, int y) {
		boundsX = x;
		boundsY = y;
	}
	
	public void moveTo(int newX, int newY) {
		if(newX < 0 || newY < 0 || newX > boundsX || newY > boundsY) {
			System.out.println("Can't move out of map.");
			return;
		}
		x = newX;
		y = newY;
	}
	
	public int getBoundsX() {
		return boundsX;
	}
	
	public int getBoundsY() {
		return boundsY;
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
