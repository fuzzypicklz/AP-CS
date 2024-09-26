package GradedLabs;
import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args){
        String input = "";
        String reversed = "";
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("input string for reversal\n> ");
            input = s.nextLine();
            for(int i = input.length();i>=1;i--){
                reversed+=input.charAt(i-1);
            }
            System.out.println(reversed);
            System.out.print("again?\n> ");
            if(s.nextLine().toLowerCase().charAt(0) != 'y'){
                break;
            }
            reversed = "";
        }
    }
}
