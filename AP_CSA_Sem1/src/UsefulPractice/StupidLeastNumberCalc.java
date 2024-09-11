package UsefulPractice;
import java.util.Scanner;
public class StupidLeastNumberCalc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1, num2, num3, num4, min=99999;

        System.out.println("input 4 numbers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        num4 = s.nextInt();
        if(num1<num2){
            min = num1;
        }
        if (num3<min) {
            min = num3;
        }
        if (num4<min){
            min = num4;
        }

        System.out.println(min);
    }
}
