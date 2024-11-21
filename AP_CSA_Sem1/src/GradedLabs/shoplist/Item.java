package GradedLabs.shoplist;

public class Item
{
private String name;
private double price;
private int quantity;

public Item (String itemName, double itemPrice, int numPurchased)
{
name = itemName;
price = itemPrice;
quantity = numPurchased;
}

public double getPrice()
{
return price;
}

public String getName()
{
return name;
}

public int getQuantity()
{
return quantity;
}

public String toString ()
{
return (name + "\t"+ price + "\t" + quantity +"\t" + price*quantity);
}


}
