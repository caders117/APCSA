/**
 * This class has methods for adding box
 * sales, getting the name, and a constructor method.
 * @author Cade
 * @version 10/22/17
 */
public class BandBooster {
	String name;
	int boxesSold;
	
	/**
	 * Constructor sets the name to the parameter and
	 * the boxes sold to 0.
	 * @param n - name of band booster
	 */
	public BandBooster(String n){
		name = n;
		boxesSold = 0;
	}
	
	/**
	 * Gets the name of the band booster
	 * @return the band booster's name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * updates the number of boxes sold
	 * @param addBox - the number of boxes sold
	 */
	public void updateSales(int addBox){
		boxesSold += addBox;
	}
	
	/**
	 * returns a nicely formatted string representation of
	 * the band booster.
	 * @return - string representation of the class
	 */
	public String toString(){
		return name + " sold " + boxesSold + " boxes.";
	}
}
