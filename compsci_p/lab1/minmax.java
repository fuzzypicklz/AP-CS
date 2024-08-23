package lab1;

import java.util.Scanner;
public class minmax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("n1");
			int n1 = s.nextInt();
			System.out.println("n2");
			int n2 = s.nextInt();
			System.out.println("n3");
			int n3 = s.nextInt();
			int max = 0;
			int min = 0;
			if(n1 > n2 && n1 > n3) {
				max=n1;
			}
			else if(n2 > n1 && n2 > n3) {
				max=n2;
			}
			else if(n3>n1&&n3>n2) {
				max=n3;
			}
			
			if(n1 < n2 && n1 < n3) {
				min=n1;
			}
			else if(n2 < n1 && n2 < n3) {
				min=n2;
			}
			else if(n3<n1&&n3<n2) {
				min=n3;
			}
			
			System.out.println("max " + max);
			System.out.println("min " + min);
		}
	}
}
