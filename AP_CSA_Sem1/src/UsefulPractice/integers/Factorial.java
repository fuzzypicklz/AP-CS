package UsefulPractice.integers;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("input a number\n> ");
        int numb = s.nextInt();
        int fact = 0;
        int temp = numb;
        while (numb > 0) {
            fact += numb;
            numb--;
            
        }
        System.out.println(fact + " = !"+temp);
    }
}