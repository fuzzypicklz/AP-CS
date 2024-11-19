package GradedLabs.arraylist;

import java.util.ArrayList;
public class arraylistdriver {

	public static void main (String []args) {
		contactlist cl1 = new contactlist("Alek", "Yoon", "4242132132", 90275);
		contactlist cl2 = new contactlist("Alan", "Xie", "3102324938", 90274);
		contactlist cl3 = new contactlist("Daniel", "Weiss", "3235436463", 90505);
		contactlist cl4 = new contactlist("Sam", "Lin", "5949593959", 90275);
		contactlist cl5 = new contactlist("Arnag", "Garg", "4245390404", 90275);
		
		ArrayList<contactlist> contacts = new ArrayList<contactlist>();
		contacts.add(cl1);
		contacts.add(cl2);
		contacts.add(cl3);
		contacts.add(cl4);
		contacts.add(cl5);

		contactlist[] arr = new contactlist[5];
		arr[0] = cl1;
		arr[1] = cl2;
		arr[2] = cl3;
		arr[3] = cl4;
		arr[4] = cl5;
		
		alist.ArrayIncrement(arr);
		alist.ArrayListIncrement(contacts);

	}
}
