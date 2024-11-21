package GradedLabs.shoplist;

import java.text.NumberFormat;
import java.util.ArrayList;
public class ShoppingCartObj
{
// an array of Items
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart
private ArrayList<Item> cart = new ArrayList<>();// current cart capacity

// -----------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// -----------------------------------------------------------
public ShoppingCartObj()
{
itemCount = 0;
totalPrice = 0.0;
//cart = new Item[capacity];
}

// -------------------------------------------------------
// Adds an item to the shopping cart.
// -------------------------------------------------------
public void addToCart(String itemName, double price, int quantity)
{

cart.add(new Item(itemName, price, quantity));
itemCount++;

totalPrice += price * quantity;
}

public String toString()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();

String contents = "\nShopping Cart\n";
contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

for (int i = 0; i < itemCount; i++)
contents += cart.get(i).toString() + "\n";

contents += "\nTotal Price: " + fmt.format(totalPrice);
contents += "\n";

return contents;
}

// ---------------------------------------------------------
// Returns the total price of the items in the cart.
// ---------------------------------------------------------
public double getTotal()
{
return totalPrice;
}
}
