package lab1;
import java.util.Scanner;

public class circle {
	public static void main(String[] args) {
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.print("input Radius\n>> ");
			double r = s.nextDouble();
			double area = Math.PI*(r*r);
			System.out.println("radius: "+r);
			System.out.println("area: "+area+"\n\n");
		}
	}
}
