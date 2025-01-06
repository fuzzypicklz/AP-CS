package UsefulPractice.integers;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){

        // this is an example code to calculate the roots of a quadratic using methods from the Math library

        Scanner s = new Scanner(System.in);
        System.out.println("Ax^2+Bx+C");
        System.out.print("input A value\n> ");
        double A = s.nextDouble();
        System.out.print("input B value\n> ");
        double B = s.nextDouble();
        System.out.print("input C value\n> ");
        double C = s.nextDouble();

        double disc = Math.pow(B, 2)-4*A*C;
        double root1 = (-B+Math.sqrt(disc))/(2*A);
        double root2 = (-B-Math.sqrt(disc))/(2*A);
        
        System.out.println("roots are "+root1+" and "+root2);
    }
}
