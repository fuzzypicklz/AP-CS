package lab2;
public class methods2 {

// method defined
private static double getSquare(int x)
{
return Math.sqrt(x);
}

public static void main(String[] args)
{
for (int i = 5; i < 50; i+=5)
{
double result = getSquare(i);
System.out.println("Square of " + i + " is: " + result);

}


}
}