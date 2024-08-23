package lab1;

import java.util.Scanner;
public class IdealWeight{
	
	public static void main (String[] args){
		double PERCENT_ALLOWANCE = 0.15;
		double maleWt, femaleWt;
		
		//Declair feet, inches, totalInches, femaleWt, maleWt, allowance;

		Scanner scan = new Scanner(System.in);

		System.out.println ("Please enter your height in feet and inches...");
		System.out.print ("Feet: ");
		double feet = scan.nextDouble()-5.0;
		System.out.print ("Inches: ");
		double inches = scan.nextDouble();

//You need to convert all feet and inched to total inches
		double height = inches + (12*feet);
		maleWt = 106+(6*inches);
		femaleWt = 100+(5*inches);
		
		double maleweightmin = Math.ceil(maleWt*0.85);
		double maleweightmax = Math.floor(maleWt*1.15);
		double femaleweightmin = Math.ceil(femaleWt*0.85);
		double femaleweightmax = Math.floor(femaleWt*1.15);
		System.out.println(maleWt + " male wt");
		System.out.println(femaleWt + " female wt");
		System.out.println(maleweightmin + "-"+ maleweightmax + " male wt range");
		System.out.println(femaleweightmin + "-" + femaleweightmax + " female wt range");
		
		
}
}