package UsefulPractice;

import java.util.Scanner;
public class Wages2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("input gender male or female\n> ");
        char gender = s.nextLine().charAt(0);
        System.out.print("do you have postgrad education, yes or no\n> ");
        char postgrad = s.nextLine().charAt(0);
        System.out.print("input years of previous employment\n> ");
        int serviceLen = s.nextInt();
        int salary;
        if(gender == 'f'){
            if(postgrad == 'y'){
                if (serviceLen>=10) {
                    salary = 12000;
                }
                else{
                    salary = 10000;
                }
            }
            else{
                if (serviceLen>=10) {
                    salary = 9000;
                }
                else{
                    salary = 6000;
                }
            }
        }
        if (gender == 'm') {
            if(postgrad == 'y'){
                if (serviceLen>=10) {
                    salary = 15000;
                }
                else{
                    salary = 10000;
                }
            }
            else{
                if (serviceLen>=10) {
                    salary = 10000;
                }
                else{
                    salary = 7000;
                }
            }
        }
        else{
            System.out.println("that is NOT a gender");
            salary = -10000;
        }
        System.out.println("your pay would be "+String.valueOf(salary));
    } 
}
