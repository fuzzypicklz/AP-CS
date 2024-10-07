package GradedLabs;
import java.util.Scanner;
public class StringManipulation {
    /*
     
    String Manipulation
    Write a complete program that will ask the user for String input using Scanner. Your program should produce the following
    1. Ask the user to input a string from the key board.
    2. return the string length ()
    3. return the first half of the string. So the string "WooHoo" yields "Woo".
    4. return the second half of the string. So the string "WooHoo" yields "Hoo".
    5. return the last letter of the string for example if the input("Hello") → return "o"
    6. return the First letter of the string for example ("Hello") → return "H"
    7. return the middle three string, Example if "Candy" yields to "and".
    8. return a string content at the given index inputted by the user.
    9. return “The rotated Half of the string from the left to the right
    example ("java") → would return "vaja"
    10. return the Boolean value (true/false) if compared to another string inputted by the user. 

    */

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("input a string\n> ");
        String string1 = s.next();



        System.out.println(string1.length());
        System.out.println(string1.substring(0, (string1.length())/2));
        System.out.println(string1.substring((string1.length())/2,string1.length()));
        System.out.println(string1.charAt(string1.length()-1));
        System.out.println(string1.charAt(0));
        System.out.println(string1.substring((string1.length())/2-1,(string1.length())/2+2));
        System.out.print("input an index within the string\n> ");
        int index = s.nextInt();
        System.out.println(string1.charAt(index));
        System.out.println(string1.substring((string1.length())/2,string1.length())+string1.substring(0, (string1.length())/2));
        System.out.print("input another string for comparison\n> ");
        String string2 = s.next();
        System.out.println(string2);
        System.out.println(string2.equals(string1)); 
        
    }

}
