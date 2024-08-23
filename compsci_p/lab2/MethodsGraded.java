package lab2;
import java.util.ArrayList;
import java.util.Scanner;
public class MethodsGraded {
	static Scanner scan = new Scanner (System.in);
	public static boolean Midpoint(int x, int y, int z) {
		if(x-y==y-z) {
			return true;
		}
		else if(x-z==z-y) {
			return true;
		}
		else if(z-y==y-x) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double Average(ArrayList<Double> args) {
		double avg = 0;
		for(int i = 0; i<=args.size()-1; i++) {
			avg+=args.get(i);
		}
		return avg/args.size();
	}
	public static double Smallest (int x, int y, int z) {
		double low = 99999999;
		if(x<low) low = x;
		if(y<low) low = y;
		if(z<low) low = z;
		return low;
	}
	
	public static void main(String[] args) {
		System.out.println("enter 3 integers:\n");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		System.out.println(Midpoint(x,y,z));
		boolean again = true;
		ArrayList<Double> numeros = new ArrayList<>();
		System.out.println("every numerical value you enter will be added to a list. when you wish to stop, enter a value that is not an integer.\n");
		while(again = true) {
			String in = scan.next();
			try {
				numeros.add(Double.parseDouble(in));
			} catch (Exception e) {
				break;
			}	
		}
		System.out.println(Average(numeros));
		
		System.out.println("enter 3 integers:\n");
		 x = scan.nextInt();
		 y = scan.nextInt();
		 z = scan.nextInt();
		 
		 System.out.println(Smallest(x,y,z));
		
		
	}
}
