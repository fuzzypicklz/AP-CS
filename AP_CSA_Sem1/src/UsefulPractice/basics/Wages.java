package UsefulPractice.basics;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Wages
{
public static void main (String[] args)
{
final double RATE = 20.00; // regular pay rate
final int STANDARD = 40; // standard hours in a work week

double normal=0.0, overtime=0.0;

Scanner scan = new Scanner (System.in);
DecimalFormat fmtd= new DecimalFormat ("0.###");

System.out.print ("Enter the number of hours worked: ");
double hours = scan.nextInt();

System.out.println ();

// Pay overtime at "time and a half"
if(hours-STANDARD>0){
    normal = STANDARD * RATE;
    overtime = (hours-STANDARD) * (RATE * 1.5);
}
else{
    normal = hours*STANDARD;
}


System.out.println ("Gross earnings: " + fmtd.format(normal+overtime));
System.out.println("Overtime earnings: "+fmtd.format(overtime));
System.out.println("normal earnings: "+fmtd.format(normal));
}
}