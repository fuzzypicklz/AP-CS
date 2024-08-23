package lab1;

import java.util.Scanner;
public class Age
{
//-----------------------------------------------------------------
// Reads the user's age and prints comments accordingly.
//-----------------------------------------------------------------
public static void main (String[] args)
{
	Scanner s = new Scanner(System.in);
final int MINOR = 21;

System.out.print ("Enter your age: ");
int age = s.nextInt();

System.out.println ("You entered: " + age);

if (age < MINOR)
{
System.out.println ("Youth is a wonderful thing. Enjoy.");
}
else
{
System.out.println ("You can do some parties .");
}

System.out.println ("Age is a state of mind.");
}
}