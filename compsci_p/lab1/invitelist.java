package lab1;
import java.util.Scanner;
public class invitelist {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame", "Ian", "Isobel", "Hakem"};
		for (String guest : guests) {
			System.out.print(guest + " : " + name+" ");
			if(name.equals(guest)) {
				System.out.println(guest + " in list");
				break;
			}
			else {
				System.out.println("not at index");
			}
		}
	}
}
