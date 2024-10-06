package GradedLabs;
import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String input = "";
        int counter = 0;
        while(true){
            System.out.print("input palindrome to be detected\n> ");
            input = s.nextLine();
            counter = 0;
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == input.charAt(input.length()-1-i)){
                    // System.out.println(input.charAt(i) + " | "+input.charAt(input.length()-1-i)); // DEBUG LINE
                    counter++;
                }
            }
            if (counter == input.length()) {
                System.out.println("Palindrome");
            }
            else System.out.println("Not Palindrome");

            
        }
    }
}
