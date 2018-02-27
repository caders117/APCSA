/**
 * This is the top class that allows for other classes to
 * name things
 * @author Jonathon Webster
 * @version 2/27/18
 */
public class NamedThing {

    private String name;
    private String description;
    private int xPos;
    private int yPos;

    /**
     * This constructor takes a name, description, x position, 
     * and a y position and assigns them to variables.
     * @param name
     * @param description
     * @param xPos
     * @param yPos
     */
    public NamedThing(String name, String description, int xPos, int yPos){
        this.name = name;
        this.description = description;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * This method return the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * this returns the name and description
     * @return name, description
     */
    public String toString(){
        return name + " " + description;
    }

    /**
     * this return the x position
     * @return xPos
     */
    public int getXPos() {
        return xPos;
    }

    /**
     * this return the y position
     * @return yPos
     */
    public int getYPos() {
        return yPos;
    }
}
