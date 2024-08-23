package lab1;
import java.util.Scanner;
public class factorial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int fact= 1;
		int max = s.nextInt();
		for(int i = 1; i <= max; i++){
			fact*=i;
		}
		System.out.println(fact);
	}
}
