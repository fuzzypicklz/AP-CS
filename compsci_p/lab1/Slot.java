package lab1;

import java.util.Random;
import java.util.Scanner;
public class Slot {
	
	public static void main (String[] args) {
		while(true) {
			Scanner s = new Scanner(System.in);
			Random random = new Random();
			int n1 = random.nextInt(1,15);
			int n2 = random.nextInt(1,15);
			int n3 = random.nextInt(1,15);
			System.out.println(n1+"-"+n2+"-"+n3);
			if(n1==n2&&n1==n3) {
				//3 of a kind
				System.out.println("jackpot");
			}
			
			else if(n1==n2||n1==n3||n2==n3) {
				//2 of a kind
				System.out.println("2 of a kind");
			}
			else {
				//loss
				System.out.println("you lose");
			}
			System.out.println("again?");
			s.next();
		}
		
		
	}
}
