package GradedLabs;
public class RecursiveReverse {
    public static void StringReverse(String input){
        System.out.print(input.charAt(input.length()-1));
        if (input.length()>1) StringReverse(input.substring(0, input.length()-1));
        else return;
        
    }
    public static void main(String[] args){
        StringReverse("Hello World");
    }
}
