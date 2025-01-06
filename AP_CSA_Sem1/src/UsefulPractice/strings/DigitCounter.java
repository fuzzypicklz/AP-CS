package UsefulPractice.strings;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        while(true){
            System.out.print("input a number\n> ");
            String number = s.nextLine();
            int zeros = 0, evens = 0, odds = 0, sum = 0;
            for(int i = 0; i<number.length(); i++){
                System.out.println((int)number.charAt(i) - '0');
                if((int)number.charAt(i) - '0' == 0){
                    zeros++;
                }
                else if(((int)number.charAt(i) - '0') %2 == 0){
                    evens++;
                }
                else {
                    odds++;
                }
                sum+=(int)number.charAt(i) - '0';
            }
            System.out.println("zero digits: "+zeros+"\neven digits: "+evens+"\nodd digits: "+odds+"\nsum: "+sum);
        }
        
    }
    
}
