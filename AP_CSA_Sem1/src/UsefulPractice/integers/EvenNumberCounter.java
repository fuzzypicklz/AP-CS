package UsefulPractice.integers;

import java.util.Scanner;

public class EvenNumberCounter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number\n> ");
        int max = s.nextInt();
        int sum = 0;
        if(max%2==1){
            max--;
        }
        for(int i = max;i>1;i-=2){
            sum+=i;
            System.out.println(i+" | "+sum);
        }
    }
}
