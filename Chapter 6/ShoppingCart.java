package ch06;
/**********************************************************************
 * ShoppingCart.java
 *
 * Represents a shopping cart as an array of items
 **********************************************************************/
import java.text.NumberFormat;
public class ShoppingCart
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    
    /**
     * Creates an empty shopping cart with a capacity of 5 items.
     */
    public ShoppingCart()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[5];
    }
    
    /**
     * Adds an item to the shopping cart.
     */
    public void addToCart(String itemName, double price, int quantity)
    {
        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += price * quantity;
        itemCount++;

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
            contents += cart[i].toString() + "\n";
        contents += "\nPlease pay: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
}
