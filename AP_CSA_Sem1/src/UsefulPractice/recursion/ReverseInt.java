package UsefulPractice.recursion;

public class ReverseInt {
    public static void reverse(int number){
        if(number<10) System.out.println(number);
        else System.out.print(number%10); reverse(number/10);
    }
}
