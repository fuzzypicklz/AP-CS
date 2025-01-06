package UsefulPractice.basics;

import java.util.Scanner;
public class LoopCondition3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        int count=0;
        while (true) {
            System.out.print("input a grade, put negative to break\n>");
            int grade = s.nextInt();
            if (grade <0) {
                break;
            }
            else {
                sum += grade; 
                count++;
            }
        }
        System.out.println("avg of "+count+"students: ");
        System.out.println((double) sum/count);
    }
}
