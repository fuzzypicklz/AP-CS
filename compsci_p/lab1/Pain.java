package lab1;

import java.util.Scanner;
public class Pain {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int COVERAGE = 350;
		double len, width, height, pain, area;
		int doors, windows;
		//paint covers 350 sq ft/gal
		//declare integers length, width, and height;
		//declare totalSqFt;
		//declare paintNeeded;
		
		//Prompt for and read in the length of the room
		System.out.println("input len\n>> ");
		len = s.nextDouble();
		//Prompt for and read in the width of the room
		System.out.println("input width\n>> ");
		width = s.nextDouble();
		//Prompt for and read in the height of the room
		System.out.println("input height\n>> ");
		height = s.nextDouble();
		
		System.out.println("input door amt\n>> ");
		doors = s.nextInt();
		
		System.out.println("input window amt\n>> ");
		windows = s.nextInt();
		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		area = ((width*len)+(width*height*2)+(len*height*2))-(windows*15)-(doors*20);
		System.out.println(area + "sq ft");
		pain = area/COVERAGE;
		System.out.println(pain+" gallons");
		//Compute the amount of paint needed
		
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
	}
}