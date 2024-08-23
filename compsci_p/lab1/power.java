package lab1;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double Base,Expo,Result;
		
		System.out.print("input base\n>> ");
		Base = s.nextDouble();
		
		System.out.print("input Expo\n>> ");
		Expo = s.nextDouble();
		
		Result = Math.pow(Base, Expo);
		
		System.out.println("exponent: "+ Result);
		
		Result = Math.sqrt(Base);
		
		System.out.println("sqrt: "+Result);
	}
}
