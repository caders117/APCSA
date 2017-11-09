package ch06;
import java.util.ArrayList;
/**********************************************************************
 * Represents a shopping cart as an array of items
 * 
 * @author Cade
 * @version 11/9/17
 **********************************************************************/
import java.text.NumberFormat;
public class ShoppingCart3
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private ArrayList<Item> cart;
    
    /**
     * Creates an empty shopping cart with a capacity of 5 items.
     */
    public ShoppingCart3()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
    }
    
    /**
     * Adds an item to the shopping cart.
     */
    public void addToCart(String itemName, double price, int quantity)
    {
        cart.add(new Item(itemName, price, quantity));
        totalPrice += price * quantity;
    }
    
    /**
     * Returns the contents of the cart together with
     * summary information.
     * 
     * @return a nicely formatted summary of the cart
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nS h o p p i n g  C a r t\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++)
            contents += cart.get(i).toString() + "\n";
        contents += "\nPlease pay: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
}
