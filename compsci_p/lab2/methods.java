package lab2;
import java.util.Scanner;
public class methods
{
static Scanner scan = new Scanner (System.in);
public static void main(String[] args)
{
double x=0;
int y=0;
power(x,y);

add(x,y);

mult(x,y);

div(x,y);
}


public static double power ( double base, int exp)
{
double result;
System.out.println("Pleas input the base and the Exponante");
base= scan.nextDouble() ;
exp= scan.nextInt();
result =Math.pow(base , exp);
System.out.println(result);
return result;
}

public static double add(double a, double b )
{
double result;
System.out.println("Pleas input two numbers");
a= scan.nextDouble() ;
b= scan.nextDouble();
result =a+b;
System.out.println(result);
return result;

}


public static double mult(double a, double b )
{
double result;
System.out.println("Pleas input two numbers");
a= scan.nextDouble() ;
b= scan.nextDouble();
result =a*b;
System.out.println(result);
return result;

}

public static double div(double a, double b )
{
double result;
System.out.println("Pleas input two numbers");
a= scan.nextDouble() ;
b= scan.nextDouble();
result =a/b;
System.out.println(result);
return result;

}


}