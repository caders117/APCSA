package ch06;
import java.util.Scanner;

/**
 * This program is used to test the ShoppingCart
 * class and adding items to a cart.
 * 
 * @author Cade
 * @version 11/9/17
 */
public class ShopTest2
{
   public static void main(String[] args){
       boolean shopping = true;
       Scanner scan = new Scanner(System.in);
       ShoppingCart2 cart = new ShoppingCart2();
       System.out.print("\fDo you want to go shopping? (Y/N) ");
       shopping = scan.next().equalsIgnoreCase("y") ? true : false;
       while (shopping) {
           if(shopping){
               String thing;
               double price;
               int quantity;
               System.out.print("What do you want to buy? ");
               thing = scan.next();
               System.out.print("What's the price? ");
               price = scan.nextDouble();
               System.out.print("How many? ");
               quantity = scan.nextInt();
               cart.addToCart(thing, price, quantity);
           }
           System.out.print("\nDo you want to continue shopping? (Y/N) ");
           shopping = scan.next().equalsIgnoreCase("y") ? true : false;
        }
        
       System.out.println(cart);
      
    }
}
