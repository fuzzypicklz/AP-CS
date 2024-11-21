package GradedLabs.shoplist;
import java.util.Scanner;
public class ShopOneDArr
{
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
Scanner scan_St = new Scanner(System.in);
ShopCartArray Amzon = new ShopCartArray();
String itemName;
double itemPrice;
int itemquantity;
double totalPrice=0.0;
String keepShopping = "y";

System.out.print ("Continue shopping (y/n)? ");
keepShopping = scan.nextLine();

while (keepShopping.equals("y"))
{
System.out.print ("Enter the name of the item: ");
itemName = scan.nextLine();

System.out.print ("Enter the unit price: ");
itemPrice = scan.nextDouble();

System.out.print ("Enter the quantity: ");
itemquantity = scan.nextInt();

Item myitem = new Item (itemName, itemPrice, itemquantity);
Amzon.addToCart(itemName, itemPrice, itemquantity);
// print the contents of the cart object
totalPrice = 0;
System.out.println ("\nCurrent Cart");
System.out.println (myitem);

totalPrice += myitem.getPrice()* myitem.getQuantity();
System.out.println ("Total Price: " + (totalPrice));
System.out.println(Amzon);

System.out.print ("Continue shopping (y/n)? ");
scan.nextLine();
keepShopping = scan.nextLine();

}
}
}