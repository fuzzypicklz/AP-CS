package UsefulPractice;

public class Method0 {
    // method defined
    private static int getSquare(int x)
    {
        return x * x;
    }
    
    private static double getSqrRoot(int x)
    {
        return Math.sqrt(x);
    }
    
    public static void main(String[] args)
    {
        for (int i = 1; i <= 15; i++)
        {
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
    
        }
    
        for (int i = 5; i <= 50; i+=5)
        {
            double result = getSqrRoot(i);
            System.out.println("Square Root of " + i + " is: " + result);
    
            }
    
    
        }
}
