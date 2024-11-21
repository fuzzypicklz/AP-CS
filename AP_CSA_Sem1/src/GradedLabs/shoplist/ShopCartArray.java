package GradedLabs.shoplist;
import java.util.ArrayList;
public class ShopCartArray
{
private ArrayList<Item> cart; // an array of Items
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart

public ShopCartArray()
{
itemCount = 0;
totalPrice = 0.0;
cart = new ArrayList<>();
}


public void addToCart(String itemName, double price, int quantity)
{

cart.add(new Item(itemName, price, quantity));
itemCount++;

totalPrice += price * quantity;
}


public String toString()
{
String contents = "\nShopping Cart\n";
contents += "\nItem\t\tUnit Price\t Quantity\t Total\n";
for (int i = 0; i < itemCount; i++)
contents += cart.get(i).toString() + "\n";

contents += "\nTotal Price: " +totalPrice;
contents += "\n";
return contents;
}


public double getTotal()
{
return totalPrice;
}
}
