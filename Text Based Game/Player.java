import java.util.ArrayList;
public class Player extends Entity {
    private ArrayList<Item> items;
    
    public Player() {
        super(", description, xPos, yPos);
        items = new ArrayList<Item>();
    }
    
    public void moveNorth() {
        yPos -= 1;
    }
    
    public void moveSouth() {
        yPos += 1;
    }
    
    public void moveWest() {
        xPos += 1;
    }
    
    public void moveEast() {
        xPos -= 1;
    }
}
        
