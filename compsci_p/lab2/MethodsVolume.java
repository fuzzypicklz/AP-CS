package lab2;

import java.util.Scanner;

public class MethodsVolume {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println(Volume(Menu()));
		}
	}
	public static int Menu() {
		System.out.print("input one of the folling:\n1) cube vol\n2)rect prism vol\n3) sphere vol\n4) cylinder vol\n5) cone vol\n6) right square pyramid vol\n>> ");
		return s.nextInt();
	}
	public static double Volume(int h) {
		double x = 0, y = 0, z = 0;
				switch (h) {
			case 1:
				System.out.print("input side length\n>> ");
				x = s.nextDouble();
				return x*x*x;
			case 2:
				System.out.print("input side length\n>> ");
				x = s.nextDouble();
				System.out.print("input side length\n>> ");
				y = s.nextDouble();
				System.out.print("input side length\n>> ");
				z = s.nextDouble();
				return x*y*z;
			case 3:
				System.out.print("input radius\n>> ");
				x = s.nextDouble();
				return (x*x)*Math.PI*(4/3);
			case 4:
				System.out.print("input radius\n>> ");
				x = s.nextDouble();
				System.out.print("input height\n>> ");
				y = s.nextDouble();
				return x*x*Math.PI*y;
			case 5:
				System.out.print("input radius\n>> ");
				x = s.nextDouble();
				System.out.print("input height\n>> ");
				y = s.nextDouble();
				return (1/3)*Math.PI*x*x*y;
			case 6:
				System.out.print("input side length\n>> ");
				x = s.nextDouble();
				System.out.print("input height\n>> ");
				y = s.nextDouble();
				return (1/3)*x*x*y;
			default:
				return 0;
		}
		
	}
}
