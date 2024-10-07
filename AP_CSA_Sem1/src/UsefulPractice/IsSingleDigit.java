package UsefulPractice;
import java.util.Scanner;

public class IsSingleDigit {
    public static boolean isSingleDigit(int x){
        if (x>=0 && x<10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.print("input number to check\n> ");
        Scanner s  = new Scanner(System.in);
        System.out.println(isSingleDigit(s.nextInt()));
    }
    
}
