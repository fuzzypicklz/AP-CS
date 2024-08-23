//********************************************************************
//  TempConverter.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.
//********************************************************************
package lab1;

import java.util.Scanner;

public class TempConversion
{
   //-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	  System.out.println("elfjlaksjfs numearo pleas\n>> ");
	  Scanner s = new Scanner(System.in);
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      double celsiusTemp = s.nextDouble();  // value to convert
      double fahrenheitTemp;

      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

      System.out.println ("Celsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   }
}